import java.sql.Date;
import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.DOM;
public class Ejercicio4 {
	public static void main(String[] args) {
		// Programa que pida por separado el d�a, el mes y el a�o de una fecha correcta y
		// muestre por pantalla la fecha del d�a siguiente.
		// VARIABLES
		Scanner sc=new Scanner(System.in);
		int dia=1,mes=1,a�o=1, limitesDias = 1;
		dia=limitesDias;
		System.out.println("-------FECHA-------");
		System.out.println("Introduzca el a�o: ");
		a�o=sc.nextInt();
		do {
			System.out.println("Introduzca el mes: ");
			mes=sc.nextInt();
		} while (mes>13 || mes<0);
		System.out.println("Introduzca el dia: ");
		dia=sc.nextInt();
		switch (mes) {
		case 1: //ENERO
			if (dia==31) {
				dia=1;
				mes++;
			}else if (dia>=32 || dia<=0) {
				System.out.println("ERROR AL INTRODUCIR EL DIA, EL DIA "+" NO ESTA BIEN INTRODUCIDO");
				do {
					System.out.println("Introduce otro dia: ");
					dia=sc.nextInt();
				} while (dia>31 || dia<1);
				if (dia==31) {
					dia=1;
					mes++;	
				}else {
					dia++;
				}
			}else {
				dia++;
			}				
			break;
		case 2: //FEBRERO
			if ((a�o % 4 == 0) && ((a�o % 100 != 0) || (a�o % 400 == 0))) {
				if(dia==29) {
					dia=1;
					mes++;
				}else if (dia>=30 || dia<=0) {
					System.out.println("ERROR AL INTRODUCIR EL DIA, EL DIA "+" NO ESTA BIEN INTRODUCIDO");
					do {
						System.out.println("Introduce otro dia: ");
						dia=sc.nextInt();
					} while (dia>29 || dia<1);
					if (dia==29) {
						dia=1;
						mes++;	
					}else {
						dia++;
					}
				}else {
					dia++;
				} 
			}else if (dia==28) {
				dia=1;
				mes++;
			}else if (dia>=29 || dia<=0) {
				System.out.println("ERROR AL INTRODUCIR EL DIA, EL DIA "+" NO ESTA BIEN INTRODUCIDO");
				do {
					System.out.println("Introduce otro dia: ");
					dia=sc.nextInt();
				} while (dia>28 || dia<1);
				if (dia==28) {
					dia=1;
					mes++;	
				}else {
					dia++;
				}
			}else {
				dia++;
			} 
			break;
		case 3: //MARZO
			if (dia==31) {
				dia=1;
				mes++;
			}else if (dia>=32 || dia<=0) {
				System.out.println("ERROR AL INTRODUCIR EL DIA, EL DIA "+" NO ESTA BIEN INTRODUCIDO");
				do {
					System.out.println("Introduce otro dia: ");
					dia=sc.nextInt();
				} while (dia>31 || dia<1);
				if (dia==31) {
					dia=1;
					mes++;	
				}else {
					dia++;
				}
			}else {
				dia++;
			}
			break;
		case 4: //ABRIL
			if (dia==30) {
				dia=1;
				mes++;
			}else if (dia>=31 || dia<=0) {
				System.out.println("ERROR AL INTRODUCIR EL DIA, EL DIA "+" NO ESTA BIEN INTRODUCIDO");
				do {
					System.out.println("Introduce otro dia: ");
					dia=sc.nextInt();
				} while (dia>30 || dia<1);
				if (dia==30) {
					dia=1;
					mes++;	
				}else {
					dia++;
				}
			}else {
				dia++;
			}
			break;
		case 5: //MAYO
			if (dia==31) {
				dia=1;
				mes++;
			}else if (dia>=32 || dia<=0) {
				System.out.println("ERROR AL INTRODUCIR EL DIA, EL DIA "+" NO ESTA BIEN INTRODUCIDO");
				do {
					System.out.println("Introduce otro dia: ");
					dia=sc.nextInt();
				} while (dia>31 || dia<1);
				if (dia==31) {
					dia=1;
					mes++;	
				}else {
					dia++;
				}
			}else {
				dia++;
			}
			break;
		case 6: //JUNIO
			if (dia==30) {
				dia=1;
				mes++;
			}else if (dia>=31 || dia<=0) {
				System.out.println("ERROR AL INTRODUCIR EL DIA, EL DIA "+" NO ESTA BIEN INTRODUCIDO");
				do {
					System.out.println("Introduce otro dia: ");
					dia=sc.nextInt();
				} while (dia>30 || dia<1);
				if (dia==30) {
					dia=1;
					mes++;	
				}else {
					dia++;
				}
			}else {
				dia++;
			}
			break;
		case 7: //JULIO
			if (dia==31) {
				dia=1;
				mes++;
			}else if (dia>=32 || dia<=0) {
				System.out.println("ERROR AL INTRODUCIR EL DIA, EL DIA "+" NO ESTA BIEN INTRODUCIDO");
				do {
					System.out.println("Introduce otro dia: ");
					dia=sc.nextInt();
				} while (dia>31 || dia<1);
				if (dia==31) {
					dia=1;
					mes++;	
				}else {
					dia++;
				}
			}else {
				dia++;
			}
			break;
		case 8: //AGOSTO
			if (dia==31) {
				dia=1;
				mes++;
			}else if (dia>=32 || dia<=0) {
				System.out.println("ERROR AL INTRODUCIR EL DIA, EL DIA "+" NO ESTA BIEN INTRODUCIDO");
				do {
					System.out.println("Introduce otro dia: ");
					dia=sc.nextInt();
				} while (dia>31 || dia<1);
				if (dia==31) {
					dia=1;
					mes++;	
				}else {
					dia++;
				}
			}else {
				dia++;
			}
			break;
		case 9: //SEPTIEMBRE
			if (dia==30) {
				dia=1;
				mes++;
			}else if (dia>=31 || dia<=0) {
				System.out.println("ERROR AL INTRODUCIR EL DIA, EL DIA "+" NO ESTA BIEN INTRODUCIDO");
				do {
					System.out.println("Introduce otro dia: ");
					dia=sc.nextInt();
				} while (dia>30 || dia<1);
				if (dia==30) {
					dia=1;
					mes++;	
				}else {
					dia++;
				}
			}else {
				dia++;
			}
			break;
		case 10: //OCTUBRE
			if (dia==31) {
				dia=1;
				mes++;
			}else if (dia>=32 || dia<=0) {
				System.out.println("ERROR AL INTRODUCIR EL DIA, EL DIA "+" NO ESTA BIEN INTRODUCIDO");
				do {
					System.out.println("Introduce otro dia: ");
					dia=sc.nextInt();
				} while (dia>31 || dia<1);
				if (dia==31) {
					dia=1;
					mes++;	
				}else {
					dia++;
				}
			}else {
				dia++;
			}
			break;
		case 11: //NOVIEMBRE
			if (dia==30) {
				dia=1;
				mes++;
			}else if (dia>=31 || dia<=0) {
				System.out.println("ERROR AL INTRODUCIR EL DIA, EL DIA "+" NO ESTA BIEN INTRODUCIDO");
				do {
					System.out.println("Introduce otro dia: ");
					dia=sc.nextInt();
				} while (dia>30 || dia<1);
				if (dia==30) {
					dia=1;
					mes++;	
				}else {
					dia++;
				}
			}else {
				dia++;
			}
			break;
		case 12: //DICIEMBRE
			if (dia==31) {
				dia=1;
				mes=1;
				a�o++;
			}else if (dia>=32 || dia<=0) {
				System.out.println("ERROR AL INTRODUCIR EL DIA, EL DIA "+" NO ESTA BIEN INTRODUCIDO");
				do {
					System.out.println("Introduce otro dia: ");
					dia=sc.nextInt();
				} while (dia>31 || dia<1);
				if (dia==31) {
					dia=1;
					mes=1;	
					a�o++;
				}else {
					dia++;
				}
			}else {
				dia++;
			}
			break;

		default:
			System.out.println("Fecha introducida no valdia!");
			break;
		}
		System.out.println(a�o+"-"+mes+"-"+dia);
	}
}