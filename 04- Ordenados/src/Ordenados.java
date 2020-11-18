import java.util.Scanner;

public class Ordenados {


	//PROGRAMA QUE LEA DOS NUMEROS POR TECLADO Y LOS MUESTRE POR PANTALLA
	//EN ORDEN ASCENDENTE (DE MENOR A MAYOR)
	public static void main(String[] args) {

		//DECLARACION DE VARIABLES
		int num, num1;
		Scanner se;
		se=new Scanner(System.in);
		//LEER LOS DOS NUMEROS
		System.out.println("Introduce el valor del primer numero:");
		num=se.nextInt();
		System.out.println("Introduce el valor del segundo numero:");
		num1=se.nextInt();
		//MOSTRARLOS EN ORDEN ASCENDENTE
		if (num<num1) {
			System.out.println("Los numeros en orden ascendente son:"+num+"y"+num1);
		}else if (num>num1){
			System.out.println("Los numeros en orden ascendente son:"+num1+"y"+num);
		}else {
			System.out.println("Los dos numeros son iguales"+ num +"y" + num1);
		}
	}


}
