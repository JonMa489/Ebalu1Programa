import java.awt.Canvas;
import java.awt.Graphics;
import java.util.Random;

public class AreaDibujo extends Canvas{
	public static final int FACIL=1;
	public static final int MEDIO=2;
	public static final int DIFICIL=3;
	public static final int SEP=75;
	private int nivel;

	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	//DATOS
	private JuegoLetras juegoLetras;
	private Circulo [] arrayCirculos;
	private Cuadrado [] arraycuadrados;
	public AreaDibujo (JuegoLetras juegoLetras) {
		this.juegoLetras=juegoLetras;

	}
	public void crearCirculos() {
		//INSTANCIAR ARRAY
		arrayCirculos=new Circulo[nivel*5];
		//CREAR CIRCULOS EN FUNCION DEL NIVEL, INDICANDO POSICION PARA CADA UNO
		//Y AÑADIRLOS AL ARRAY
		for (int i = 0; i < arrayCirculos.length; i++) {
			if (i==0) { //EL PRIMERO
				arrayCirculos[i]=new Circulo(30, 30, 75, 75);
			}else if(i%5==0) { //LOS DE LA PRIMERA COLUMNA
			arrayCirculos[i]=new Circulo(arrayCirculos[i-5].getPosX(),arrayCirculos[i-5].getPosY()+arrayCirculos[i-5].getAlto()+ SEP,75,75);
			}else { //EL RESTO
				arrayCirculos[i]=new Circulo(arrayCirculos[i-1].getPosX()+arrayCirculos[i-1].getAncho()+SEP, 30,75,75);
			}

		}
		//ASIGNAR LAS LETRAS A CADA CIRCULO (ALEATORIAA SIN REPETIR)
		Random r=new Random();
		for (int i = 0; i < arrayCirculos.length; i++) {
			arrayCirculos[i].setLetra((char) (r.nextInt(27)+'A')+"");
			if (arrayCirculos[i].getLetra().equals("[")) {
				arrayCirculos[i].setLetra("Ñ");
			}
			for (int j = 0; j < i; j++) {
				if (arrayCirculos[i].getLetra().equals(arrayCirculos[j].getLetra())) {
					i--;
					break;
				}
			}
			System.out.println(arrayCirculos[i].getLetra());
		}
		//DIBUJARLOS (SE HARA ENTRE EL METODO PAINT Y LA PROPIA CLASE CIRCULO)


	}
	public void crearCuadrados() {

	}
	@Override
	public void paint(Graphics g) {
		// DIBUJAR TODOS LOS ELEMENTOS DE LA PARTE GRAFICA
		super.paint(g);
		if (arrayCirculos!=null) {
			for (Circulo circulo : arrayCirculos) {
				circulo.dibujar(g);
				
			}
		}
		
	}
}
