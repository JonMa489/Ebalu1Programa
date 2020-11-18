import java.util.Scanner;

public class SumaPotencias {

	public static void main(String[] args) {
		//PROGRAMA que, mediante llamadas a la funcion potencia, calcula la suma
		//de las potencias de un numero elevado a si mismo, desde el 1 a un numero 
		//introducido por teclado
		double sumaPot = 0;
		int num;
		//FUNCION POTENCIA:
		//CALCULA Y DEVUELVE COMO UN DOUBLE LA POTENCIA DE UN NUMERO ENTERO POSITIVO ELEVADO 
		//A OTRO NUMERO ENTERO POSITIVO
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		num=sc.nextInt();
		for (int i = 0; i <=num; i++) {
			sumaPot=sumaPot+potencia(i, i);
		}
		System.out.println("La suma de las potencias es: "+sumaPot);
	}
	public static double potencia(int base, int exp){
		double res;
		res=base;
		for (int i = 0; i < exp; i++) {
			res=res*base;
		}
		return res;
	}

}
