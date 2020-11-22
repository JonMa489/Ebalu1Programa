import java.util.Scanner;


public class LLenarArray {

	public static void main(String[] args) {
		/*LLENAR UN ARRAY DE 10 ELEMENTOS CON 10 NUMEROS ENTEROS INTRODUCIDOS POR TECLADO.
		 * UNA VEZ LLENO, MOSTRARLO POR PANTALLA EN ORDEN INVERSO (DEL ULTIMO NUMERO
		 * INTRODUCIDO AL PRIMERO)
		 */
		
		//DECLARACION DE VARIABLES
		int num;
		int []numeros;
		Scanner sc;
		//CREAR INSTANCIAS
		sc=new Scanner(System.in);
		numeros=new int[10];
		
		//PEDIR 10 NUMEROS POR TECLADO Y GUARDARLOS EN EL ARRAY
		for(int cont=0;cont<numeros.length;cont++) {
			System.out.print("Introduce nº: ");
			numeros[cont]=sc.nextInt();
		}
		
		for(int cont=numeros.length-1;cont>=0;cont--) {
			System.out.print(numeros[cont]+" ");
		}
	
	}

}


