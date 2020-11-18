
public class Numeros100 {

	public static void main(String[] args) {
		//PROGRAMA QUE MNUESTRE POR PANTALLA LOS NUMEROS DEL 1 AL 300 SEPARADOS POR UN -
		//15 numeros por fila
		
		//DECLARACION VARIABLES
		int cont;
		//INICIALIZACIÓN
		cont=1;
		//CUERPO DEL PROGRAMA
		while(cont<=300) {
			//si no es multiplo de 15 escribo el numero y un -
			//sino solo se escribe el numero con salto de linea
			if(cont%15!=0) {
				System.out.print(cont+"-");
			}else {
				System.out.println(cont);
			}
			
			/*
			if(cont%15!=0) {
				System.out.print(cont+"-");
			}else {
				System.out.print(cont);
			}
			
			//si el numero escrito es multuiplo de 15, escribimos un salto de linea
			if(cont%15==0) {
				System.out.println();
			}
		*/
			cont=cont+1;
		}
		
		
		
	}

}