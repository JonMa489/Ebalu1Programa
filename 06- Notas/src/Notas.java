import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		/* PROGRAMA QUE LEA UNA NOTA NUMERICA ENTERA POR TECLADO Y MUESTRE POR PANTALLA
		 * EL VALOR DE LA NOTA DE FORMA DE TEXTO SEGUN LA SIGUIENTE TABLA:
		 * NOTA: 
		 * 		0,1,2: Oso Gutxi - Muy Deficiente
		 * 		3,4: Gutxi  - Insuficiente
		 * 		5: Nahiko  -  Suficiente
		 * 		6: Ondo  - Bien
		 * 		7, 8: Oso Ondo - Notable
		 * 		9, 10: Bikain   -  Sobresaliente
		 */
		// DECLARACION DE VARIABLES
		int a; 


		//LEER LA NOTA POR TECLADO
		Scanner se;
		se=new Scanner(System.in);
		System.out.println("Introduce tu nota:");
		a=se.nextInt();

		//EVALUAR LA NOTA Y MOSTRAR EL MENSAJE (UTILIZAR switch)
		switch (a) {
		case 0,1,2: System.out.println("Muy insuficiente");
		break;
		case 3,4: System.out.println("Insuficiente");
		break;
		case 5: System.out.println("Suficiente");
		break;
		case 6: System.out.println("Bien");
		break;
		case 7,8: System.out.println("Notable");
		break;
		case 9,10: System.out.println("Sobresaliente");
		break;
		}

	}


}
