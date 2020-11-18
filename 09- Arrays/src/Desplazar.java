
public class Desplazar {

	public static void main(String[] args) {
		//LLENAR UN ARRAY DE 30 ELEMENTOS CON NUMEROS ALEATORIOS ENTEROS POSITIVOS
		//MENORES QUE 100.
		//MOSTRAR EL ARRAY, 15 NUMEROS POR LINEA
		//DESPLAZAR TODOS LOS ELEMENTOS DEL ARRAY UNA POSICION A LA DERECHA, DE FORMA QUE
		//EL CONTENIDO DE LA PRIMERA POSICION PASE A LA SEGUNDA, EL DE LA SEGUNDA A LA 
		//TERCERA, ETC..., Y EL DE LA ULTIMA A LA PRIMERA
		//VOLVER A MOSTRAR EL ARRAY
		int i, aux;
		int mayor=0, menor=0;
		int [] numeros;
		numeros=new int[30];
		//LLENAR EL ARRAY
		for  (i= 0; i <numeros.length; i++) {
			if (i%15==0) {
				System.out.println();
			}
			numeros[i] = (int) (Math.random()*90+10);
			System.out.print(numeros[i]+" ");
		}
		aux=numeros[numeros.length-1];//guardamos el ultimo
		//DESPLAZAR TODOS LOS ELEMENTOS UNA POSICION A LA DERECHA
		for (i = numeros.length-1; i < 0; i--) {
			numeros[i-1]=numeros[i];
		}
		//el de la ultima pos que estaba guardado en aux, se mete en la pos 0
		numeros[0]=aux;
		//volver a mostrar el array
		System.out.println();
		for (int i = 0; i < numeros.length; i++) {
			
		}
		//SIN TERMINAR EL FINAL



	}

}

