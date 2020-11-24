import java.util.Scanner;

public class ExamEjercicio1 {

	public static void main(String[] args) {

		@SuppressWarnings({ "resource" })
		//VARIABLES
		int num, num1, cont = 0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Escribe numeros: ");
			num=sc.nextInt();
			num1=num;
			if (num1==4) {
				System.out.println("Escribe numeros: ");
				num1=sc.nextInt();
				if (num1==5) {
					System.out.println("Escribe numeros: ");
					num1=sc.nextInt();
					if (num1==6) {
						System.out.println("Escribe numeros: ");
						num1=sc.nextInt();
						if (num1==7) {
							System.out.println("Escribe numeros: ");
							num1=sc.nextInt();
							cont++;
						}
					}
				}
			}
			if (cont>=1) {
				System.out.println("Frecuencia de veces repetidos 4,5,6,7: "+ cont);
			}	
		} while (num!=0);
	}

}
