import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LeerFichero {

	public static void main(String[] args) {
		/* LEER EL CONTENIDO DE UN FICHERO DE TEXTO Y MOSTRARLO POR PANTALLA
		 * 
		 Variables*/ 
		String cadena;
		Scanner sc;
		//BufferedReader br;

		//br=new BufferedReader(new InputStreamReader (System.in)); //TECLADO

		//br=new BufferedReader(new FileReader("fichero.txt"));
		try {
			sc=new Scanner(new File("fichero.txt"));//fichero abierto
			System.out.println("CONTENIDO de fichero.txt:");
			do {
				cadena=sc.nextLine();
				System.out.println(cadena);
			} while (sc.hasNextLine());
			sc.close();

		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe!");
		}
	
	//LLAMADAS A FUNCIONES
	//FUNCION QUE LEA EL CONTENIDO DEL ARCHIVO CUYO NOMBRE RECIBE COMO PARAMETRO
	//MUESTRE POR PANTALLA LAS VOCALES EN EL ORDEN EN EL QUE VAN APARECIENDO
	//Y DEVUELVA EL NUMERO DE CARACTERES TOTALES DEL FICHERO
	int numCaracteres;
	numCaracteres=leerFich("fichero.txt");
	System.out.println("Numero de caracteres del fichero "+numCaracteres);
	}
	
	private static int leerFich(String strFich) {
		//leemos el fichero linea a linea --> sc.nextLine()
		String cadena;
		int i=0;
		try {
			Scanner sc=new Scanner(new File("strFich.txt"));
			do {
				cadena=sc.nextLine();
				//recorrer todos los caracteres de la cadena y mostrar las vocales
				//contar todos los caracteres
				for (int cont = 0; cont < cadena.length(); cont++) {
					switch(cadena.charAt(cont)) {
					case 'a','A','e','E','i','I','o','O','u','U':
					System.out.print(cadena.charAt(cont)+" ");
					}
				}
				i=i+cadena.length();
			} while (sc.hasNext());
			sc.close();
			return i;
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe");
			return 0;
		}
		


	}

}
