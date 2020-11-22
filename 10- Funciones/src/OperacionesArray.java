import java.util.Scanner;

public class OperacionesArray {
	//ARRAY DE 10 ELEMENTOS INICIALMENTE VAC�O. 
	//ENTRE VARIOS ELEMENTOS NO PUEDE HABER POSICIONES VACIAS
	/*MEDIANTE FUNCIONES:
	 * leernumeros: LEER NUMEROS POR TECLADO HASTA QUE SE TECLEE EL 0 Y GUARDARLOS EN 
	 * 				POSICIONES SUCESIVAS DEL ARRAY. EL 0 NO SE GUARDA, Y LA FUNCI�N
	 * 				MOSTRAR� UN MENSAJE SI EL ARRAY YA EST� LLENO. DEVUELVE EL NUMERO DE 
	 * 				NUMEROS INTRODUCIDOS EN EL ARRAY.
	 * MEN� PRINCIPAL:
	 * menu: Muestra por pantalla el siguiente menu:
	 * 		0.- Mostrar array
	 * 		1.- A�adir elemento por el final
	 * 		2.- Eliminar elemento
	 * 		3.- Insertar elemento en una posici�n
	 * 		4.- Fin de programa
	 * 		ELIGE UNA OPCI�N: 
	 * 		CONTROLA QUE LA OPCION ELEGIDA SEA CORRECTA Y DEVUELVE ESA OPCI�N.
	 * 
	 * aniadir: RECIBE COMO PARAMETROS EL ARRAY, EL ELEMENTO A A�ADIR Y EL NUMERO DE ELEMENTOS
	 * 			QUE HAY EN EL ARRAY. DEVUELVE EL CONTADOR ACTUALIZADO.
	 * 
	 * eliminar: ELIMINA EL �LTIMO ELEMENTO DEL ARRAY, SI HAY ALGUNO. DEVUELVE EL CONTADOR 
	 * 			 ACTUALIZADO
	 * 
	 * insertar: PARAMETROS: ARRAY, NUMERO, POSICI�N A INSERTAR Y EL NUMERO DE ELEMENTOS QUE 
	 * 			 HAY EN EL ARRAY. INSERTA EL ELEMENTO, SI EL ARRAY NO EST� LLENO, DESPLAZANDO
	 * 			 UNA POSICI�N A LA DERECHA LOS ELEMENTOS QUE EST� A PARTIR DE ESA POSICI�N.
	 * 			 DEVUELVE EL CONTADOR ACTUALIZADO. 
		*/
	public static int TAM=10;
	public static void main(String[] args) {
		int[] numeros;
		int numElementos;
		int opcion, num, pos;
		Scanner sc=new Scanner(System.in);
		
		numeros=new int[TAM];
		numElementos=0;
		numElementos=leerNumeros(numeros, numElementos);
		mostrarArray(numeros);
		do {
			opcion=menu();
			switch(opcion) {
				case 0: mostrarArray(numeros);
						break;
				case 1: System.out.println("Teclea el numero para a�adir al array: ");
						num=sc.nextInt();
						numElementos=aniadir(numeros, num, numElementos);
						break;
				case 2: numElementos=eliminar(numeros, numElementos);
						break;
				case 3: System.out.println("Teclea el numero para insertar en el array: ");
						num=sc.nextInt();
						System.out.println("Teclea la posici�n en la que quieres insertar: ");
						pos=sc.nextInt();
						numElementos=insertar(numeros, pos, num, numElementos);
						break;
				case 4: System.out.println("Fin de programa");
						break;
			}

		}while(opcion!=4);
	}
	
	private static int eliminar(int[] numeros, int numElementos) {
		if(numElementos==0) {
			return numElementos;
		}else {
			numeros[numElementos-1]=0;//numElementos es la primera posicion vacia
			numElementos--;
			return numElementos;
		}
	}

	private static int insertar(int []numeros, int pos, int num, int numElementos) {
		//CASOS ESPECIALES
		//array lleno
		if(numElementos==10) {
			return numElementos;
		}
		if(pos>numElementos){//la posicion este fuera de los elementos del array
			return numElementos;
		}
		//SE PUEDE INSERTAR
		//DESPLAZAR TODOS LOS ELEMENTOS DESDE EL FINAL HASTA LA POS UNA POSICION A LA DERECHA
		for(int i=numElementos;i>=pos;i--) {
			numeros[i]=numeros[i-1];
		}
		//ASIGNAR EL NUMERO A LAPOSICION
		numeros[pos-1]=num;
		numElementos++;
		return numElementos;
	}
	
	private static int aniadir(int[] numeros, int num, int numElementos) {
		if(numElementos==10) {
			return numElementos;
		}else {
			numeros[numElementos]=num;
			numElementos++;
			return numElementos;
		}
	}

	private static void mostrarArray(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
		System.out.println();
	}

	private static int menu() {
		int opc;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("MENU PRINCIPAL:");
		System.out.println("0.- Mostrar array");
		System.out.println("1.- A�adir elemento por el final");
		System.out.println("2.- Eliminar �ltimo elemento");
		System.out.println("3.- Insertar elemento en una posici�n");
		System.out.println("4.- Fin de programa");
		do {
			System.out.print("ELIGE UNA OPCI�N [0..4]: ");
			opc=sc.nextInt();
		} while(opc<0 || opc>4);
		return opc;
	}

	private static int leerNumeros(int[] numeros, int numElementos) {
		Scanner sc=new Scanner(System.in);
		int num;
		do {
			System.out.print("Introduce numero "+(numElementos+1)+" (10 como mucho, 0 para terminar): ");
			num=sc.nextInt();
			if(num!=0) {
				numeros[numElementos]=num;
				numElementos++;
			}
			if(numElementos==10) {
				System.out.println("El array est� lleno. Ya no se pueden introducir m�s n�meros");
			}
		}while(num!=0 && numElementos<10);
		return numElementos;
	}
	
	
}



