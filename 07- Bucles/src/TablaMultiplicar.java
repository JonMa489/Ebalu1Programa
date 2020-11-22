import java.util.InputMismatchException;
import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		/*PROGRAMA QUE LEA UN NUMERO POR TECLADO Y MUESTRE POR PANTALLA SU TABLA DE 
		 * MULTIPLICAR DEL 1 AL 10.
		 * DESPUÉS DE CADA TABLA EL PROGRAMA PREGUNTARÁ SI QUEREMOS OTRA TABLA. SI LA 
		 * RESPUESTA ES SI, REPETIMOS EL PROCESO Y SI LA RESPUESTA ES NO EL PROGRAMA SE ACABA
		 * EJEMPLO:
		 * 		INTRODUCE UN NUMERO: 8
		 * 
		 * 		TABLA DEL MULTIPLICAR DEL 8:
		 * 		8 X 1 = 8
		 * 		8 X 2 = 16
		 * 		8 X 3 = 24
		 * 		8 X 4 = 32
		 * 		......
		 * 		8 X 10 = 80
		 * 
		 * 		¿QUIERES CALCULAR OTRA TABLA (S/N)?:
		 * 
		 */
		
		int num=1, cont;
		String resp;
		boolean error;
		Scanner sc=new Scanner(System.in);
		error=false;
		do {
			
			do {
				try {
					System.out.println("Introduce numero: ");
					num=sc.nextInt();
					error=false;
				}catch(InputMismatchException e) {
					System.out.println("Lo que has introducido no es un numero.");
					sc.next();
					error=true;
				}
			} while(error);	
			
			
			
			System.out.println("TABLA DE MULTIPLICAR DEL "+num+":");

			for(cont=1;cont<=10;cont++) {
				System.out.println(num+" X "+cont+" = "+num*cont);
			}

			System.out.println("¿QUIERES OTRA TABLA (S/N)?");
			resp=sc.next();

		} while(resp.equalsIgnoreCase("S"));
			
		}

}