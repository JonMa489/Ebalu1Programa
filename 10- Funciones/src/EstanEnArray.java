import java.util.Scanner;

public class EstanEnArray {

	//FUNCIONES:
	//LLENAR ARRAY: FUNCIÓN QUE LLENA EL ARRAY RECIBIDO COMO PARAMETRO CON 25 NUMEROS 
	//ALEATORIOS ENTEROS POSITIVOS MENORES QUE 100.
	
	//MOSTRAR ARRAY: FUNCION QUE MUESTRA POR PANTALLA EL ARRAY RECIBIDO COMO PARÁMETRO
	
	//ESTAN: FUNCIÓN QUE DEVUELVA true SI LOS DOS NUMEROS RECIBIDOS COMO PARAMETROS
	//ESTÁN EN EL ARRAY RECIBIDO COMO PARAMETRO, Y false EN CASO CONTRARIO
	
	public static void main(String[] args) {
		//MEDIANTE LLAMADAS A LAS TRES FUNCIONES:
		//LLENAR EL ARRAY DE 25 NUMEROS --> LLAMARA A LLENAR
		//MOSTRARLO POR PANTALLA --> LLAMADA A MOSTRAR
		//LEER DOS NUMEROS POR TECLADO
		//DECIR SI LOS DOS NUMEROS ESTÁN O NO --> LLAMADA A ESTAN
		
		int [] numeros;
		int num1, num2;
		Scanner sc;
		numeros=new int[25];
		sc=new Scanner(System.in);
		llenar(numeros);
		mostrar(numeros);
		//LEER LOS DOS NUMEROS POR TECLADO
		System.out.println("introduce numero 1: ");
		num1=sc.nextInt();
		System.out.println("introduce numero 2: ");
		num2=sc.nextInt();
		
		if(estan(numeros, num1, num2)) {
			System.out.println("Los dos numeros SI estan");
		}else {
			System.out.println("Los dos numeros NO estan");
		}
		
		
	}
	
	private static boolean estan(int[] numeros, int num1, int num2) {
		boolean esta1, esta2;
		esta1=false;
		esta2=false;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]==num1) {
				esta1=true;
			}
			if(numeros[i]==num2) {
				esta2=true;
			}
		}
		
		return esta1 && esta2;
	}

	public static void llenar(int []numeros) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=(int)(Math.random()*100);
		}
	}
	
	public static void mostrar(int [] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
	}
	
	
}






