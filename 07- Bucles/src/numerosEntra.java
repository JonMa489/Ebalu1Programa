import java.util.Scanner;

public class numerosEntra {

	public static void main(String[] args) {
		// LEER DOS NUMEROS POR TECLADO Y MOSTRAR POR PANTALLA TODOS LOS NUMEROS COMPRENDIDOS
		// ENTRE AMBOS EN ORDEN ASCENDENTE.SE MOSTRARAN LO METEMOS POR FILA
		/*EJEMPLO:
		 * 	INTRODUCE UN NUMERO: 5
		 *  INTRODUCE UN NUMERO: 20
		 *  5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
		 */
		Scanner se;
		se=new Scanner(System.in);
		int num1, num2, cont = 0, cont1 = 0, cont3=1;
		System.out.println("Introduce el primer numero:");
		num1=se.nextInt();
		System.out.println("Introduce el segundo numero:");
		num2=se.nextInt();

		if (num1<num2) {
			for (cont = num1; cont <= num2; cont++) {
				System.out.print(" "+cont+" ");
				cont3++;
				if (cont3==10) {
				System.out.println(" ");
				cont3=0;
				}
			}
		} else {
			for (cont1 = num2; cont1 <= num1; cont1++) {
				System.out.print(""+cont1+" ");
			}
		}
	
	}

}
