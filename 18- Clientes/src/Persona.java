
public class Persona {

	private String nombre, a, strErrorN;

	public Persona() { 
		nombre="";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getStrErrorN() {
		return strErrorN;
	}

	public void setStrErrorN(String strErrorN) {
		this.strErrorN = strErrorN;
	}
	//NOMBRE
	public boolean nombreCorrecto() {
		//SI EL NOMBRE CONTIENE ALGUN NUMERO
		int contNumeros=0;
		for (int i = 0; i < nombre.length(); i++) {
			if (nombre.charAt(i)==('1') || nombre.charAt(i)==('2')|| nombre.charAt(i)==('3')||
					nombre.charAt(i)==('4')|| nombre.charAt(i)==('5')|| nombre.charAt(i)==('6')||
					nombre.charAt(i)==('7')|| nombre.charAt(i)==('8')|| nombre.charAt(i)==('9')||
					nombre.charAt(i)==('0') ) {
				contNumeros++;
			}
		}
		if (contNumeros>=1) {
			strErrorN="No puede contener numeros";
			return false;
		}
		//SI EL NOMBRE TIENE MENOS DE 2 CARACTERES
		if (nombre.length()-1==0  || nombre.length()==0) {
			strErrorN="Contiene menos de dos caracteres";
			return false;
		}
		if (nombre==(" ")) {
			strErrorN="No puede contener espacios";
			return false;
		}
		return true;
	}
	
}
