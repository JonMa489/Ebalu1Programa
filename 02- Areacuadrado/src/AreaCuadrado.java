import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AreaCuadrado {
	/*TIPOS Y SUS CLASES:
	 * int Intefer
	 * float Float
	 * double Double
	 * boolean Double
	 */

	/*PROGRAMA QUE LEA POR TECLADO LA BASE Y LA ALTURA DE UN RECTANGULO
	 * Y MUESTRE EL VALOR DEL AREA Y DEL PERIMETRO POR PANTALLA
	 */

	public static void main(String[] args) throws IOException {
		//DECLARACION DE VARIABLES
		int base, altura, area, perimetro;
		String strNum;  


		se,nex
		se=nex Scanner(System.in);
		BufferedReader br;
		br=new BufferedReader(new InputStreamReader (System.in));

		System.out.println("CALCULO DEL AREA DEL PERIMETRO;");


		System.out.println("Intrduce el valor de la base; ");
		strNum=br.readLine();
		base=Integer.parseInt(strNum);

		System.out.println("Introduce el valor de la altura; ");
		strNum=br.readLine();
		altura=Integer.parseInt(strNum);

		area= base * altura ;  
		System.out.println("El area es; " + area );

		perimetro= base*2 + altura*2 ;
		System.out.println( "El perimetro es; " + perimetro);

		/* LEER EL VALOR DE LA BASE POR TECLADO
		 * LEER EL VALOR DE LA ALTURA POR TECLADO
		 * CALCULAR EL AREA Y MOSTRAR POR PANTALLA
		 * CARCULAR EL PERIMETRO Y MOSTRAR POR PANTALLA
		 */

	}

}
