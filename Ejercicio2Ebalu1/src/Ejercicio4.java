import java.sql.Date;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// Programa que pida por separado el día, el mes y el año de una fecha correcta y
		// muestre por pantalla la fecha del día siguiente.
		// VARIABLES
		Scanner sc=new Scanner(System.in);
		int dia=1,mes=1,año=1, limitesDias = 1;
		dia=limitesDias;
		System.out.println("-------FECHA-------");
		System.out.println("Introduzca el año: ");
		año=sc.nextInt();
		System.out.println("Introduzca el mes: ");
		mes=sc.nextInt();
		System.out.println("Introduzca el dia: ");
		dia=sc.nextInt();
		
			switch (mes) {
			case 1: //ENERO
				limitesDias=31;
				dia++;
				break;
			case 2: //FEBRERO
				if (año%4==0 && año%400==0) {
					limitesDias=29;
					dia++;
					if (dia==30) {
						mes=3;
						dia=1;
					}
				}else {
					limitesDias=28;
					dia++;
					if (dia==29) {
						mes=3;
						dia=1;
					}
				}
				break;
			case 3: //MARZO
				limitesDias=31;
				break;
			case 4: //ABRIL
				limitesDias=30;
				break;
			case 5: //MAYO
				limitesDias=31;
				break;
			case 6: //JUNIO
				limitesDias=30;
				break;
			case 7: //JULIO
				limitesDias=31;
				break;
			case 8: //AGOSTO
				limitesDias=31;
				break;
			case 9: //SEPTIEMBRE
				limitesDias=30;
				break;
			case 10: //OCTUBRE
				limitesDias=31;
				break;
			case 11: //NOVIEMBRE
				limitesDias=30;
				break;
			case 12: //DICIEMBRE
				limitesDias=31;
				break;

			default:
				System.out.println("Fecha introducida no valdia!");
				break;

			}
			System.out.println(año+"-"+mes+"-"+dia);
	}
}

