
public class Bidimensional {
	public static final int FILAS=6;
	public static final int COLS=8;
	/*FUNCIONES:
	 * 		- LLENAR ARRAY: RECIBE COMO PARAMETRO UN ARRAY BIDIMENSIONAL Y LO LLENA CON NUMEROS ALEATORIOS DE 1 A 10
	 * 		- MOSTRAR: MUESTRA EL ARRAY RECIBIDO COMO PARAMETRO POR PANTALLA	
	 * 		- SUMAFILASCOLS: RECIBE COMO PARAMETRO EL ARRAY BIDIMENSIONAL Y LOS DOS UNIDIMENSIONALES Y GUARDA LA SUMA 
	 * 		  DE LAS FILAS EN UNO Y LA SUMA DE COLUMNAS EN OTRO
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*TENEMOS 3 ARRAYS DE NUMEROS ENTEROS
		 * ARRAY 1: BIDIMENSIONAL DE 6X8
		 * ARRAY 2: ARRAY DE 6 ELEMENTOS
		 * ARRAY 3: ARRAY DE 8 ELEMENTOS
		 * MEDIANTE LLAMADAS A FUNCIONES:
		 * 		- LLENAR EL ARRAY BIDIMENSIONAL CON NUMEROS ALEATORIOS ENTRE 1 Y 10
		 * 		- MOSTRAR EL ARRAY BIDIMENSIONAL
		 * 		REALIZAR LA SUMA POR FILAS DEJANDO EL RESULTADO EN UN DE LOS ARRAYS
		 * 		Y LA SUMA POR COLUMNAS DEJANDO EL RESULTALDO EN EL OTRO ARRAY
		 * 		- MOSTRR OS DOS ARRAYS UNIDIMENSIONALES
		 */
		//VARIABLES
		int [][]array1; 
		array1=new int[FILAS][COLS];
		int []array2;
		array2=new int[FILAS];
		int []array3;
		array3=new int[COLS];
		llenar(array1);
		mostrar(array1);
	}
	public static void llenar(int[][]array1) {
		for  (int i= 0; i <array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array1[i][j] = (int) (Math.random()*10);
			}

		}
	}
	public static void mostrar(int[][]array1) {
		for  (int i= 0; i <array1.length; i++) {
			System.out.println();
			for (int j = 0; j < array1.length; j++) {
				System.out.print(array1[i][j]+" ");
			}

		}
	}
	public static void sumaFilasCols(int[][]array1, int[]array2,int[]array3) {
	}
}