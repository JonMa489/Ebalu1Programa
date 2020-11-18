import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Intercambio {


	/* LEER POR TECLADO EL VALOR DE DOS VARIABLES NUMERICOS Y GUARDARLOS EN DOS VARIABLES
	 * MOSTRAR AMBOS VALORES
	 * A CONTINUACION EL PROGRAMA INTERCAMBIARA EL VALOR DE LAS DOS VARIABLES
	 * VOLVER A MOSTRAR EL VALOR DE LAS DOS VARIABLES PARA COMPROBRAR QUE SE
	 * HAN INTERCAMBIADO.
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader br ;
		br=new BufferedReader(new InputStreamReader(System.in)) ;

		int Num1, Num2, Num3;
		String strNum;

		System.out.println("Introduzca el primer numero:");
		strNum=br.readLine();
		Num1=Integer.parseInt(strNum);

		System.out.println("Introduzca el segundo numero:");
		strNum=br.readLine();
		Num2=Integer.parseInt(strNum);

		System.out.println("Primer numero="+ Num1 + ", Segundo numero=" + Num2);

		//INTERCAMBIAR

		Num3=Num1;
		Num1=Num2;
		Num2=Num3;



		// VOLVER A MOSTRARLOS

		System.out.println("Primer numero="+ Num1+ ", Segundo numero="+ Num2);
	}

}
