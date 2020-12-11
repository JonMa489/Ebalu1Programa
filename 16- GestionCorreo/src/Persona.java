import java.io.PrintWriter;

public class Persona {

	//DATOS
	private String nombre, mail, web;
	private String strError;

	//CONSTRUCTORES
	public Persona() { //CUANDO NO HAYA DATOS // PARA QUE SALGA LA RESPUESTA
		nombre="";
		mail="";
		web="";
	}
	public Persona (String nombre, String mail, String web) {
		this.nombre=nombre;
		this.mail=mail;
		this.web=web;
	}
	//GETTERS Y SETTERS (SOURCE)
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getStrError() {
		return strError;
	}
	public void setStrError(String strError) {
		this.strError = strError;
	}
	//METODOS
	public boolean esEmailCorrecto() {
		//PARA NO CONFUNDIRSE Y AÑADIR MUCHAS O NINGUNA @
		int contArrobas=0;
		for (int i = 0; i < mail.length(); i++) {
			if (mail.charAt(i)==('@')) {
				contArrobas++;
			}
		}
		if (contArrobas>=2 || contArrobas==0) {
			strError="Solo puede haber una arroba";
			return false;
		}
		//NO HAY AL MENOS DOS CARACTERES ANTES DEL @
		if (mail.indexOf("@")<3) {
			strError="Antes de la arroba de haber al menos 3 caracteres";
			return false;
		}
		//HAY ALGUN ESPACIO EN BLANCO
		if (mail.contains(" ")) {
			strError="El mail no puede contener espacios";
			return false;
		}
		//ENTRE LA @ Y EL ULTIMO PUNTO HAY MENOS DE 3
		if (mail.indexOf("@")>mail.lastIndexOf(".")-3) {
			strError="Entre la @ y el ultimo punto debe haber 3 caracteres minimo";
			return false;
		}
		//AL MENOS DOS CARACTERES DESPUES DEL PUNTO
		if (mail.lastIndexOf(".")>=mail.length()-2) {
			strError="Despues dell ultimo punto debe haber 3 caracteres minimo";
			return false;
		}
		return true;
	}
	public void guardar(PrintWriter pw) {
		pw.println(this.nombre);
		pw.println(this.mail);
		pw.println(this.web);
		
	}
}
