import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Programa que pida un número entre 0 y 999999999 y lo muestre por pantalla
		//con las cifras al revés.
		@SuppressWarnings("unused")
		Scanner sc=new Scanner(System.in);
		//VARIABLES
		int num = 0, num1=0,a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0,a8=0,a911=0,cont = 0,res,div = 10;
		String A1,A2,A3,A4,A5,A6,A7,A8,A9;
		do {
			System.out.println("-----PON UN NUMERO ENTERO DEL 0 al 999999999-----");
			System.out.println("Introduzca el numero: ");
			num=sc.nextInt();
			do {
				res= num/div;
				cont++;
				div = div *10;
			} while (res>=1);
			if (cont<=1 && cont>=0) {
				a911=num%10;
				A9=String.valueOf(a911);
				System.out.println(A9);
			}
			if (cont==2) {
				a911=num%10;
				a8=num%100/10;
				A8=String.valueOf(a8);
				A9=String.valueOf(a911);
				System.out.println(A9+A8);
			}
			if (cont==3) {
				a911=num%10;
				a8=num%100/10;
				a7=num%1000/100;
				A7=String.valueOf(a7);
				A8=String.valueOf(a8);
				A9=String.valueOf(a911);
				System.out.println(A9+A8+A7);
			}
			if (cont==4) {
				a911=num%10;
				a8=num%100/10;
				a7=num%1000/100;
				a6=num%10000/1000;
				A6=String.valueOf(a6);
				A7=String.valueOf(a7);
				A8=String.valueOf(a8);
				A9=String.valueOf(a911);
				System.out.println(A9+A8+A7+A6);
			}
			if (cont==5) {
				a911=num%10;
				a8=num%100/10;
				a7=num%1000/100;
				a6=num%10000/1000;
				a5=num%100000/10000;
				A5=String.valueOf(a5);
				A6=String.valueOf(a6);
				A7=String.valueOf(a7);
				A8=String.valueOf(a8);
				A9=String.valueOf(a911);
				System.out.println(A9+A8+A7+A6+A5);
			}
			if (cont==6) {
				a911=num%10;
				a8=num%100/10;
				a7=num%1000/100;
				a6=num%10000/1000;
				a5=num%100000/10000;
				a4=num%1000000/100000;
				A4=String.valueOf(a4);
				A5=String.valueOf(a5);
				A6=String.valueOf(a6);
				A7=String.valueOf(a7);
				A8=String.valueOf(a8);
				A9=String.valueOf(a911);
				System.out.println(A9+A8+A7+A6+A5+A4);
			}
			if (cont==7) {
				a911=num%10;
				a8=num%100/10;
				a7=num%1000/100;
				a6=num%10000/1000;
				a5=num%100000/10000;
				a4=num%1000000/100000;
				a3=num%10000000/1000000;
				A3=String.valueOf(a3);
				A4=String.valueOf(a4);
				A5=String.valueOf(a5);
				A6=String.valueOf(a6);
				A7=String.valueOf(a7);
				A8=String.valueOf(a8);
				A9=String.valueOf(a911);
				System.out.println(A9+A8+A7+A6+A5+A4+A3);
			}
			if (cont==8) {
				a911=num%10;
				a8=num%100/10;
				a7=num%1000/100;
				a6=num%10000/1000;
				a5=num%100000/10000;
				a4=num%1000000/100000;
				a3=num%10000000/1000000;
				a2=num%100000000/10000000;
				A9=String.valueOf(a911);
				A2=String.valueOf(a2);
				A3=String.valueOf(a3);
				A4=String.valueOf(a4);
				A5=String.valueOf(a5);
				A6=String.valueOf(a6);
				A7=String.valueOf(a7);
				A8=String.valueOf(a8);
				System.out.println(A9+A8+A7+A6+A5+A4+A3+A2);
			}
			if (cont==9) {
				a911=num%10;
				a8=num%100/10;
				a7=num%1000/100;
				a6=num%10000/1000;
				a5=num%100000/10000;
				a4=num%1000000/100000;
				a3=num%10000000/1000000;
				a2=num%100000000/10000000;
				a1=num%1000000000/100000000;
				A1=String.valueOf(a1);
				A2=String.valueOf(a2);
				A3=String.valueOf(a3);
				A4=String.valueOf(a4);
				A5=String.valueOf(a5);
				A6=String.valueOf(a6);
				A7=String.valueOf(a7);
				A8=String.valueOf(a8);
				A9=String.valueOf(a911);
				System.out.println(A9+A8+A7+A6+A5+A4+A3+A2+A1);
			}
		} while (num<-1);
	}
}
