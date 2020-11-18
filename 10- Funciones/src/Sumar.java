import java.util.Scanner;

public class Sumar {
	//programa que pida dos numeros por teclado y mediante llamadas la funcion sumar, 
	//obtenga el resultado de la suma y muestre el resultado por pantalla

	public static void main(String[] args) {
		// Variables
		int num1, num2, resultado;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Escriba el primer numero: ");
		num1=sc.nextInt();
		System.out.println("Escriba el segundo numero: ");
		num2=sc.nextInt();

		//Llmar a la funcion sumar para obtener el resultado
		//Declaracion de la funcion
		resultado=sumar(num1,num2);
		System.out.println("La suma de "+num1+" y "+num2+" es: "+ resultado);
		
	}
	public static int sumar(int a, int b) {
		//cuerpo de la funcion
		int suma;
		suma=a+b;
		return suma;
		
		//(ES LO MISMO QUE LO DE ARRIBA) return (a+b);
	}
}

