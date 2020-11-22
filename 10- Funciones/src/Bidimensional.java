public class Bidimensional1 {
	public static final int FILAS=6;
	public static final int COLS=8;
	/*FUNCIONES:
	 * 	- llenar: RECIBE COMO PARAMETRO UN ARRAY BIDIMENSIONAL Y LO LLENA CON 
	 * 				NUMEROS ALEATORIOS DE 1 A 10
	 * 	- mostrarBidi: muestra el array recibido como parametro por pantalla
	 *  - mostrarUni: 
	 *  - sumaFilasCols: RECIBE COMO PARAMETRO EL ARRAY BIDIMENSIONAL Y LOS DOS 
	 *  				UNIDIMENSIONALES Y GUARDA LA SUMA DE LAS FILAS EN UNO
	 *  				Y LA SUMA DE COLUMNAS EN OTRO
	 */
	public static void main(String[] args) {
		/*TENEMOS 3 ARRAYS DE NUMEROS ENTEROS:
		 * ARRAY 1: BIDIMENSIONAL DE 6 X 8
		 * ARRAY 2: ARRAY DE 6 ELEMENTOS
		 * ARRAY 3: ARRAY DE 8 ELEMENTOS
		 * MEDIANTE LLAMADAS A FUNCIONES:
		 * 		- LLENAR EL ARRAY BIDIMENSIONAL CON NUMEROS ALEATORIOS ENTRE 1 Y 10
		 * 		- MOSTRAR EL ARRAY BIDIMENSIONAL
		 * 		REALIZAR LA SUMA POR FILAS DEJANDO EL RESULTADO EN UNO DE LOS ARRAYS
		 * 		Y LA SUMA POR COLUMNAS DEJANDO EL RESULTADO EN EL OTRO ARRAY
		 * 		- MOSTRAR LOS DOS ARRAYS UNIDIMENSIONALES
		 */
		
		//DECLARACION DE LOS ARRAYS
		int [][]array1;
		int [] sumaFilas, sumaCols;
		array1=new int[FILAS][COLS];
		sumaFilas=new int[FILAS];
		sumaCols=new int[COLS];
		
		llenar(array1);
		mostrar(array1);
		sumaFilasCols(array1, sumaFilas, sumaCols);
		
		System.out.println("Suma por Filas:");
		mostrarUni(sumaFilas);
		System.out.println();
		System.out.println("Suma por Columnas:");
		mostrarUni(sumaCols);
		System.out.println();
		System.out.println();
		System.out.println("AHORA MOSTRAMOS TODO");
		mostrarTodo(array1, sumaFilas, sumaCols);
	}
	
	public static void llenar(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j]=(int)(Math.random()*10);
			}
		}
	}

	public static void mostrar(int[][] array) {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLS; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void mostrarUni(int[] array) {
		for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]+" ");
		}
	}
		
	public static void mostrarTodo(int[][] array, int[] sumaFilas, int[] sumaCols) {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLS; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.print("- "+sumaFilas[i]);
			System.out.println();
		}
		//DESPUÉS DE MOSTRAR EL ARRAY BIDIMENSIONAL SE MUESTRA LA SUMA POR COLUMNAS
		System.out.println();
		for (int j = 0; j < COLS; j++) {
			System.out.print(sumaCols[j]+" ");
		}
	}
	
	public static void sumaFilasCols(int[][] array, int[] sumaFilas, int[] sumaCols) {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLS; j++) {
				sumaFilas[i]+=array[i][j];
				sumaCols[j]+=array[i][j];
			}
		}
	}
	
	
}
