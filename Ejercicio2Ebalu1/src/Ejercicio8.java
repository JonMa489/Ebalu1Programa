import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int[] numeros = new int[10];
		// 	Programa que mediante llamadas a funciones llene un array, lo muestre con su
		//	contenido y después lo muestre por pantalla tal y como se indica en la otra
		//	función:
		//	● 	Función para llenar un array de 10 elementos con números enteros entre
		//		1 y 50.
		//	● 	Función para mostrar el array con su contenido.
		//	● 	Función para mostrarlos en el siguiente orden: el primero, el último, el
		//		segundo, el penúltimo, el tercero, etc.
		llenarArray(numeros);
	}
	public static void llenarArray  (int[]numeros) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=(int)(Math.random()*49+1);
			System.out.print(numeros[i]+ " ");
		}
		
	}
}
