
public class CopiarArray {

	public static void main(String[] args) {
		// LLENAR UN ARRAY EN 50 ELEMNETOS CON NUMEROS ALEATORIOS  ENTEROS POSITIVOS DE DOS
		//DIGITOS
		//MOSTRAR EL ARRAY (10ELEMENTOS POR FILA)
		//COPIAR LOS ELEMENTOS DE LA POSICIONES IMPARES DEL ARRAY EN OTRO ARRAY  DE 25 ELEMENTOS (INICIALMENTE VARIOS)
		// MOSTRAR EL CONTENIDO DE ESTE ARRAY DE 25 ELEMENTOS (10 FILA)
		
		int cont, i;
		int [] numeros, numeros1;
		numeros=new int [50];
		numeros1=new int [25];
		//LLENAR EL ARRAY CON NUMEROS ALEATORIOS
		for  (cont= 0; cont <numeros.length; cont++) {
			numeros[cont] = (int) (Math.random()*90+1);
		}
			//mostrar array
		for (cont = 0; cont < numeros.length; cont++) {
			if(cont%10==0) {
				System.out.println();
			}
			System.out.println(numeros[cont]+" ");
		}
		//copiar los elementos de un array sobre el segundo
		for (cont = 0; cont < numeros1.length; cont++) {
			numeros[cont]= numeros1(1*2);
		}
		//otra forma
		for (cont = 0; cont < numeros.length; cont++) {
			if(cont%2==0) {
				numeros1[1/2]=numeros[cont];
			}
		}
		//mostrar el contenido de segundo array
		System.err.println();
		System.out.println();
		
		
		
		
	}

}
