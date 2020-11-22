
public class Desplazar {

	public static void main(String[] args) {
		//LLENAR UN ARRAY DE 30 ELEMENTOS CON NUMEROS ALEATORIOS ENTEROS POSITIVOS
		//MENORES QUE 100.
		//MOSTRAR EL ARRAY, 15 NUMEROS POR LINEA
		//DESPLAZAR TODOS LOS ELMENTOS DEL ARRAY UNA POSICIÓN A LA DERECHA, DE FORMA QUE
		//EL CONTENIDO DE LA PRIMERA POSICIÓN PASE A LA SEGUNDA, EL DE LA SEGUNDA A LA
		//TERCERA, ETC..., Y EL DE LA ÚLTIMA A LA PRIMERA
		//VOLVER A MOSTRAR EL ARRAY
		int[] numeros;
		numeros=new int[30];
		
		//LLENAR EL ARRAY
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=(int)(Math.random()*100);
		}
		
		//MOSTRAR EL ARRAY
		for (int i = 0; i < numeros.length; i++) {
			if(i%15==0) {
				System.out.println();
			}
			System.out.print(numeros[i]+" ");
			
		}
		
		int aux;
		aux=numeros[numeros.length-1];//guardamos el ultimo
		//DESPLAZAR TODOS LOS ELEMENTOS UNA POS A LA DERECHA
		for (int i = numeros.length-1; i > 0; i--) {
			numeros[i]=numeros[i-1];
		}
		//el de la ultima pos que estaba guardado en aux, se mete en la pos 0
		numeros[0]=aux;
		//VOLVER A MOSTRAR EL ARRAY
		System.out.println();
		for (int i = 0; i < numeros.length; i++) {
			if(i%15==0) {
				System.out.println();
			}
			System.out.print(numeros[i]+" ");

		}

		
	}

}
