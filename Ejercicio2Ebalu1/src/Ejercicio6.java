import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Programa que pida un número entero por teclado y dibuje un triángulo con * de
		//tantas filas por pantalla como indique el número leído:
		Scanner sc=new Scanner(System.in);
		//Variables
		int num;
		//EJERCICIO
			System.out.println("Escribe un numero: ");
			num=sc.nextInt();
			for (int i = 0; i <= num; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*"+" ");
				}
				System.out.println();
			}
		

	}

}
