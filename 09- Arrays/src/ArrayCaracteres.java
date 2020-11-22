import java.util.Scanner;

public class ArrayCaracteres {
	public static void main(String[] args) {
		/*LLENAR UN ARRAY DE 25 ELEMENTOS CON LETRAS MAYUSCULAS ALEATORIAS.
		 * MOSTRARLO POR PANTALLA, SEPARANDO CADA LETRA POR ESPACIOS EN BLANCO.
		 * 
		 * 
		 */
		char car;
		String strCad;
		int num;
		char[] cadena;
		Scanner sc=new Scanner(System.in);
		
		cadena=new char[25];
		//Math.random()*Nº de valores diferentes + Minimo
		for (int i = 0; i < cadena.length; i++) {
			cadena[i]=(char)((int)(Math.random()*26+'A'));
			System.out.print(cadena[i]+" ");
		}
		System.out.println();
		System.out.println();
		//LEER UN CARACTER POR TECLADO Y MOSTRAR LA POSICIÓN O POSICIONES EN LAS QUE SE 
		//SE ENCUANTRA ESA LETRA. SI NO ESTÁ, MOSTRAR UN MENSAJE
		System.out.print("Introduce carácter a buscar: ");
		strCad=sc.next();
		car=strCad.charAt(0);
		int cont=0;
		for (int i = 0; i < cadena.length; i++) {
			if(car==cadena[i]) {
				System.out.println("Pos: "+(i+1));
				cont++;
			}
		}
		
		if(cont==0) {
			System.out.println("La letra no esta");
		}
		
		//MOSTRAR LAS POSICIONES DE LAS VOCALES
		System.out.print("Posiciones de las vocales: ");
		for (int i = 0; i < cadena.length; i++) {
			if(cadena[i]=='A' || cadena[i]=='E' || cadena[i]=='I' || cadena[i]=='O' || cadena[i]=='U') {
				System.out.println("Pos: "+(i+1)+" - "+cadena[i]);
			}
		}
		
		
	}
}

