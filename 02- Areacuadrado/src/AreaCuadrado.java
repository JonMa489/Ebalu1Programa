import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class AreaCuadrado {
	/*TIPOS Y SUS CLASES:
	 * int Integer
	 * float Float
	 * double Double
	 * boolean Boolean
	 */
	
	
	/*PROGRAMA QUE LEA POR TECLADO LA BASE Y LA ALTURA DE UN RECTÁNGULO 
	 * Y MUESTRE EL VALOR DEL ÁREA Y DEL PERÍMETRO POR PANTALLA 
	 */
	public static void main(String[] args) throws IOException {
		//DECLARACION DE VARIABLES
		int base, altura, area, perimetro;
		String strNum;
		
		/*Scanner sc;
		sc=new Scanner(System.in);
		base=sc.nextInt();*/
		
		
		BufferedReader br;
		br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("CALCULO DEL AREA Y PERIMETRO:");
		
		//LEER EL VALOR DE LA BASE POR TECLADO
		System.out.print("Introduce el valor de la base (>0): ");
		strNum=br.readLine();
		base=Integer.parseInt(strNum);
		
		//LEER EL VALOR DE LA ALTURA POR TECLADO
		System.out.print("Introduce el valor de la base (>0): ");
		strNum=br.readLine();
		altura=Integer.parseInt(strNum);
		
		//CALCULAR EL AREA Y MOSTRAR POR PANTALLA
		area=base*altura;
		System.out.println("El area es: "+ area);
		//CALCULAR EL PERIMETRO Y MOSTRAR POR PANTALLA
		perimetro=(base*2)+(altura*2);
		System.out.println("El perimetro es: "+perimetro);
		
	}

}

