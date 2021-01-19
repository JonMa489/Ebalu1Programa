import java.awt.FileDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Fichero {
	private File fichero;
	private Scanner sc;
	private ArrayList<String> arrayPalabras;

	
	public Fichero() {
		//carga las palabras en el arraylist
		String palabra;
		try {
			arrayPalabras=new ArrayList<String>();
			sc= new Scanner (new File("Palabra.txt"));
			while (sc.hasNextLine()) {
				palabra=sc.nextLine();
				arrayPalabras.add(palabra);
			}
			sc.close();
			//TAMBIEN SE PUEDE HACER CON UN DO WHILE;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("NO EXISTE EL FICHERO");
		}
	}
	public String obtenerPalabra () {
		// DEVUELVE UNA PALABRA ALEATORIA DEL ARRAYLIST
		Random r=new Random ();
		int pos = 0;
		String palabra;
		if (arrayPalabras.size()>0) {
			r.nextInt(arrayPalabras.size());
			palabra=arrayPalabras.get(pos);
			arrayPalabras.remove(pos);
			System.out.println(palabra);
			return palabra;
		}
		// QUE NO SE REPITAN LAS PALABRAS
		// SI NO QUEDAN PALABRAS, NO SEGUIMOS
		
		
		return null;
	}
}
