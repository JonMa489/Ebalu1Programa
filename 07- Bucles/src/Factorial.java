import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		//LEER NUMEROS ENTEROS POR TECLADO HASTA QUE SE TECLEE UN NUMERO NEGATIVO.
		//PARA CADA NUMERO SE MOSTRARÁ POR PANTALLA EL FACTORIAL DE DICHO NUMERO
		//num -> Entero
		//resultado (factorial) -> double
		//FACTORIAL: 7!=7*6*5*4*3*2*1
		//num!=num*(num-1)*(num-2)*(num-3)*.....*3*2*1
		int num, cont;
		double fact;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Introduce un numero para calcular el factorial (Negativo para finalizar): ");
			num=sc.nextInt();
			if(num>=0) {
				//CALCULAR EL FACTORIAL DE NUM
				fact=1;
				for(cont=num;cont>=1;cont--) {
					fact=fact*cont;
				}
				System.out.println(num+"="+fact);
			}
		}while(num>=0);
	}
}



