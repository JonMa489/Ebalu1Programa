import java.util.Scanner;

public class Tablero {
	//CONSTANTES
	public static final int FILAS=8;
	public static final int COLS=8;
	
	public static void main(String[] args) {
		/*CREAR UN TABLERO DE AJEDREZ DE 8X8
		 * EN EL TABLERO ALMACENAREMOS UN CARACTER POR CADA FICHA: 'P' Peon, 'T' Torre, etc
		 * 
		 *  INICIALIZAR EL TABLERO A LA SITUACIÓN INICIAL
		 *  MOSTRAR EL TABLERO
		 *  
		 */

		//DECLARACION
		char [][]tablero;
		int filaOrig, colOrig, filaDest, colDest;
		
		//INSTANCIAR
		tablero=new char[FILAS][COLS];
		Scanner sc=new Scanner(System.in);
		
		/*tablero.length --> nº filas
		tablero[i].length --> nº de elementos en cada fila*/
		//INICIALIZAR EL TABLERO: VACIO (UN PUNTO)
		for(int fila=0;fila<FILAS;fila++) {
			for(int col=0;col<COLS;col++) {
				tablero[fila][col]='.';
				System.out.print(tablero[fila][col]+" ");
		}
			System.out.println();
		}
				
		System.out.println();
		System.out.println();
		//INICILIZAR EL TABLERO A LA POSICIÓN INICIAL
		tablero[0][0]='T';
		tablero[0][1]='C';
		tablero[0][2]='A';
		tablero[0][3]='R';
		tablero[0][4]='X';
		tablero[0][5]='A';
		tablero[0][6]='C';
		tablero[0][7]='T';
	
		//PARA LOS PEONES
		for(int col=0;col<COLS;col++) {
			//FILA 1
			tablero[1][col]='P';
		}
		
		//FILA 6
		for(int col=0;col<COLS;col++) {
			tablero[6][col]='P';
		}
		
		//LA ULTIMA FILA
		tablero[7][0]='T';
		tablero[7][1]='C';
		tablero[7][2]='A';
		tablero[7][3]='R';
		tablero[7][4]='X';
		tablero[7][5]='A';
		tablero[7][6]='T';
		tablero[7][7]='C';
		
		//MOSTRAR DE NUEVO EL TABLERO
		System.out.println("  0 1 2 3 4 5 6 7");
		for(int fila=0;fila<FILAS;fila++) {
			System.out.print(fila+" ");
			for(int col=0;col<COLS;col++) {
				System.out.print(tablero[fila][col]+" ");
			}
			System.out.println();
		}
		
		//PEDIR POR TECLADO UNA FILA Y UNA COLUMNA ORIGEN Y UNA FILA Y UNA COLUMNA DESTINO
		//Y MOVER LA FICHA DE LA CASILLA ORIGEN A LA CASILLA DESTINO
		System.out.print("Itroduce Fila origen: ");
		filaOrig=sc.nextInt();
		System.out.print("Itroduce Columna origen: ");
		colOrig=sc.nextInt();
		
		System.out.print("Itroduce Fila destino: ");
		filaDest=sc.nextInt();
		System.out.print("Itroduce Columna destino: ");
		colDest=sc.nextInt();
		
		tablero[filaDest][colDest]=tablero[filaOrig][colOrig];
		tablero[filaOrig][colOrig]='.';
		
		//VOLVER A MOSTRAR EL TABLERO
		System.out.println("  0 1 2 3 4 5 6 7 (NEGRAS)");
		for(int fila=0;fila<FILAS;fila++) {
			System.out.print(fila+" ");
			for(int col=0;col<COLS;col++) {
				System.out.print(tablero[fila][col]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		//MOSTRAR EL TABLERO CON LAS NEGRAS A LA IZQUIERDA Y LAS BLANCAS A LA DERECHA
		for(int col=COLS-1;col>=0;col--) {

			for(int fila=0;fila<FILAS;fila++) {
				System.out.print(tablero[fila][col]+" ");
			}
			System.out.println();
		}
	}
}






