import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		/*PROGRAMA QUE LEA NUMEROS POR TECLADO MIENTRAS NO SE TECLEE EL 0. AL FINAL DIRÁ 
		 * CUANTOS ERAN MENORES QUE 10, CUANTOS MAYORES QUE 10 Y MOSTRARÁ LA MEDIA DE LOS
		 * MAYORES DE 5.
		 * EL 0 NO FORMA PARTE DE LA SECUENCIA.
		 */
		int num, cont, may10, men10, suma;
		float media;
		Scanner sc=new Scanner(System.in);
		may10=0;
		men10=0;
		suma=0;
		cont=0;
		do {
			System.out.print("Introduce numero: ");
			num=sc.nextInt();
			//evaluar el numero
		
			if(num>5) {
				cont++;
				suma=suma+num;
			}
			if(num>10) {
				may10++;
			}else if(num<10 && num!=0) {
				men10++;
			}
		
		}while(num!=0);

		//MOSTRAR RESULTADOS
		System.out.println("Menores que 10: "+men10);
		System.out.println("Mayores que 10: "+may10);
		media=0;
		media=(float)suma/cont;
		System.out.println("Media de los mayores que 5: "+media);
		
		
	}

}
