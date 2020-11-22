import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {
		//LEER UN NUMERO POR TECLADO Y MOSTRAR UN MENSAJE INDICANDO SI ES PRIMO O NO
		int num, cont, contPrimos;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduce un número: ");
		num=sc.nextInt();
		if(esPrimo(num)) {
			System.out.println("SI es primo");
		}else {
			System.out.println("No es primo");
		}
		
		//PROGRAMA QUE MUESTRE POR PANTALLA LOS n PRIMEROS NUMEROS PRIMOS, SIENDO n UN 
		//NUMERO INTRODUCIDO POR TECLADO
		contPrimos=0;
		cont=1;
		while(contPrimos<=num) {
			if(esPrimo(cont)) {
				System.out.print(cont+" ");
				contPrimos++;
				if(contPrimos%10==0) {
					System.out.println();
				}
			}
			cont++;
		}
		
		//OTRA FORMA
		contPrimos=0;
		for(cont=1;contPrimos<=100;cont++) {
			if(esPrimo(cont)) {
				contPrimos++;
				System.out.println(cont+" ");
			}
		}
	}
	
	//FUNCIÓN QUE ME DIGA SI UN NUMEROS ES PRIMO O NO
	//FUNCION QUE DEVUELVA VERDADERO SI EL NUMERO RECIBIDO COMO PARAMETRO ES PRIMO,
	//Y FALSO EN CASO CONTRARIO
	public static boolean esPrimo(int num) {
		//contar el numero de divisores del numero desde el 1 hasta sí mismo
		//si solo hay DOS, el número es primo
		int cont;
		cont=0;
		int i=2;
		
		while(i<num) {
			if(num%i==0) {
				return false;
			}
			i++;
		}
		return true;
		
		/*for (int i = 2; i < num; i++) {
			if(num%i==0) {
				cont++;
			}
		}
		
		/*if(cont==2) {
			return true;
		}else {
			return false;
		}*/
		//return (cont==0);
	
	}

}
