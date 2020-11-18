import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int[] numeros = new int[10];
		// 	Programa que mediante llamadas a funciones llene un array, lo muestre con su
		//	contenido y despuÃ©s lo muestre por pantalla tal y como se indica en la otra
		//	funciÃ³n:
		//	â—� 	FunciÃ³n para llenar un array de 10 elementos con nÃºmeros enteros entre
		//		1 y 50.
		//	â—� 	FunciÃ³n para mostrar el array con su contenido.
		//	â—� 	FunciÃ³n para mostrarlos en el siguiente orden: el primero, el Ãºltimo, el
		//		segundo, el penÃºltimo, el tercero, etc.
		llenarArray(numeros);
		orden(numeros);
	}
	public static void llenarArray  (int[]numeros) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=(int)(Math.random()*49+1);
			System.out.print(numeros[i]+ " ");
		}
	}
	public static void mostrar () {

	}
	public static void orden (int numeros[]) {
	int j=4;
	}
}
