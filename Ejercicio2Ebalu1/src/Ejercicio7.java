import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Programa que pida un n�mero entero por teclado y dibuje por pantalla un
		//tri�ngulo de N�meros de tantas filas como indique el n�mero le�do.
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		//VARIABLES
		int num;
		do {
			System.out.println("Escribe el numero: ");
			num=sc.nextInt();
			for (int i = 0; i <= num; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
			System.out.println();
			for (int i = 1; i <= num; i++) {
				for (int j = i; j >= 1; j--) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
			System.out.println();
			for (int i = num; i >= 1; i--) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
			System.out.println();
		} while (num!=0);
	}
}