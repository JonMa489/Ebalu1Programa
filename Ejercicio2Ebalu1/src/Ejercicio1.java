import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Programa que pida tres números enteros por teclado y los muestre ordenados 
		//de mayor a menor.

		//VARIABLES
		int num1, num2, num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("--------------INTRODUCE TRES NUMEROS--------------");
		System.out.println("Escribe el primer numero: ");
		num1=sc.nextInt();
		System.out.println("Escribe el segundo numero: ");
		num2=sc.nextInt();
		System.out.println("Escribe el tercer numero: ");
		num3=sc.nextInt();

		//CALCULO
		System.out.println();
		System.out.println("ESTOS SON LOS NUMEROS INTRODUCIDOS, ORDENADOS DE MAYOR A MENOR\n");
		if (num1<=num2 && num2<=num3) {
			System.out.println(num3+"-"+num2+"-"+num1);
		}else if (num2<=num1 && num1<=num3) {
			System.out.println(num3+"-"+num1+"-"+num2);
		}else if (num3<=num1 && num1<=num2) {
			System.out.println(num2+"-"+num1+"-"+num3);
		}else if (num3<=num2 && num2<=num1) {
			System.out.println(num1+"-"+num2+"-"+num3);
		}else if (num2<=num3 && num3<=num1) {
			System.out.println(num1+"-"+num3+"-"+num2);
		}else {
			System.out.println(num2+"-"+num3+"-"+num1);
		}


	}

}
