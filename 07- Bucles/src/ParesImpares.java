import java.util.Scanner;

public class SumaParesImpares {
	public static void main(String[] args) {
		/*PROGRAMA QUE MUESTRE EL SIGUIENTE MENU POR PANTALLA:
			1.- Sumar Pares
			2.- Sumar impares
			3.- Sumar Todos
			4.- Fin de programa
		UNA VEZ ELEGIDA LA OPCIÓN EL PROGRAMA REALIZARÁ LA OPERACIÓN CORRESPONDIENTE CON LOS 
		NUMEROS INTRODUCIDOS POR TECLADO HASTA QUE SE TECLEE EL 0, MOMENTO EN EL QUE MOSTRARÁ
		EL RESULTADO.
		EJEMPLO:
			1.- Sumar Pares
			2.- Sumar impares
			3.- Sumar Todos
			4.- Fin de programa
			Elige una opción: 1
			Introduce un nº (0 para finalizar): 4
			Introduce un nº (0 para finalizar): 23
			Introduce un nº (0 para finalizar): 46
			Introduce un nº (0 para finalizar): 100
			Introduce un nº (0 para finalizar): 9
			Introduce un nº (0 para finalizar): 0
			La suma de los números PARES introducidos es: 150
			
			
			1.- Sumar Pares
			2.- Sumar impares
			3.- Sumar Todos
			4.- Fin de programa
			Elige una opción:
			*/
		int num, sumaPares, sumaImpares, sumaTodos, opcion;
		System.out.println("Introduce un numero para calcular el factorial (Negativo para finalizar): ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
	
		do {
			System.out.println("1.- Sumar Pares");
			System.out.println("1.- Sumar Impares");
			System.out.println("1.- Sumar Todos");
			System.out.println("1.- Fin programa");
			System.out.println("Elige opcion [1..4]");
			opcion=sc.nextInt();

			sumaPares=0;
			sumaImpares=0;
			sumaTodos=0;
			if(opcion!=4) {
				
				do {
					System.out.println("Introduce un numero (0 para terminar): ");
					num=sc.nextInt();
					if(num%2==0) {
						sumaPares=sumaPares+num;
					} else {
						sumaImpares=sumaImpares+num;
					}
					sumaTodos=sumaTodos+num;
					
				}while(num!=0);
			}
			switch(opcion) {
				case 1: System.out.println("La suyma de los PARES es: "+sumaPares);
						break;
				case 2: System.out.println("La suyma de los IMPARES es: "+sumaImpares);
						break;
				case 3: System.out.println("La suyma de TODOS es: "+sumaTodos);
						break;
				case 4: System.out.println("Fin de programa");
			}
		} while(opcion!=4);
		
		
		//DECLARACION DE VARIABLES
		
		//INICIALIZACION
		
		/*mientras (opcion de menu!=4)
		 		leer opcion
		 		mientras num!=0
		 			pedir numero
		 			leer numero
		 			si num es par
		 				sumarlo como par
		 			sino
		 				sumarlo como impar
		 			si opción=1
		 				mostrar suma pares
		 			si opcion=2
		 				mostrar sumaimpares
		 			si opcion=3
		 				mostrar suma total
		 		fin mientras
		  fin mientras
		 */
	}
}
