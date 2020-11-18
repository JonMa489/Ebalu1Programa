import java.util.Scanner;

public class EstanEnArray {


	//Funciones:
	//LLenar array : Funcion que llena el array recibido como parametro con 25 numeros aleatorios enteros
	//positivos menores que 100.

	//Mostrar array: Funcion que muestra por pantalla el array recibido como parametro

	//Estan: Funcion que devuelva true. Si los dos numeros recibidos como parametros
	//estan en el array recibido como parametro, y falso en caso contrario


	public static void main(String[] args) {
		//Mediante llamadas a las tres funciones:
		//LLenar el array de 25 numeros --> LLamara a llenar
		//Mostrarlo por pantalla --> LLamada a mostrar
		//Leer dos numeros por teclado
		//Decir si los dos numeros estan o no --> LLamada a estan

		@SuppressWarnings({ "unused", "resource" })
		Scanner sc=new Scanner(System.in);
		//VARIABLES
		int [] numeros;
		int a, o;
		numeros=new int[25];
		llenar(numeros);
		mostrar(numeros);
		System.out.println();
		//TECLADO
		System.out.println("Introduce el numero del array: ");
		a=sc.nextInt();
		System.out.println("Introduce otro numero del array: ");
		o=sc.nextInt();
		estan(numeros,a,o);
		System.out.println(estan(numeros,a,o));
	}

	public static void llenar (int []numeros) {
		int i;
		for  (i= 0; i <numeros.length; i++) {
			numeros[i] = (int) (Math.random()*99+1);
		}
	}
	public static void mostrar (int[]numeros) {
		for  (int i= 0; i <numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
	}
	public static boolean estan (int [] numeros, int a, int o) {
		boolean pepo = false , pepo1=false;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]==a || numeros[i]==o) {
				pepo=true;
			}else {
				pepo1=true;
			}
		}
		return pepo && pepo1;
	}
}