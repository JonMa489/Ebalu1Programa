import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class Cuadrado extends Circulo{

	//DATOS
	private	int posXInicial;
	private int posYInicial;

	public int getPosXInicial() {
		return posXInicial;
	}
	public void setPosXInicial(int posXInicial) {
		this.posXInicial = posXInicial;
	}
	public int getPosYInicial() {
		return posYInicial;
	}
	public void setPosYInicial(int posYInicial) {
		this.posYInicial = posYInicial;
	}


	public Cuadrado () {
		super();
		posXInicial=0;
		posYInicial=0;

	}
	public Cuadrado (int posX, int poxY, int ancho, int alto) {
		super(posX,poxY,ancho,alto);
		setColor(Color.GRAY);
		posXInicial=posX;
		posYInicial=poxY;
	}
	public void dibujar(Graphics g) {
		g.setColor(getColor());
		g.fillRect(getPosX(), getPosY(), getAncho(), getAlto());
		//DIBUJAR EL CONTORNO EN NEGRO
		g.setColor(Color.BLACK);
		g.drawRect(getPosX(),getPosY(), getAncho(), getAlto());
		g.setFont(new Font("Arial",Font.PLAIN,20));
		FontMetrics fm=g.getFontMetrics();
		Rectangle2D r;
		r=fm.getStringBounds(getLetra(),g);
		
		g.drawString(getLetra(),(int) (getPosX()+getAncho()/2-r.getWidth()/2),(int)(getPosY()+getAlto()/2+r.getHeight()/2-2));
	}
	
}