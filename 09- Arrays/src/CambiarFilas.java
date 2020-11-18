import java.util.Scanner;

public class CambiarFilas {
	public static final int FILAS=6;
	public static final int COLS=10;
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//ARRAY BIDIMENSIONAL DE 6 FILAS Y 10 COLUMNAS
		//LLENARLO CON NUMEROS ALEATORIOS ENTEROS POSITIVOS DE DOS DIGITOS
		//MOSTRAR POR PANTALLA

		// Fila 1: 23 54 58 98 54 21 54 25 30
		// Fila 2: 32 35

		//PEDIR LOS NUMEROS DE DOS FILAS POR TECLADO (FORZAR QUE ESTEN ENTRE 1 Y 6)
		//INTERCAMBIAR LOS ELEMENTOS DE LAS DOS FILAS

		//VOLER A MOSTRAR EL ARRAY CON LAS FILAS CAMBIADAS

		//VARIABLES
		int[][] numeros;
		int fila, col, fila1, fila2;
		Scanner sc=new Scanner(System.in);
		numeros=new int [FILAS][COLS];
		//LLENARLO CON NUMEROS ALEATORIOS ENTEROS POSITIVOS DE DOS DIGITOS
		for (int i = 0; i < numeros.length; i++) {
			for (int j= 0; j <numeros[0].length; j++) {
				numeros[i][j] = (int) (Math.random()*90+10);
			}
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Fila "+(i+1)+": ");
			for (int j = 0; j < numeros[0].length; j++) {
				System.out.print(numeros[i][j]+" ");
			}
			System.out.println();
		}
		//Pedir FILA y COL
		do {
			System.out.println("Introduce numero de primera fila (1-6): ");
			fila1 = sc.nextInt();
			System.out.println("Introduce numero de segunda fila (1-6): ");
			fila2= sc.nextInt();
		} while (fila1<1 || fila1>6 || fila2<1 || fila2>6);
		//INTERCAMBIAR LAS DOS FILAS
		int aux;
		for (int i = 0; i < numeros.length; i++) {
			aux=numeros[fila1-1][i];
			numeros[fila1-1][1]=numeros[fila2][i];
			numeros[fila2-1][i]=aux;
		}
		//VOLVER A MOSTRAR
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Fila "+(i+1)+": ");
			for (int j = 0; j < numeros.length; j++) {
				System.out.print(numeros[i][j]+" ");
			}
			System.out.println();
		}
	}
}
