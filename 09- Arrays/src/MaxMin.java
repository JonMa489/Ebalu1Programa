
public class MaxMin {

	public static void main(String[] args) {
		// PROGRAMA QUE LLENE UN ARRAY DE 20 ELEMENTOS CON NUMEROS ENTEROS PARES DE DOS
		// DIGITOS
		// MOSTRAR EL ARRAY POR PANTALLA.
		// MOSTRAR POR PANTALLA EL MAXIMO Y EL MINIMO QUE HAY EN EL ARRAY
		// LLEVAR EL MAXIMO A LA ULTIMA POSICION DEL ARRAY Y EL MINIMO A LA PRIMERA
		// INTERCAMBIANDO SUS CONTENIDOS CON LOS DE ESAS POSICIONES
		// VOLVER A MOSTRAR EL ARRAY

		//VARIABLES
		int [] numeros;
		int i, mayor = 0, menor = 100, posmayor=0, posmenor=0;
		numeros=new int[20];
		//LLENAR EL ARRAY
		for  (i= 0; i <numeros.length; i++) {
			numeros[i] = (int) (Math.random()*45+5)*2;
			System.out.print(numeros[i]+" ");
		}
		//HAY OTRA FORMA (BUSCARLA EN SCHOOLOGY)
		//BUSCAR EL MAXIMO Y EL MINIMO POR PANTALLA
		for (i = 0; i < numeros.length; i++) {
			if (numeros[i]>mayor) {
				mayor=numeros[i];
				posmayor=i;
			}	
			if (numeros[i]<menor) {
				menor=numeros[i];
			}
		}
		System.out.println();
		System.out.println("El mayor es: "+ mayor);
		System.out.println("El menor es: "+ menor);
		//INTERCAMBIAR MAYOR Y MENOR CON LOS DE LAS POSICIONES ULTIMA Y PRIMERA
		numeros[posmayor]=numeros[numeros.length-1];
		numeros[numeros.length-1]=mayor;
		numeros[posmenor]=numeros[0];
		numeros[0]=menor;
		//VOLVER A MOSTRAR EL ARRAY
		for (i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+" ");
			
		}
		
	}
}
