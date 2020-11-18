
public class SumaMayor {
	public static final int FILAS=10;
	public static final int COLS=15;

	/*FUNCIONES:
	 * LLENAR: LLENAR EL ARRAY RECIBIDO COMO PARAMETRO CON NUMEROS ALEATORIOS ENTRE 1 Y 99
	 * MOSTRAR: MOSTRAR EL ARRAY RECIBIDO COMO PARAMETRO POR PANTALLA
	 * FILA MAYOR: RECIBE UN ARRAY BIDIMENSIONAL COMO PARAMETRO Y DEVUELVE EL NUMERO DE FILA CUYA SUMA SEA LA MAYOR
	 * SUMARFILA:RECIBO COMO PARAMETRO UN ARRAY BIDIMENSIONAL Y UN NUMERO DE FILA Y DEVUELVE LA SUMA DE DICHA FILA
	 * 
	 */
	public static void main(String[] args) {
		/*ARRAY DE 10X15
		 * LLENARLO
		 * MOSTRARLO
		 * OBTENER EL NUMERO DE FILA CUYA SUMA ES LA MAYOR
		 * OBTENER LA SUMA DE DICHA FILA
		 */
		//VARIABLES
		int [][]array1; 
		array1=new int[FILAS][COLS];



		llenar(array1);
		mostrar(array1);
	    filamayor(array1);
	    System.out.println();
	    System.out.println("La fila cuya suma es la mayor es:"+filamayor(array1));
	    
	}
	public static void llenar(int[][]array1) {
		for  (int i= 0; i <array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array1[i][j] = (int) (Math.random()*99+1);
			}
		}
	}
	public static void mostrar(int[][]array1) {
		for  (int i= 0; i <array1.length; i++) {
			System.out.println();
			for (int j = 0; j < array1[0].length; j++) {
				System.out.print(array1[i][j]+"  ");
			}
		}
	}
	public static int filamayor(int[][]array1) {
		int sumarfilas=0;
		int sumamayor=0;
		int numfila=0;
		for (int i = 0; i <FILAS; i++) {
			for (int j = 0; j < COLS; j++) {
				sumarfilas=sumarfilas+array1[i][j];
			}
			if (sumarfilas>sumamayor) {
				sumamayor=sumarfilas;
				numfila=i;
			}
		}
		return numfila;
	}
}