import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class AreaDibujo extends Canvas {
	private int numFallos;
	private int desp;
	private Image [] img;
	private BufferedImage bfImage;
	
	public int getNumFallos() {
		return numFallos;
	}

	public void setNumFallos(int numFallos) {
		this.numFallos = numFallos;
	}
	public int getDesp() {
		return desp;
	}

	public void setDesp(int desp) {
		this.desp = desp;
	}
	
	public AreaDibujo() {
		numFallos=0;
		desp=0;
		img=new Image[8];
		//CARGAR LAS 8 IMAGENES COMO RECURSO
		/*for (int i = 0; i < img.length; i++) {
			img[i] = new ImageIcon(getClass().getResource("Ahorcado"+i+".png")).getImage();
		}*/
		//CARGAR LAS IMAGENES DESDE UN SOLO SPRITE
		try {
			bfImage=ImageIO.read(new File("img/ahorcado.jpg"));
			for (int i = 0; i < img.length; i++) {
				img[i]=bfImage.getSubimage(162*(i%5), 160*(i/5), 162, 160);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void paint (Graphics g) {
		//DIBUJA TOOODOS LOS ELEMENTOS GRAFICOS QUE FORMAN PARTE DE LA IMAGEN
		//dibujarAhorcado (g);
		imagenesAhorcado (g);
		
	}
	private void imagenesAhorcado (Graphics g) {
		g.drawImage(img[numFallos],0, 0, this.getWidth(), this.getHeight(), null);
	}

	private void dibujarAhorcado(Graphics g) {
		//DIBUJAR EL PATIBULO (siempre)
		g.drawLine(50, 400, 50, 450);
		g.drawLine(50, 400, 150, 400);
		if (numFallos<7) {
			g.drawLine(150, 400, 250, 400); //LINEA QUE ABRE EL PATIBULO
		}else {
			g.drawLine(	150, 400, 150, 450);
			g.drawLine(250, 400, 250, 450);
		}
		g.drawLine(250, 400, 350, 400);
		g.drawLine(350, 450, 350, 100);
		g.drawLine(350, 100, 200, 100);
		//SEGUN EL NUMERO DE FALLOS, DIBUJAR UNA PARTE MAS DEL CUERPO
		switch(numFallos) {
			case 7: //BAJAR POCO A POCO A LA PERSONA (LA CUERDA)
				g.drawLine(200, 100, 200, 100+desp);
			case 6: g.drawLine(200, 260+desp, 240, 340+desp);//PIERNA IZQUIERDA
			case 5: g.drawLine(200, 260+desp, 160, 340+desp);	 //PIERNA DRECHA
			case 4:	g.drawLine(200, 200+desp, 240, 260+desp);//BRAZO  IZQUIERDO
			case 3: g.drawLine(200, 200+desp, 160, 260+desp); //BRAZO  DERECHO
			case 2: g.drawLine(200,180+desp,200,260+desp); //CUERPO
			case 1:	g.drawOval(160, 100+desp, 80, 80); //CABEZA

		}
	}
	public void bajar () {
		desp=desp+5;
	}
	
}
