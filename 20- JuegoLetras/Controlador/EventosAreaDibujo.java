import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.Timer;

public class EventosAreaDibujo {
	private AreaDibujo areaDibujo;
	private Cuadrado cuadSeleccionado;
	private Circulo circColisionado;

	private int despX,despY;
	public EventosAreaDibujo (AreaDibujo areaDibujo) {
		this.areaDibujo=areaDibujo;
		cuadSeleccionado=null;

		areaDibujo.setReloj(new Timer(40,new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Circulo circ=areaDibujo.getCirc();
				Cuadrado cuad=areaDibujo.getCuad();
				//MOVER EL CIRCULO Y EL CUADRADO
				circ.mover();
				cuad.mover();

				//COMPROBAR COLISIONES CON LOS LATERALES PARA CAMBIAR SU DIRECCION
				//ABAJO
				if (circ.getPosY()+circ.getAlto()>=areaDibujo.getHeight()) {
					circ.setDirV(-1);
				}
				//DERECHA
				if (circ.getPosX()+circ.getAncho()>=areaDibujo.getWidth()) {
					circ.setDirH(-1);
				}
				//IZQUIERDA
				if (circ.getPosX()<=0) {
					circ.setDirH(1);
				}
				//ARRIBA
				if (circ.getPosY()<=0) {
					circ.setDirV(1);
				}
				//ABAJO
				if (cuad.getPosY()+cuad.getAlto()>=areaDibujo.getHeight()) {
					cuad.setDirV(-1);
				}
				//DERECHA
				if (cuad.getPosX()+cuad.getAncho()>=areaDibujo.getWidth()) {
					cuad.setDirH(-1);
				}
				//IZQUIERDA
				if (cuad.getPosX()<=0) {
					cuad.setDirH(1);
				}
				//ARRIBA
				if (cuad.getPosY()<=0) {
					cuad.setDirV(1);
				}

				//COMPROBAR COLISIONES ENTRE LAS LETRAS PARA FINALIZAR LA ANIMACION
				if (circ.getRect().intersects(cuad.getRect())) {
					circ.setDirH(0);
					circ.setDirV(0);
					cuad.setDirH(0);
					cuad.setDirV(0);
					circ.setAlto(circ.getAlto()+5);
					circ.setAncho(circ.getAncho()+5);
					cuad.setAlto(cuad.getAlto()+5);
					cuad.setAncho(cuad.getAncho()+5);
					if (circ.getAlto()>=120) {
						areaDibujo.getReloj().stop();
					}

				}

				areaDibujo.repaint();

			}

		}));
		areaDibujo.getReloj().start(); //INICIAR EL RELOJ

		areaDibujo.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent e) {
				if (cuadSeleccionado!=null) {
					//SI EL CUADRADO SELECCIONADO NO COLISIONA CON NINGUN CIRCULO -> 
					//VOLVER A POS INCIAL
					if (circColisionado==null) {
						cuadSeleccionado.setPosX(cuadSeleccionado.getPosXInicial());
						cuadSeleccionado.setPosY(cuadSeleccionado.getPosYInicial());
					}else {//SI EL CUADRADO SELECCIONADO SI COLISIONA CON UN CIRCULO -> 
						//EMPAREJADOS EL CIRCULO Y EL CUADRADO
						circColisionado.setEmparejado(true);
						cuadSeleccionado.setEmparejado(true);
						//ASIGNAR A LA PAREJA DEL CIRCULO ESE CUADRADO
						circColisionado.setPareja(cuadSeleccionado);
						//COLOCAR EL CUADRADO DEBAJO
						cuadSeleccionado.setPosX(circColisionado.getPosX());
						cuadSeleccionado.setPosY(circColisionado.getPosY()+AreaDibujo.SEP*3/4);

						//SI ESTAN TODOS EMPAREJADOS, ACTIVAR EL BOTON COMPROBAR
						boolean todosEmparejados=true;
						for (Circulo circ : areaDibujo.getArrayCirculos()) {
							if (!circ.isEmparejado()) {
								todosEmparejados=false;
								break;
							}
						}
						if (todosEmparejados) {
							areaDibujo.getJuegoLetras().getBtnComprobar().setEnabled(true);
						}
					}
					// FINAL
					cuadSeleccionado=null;
					areaDibujo.repaint();
				}
			}
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				Rectangle rMouse, rCuad;
				rMouse=new Rectangle(e.getX(), e.getY(), 1, 1);
				if (areaDibujo.getArrayCuadrado()!=null) {
					for (Cuadrado c : areaDibujo.getArrayCuadrado()) {
						rCuad=c.getRect();
						// SI COLISIONA EL CUADRADO ACTUALm, GUARDARLO EN UNA VARIABLE
						if (rMouse.intersects(rCuad) && !c.isEmparejado()) {
							cuadSeleccionado=c;
							//OBTENER EL DESPLAZAMIENTO EN X Y EN Y  DEL RATON RESPECTO AL COMIENZO
							despX=e.getX()-c.getPosX();
							despY=e.getY()-c.getPosY();
							break;
						}
					}
				}
			}

		});
		areaDibujo.addMouseMotionListener(new MouseMotionAdapter() {


			@Override
			public void mouseDragged(MouseEvent e) {
				if (cuadSeleccionado!=null) {
					Rectangle rCuad, rCirc;
					cuadSeleccionado.setPosX(e.getX()-despX);
					cuadSeleccionado.setPosY(e.getY()-despY);
					rCuad=cuadSeleccionado.getRect();
					//SI COLISIONA CON UN CIRCULO -> DESTACAR ESE CIRCULO
					//SI DEJA DE COLISIONAR CON UN CIRCULO --> DEJAR
					circColisionado=null;
					for (Circulo c : areaDibujo.getArrayCirculos()) {
						rCirc=c.getRect();
						if (rCuad.intersects(rCirc) && !c.isEmparejado()) {
							c.setColor(Color.pink);
							circColisionado=c;
						}else {
							if(!c.isEmparejado())
								c.setColor(Color.orange);
						}
					}
					areaDibujo.repaint();
				}
			}
		});
	}
}
