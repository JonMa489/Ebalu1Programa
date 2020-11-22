import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class perfecto {
	
	//Programa que, mediante llamadas a la funci�n anterior, muestre los n�meros perfectos que hay 
	//entre 1 y 100.000
	//ESCRIBIR LOS NUMEROS PERFECTOS ENTRE 1 Y 100000 EN UN FICHERO LLAMADO perfectos.txt (UN 
	//NUMERO POR L�NEA). NO HAY QUE COMPROBAR SI EL FICHERO EXISTE O NO.

	public static void main(String[] args) {
		PrintWriter pw;
		
		try {
			pw=new PrintWriter(new File("perfect.txt"));
			for(int i=1;i<100000;i++) {
				if(esPerfecto(i)) {
					System.out.println(i);
					pw.println(i);
				}
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		System.out.println("Se acab�");
	}
	
	//Funci�n que devuelva true si el n�mero recibido como par�metro es perfecto y falso en caso 
		//contrario. 
		//(N�mero perfecto: n�mero que es igual a la suma de todos sus divisores incluyendo el 1, 
		//pero no a s� mismo)
		
	public static boolean esPerfecto(int num) {
		int suma=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				suma+=i;
			}
		}
		if(suma==num) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void escribirPerfectos() {
		
	}
}











