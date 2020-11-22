import java.util.Scanner;

public class Ecuacion {
	/*RESOLVER UNA ECUACION DE 2º GRADO:
	 * PEDIR Y LEER POR TECLADO LOS TRES TÉRMINOS DE UNA ECUACIÓN DE 2º GRADO (int).
	 * RESOLVER Y MOSTRAR POR PANTALLA LOS RESULTADOS DE LA ECUACIÓN (float o double)
	 * NOTA: CONTROLAR LOS DIFERENTES CASOS......
	 */
	public static void main(String[] args) {
		int a, b, c;
		double res1, res2;
		Scanner sc;
		sc=new Scanner(System.in);

		//LEER LOS TRES TÉRMINOS POR TECLADO
		System.out.println("Introduce el valor del termino de grado 2: ");
		a=sc.nextInt();
		System.out.println("Introduce el valor del termino de grado 1: ");
		b=sc.nextInt();
		System.out.println("Introduce el valor del termino independiente: ");
		c=sc.nextInt();

		//CONTROLAR LOS 3 CASOS
		//CASOS EN QUE NO SON ECUACIONES
		if(a==0 && b==0 && c==0) {
			System.out.println("Esto no es una ecuación. X puede valer cualquier cosa...");
		} else if(a==0 && b==0) {
			System.out.println("NO TIENE SENTIDO...");
		}
		//1.- NO HAY SOLUCION: SI LO QUE HAY DENTRO DE LA RAIZ ES < 0
		else if((b*b)-(4*a*c)<0) {
			System.out.println("No existe solución");
		}
		//2.- SOLO HAY UNA SOLUCION: Si a==0 ==> No es una ecuación de 2º grado
		else if(a==0) {
			res1=-c/b;
			System.out.println("Solo hay un resultado: "+res1);
		}
		//3.- HAY DOS SOLUCIONES
		else {
			res1=(-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
			res2=(-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);
			if(res1==res2) {
				System.out.println("Solo hay un resultado: "+res1);
			}else {
				System.out.println("Las soluciones son "+res1+" y "+res2);
			}
		}


	}

}







	//num1=-(b); 
	//num2=Math.sqrt(((b*b)-(4*a*c)));
	//num3=2*a; 
	//num1-(num2)/(num3);




