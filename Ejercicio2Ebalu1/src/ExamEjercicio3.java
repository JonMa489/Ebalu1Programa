import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExamEjercicio3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter pw, l;
		int numEstudios;
		String nombre, clases; 
		try {
			sc=new Scanner(File(/Ejercicio2Ebalu1/src/Alumnado.txt));
			System.out.println("Escribe tu nombre");
			pw.println();
			System.out.println("Cuantas asignaturas tienes; ");
			numEstudios=sc.nextInt();
			for (int i = 0; i < numEstudios; i++) {
				System.out.println("Escribe los nombres de las asignaturas;");
				l.println();
			}
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe");
			System.exit(0);
			
		}
	}

}
