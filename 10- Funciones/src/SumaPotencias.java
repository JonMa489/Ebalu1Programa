import java.util.Scanner;

public class SumaPotencias {
	
	public static void main(String[] args) {
		//PROGRAMA QUE, MEDIANTE LLAMADASSSSSSSS AL A FUNCIÓN POTENCIA, CALCULE LA SUMA
		//DE LAS POTENCIAS DE UN NUMERO ELEVADO A SÍ MISMO, DESDE EL 1 A UN NUMEROS 
		//INTRODUCIDO POR TECLADO
		double res, sumaPot;
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduce un numero: ");
		num=sc.nextInt();
		sumaPot=0;
		for (int i = 1; i <= num; i++) {
			sumaPot=sumaPot+potencia(i,i);
		}
		System.out.println("La suma de las potencias es: "+sumaPot);
		
	}
	
	//FUNCIÓN POTENCIA:
	//MEDIANTE MULTIPLICACIONES CALCULA Y DEVUELVE COMO UN DOUBLE LA POTENCIA DE UN 
	//NUMERO ENTERO POSITIVO ELEVADO A OTRO NUMERO ENTERO POSITIVO
	public static double potencia(int base, int exp) {
		double res;
		res=base;
		for (int i = 1; i < exp; i++) {
			res=res*base;
		}
		return res;
	}
}