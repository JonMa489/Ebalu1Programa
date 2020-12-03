
public class Circulo {
	public static final double PI=3.1416;
	//DATOS
	private double radio;
	private Punto centro;
	//CONSTRUCTORES
	//CONSTRUCTOR 1: Sin Parametros
	public Circulo() {
		radio=0;
		centro=new Punto (); //LOS PARENTESIS SON IGUAL A (0,0) 
	}
	/*CONSTRUCTOR 2: RECIBE SOLO EL RADIO (EN ESTE CASO SERIA UN 
	  CIRCULO CON EL CENTRO EN EL PUNTO 0,0)*/
	public Circulo(double radio) {
		this.radio=radio;
		centro=new Punto();//LOS PARENTESIS SON IGUAL A (0,0) 
	}
	//CONSTRUCTOR 3: RECIBE EL RADIO Y EL CENTRO EN FORMA DE PUNTO
	public Circulo(double radio, Punto Centro){
		this.radio=radio;
		this.centro=centro;
	}
	//CONTRUCTOR 4: RECIBE EL RADIO Y LAS DOS COORDENADAS DEL CENTRO
	public Circulo(double radio, double x, double y) {
		this.radio=radio;
		centro=new Punto (x,y);
	}
	//GETTERS y SETTERS
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public Punto getCentro() {
		return centro;
	}
	public void setCentro(Punto centro) {
		this.centro = centro;
	}
	//METODOS
	//METODOS QUE DEVUELVA EL ARRAY DEL CIRCULO
	public double getArea() {
		return (PI*radio*radio);
	}
	//METODO QUE DEVUELVA LA LONGITUD DE LA CIRCUNFERENCIA
	public double longitud() {
		return(2*PI*radio);
	}
	//METODO QUE DEVUELVA EL CIRCULO A UNA POSICION RECIBIDA COMO PARAMETRO
	//EN FORMA DE DOS ORDENADAS
	public void mover(double x, double y) {
		centro=new Punto(x,y);  //MEDIANTE EL CONSTRUCTOR
		centro.setX(x); //MEDIANTE SETTERS
		centro.setY(y);
	}
	//METODO QUE DEVUELVA EN FORMA DE STRING EL RADIO Y LAS DOS COORDENADAS DEL CENTRO
	//TODO CON DOS DECIMALES Y SEPARADOS POR ", " Y POR UN ESPACIO
	public String toString() {
		return ("R="+String.format("%.2f"/*DOS DECIMALES*/, radio)+", x="+String.format("%2f", centro.getX())+", y="+String.format("%2f", centro.getX()));
	}
}
