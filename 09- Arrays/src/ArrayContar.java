import java.util.Scanner;

public class ArrayContar {

	public static void main(String[] args) {
		//LLENAR UN ARRAY DE 30 ELEMENTOS CON NUMEROS ENTEROS ALEATORIOS POSITIVOS 
		//MENORES QUE 100
		//MOSTRAR EL ARRAY ENTERO. 10 NUMEROS POR FILA SEPARADOS POR " "
		//A CONTINUACION, MOSTRAR, CONTAR Y SUMAR LOS NUMEROS PARES DEL ARRAY
		
		//DECLARACION
		int cont, num, contPares, sumaPares;
		int[] numeros;
		
		numeros=new int[30];
		
		//LLENAR Y MOSTRAR EL ARRAY CON NUMEROS ALEATORIOS
		for(cont=0;cont<numeros.length;cont++) {
			numeros[cont]=(int)(Math.random()*99+1);
			if(cont%10==0 && cont!=0) {
				System.out.println();
			}
			System.out.print(numeros[cont]+" ");
		}
		
		contPares=0;
		sumaPares=0;
		//contar, sumar y mostrar los elementos pares
		System.out.println();
		System.out.println("Los elementos PARES son:");
		for(cont=0;cont<numeros.length;cont++) {
			if(numeros[cont]%2==0) {//si el numero es par
				contPares++;
				sumaPares+=numeros[cont];
				System.out.print(numeros[cont]+" ");
			}
		}
		System.out.println();
		System.out.println("El numero de elementos pares es: "+contPares);
		System.out.println("La suma de los pares es: "+sumaPares);
		
	}

}
