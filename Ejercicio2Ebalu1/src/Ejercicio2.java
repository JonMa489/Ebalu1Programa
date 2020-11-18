import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Programa que pida un número entero (de 9 dígitos como mucho) por teclado y
		// muestre un mensaje por pantalla indicando cuántos dígitos tiene.
		@SuppressWarnings("unused")
		Scanner sc=new Scanner(System.in);
		//VARIABLES
		int num = 0, cont=0, res=0, div=10, num1=-1, num2=0;
		do {
			System.out.println("-----PON UN NUMERO ENTERO DE 9 DIGITOS COMO MAXIMO-----");
			System.out.println("Introduzca el numero: ");
			num=sc.nextInt();
			if (num>999999999 || num<-999999999) {
				System.out.println("Te has pasado con los digitos! Lo maximo son 9 digitos!");
			}
			if (num>=1 && num<=999999999) {
				do {
					res= num/div;
					cont++;
					div = div *10;
				} while (res>=1);
			System.out.println(cont);
			cont=0;
			div=10;
			}	
			if (num>=-999999999 && num<=-1) {
				num2=num*num1;
				do {
					res= num2/div;
					cont++;
					div = div *10;
				} while (res>=1);
			System.out.println(cont);
			cont=0;
			div=10;
			}
		} while (num!=0);
	}
}
