import java.util.Scanner;

public class OperacionesArray {
	//ARRAY DE 10 ELEMENTOS INICIALMENTE VACIO
	//ENTRE VARIOS ELEMENTOS NO PUEDE HABER POSICIONES VACIAS.
	/*MEDIANTE FUNCIONES:
	 * leernumeros: LEER NUMEROS POR TECLADO HASTA QUE SE TECLEE EL 0 Y GUARDARLOS EN 
	 * 				POSICIONES SECESIVAS DEL ARRAY, EL 0 NO SE GUARDA, Y EN FUNCION 
	 * 				MOSTRARA UN MENSAJE SI EL ARRAY YA ESTA LLENO. DEVUELVE EL NUMERO 
	 * 				DE NUMEROS INTRODUCIDOS EN EL ARRAY.
	 * menu principal:
	 * menu: 		MUESTRA POR PANTALLA EL SIGUIENTE MENU:
	 * 					0.- Mostrar el array
	 * 					1.- Añadir elemento por el final
	 * 					2.- Eliminar elemento
	 * 					3.- Insertar elemento en una posicion
	 * 					4.- Fin de programa
	 * 				ELIGE UNA OPCION:
	 * 				CONTROLA QUE LA OPCION ELEGIDA SEA CORRECTA Y DEVUELVE ESA OPCION.
	 * 
	 * aniadir:		RECIBE COMO PARAMETROS EL ARRAY, EL ELEMENTO A AÑADIR Y EL NUMERO DE 
	 * 				ELEMENTOS QUE HAY EN EL ARRAY, DEVUELVA TRUE O FALSE.
	 * 
	 * eliminar: 	ELIMINA EL ULTIMO ELEMENTO DEL ARRAY, (SI HAY ALGUNO), DEVUELVE EL CONTADOR, ACTUALIZADO.
	 * 
	 * insertar: 	PARAMETROS: ARRAY, NUMERO,  POSICION A INSERTAR Y EL NUERO DE ELEMENTOS 
	 * 			 	QUE HAY EN EL ARRAY. INSERTA EL ELEMENTO, SI EL ARRAY NO ESTA A PARTIR DE ESA POSICION.
	 * 				DEVUELVE EL CONTADOR ACTUALIZADO.
	 * 			 	
	 */
	public static int TAM=10;
	public static void main(String[] args) {
		//VARIABLES
		int []numeros;
		int numElementos;
		int opcion = 0;
		Scanner sc=new Scanner(System.in);
		numeros=new int[TAM];
		numElementos=0;
		numElementos=leerNumeros(numeros, numElementos);
		do {
			//System.out.println("Elige una de estas opciones [0-4]: ");
			opcion=menu(opcion, numeros, opcion);
		} while (opcion!=4);
	}
	public static int leerNumeros(int[]numeros, int numElementos) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int a;
		do {
			System.out.println("Introduce los numeros deseados (Para finalizar introduzca 0): ");
			a=sc.nextInt();
			numeros[numElementos]=a;
			numElementos++;
		} while (a!=0);
		return numElementos;
	}
	private static int menu(int opcion, int []numeros, int numElementos) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("0º Mostrar array");
		System.out.println("1º Añadir elemento por el final");
		System.out.println("2º Eliminar elemento");
		System.out.println("3º Insertar el elemento en una posicion");
		System.out.println("4º Fin de programa");
		do {
			System.out.print("Elige una de estas opciones [0-4]: ");
			opcion=sc.nextInt();
			if (opcion>=5 || opcion<=-1) {
				System.out.println("Error, vuelve a intentar introducir un numero del [0-4]");
			}
				switch (opcion) {
				case 0:
					if (opcion==0) {
						System.out.println(numeros[numElementos]);
					}
					break;
				case 1:

					break;	
				}
			} while (opcion>=5 || opcion<=-1);
			/*do {
			System.out.print("Elige una de estas opciones [0-4]: ");
			opcion=sc.nextInt();
			if (opcion>=5 || opcion<=-1) {
				System.out.println("Error, vuelve a intentar introducir un numero del [0-4]");
			}
			if (opcion==0) {
				System.out.println(numeros[numElementos]);
			}
		} while (opcion>=5 || opcion<=-1);
			 */

			return opcion;
		}
		private static int aniadir() {
			return TAM;

		}
		private static int eliminar() {
			return TAM;

		}
		private static int insertar() {
			return TAM;

		}
	}
