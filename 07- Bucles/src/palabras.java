import java.util.Scanner;

public class palabras {

	public static void main(String[] args) {
		//PROGRAMA QUE LEA UN NUMERO POR TECLADO("OBLIGAR,FORZAR") A QUE SE META UN NUMERO POSITIVO
		//MIENTRA EL NUMERO QUE EL USUARIO META POR TECLADO NO SEA >0, PEDIR EL NUMERO  DE NUEVO

		//UNA VEZ METIDO UN NUMERO POSITIVO, LEEMOS UNA PALABRA POR TECLADO, Y MOSTRAMOS POR
		//PANTALA LA PALABRA LEIDA TANTAS VECES COMO INDIQUE EL NUMERO
		//DECLARACION DE VARIABLES
		int  num;
		String ko;
		Scanner se;
		se=new Scanner(System.in);

		System.out.println("Introduce un numero positivo:");
		num=se.nextInt(); 
		while (num<=0) {
			System.out.println("Solo numeros positivos:");
			num=se.nextInt();
		}
		System.out.println("Escribe la palabra que quieras repetir:");
		ko=se.next();
		for (int cont = 0; cont < num; cont++) {
			System.out.println(ko);

		}




	}
}
