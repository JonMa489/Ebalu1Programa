
public class MezclarArrays {
	//Funcion que reciba como parametros dos arrays ya ordenados con 10 elementos cada uno y 
	// vaya metiendo en otro array de 20 elementos que tambien recibe como parametro los numeros
	//de ambos array de forma ordenada.
	//NOTA: No vale meter los numeros en cualquier orden y luego ordenar el array.
	public static void main(String[] args) {
		//
		int[] numeros1= {4,6,12,15,16,17,19,22,26,28};
		int[] numeros2= {5,7,8,9,10,20,25,27,29,30, 31};
		int[] numeros3=new int [20];

		mezclar(numeros1,numeros2,numeros3);
		mostrar(numeros3);

	}
	public static void mezclar (int[] num1, int[] num2, int[] num3) {
		int pos1=0;
		int pos2=0;
		for (int i = 0; i < num3.length; i++) {
			if (pos1<=9 && pos2<=9) { //NO HA TERMINADO NINGUN ARRAY
				if (num1 [pos1]<=num2 [pos2]) {
					num3[i]=num3 [pos1];
					pos1++;
				}else {
					num3[i]=num2[pos2];
					pos2++;
				}
			}else {//HA TERMINADO UNO DE LOS 
				for (int cont = pos1; cont <=9; cont++) {
					num3[i]=num1[cont];
					i++;
				}
				//METER
				for (int cont = pos2; cont < 10; cont++) {
					num3[i]=num2[cont];
					i++;
				}
				break;
			}
		}
	}
	public static void mostrar (int[] num) {
		System.out.println("Array mezclado");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}
}
