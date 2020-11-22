import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class LeerFichero {

	public static void main(String[] args) {
		/*LEER EL CONTENIDO DE UN FICHERO DE TEXTO Y MOSTRARLO POR PANTALLA*/
		
		//variables
		String cadena;
		Scanner sc;
		BufferedReader br;
		
		//br=new BufferedReader(new InputStreamReader(System.in)); //TECLADO

		try {
			br=new BufferedReader(new FileReader("fichero.txt"));
			System.out.println("CONTENIDO de fichero.txt:");
			do {
				cadena=br.readLine();
				if(cadena!=null) {
					System.out.println(cadena);
				}
			}while(cadena!=null);
			br.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		try {
			sc=new Scanner(new File("fichero.txt"));//fichero abierto
			System.out.println("CONTENIDO de fichero.txt:");
			do {
				cadena=sc.nextLine();
				System.out.println(cadena);
			}while(sc.hasNextLine());
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe");
		}
		
		//LLAMADAS A FUNCIONES
		/*FUNCIÓN QUE LEA EL CONTENIDO DEL ARCHIVO CUYO NOMBRE RECIBE COMO PARÁMETRO
		 * MUESTRE POR PANTALLA LAS VOCALES EN EL ORDEN EN EL QUE VAN APARECIENDO
		 * Y DEVUELVA EL NUMERO DE CARACTERES TOTALES DEL FICHERO
		 */
		int numCaracteres;
		numCaracteres=leerFich("fichero.txt");
		System.out.println();
		System.out.println("Numero de caracteres del fichero: "+numCaracteres);
	}

	private static int leerFich(String strFich) {
		//leemos el fichero linea a linea --> sc.nextLine()
		String cadena;
		Scanner sc;
		int cont=0;
		try {
			sc=new Scanner(new File(strFich));
			
			do {
				cadena=sc.nextLine();
				//recorrer todos los caracteres de la cadena y mostrar las vocales
				//contar todos los caracteres
				for (int i = 0; i < cadena.length(); i++) {
					switch(cadena.charAt(i)) {
						case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U':
							System.out.print(cadena.charAt(i)+" ");
					}					
				}
				cont=cont+cadena.length();
			} while(sc.hasNext());
			sc.close();
			return cont;
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe");
			return 0;
		}
		
	}
	
}

