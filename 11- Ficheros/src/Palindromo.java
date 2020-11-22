import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		//PROGRAMA QUE LEA UNA FRASE POR TECLADO
		//UTILIZANDO UNA LLAMADA A LA FUNCIÓN PALINDROMO, muestre un mensaje por pantalla
		//indicando si la frase es palindromo o no
		/*Scanner sc;
		String frase;
		sc=new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
		frase=sc.nextLine();
		if(palindromo(frase)) {
			System.out.println("Sí es palindromo");
		}else {
			System.out.println("No es palindromo");
		}*/
		
		/*LEER LAS FRASES DE UN FICHERO DE TEXTO, CUYO NOMBRE EL USUARIO INTRODUCE POR
		 * TECLADO, Y GUARDAR EN EL FICHERO "resultado.txt" CADA FRASE LEIDA DEL FICHERO
		 * SEGUIDO DE "--> SI ES PALINDROMO", O "--> NO ES PALINDROMO"
		 */
		String strFich, frase;
		Scanner sc=new Scanner(System.in);
		PrintWriter pw;
		
		System.out.print("Introduce el nombre del fichero de entrada: ");
		strFich=sc.nextLine();
		//ABRIR EL ARCHIVO PARA LEER, COMPROBANDO QUE EXISTA
		try {
			sc=new Scanner(new File(strFich));
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe");
			System.exit(0);
		}
		
		//PEDIR POR TECLADO EL FICHERO DE SALIDA
		//SI EL FICHERO EXISTE, PEDIRÁ CONFIRMACIÓN DE SOBREESCRIBIR
		//SI EL USUARIO RESPONDE QUE SÍ -> SE SOBREESCRIBE
		//SI RESPONDE QUE NO VOVLERA A PEDIR EL NOMBRE DEL FICHERO
		Scanner scTeclado=new Scanner(System.in);
		Scanner sc2;
		String resp;
		boolean seguir;
		do {
			System.out.print("Introduce nombre del fichero de salida: ");
			strFich=scTeclado.next();
			seguir=false;
			try {
				sc2=new Scanner(new File(strFich));//COMPROBAR SI EXISTE
				System.out.print("El fichero "+strFich+" ya existe. "
									+ "¿Quieres sobreescribirlo? (S/N): ");
				resp=scTeclado.nextLine();
				scTeclado.nextLine();
				if(resp.equalsIgnoreCase("S")) {
					seguir=true;
				}
			} catch (FileNotFoundException e1) {
				//EL FICHERO DE SALIDA NO EXISTE
				seguir=true;
			}
		}while(seguir==false);
		//ABRIR EL ARCHIVO "resultado.txt" PARA ESCRIBIR EN EL
		try {
			pw=new PrintWriter(new File(strFich));
			//leer todas las frases del fichero de entrada y escribir en el de salida
			//las mismas frases indicando si son palindromos o no
			do {
				frase=sc.nextLine();
				if(palindromo(frase)) {
					pw.println(frase+" --> SI es palindromo");
				}else {
					pw.println(frase+" --> NO es palindromo");
				}
			}while(sc.hasNextLine());
			pw.close();
			sc.close();
			System.out.println("El fichero se ha creado");
		} catch (FileNotFoundException e) {
			System.out.println("No se ha podico crear el archivo");
		}
		
		/*
		//LO MISMO PERO CON BUFFEREDREADER
		try {
			BufferedReader br=new BufferedReader(new FileReader(strFich));
			pw=new PrintWriter(new File("resultado.txt"));
			do {
				frase=br.readLine();
				if(frase!=null) {
					if(palindromo(frase)) {
						pw.println(frase+" --> SI es palindromo");
					}else {
						pw.println(frase+" --> NO es palindromo");
					}
				}
			}while(frase!=null);
			pw.close();
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}

	//FUNCIÓN PALINDROMO QUE RECIBE UNA FRASE COMO PARÁMETRO Y DEVUELVE true SI LA FRASE ES
	//UN PALINDROMO Y false EN CASO CONTRARIO
	//DABALE ARROZ A LA         ZORRA EL ABAD
	public static boolean palindromo(String frase) {
		int j;
		j=frase.length()-1;//posicion del ultimo carcater
		frase=frase.toLowerCase();
		
		for (int i = 0; i < frase.length()/2; i++) {
			//saltar espacios
			while(frase.charAt(i)==' ') {
				i++;
			}
			while(frase.charAt(j)==' ') {
				j--;
			}
			if(frase.charAt(i)!=frase.charAt(j)) {
				return false;
			}
			j--;
		}
		
		return true;
	}
	
}






