import java.awt.Color;

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
	
}