
public class OrdenarArray {

	public static void main(String[] args) {
		/*LLenar un array de 20 elementos con numeros aleatorios positivos menores que 100
		 * mostrar el array
		 * ordenar el array por el metodo de la burbuja
		 * volver a mostar el array
		 */
		int[] numeros;
		int aux;
		int cont1 = 0, cont2 = 0;
		numeros=new int[20];
		//LLENAR Y MOSTRAR EL ARRAY
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=(int) (Math.random()*100);
			System.out.println(numeros[i]);
		}
		//ordenar el array
		for (int i = 0; i < numeros.length-1; i++) { //numero de pasadas en el array
			//recorrer el array desplazado el mayor hacia arriba
			for (int j = 0; j < numeros.length-1; j++) {
				cont1++;
				if (numeros[j]> numeros[j+1]) {
					cont2++;
					aux= numeros[j];
					numeros[j]=numeros[j+1];
					aux=numeros[j]+1;

				}
			}
		}
		System.out.print(numeros.length);
	}

}
