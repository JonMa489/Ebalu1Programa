import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Palindromo {
	@SuppressWarnings("resource")
	public static void main(String[] args) { 
		// PROGRAMA QUE LEA UNA FRASE POR TECLADO
		// UTILIZANDO UNA LLAMADA A LA FUNCION PALINDROMO, GUARDARA LA FRASE EN UN ARCHIVO
		// AÑADIENDO AL FINAL DE LA FRASE"--> SI ES PALINDROMO" O "-->NO ES PALINDROMO"
		// DEPENDIENDO DE SI LA FRASE ES PALINDROMO O NO
		/*EJEMPLO
		 * 	SARA BARAS
		 * 	Es palindromo
		 * 	Hola a todos no es palindromo
		 */
		//PrintWriter pw;
		//pw=new PrintWriter(new File("fichero.txt"));
		Scanner sc;
		sc=new Scanner(System.in);
		String capi;
		/*try {
			sc=new Scanner(new File("palindromo.txt"));//fichero abierto
			System.out.println("CONTENIDO de palindromo.txt:");
			do {
				capi=sc.nextLine();
				System.out.println(capi);
			} while (sc.hasNextLine());
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe!");
		}
		 */
		System.out.println("INTRODUCE UNA FRASE ");
		capi=sc.nextLine();
		if (comparacion(capi)) {
			System.out.println("Si es palindromo");
		}else {
			System.out.println("No es palindromo");
		}
		//LEER LAS FRASES DE UN FICHERO DE TEXTO, COMO NOMBRE EL USUARIO INTRODUCE POR
		//TECLADO, Y GUARDAR EN EL FICHERO "resultado.txt" CADA FRASE LEIDA DEL FICHERO
		//SEGUIDO DE "--> SI EL PALINDROMO, 0 "--> NO ES PALINDROMO
		String strFich, frase;
		System.out.println("Introduce el nombre del fichero: ");
		strFich=sc.nextLine();
		//ABRIR EL ARCHIVO PARA LEER, COMPROBANDO QUE EXISTA
		
		try {
			sc=new Scanner(new File(strFich));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
		//ABRIR EL ARCHIVO "resultado.txt" PARA ESCRIBIR EN EL
		PrintWriter pw;
		try {
			pw=new PrintWriter(new File("resultado.txt"));
			//leer todas las frases del fichero de entrara y escribir en el de salida
			//las mismas frases indicando si es palindromo o no
			pw.println
		} catch (FileNotFoundException e) {
			System.out.println("No se ha podido crear el archivo ");
		}
		
		
		
		
		comparacion(capi);
	}
	public static boolean comparacion(String capi) {
		//FUNCION PALINDROMO QUE RECIBE UNA FRASE COMO PARAMETRO Y DEVUELVE "TRUE" SI LA FRASE ES
		//UN PALINDROMO Y "FALSE" EN CASO CONTRARIO
		int j;
		j=capi.length()-1;
		capi.toLowerCase(); //LO PONE EN MINUSCULAS Y LA DEVUELVE CONVERTIDA
		for (int i = 0; i < capi.length()/2; i++) {
			//saltar espacios
			while (capi.charAt(i)==' ') {
				i++;
			}
			while (capi.charAt(j)==' ') {
				j++;
			}
			if (capi.charAt(i)!=capi.charAt(j)) {
				return false;
			}
			j--;
		}
		return true;	
	}
}