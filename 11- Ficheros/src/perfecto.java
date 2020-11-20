import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class perfecto {
	//Programa que, mediante llamadas a la funcion anterior, muestre los numeros perfectos que hay entre 1 y 100.000;
	public static void main(String[] args) {	
		//Funcion que devuelva true si el numero recibido como parametro es perfecto y falso en caso contrario
		//(Numero perfecto; numero que es igual a la suma de todos sus divisores incluyendo el 1, pero no a si mismo;
		@SuppressWarnings({ "unused", "resource" })
		Scanner sc=new Scanner(System.in);
		PrintWriter pw;
		try {
			pw=new PrintWriter (new File("perfect.txt"));
			for (int i = 1; i < 100000; i++) {
				if (esPerfecto(i)) {
					System.out.println(i);
					pw.println(i);
				}
			}
			pw.close();
		} catch (FileNotFoundException e) {
		}

		
		System.out.println("Se acabo");

	}
	public static boolean esPerfecto(int num) {
		int suma = 0;
		for (int i = 1; i < num; i++) {
			if (num%i==0) {
				suma=suma + i;
			}
		}
		if (suma==num) {
			return true;
		}else {
			return false;
		}

	}
}
