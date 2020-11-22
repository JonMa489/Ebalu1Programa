import java.util.Scanner;

public class Multiplos {
	public static void main(String[] args) {
		//PROGRAMA QUE LEA UN NUMERO POR TECLADO Y MUESTRE POR PANTALLA LOS MULTIPLOS DE 6
		//DESDE EL 1 HASTA EL NUMERO METIDO POR TECLADO
		
		/*EJEMPLO:
			Introduce un numero: 23
			Los multiplos del 6 hasta el 23 son:
			6, 12, 18
			*/
		int num, cont;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce hasta que numero quieres ver los multiplos de 6: ");
		num=sc.nextInt();
		
		//BUCLE
		for(cont=6;cont<=num;cont+=6) {
			System.out.print(cont+", ");
		}
		
		System.out.println();
		System.out.println();
		for(cont=1;cont<=num;cont++) {
			if(cont%6==0) {
				System.out.print(cont+", ");
			}
		}
		
		
	}
}

