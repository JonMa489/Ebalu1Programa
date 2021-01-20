import java.awt.Canvas;
import java.awt.Graphics;

public class AreaDibujo extends Canvas {
	private int numFallos;
	public AreaDibujo() {

	}

	@Override
	public void paint (Graphics g) {
		//DIBUJA TOOODOS LOS ELEMENTOS GRAFICOS QUE FORMAN PARTE DE LA IMAGEN
		dibujarAhorcado (g);
		//imagenesAhorcado (g);
		
	}

	private void dibujarAhorcado(Graphics g) {
		//DIBUJAR EL PATIBULO (siempre)
		g.drawLine(50, 400, 50, 450);
		g.drawLine(50, 400, 150, 400);
		g.drawLine(50, 400, 250, 400);
		g.drawLine(50, 400, 350, 400);
		g.drawLine(350, 450, 350, 100);
		g.drawLine(350, 100, 200, 100);
		//SEGUN EL NUMERO DE FALLOS, DIBUJAR UNA PARTE MAS DEL CUERPO
		switch(numFallos) {
		case 7: 
			abrir patibulo;
			
		case 6: 
			pierna izq;
		case 5:
			pierna dcha;
		case 4: 
			brazo dcha;
		case 3:
			brazo izq;
		case 2: 
			cuerpo;
		case 1:
			g.drawOval(160, 100, 240, 180);
		



		}
	}
}
