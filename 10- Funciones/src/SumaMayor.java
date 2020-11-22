
public class SumaMayor {
	/*FUNCIONES:
	 * llenar: llenar el array recibido como parametro con numeros aleatorios entre 1 y 99
	 * mostrar: mostrar el array recibido como parametro por pantalla
	 * filaMayor: recibe un array bidimensional como parametro y devuelve el NUMERO DE FILA
	 * 				cuya suma sea la mayor
	 * sumarFila: recibe como parametros un array bidimensional y un número de fila y 
	 * 				devuelve la suma de dicha fila
	 */
	public static final int FILAS=10;
	public static final int COLS=15;
	
	public static void main(String[] args) {
		/*ARRAY DE 10X15
			llenarlo
			mostrarlo
			obtener el número de fila cuya suma es la mayor, y mostrarlo
			obtener la suma de dicha fila, y mostrar el valor de dicha suma
			
			ARRAY DE 10X15:
			7 12 15 43 23 34 45 65 67 78 9 98 67 54 34
			...........
			...........
			..............
			43 45 56 76 87 98 9 23 43 12 23 34 34 45 56
			La fila cuya suma es la mayor es: 3
			Su suma es: 1580
			
		*/
		int[][] numeros;
		numeros=new int[FILAS][COLS];
		int mayor;
		llenar(numeros);
		mostrar(numeros);
		System.out.println();
		mayor=filaMayor(numeros);
		System.out.println("La fila cuya suma es la mayor es: "+mayor);
		System.out.println();
		System.out.println("la suma de esa fila es: "+sumarFila(numeros, mayor));
	}
	
	public static void llenar(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j]=(int)(Math.random()*99+1);
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
	
	public static int filaMayor(int[][] array) {
		int sumaFilas=0;
		int sumaMayor=0;
		int numFila=0;
		for (int i = 0; i < FILAS; i++) {
			sumaFilas=0;
			for (int j = 0; j < COLS; j++) {
				sumaFilas=sumaFilas+array[i][j];
			}
			if(sumaFilas>sumaMayor) {//cada vez que encuantro la fila mayor
				sumaMayor=sumaFilas;
				numFila=i;
			}
		}
		
		return numFila;
	}
	
	public static int sumarFila(int[][] array, int fila) {
		int suma=0;
		for (int i = 0; i < array[0].length; i++) {
			suma=suma+array[fila][i];
		}
		return suma;
	}
}