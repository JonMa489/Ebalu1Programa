import java.util.Scanner;
public class PALILLOS {
	//JUEGO DE LOS PALILLOS
	//JUEGO PARA DOS JUGADORES QUE JUEGAN DE FORMA ALTERNATIVA
	//EL JUEGO COMIENZA CON 15 PALILLOS
	//EN CADA TURNO 1 JUGADOR PUEDE QUITAR 1, 2 ó 3 PALILLOS
	//PIERDE EL QUE QUITA EL ÚLTIMO PALILLO
	/*INTRODUCE LOS NOMBRES DE LOS JUGADORES:
	 * JUGADOR 1: Roberto
	 * JUGADOR 2: Ander
	 * COMIENZA EL JUEGO:
	 * Quedan 15 palillos: IIIII IIIII IIIII
	 * Turno: Roberto. Elige número de palillos (1-3): 3
	 * Quedan 12 palillos: IIIII IIIII II
	 * Turno: Ander. Elige número de palillos (1-3): 4
	 * Turno: Ander. Elige número de palillos (1-3): 5
	 * Turno: Ander. Elige número de palillos (1-3): 2
	 * Quedan 10 palillos: IIIII IIIII
	 * Turno: Roberto. Elige número de palillos (1-3):
	 */
	//FUNCIONES:
	//		1- INTRODUCIRNOMBRES: INTRODUCIR LOS NOMBRES DE LOS DOS USUARIOS
	//		2- PROCESO:
	public static void main(String[] args) {
		//VARIABLES
		String jugador1 = "", jugador2 = "";
		int confirmar, palillos = 0,quitar = 0, turno = 1;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("\nDESEAS JUGAR? (Si=1)(No=0)");
			confirmar=sc.nextInt();
			if (confirmar==1) {
				//INTRODUCIR NOMBRES
				System.out.println("+----+-+-----------------------------------+-+----+");
				System.out.println("+---+-+-BIENVENIDO AL JUEGO DE LOS PALILLOS-+-+---+");
				System.out.println("+----+-+-----------------------------------+-+----+");
				System.out.println("INTRODUCE EL NOMBRE DEL PRIMER JUGADOR:");
				jugador1=sc.next();
				System.out.println("INTRODUCE EL NOMBRE DEL SEGUNDO JUGADOR:");
				jugador2=sc.next();
				//PROCESO
				proceso(jugador1,jugador2, palillos,quitar, turno);
			}
			//FINALIZAR
		} while (confirmar!=0);
	}
	public static void proceso(String jugador1, String jugador2, int palillos, int quitar, int turno) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		//JUGADOR ALEATORIO
		System.out.println("------COMIENZA EL JUEGO------");
		turno=(int)(Math.random()*2+1);
		if (turno==1) {
			System.out.println("Comieza el jugador "+jugador1);
		}else {
			System.out.println("Comieza el jugador "+jugador2);
		}
		//PARTIDA, PONER PALILLOS
		palillos=15;
		do {
			for (int i = 1; i <= palillos; i++) {
				System.out.print("");
				if(i%5==0) {
					System.out.print(" ");
				}	
			} 
			//PEDIR JUGADA
			do {
				if (turno==1) {
					System.out.println(" Turno: "+jugador1+" Cuantos palitos quieres quitar (1-3): ");
					quitar=sc.nextInt();
				}else {
					System.out.println(" Turno: "+jugador2+" Cuantos palitos quieres quitar (1-3): ");
					quitar=sc.nextInt();
				}
			} while (quitar<1 || quitar>3);
			turno=(turno%2)+1;
			palillos=palillos-quitar;
			//RESULTADOS
			if(palillos==0 && turno==1) {
				System.out.println("Ganador: "+jugador2);
			}else if (palillos==0 && turno==2) {
				System.out.println("Ganador: "+jugador1);
			}else if (palillos==1 && turno==1) {
				System.out.println("Ganador: "+jugador1);
			}else {
				System.out.println("Ganador: "+jugador2);
			}
		}while (palillos>+1);
	}
}