
public class Persona {

	//DATOS
	String nombre, mail, web;

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
			return false;
		}
		//PARA NO CONFUNDIRSE Y AÑADIR MUCHAS O NINGUNA .COM
		int contCOM=0;
		for (int i = 0; i < mail.length(); i++) {
			if (mail.toString()==(".com")) {
				contCOM++;
			}
		}
		if (contCOM>=2 || contCOM==0) {
			return false;
		}
		if (incorrecto3) {
			return false;
		}
		return true;
	}
}
