import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Programa que pida un n�mero �n� por teclado y muestre por pantalla la
		//multiplicaci�n de los �n� primeros n�meros impares.
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		//VARIABLES
		int num, i, multi=1;
		System.out.println("------Multiplicacion de numeros impares------");
		System.out.println("Introduzca el numero: ");
		num=sc.nextInt();

		//CALCULO
		for (i=1; i <=num; i++) {

			if (i %2!= 0)
				multi=multi*i;
		}
		System.out.println(multi);
	}	
}

