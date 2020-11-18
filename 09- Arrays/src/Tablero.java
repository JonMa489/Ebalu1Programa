import java.util.Scanner;

public class Tablero {
	public static final int FILAS=9;
	public static final int COLS=9;
	@SuppressWarnings("resource")
	public static void main (String[]args) {
		/* Crear un tablero de ajedrez de 8x8
		 * en el trablero almacenaremos un caracter por cada ficha:"P" Torre, etc
		 * 
		 * Inializar el tablero a la situacion inicial
		 * mostrar el tablero
		 */

		//CONSTANTES


		//DECLARACION
		Scanner sc;
		sc=new Scanner(System.in);
		//INTANCIAR
		int mover;
		char[][] tablero;
		tablero=new char[FILAS][COLS];
		//inializar el tablero: vacio (un espacio, un punto, un guion...)

		System.out.println();
		//Inicilizar el tablero a la posicion inicial
		for (int fila = 0; fila <FILAS; fila++) {
			for (int col=0;col<COLS;col++) {
				tablero[fila][col]='.';
				tablero [1][1]='T';
				tablero [1][2]='C';
				tablero [1][3]='A';
				tablero [1][4]='R';
				tablero [1][5]='X';
				tablero [1][6]='A';
				tablero [1][7]='C';
				tablero [1][8]='T';

				for (int col1 = 0; col1 < COLS; col1++) {
					//FILA 1
					tablero[2][col1]='P';
					//FILA 6
					tablero[7][col1]='P';
				}
				tablero [8][1]='T';
				tablero [8][2]='C';
				tablero [8][3]='A';
				tablero [8][4]='R';
				tablero [8][5]='X';
				tablero [8][6]='A';
				tablero [8][7]='C';
				tablero [8][8]='T';
				//NUMEROS
				tablero [0][1]='1';
				tablero [0][2]='2';
				tablero [0][3]='3';
				tablero [0][4]='4';
				tablero [0][5]='5';
				tablero [0][6]='6';
				tablero [0][7]='7';
				tablero [0][8]='8';

				tablero [1][0]='1';
				tablero [2][0]='2';
				tablero [3][0]='3';
				tablero [4][0]='4';
				tablero [5][0]='5';
				tablero [6][0]='6';
				tablero [7][0]='7';
				tablero [8][0]='8';
				System.out.print(tablero[fila][col]+" ");
			}
			System.out.println();
		}


		//PEDIR POR TECLADO UNA FILA Y UNA COLUMNA ORIGEN Y UNA FILA Y UNA COLUMNA DESTINO
		//Y MOVER LA FICHA DE LA CASILLA ORIGEN A LA CASILLA DESTINO


		/*VARIABLES NUEVAS
		 * 
		 * 
		 */
		int filaorig, colorigen;
		System.out.println("Introduce fila origen:");
		filaorig=sc.nextInt();
		System.out.println("Introduce Columna origen:");
		colorigen=sc.nextInt();

		//volver a mostrar el tablero
		System.out.println("  0 1 2 3 4 5 6 7");
		for (int fila = 0; fila < FILAS; fila++) {
			System.out.print(" ");
			for (int col = 0; col <COLS; col++) {
				System.out.print(tablero[fila][col]+ " ");
			}
			System.out.println();
		}

		//volver a mostra el tablero girado
		System.out.println("Escribe si quieres mover el tablero de lado: ");
		mover=sc.nextInt();
		
	}
}











