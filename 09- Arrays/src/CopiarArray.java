
public class CopiarArray {

	public static void main(String[] args) {
		//LLENAR UN ARRAY DE 50 ELEMENTOS CON NUMEROS ALEATORIOS ENTEROS POSITIVOS DE DOS 
		//DIGITOS
		//MOSTRAR EL ARRAY (10 ELEMENTOS POR FILA)
		//COPIAR LOS ELEMENTOS DE LAS POSICIONES IMPARES DEL ARRAY (1ª, 3ª, 5ª ,ETC.., 
		//0, 2, 4, 6,...) EN OTRO ARRAY DE 25 ELEMENTOS INICIALMENTE VACIO.(son las posiciones PARES desde el punto
		//de vista del programador)
		//MOSTRAR EL CONTENIDO DE ESTE ARRAY DE 25 ELEMENTOS (10 POR FILA)
		
		
		//DECLARACION
		int [] numeros1;
		int[] numeros2;
		int cont;
		numeros1=new int[50];
		numeros2=new int[25];
		
		//LLENAR EL ARRAY
		for (int i = 0; i < numeros1.length; i++) {
			numeros1[i]=(int)(Math.random()*90+10);
		}
		
		//mostrar el array
		for (int i = 0; i < numeros1.length; i++) {
			if(i%10==0) {
				System.out.println();
			}
			System.out.print(numeros1[i]+" ");
			
		}
		//COPIAR LOS ELEMENTOS DE UN ARRAY SOBRE EL 2º
		for (int i = 0; i < numeros2.length; i++) {
			numeros2[i]=numeros1[i*2];
		}
		
		//OTRA FORMA
		cont=0;
		for (int i = 0; i < numeros1.length; i++) {
			if(i%2==0) {
				numeros2[cont]=numeros1[i];
				cont++;
			}
		}
		
		//OTRA FOERMA
		for (int i = 0; i < numeros1.length; i++) {
			if(i%2==0) {
				numeros2[i/2]=numeros1[i];
			}
		}
		System.out.println();
		System.out.println();
		//MOSTRAR EL CONTENIDO DEL 2º ARRAY
		for (int i = 0; i < numeros2.length; i++) {
			System.out.print(numeros2[i]+" ");
		}
	}
}