import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class EventosJuegoLetras {

	private JuegoLetras juegoLetras;
	
	public EventosJuegoLetras(JuegoLetras juegoLetras) {
		this.juegoLetras=juegoLetras;
		
		this.juegoLetras.getBtnComenzar().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//PASAR EL NIVEL A AreaDibujo
				if(juegoLetras.getRbFacil().isSelected()) {
					juegoLetras.getAreaDibujo().setNivel(1);
				}else if(juegoLetras.getRbMedio().isSelected()) {
					juegoLetras.getAreaDibujo().setNivel(2);
				}else {
					juegoLetras.getAreaDibujo().setNivel(3);
				}
				
				//LLAMAR A CREAR LOS CIRCULOS
				juegoLetras.getAreaDibujo().crearCirculos();
				//LLAMAR A CREAR LOS CUADRADOS
				juegoLetras.getAreaDibujo().crearCuadrados();
				
				juegoLetras.getAreaDibujo().repaint();
				
				juegoLetras.estadoBotones(false);
			}
		});
		this.juegoLetras.getBtnComprobar().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int aciertos=0,fallos=0;
				//RECORRER TODOS LOS CIRCULOS DEL ARRAY, Y PONER EN ROJO LOS CUADRADOS EMPAREJADO CON 
				//ESE CIRCULO QUE SEAN INCORRECTOS Y EN VERDE LOS CORRECTOS
				for (Circulo circ : juegoLetras.getAreaDibujo().getArrayCirculos()) {
					if (circ.getLetra().equalsIgnoreCase(circ.getPareja().getLetra())) {
						circ.getPareja().setColor(Color.GREEN);
						aciertos++;
					}else {
						circ.getPareja().setColor(Color.RED);
						fallos++;
					}
				}
				//MENSAJE 
				juegoLetras.getAreaDibujo().setAciertos(aciertos);
				juegoLetras.getAreaDibujo().setFallos(fallos);
				//REPINTAR EL CANVAS
				juegoLetras.getAreaDibujo().repaint();
				//DESACTIVAR EL BOTON DE COMPROBAR
				//ACTIVAR LOS CONTROLES DEL JFRAME,EXCEPTO COMPROBAR
				juegoLetras.estadoBotones(true);
			//DESACTIVAR EL BOTON DE COMPROBAR
				juegoLetras.getBtnComprobar().setEnabled(false);
				
				
			}
		});
	}//FIN DEL CONSTRUCTOR
}
