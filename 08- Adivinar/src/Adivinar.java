import java.util.Scanner;

public class Adivinar {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//EL ORDENADOR "PIENSA" UN NUMERO ENTRE 1 Y 1000. (MOSTRADLO AL COMIENZO EN LA FASE DE PRUEBA.)
		// EL JUGADOR TIENE 10 INTENTOS COMO MAXIMO PARA ADIVINAR DICHO NUMERO POR CADA NUMERO INTRODUCIDO POR EL USUARIO, EL PROGRAMA NOS DIRA SI EL QUE BUSCAMOS ES MAYOR O MENOR QUE EL INTRODUCIDO
		// AL FINAL EL PROGRAMA INDICARA SI LO HEMOS ADIVINADO O NO, EN ESTE ULTIMO CASO MOSTRARA CUAL ERA EL NUMERO BUSCADO.

		//EJEMPLO
		/*INTRODUCE NUMERO:200
		 * EL QUE BUSCAS ES MAYOR
		 * INTENTO 1, INTRODUCE NUMERO: 600
		 * EL QUE BUSCAS ES MAYOR
		 * INTENTO 2, INTRODUCE NUMERO:800
		 * EL QUE BUSCAS ES MENOR
		 * .........
		 */
		Scanner sc;
		sc=new Scanner(System.in);
		int numero=0, a = 0, cont=0;

		numero= (int) (Math.random()*999+1);

		System.out.println("-----------------------ADIVINA EL NUMERO-----------------------");
		System.out.println("Vas a tener 10 intentos para poder adivinar el numero correcto");
		System.out.println("El numero que tengas que adivinar esta entre el 1 y el 1000");

		for (int i = 0; i < 10; i++) {
			cont++;
			System.out.println("  - Introduce"+cont+"ºN: ");
			a=sc.nextInt();
			if(cont>9 || numero==a ) {
				System.out.println("Se te han acabado las oportunidades");
			}else if(numero>a) {
				System.out.println("El numero introducido es Mayor");
				System.out.println("------Sigue intentandolo------");
			}
			else if (numero<a) {

				System.out.println("El numero introducido es Menor");
				System.out.println("Sigue intentandolo");

			} 
			else if (numero==a) {
				System.out.println("El numero introducido es correcto");
			}

		}


	}


}



