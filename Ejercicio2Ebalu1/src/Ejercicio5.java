import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Programa que pida un número “n” por teclado y muestre por pantalla la
		//multiplicación de los “n” primeros números impares.
		@SuppressWarnings({ "unused", "resource" })
		Scanner sc=new Scanner(System.in);
		//VARIABLES
		int num,dig = 1, multi = 1, impar=1;
		System.out.println("------Multiplicacion de numeros impares------");
		System.out.println("Introduzca el numero: ");
		num=sc.nextInt();
		//CALCULO
		while (num>0) {
			dig=num%10;

			if(dig%dig==0) {
				multi=multi*dig;
				num/=10;
			}
			System.out.println("La multiplicacion es: "+ impar);
		}
	}
}


