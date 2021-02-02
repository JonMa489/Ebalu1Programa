import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;

public class AreaDibujo extends Canvas{
	public static final int FACIL=1;
	public static final int MEDIO=2;
	public static final int DIFICIL=3;
	public static final int SEP=80;
	private int nivel;
	private int aciertos,fallos;
	private EventosAreaDibujo eventosAreaDibujo;
	//PARA EL DOBLE BUFFER
	private Image buffer;
	private Graphics pantVirtual;

	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	//DATOS
	private JuegoLetras juegoLetras;
	private Circulo [] arrayCirculos;
	private Cuadrado[] arrayCuadrado;
	public AreaDibujo (JuegoLetras juegoLetras) {
		this.juegoLetras=juegoLetras;
		eventosAreaDibujo=new EventosAreaDibujo(this);
		aciertos=0;
		fallos=0;

	}
	public JuegoLetras getJuegoLetras() {
		return juegoLetras;
	}
	public void setJuegoLetras(JuegoLetras juegoLetras) {
		this.juegoLetras = juegoLetras;
	}
	public Circulo[] getArrayCirculos() {
		return arrayCirculos;
	}
	public void setArrayCirculos(Circulo[] arrayCirculos) {
		this.arrayCirculos = arrayCirculos;
	}
	public Cuadrado[] getArrayCuadrado() {
		return arrayCuadrado;
	}
	public void setArrayCuadrado(Cuadrado[] arrayCuadrado) {
		this.arrayCuadrado = arrayCuadrado;
	}
	public int getAciertos() {
		return aciertos;
	}
	public void setAciertos(int aciertos) {
		this.aciertos = aciertos;
	}
	public int getFallos() {
		return fallos;
	}
	public void setFallos(int fallos) {
		this.fallos = fallos;
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
				arrayCirculos[i]=new Circulo(arrayCirculos[i-1].getPosX()+arrayCirculos[i-1].getAncho()+SEP, arrayCirculos[i-1].getPosY(),75,75);
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
		//INSTANCIAR ARRAY

		arrayCuadrado=new Cuadrado[nivel*5];
		for (int i = 0; i < arrayCuadrado.length; i++) {
			if (i==0) { //EL PRIMERO
				arrayCuadrado[i]=new Cuadrado(30, 450, 75, 75);
			}else if(i%5==0) { //LOS DE LA PRIMERA COLUMNA
				arrayCuadrado[i]=new Cuadrado(arrayCuadrado[i-5].getPosX(),arrayCuadrado[i-5].getPosY()+arrayCuadrado[i-5].getAlto()+ SEP,75,75);
			}else { //EL RESTO
				arrayCuadrado[i]=new Cuadrado(arrayCuadrado[i-1].getPosX()+arrayCuadrado[i-1].getAncho()+SEP, arrayCuadrado[i-1].getPosY(),75,75);
			}
		}
		//ASIGNAR LAS LETRAS
		ArrayList<String> arrayLetras=new ArrayList<String>();
		for (int i = 0; i < arrayCirculos.length; i++) {
			arrayLetras.add(arrayCirculos[i].getLetra().toLowerCase()); //COGER Y PASAR A MINUSCULAS
		}
		/*for (Circulo circulo : arrayCirculos) {
			arrayLetras.add(circulo.getLetra());
			}*/
		//METERLAS DESORDENADAS EN CADA CUADRADO
		int pos;
		Random r=new Random();
		for (Cuadrado cuadrado : arrayCuadrado) {
			//Coger posicion alatoria del arrayList
			//meter la letra de esa posicion en el cuadrado actual
			//eliminar la letra de esa posicion del arrayList
			pos=r.nextInt(arrayLetras.size());
			cuadrado.setLetra(arrayLetras.get(pos));
			arrayLetras.remove(pos);
		}
	}
	@Override
	public void paint(Graphics g) {
		// DIBUJAR TODOS LOS ELEMENTOS DE LA PARTE GRAFICA
		super.paint(g);
		if (arrayCirculos!=null) {
			
			for (Circulo circulo : arrayCirculos) {
				circulo.dibujar(g);
			}
			for (Cuadrado cuadrado : arrayCuadrado) {
				cuadrado.dibujar(g);
			}
			//SI ES EL FINAL, MOSTRAR UN MENSAJE DE ACIERTOS Y FALLOS
			
		}
	}
	@Override
	public void update(Graphics g) {
		buffer=createImage(this.getWidth(), this.getHeight());
		pantVirtual=buffer.getGraphics();
		paint(pantVirtual);
		g.drawImage(buffer, 0, 0, this.getWidth(), this.getHeight(), null);
	}
	
}
