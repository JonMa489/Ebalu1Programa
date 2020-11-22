import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		@SuppressWarnings({ "resource", "unused" })
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
		mostrar(numeros);
		System.out.println();
		orden(numeros);

	}
	public static void llenarArray  (int[]numeros) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=(int)(Math.random()*49+1);
		}
	}
	public static void mostrar (int[]numeros) {
		for  (int i= 0; i <numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
	}
	public static void orden (int numeros[]) {
		int aux;
		for (int i=0; i<numeros.length/2; i++) {
			aux = numeros[i];
			numeros[i] = numeros[numeros.length-1-i];
			numeros[numeros.length-1-i] = aux;
		}
		for  (int i= 0; i <numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
	}
}














































//PRUEBAS 



/*int aux[]=new int[numeros.length];
		for (int i = numeros.length, j=0; i>=0 ; i--,j++) {
			aux[j]=numeros[i];
			System.out.print(aux[j]+" ");
		}*/
/*for (int i = 0; i < numeros.length; i++) {
			for (int j = i + 1; j < numeros.length; j++) {

				if (numeros[i] < numeros[j]) {
					aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;
				}
			}
		}
		for (int i1= 0; i1 <numeros.length; i1++) {
			System.out.print(numeros[i1]+" ");
		}*/

/* private static void visualizar(int[] array){ 
	        String cadena = "Array: ";
	        for (int i = 0; i < array.length; i++) {
	            cadena += array[i] + ", ";
	        }
	        cadena = cadena.substring(0, cadena.length()-2);
	        System.out.println(cadena);
	    }*/
