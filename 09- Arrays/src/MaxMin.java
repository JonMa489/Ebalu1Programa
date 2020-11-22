public class MaxMin {
	public static void main(String[] args) {
		//PROGRAMA QUE LLENE UN ARRAY DE 20 ELEMENTOS CON NUMEROS ALEATORIOS ENTEROS 
		//PARES DE DOS DÍGITOS.
		//MOSTRAR EL ARRAY POR PANTALLA.
		//MOSTRAR POR PANTALLA EL MÁXIMO Y EL MÍNIMO QUE HAY EN EL ARRAY
		
		/*LLEVAR EL PRIMER MAXIMO A LA ULTIMA POSICIÓN DEL ARRAY Y EL PRIMER MÍNIMO A LA P
		 * RIMERA, INTERCAMBIANDO SUS CONTENIDOS CON LOS DE ESAS POSICIONES.
		 * 
		 * VOLVER A MOSTRAR EL ARRAY
		 */
		
		int [] numeros;
		int num;
		int mayor, menor, posMayor, posMenor;
		numeros=new int[20];
	
		//LLENAR EL ARRAY
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=(int)(Math.random()*45+5)*2;
			System.out.print(numeros[i]+" ");
		}	
		
		//OTRA FORMA DE LLENAR EL ARRAY
		/*for (int i = 0; i < numeros.length; i++) {
			do {
				num=(int)(Math.random()*90+10);
			}while(num%2!=0);
			numeros[i]=num;
		}
		
		//OTRA FORMA
		for (int i = 0; i < numeros.length;) {
			num=(int)(Math.random()*90+10);
			if(num%2==0) {
				numeros[i]=num;
				i++;
			}
		}*/
		mayor=numeros[0];
		menor=numeros[0];
		posMayor=0;
		posMenor=0;
		//BUSCAR EL MÁXIMO Y EL MÍNIMO Y MOSTRARLOS POR PANTALLA
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]>mayor) {
				mayor=numeros[i];
				posMayor=i;
			}
			if(numeros[i]<menor) {
				menor=numeros[i];
				posMenor=i;
			}
			
		}
		System.out.println();
		System.out.println("El mayor es: "+mayor);
		System.out.println("El menor es: "+menor);
		//INTERCAMBIAR MAYOR Y MENOR CON LOS DE LAS POSICIONEWS ULTIMA Y PRIMERA
		numeros[posMayor]=numeros[numeros.length-1];
		numeros[numeros.length-1]=mayor;
		numeros[posMenor]=numeros[0];
		numeros[0]=menor;
		
		//VOLVER A MOSTRAR EL ARRAY
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}	
	}
}