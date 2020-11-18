import java.util.Scanner;

public class ArrayCaracteres {

	public static void main(String[] args) {
		/* LLENAR UN ARRAY DE 25 ELEMENTOS CON LETRAS MAYUSCULAS ALEATORIAS.
		 * MOSTRARLO POR PANTALLA, SEPARANDO CADA LETRA POR ESPACIOS EN BLANCO.
		 */
		
		Scanner sc;
		sc=new Scanner(System.in);
		char car;
		String strCad;
		int num;
		int i=0;
		char[] cadena;
		cadena=new char [25];
		for (int cont = 0; cont < cadena.length; cont++) {
			cadena [cont] = (char) (int)(Math.random()*26+65);
			System.out.print(cadena[cont]+" ");
		}
		//LEER UN CARACTER POR TECLADO Y MOSTRAR LA POSICION O POSICIONES EN LAS QUE SE  
		// ENCUENTRA ESA LETRA, SI NO ESTA, MOSTRAR UN MENSAJE
		System.out.println("\nIntroduzca una letra:" );
		strCad = sc.next();
		car=strCad.charAt(0);
		
		for (int cont = 0; cont < cadena.length; cont++) {
			if (car==cadena[cont]) {
				System.out.println("Pos;"+cont);
				i++;
			}
		}
	
		if (i==0) {
			System.out.println("La letra no esta");
		}
		//MOSTRAR LAS POSICIONES DE LAS VOCALES
		System.out.println("Vocales:");
		for (int cont = 0; cont < cadena.length; cont++) {
			if (cadena [cont]=='A' || cadena [cont]=='E' ||  cadena [cont]=='O' || cadena [cont]=='U') {
				System.out.println("Pos: "+(cont+1));
			}
		}
	}

}
