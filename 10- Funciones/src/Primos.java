import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {
		//LEEN UN NUMERO POR TECLADO Y MOSTRAR UN MENSAJE INDICANDO SI ES PRINERO O NO
		//FUNCION QUE ME DIGA SI UN NUMERO ES PRIMO O NO.
		//FUNCION QUE DEVUELVA VERDADERA EN EL NUMERO RECIBIDO COMO PARAMETRO ES PRIMO.
		//FALSO EN CASO CONTRARIO
		@SuppressWarnings("unused")
		int num,contPrimos, cont=1;
		@SuppressWarnings({"resource" })
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		num=sc.nextInt();
		System.out.println(esPrimo(num));
		
		
		while (contPrimos<=num) {
			if (esPrimo(cont)) {
				System.out.println(cont+" ");
				if () {
					System.out.println();
				}
			}
		}
		for (cont = 1; contPrimos<=100; cont++) {
			if (esPrimo(cont)) {
				contPrimos++;
				System.out.println(cont+" ");
			}
		}
	}
	public static boolean esPrimo(int num	) {
		int cont=0,num1;
		//CONTAR EL NUMERO DE DIVISORES DEL NUMERO DESDE EL 1 HASTA EL SI MISMO
		//SI SOLO HAY DOS, EL NUMERO ES PRIMO
		for (int i = 1; i <=num; i++) {
			if (num%i==0) { 
				cont++;
			}
		}
		
		if (cont==2) {
			return true;
		}else{
			return false;
		}
		
	}
}
