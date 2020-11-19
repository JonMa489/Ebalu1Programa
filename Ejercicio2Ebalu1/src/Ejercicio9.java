import java.util.Scanner;

public class Ejercicio9 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/* Programa que tiene 3 arrays, 2 de 10 elementos numÃ©ricos cada uno y un
			tercero de 20 elementos tambiÃ©n numÃ©ricos. Mediante llamadas a funciones el
			programa debe llenar los 2 arrays de 10 elementos, mezclarlos en el tercero de
			20 elementos y mostrar los 3:
				â—� FunciÃ³n para llenar un array con nÃºmeros enteros <100
				â—� FunciÃ³n para mezclar dos arrays recibidos como parÃ¡metros en un tercero
					tambiÃ©n recibido como parÃ¡metro de la siguiente forma: 2 elementos de
					A, 2 elementos de B, 2 de A, 2 de B, etc.
				â—� FunciÃ³n para mostrar por pantalla un array recibido como parÃ¡metro (la
					funciÃ³n solo debe mostrar el contenido de un array, pero mediante
					llamadas a esta funciÃ³n hay que mostrar los 3). */
		@SuppressWarnings("unused")
		Scanner sc=new Scanner(System.in);
		int[] numeros = new int[10];
		int[] numeros1 = new int[10];
		int[] numeros20 = new int[20];
		llenarArray(numeros);
		llenarArray(numeros1);
		mezclar(numeros,numeros1,numeros20);
		mostrar(numeros);
		System.out.println("\n");
		mostrar(numeros1);
		System.out.println("\n");
		mostrar(numeros20);


	}
	public static void llenarArray  (int[]llenarnumeros) {
		for (int i = 0; i < llenarnumeros.length; i++) {
			llenarnumeros[i]=(int)(Math.random()*99+1);

		}
	}
	public static void mezclar (int[]numeros, int[]numeros1,int[]numeros20) {
		int con=0;
		for (int i = 0; i < numeros20.length;) {
			for (int j = 0; j <2; j++) {
				numeros20[i]=numeros[con+j];
				i++;
			}
			for (int j = 0; j <2; j++) {
				numeros20[i]=numeros1[con+j];
				i++;
			}
			con+=2;
		}
	}
	public static void mostrar (int[]llenarnumeros) {
		for  (int i= 0; i <llenarnumeros.length; i++) {
			System.out.print(llenarnumeros[i]+" ");
		}
	}
}

