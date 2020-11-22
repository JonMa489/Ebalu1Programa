import java.util.Scanner;

public class Intercambio {

	/* LEER POR TECLADO DOS VALORES NUMERICOS Y GUARDARLOS EN DOS VARIABLES.
	 * MOSTRAR AMBOS VALORES.
	 * A CONTINUACIÓN EL RPOGRAMA INTERCAMBIARÁ EL VALOR DE LAS DOS VARIABLES. 
	 * VOLVER A MOSTRAR EL VALOR DE LAS DOS VARIABLES PARA COMPROBAR QUE SE
	 * HAN INTERCAMBIADO.
	 */
	public static void main(String[] args) {
		int num1, num2, aux;
		Scanner sc;
		sc=new Scanner(System.in);
		
		//LEER LOS DOS NÚMEROS POR TECLADO
		System.out.println("Introduce el valor del primer número: ");
		num1=sc.nextInt();
		System.out.println("Introduce el valor del segundo número: ");
		num2=sc.nextInt();
		
		//MOSTRARLOS POR PANTALLA
		System.out.println("Num1 = "+num1+", Num2= "+num2);

		//INTERCAMBIARLOS
		aux=num1;
		num1=num2;
		num2=aux;
		
		/*num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;*/
		
		//VOLVER A MOSTRARLOS
		System.out.println("Num1 = "+num1+", Num2= "+num2);
		
		
	}

}
