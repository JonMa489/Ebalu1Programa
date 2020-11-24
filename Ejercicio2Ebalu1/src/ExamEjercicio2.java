import java.util.Scanner;

public class ExamEjercicio2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//VARIABLES
		int cont = 0;
		int num;
		int[] numeros = new int[20];
		System.out.println("Escribe un numero (1-4): ");
		num=sc.nextInt();
		llenarArray(numeros);
		MaxVeces(numeros, num, cont);
		mostrar(numeros, cont);
	}
	public static void MaxVeces(int[]numeros,int num, int cont) {

		for  (int i= 0; i <numeros.length; i++) {
			if (numeros[i]==num) {
				cont++;
				//	for ( int j= 0; num == numeros.length; j++) {
				//	cont=j;

				//}

				//if (num<numeros[i] || num>numeros[i]) {

				//}
			}
		}
		System.out.println(cont);
	}
	public static void llenarArray(int[]llenarnumeros) {
		for (int i = 0; i < llenarnumeros.length; i++) {
			llenarnumeros[i]=(int)(Math.random()*4+1);
		}
	}
	public static void mostrar(int[]numeros, int cont) {
		System.out.println("\nArray de 20 numeros; ");
		for  (int i= 0; i <numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
		System.out.println("\nResultado de MaxVeces: "+ cont);

	}
}