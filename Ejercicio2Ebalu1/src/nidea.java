public class nidea {
	public static void main(String[] args) {
		/*LLENAR UN ARRAY DE 20 ELEMENTOS CON NUMEROS ALEATORIOS POSITIVOS MENORES QUE 100.
		 * MOSTRAR EL ARRAY
		 * ORDENAR EL ARRAY POR EL MÉTODO DE LA BURBUJA
		 * VOLVER A MOSTRAR EL ARRA
		 */
		int[] numeros;
		int aux;
		numeros=new int[20];
		//LLENAR Y MOSTRAR EL ARRAY
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=(int)(Math.random()*100);
			System.out.print(numeros[i]+" ");
		}
		int cont1=0, cont2=0;
		boolean ordenado;
		//ordenar el array
		ordenado=false;
		for (int i = 0; i < numeros.length; i++) {//numero de pasadas en el array
			//recorrer el array desplazando el mayor hacia arriba
			if(ordenado) {
				break;
			}
			ordenado=true;
			for (int j = 0; j < numeros.length-i-1; j++) {
				cont1++;
				if(numeros[j]>numeros[j+1]) {
					cont2++;
					aux=numeros[j];
					numeros[j]=numeros[j+1];
					numeros[j+1]=aux;
					ordenado=false;
				}
			}
		}
		
		//volver a mostrar el array
		System.out.println();
		System.out.println("ARRAY ORDENADO:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
		System.out.println();
		System.out.println("Intercambios: "+cont2+" - Veces doble bucle: "+cont1);
		
	}
}
