import javax.swing.JPanel;

import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class TecladoVirtual extends JPanel {

	public static final int ANCHO=40;
	public static final int ALTO=40;
	public static final int SEP=15;
	private JLabel lblPalabra;
	private JButton []arrayTeclado;
	private EventosTeclado eventosTeclado;
	private Ahorcado ahorcado;
	private String palabra;
	
	
	/**
	 * Create the panel.
	 */
	public TecladoVirtual(Ahorcado ahorcado) {
		this.ahorcado=ahorcado;
		this.setLayout(null);
		this.setBounds(0,0,450,600);
		lblPalabra = new JLabel("- - - - - - - - - - - - -");
		lblPalabra.setHorizontalAlignment(SwingConstants.CENTER);
		lblPalabra.setBounds(50, 50, 200, 20);
		this.add(lblPalabra);
		

		crearTeclado ();
		//CREAR LA CLASE EventosTeclado PARA GESTIONAR LOS EVENTOS;
		eventosTeclado = new EventosTeclado(this);
	}
	public Ahorcado getAhorcado() {
		return ahorcado;
	}
	public void setAhorcado(Ahorcado ahorcado) {
		this.ahorcado = ahorcado;
	}
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	public JLabel getLblPalabra() {
		return lblPalabra;
	}
	public void setLblPalabra(JLabel lblPalabra) {
		this.lblPalabra = lblPalabra;
	}
	public JButton[] getArrayTeclado() {
		return arrayTeclado;
	}
	public void setArrayTeclado(JButton[] arrayTeclado) {
		this.arrayTeclado = arrayTeclado;
	}
	public void ponerGuiones ()  { //HAY QUE LLAMAR A ESTA FUNCION POR CADA PALABRA NUEVA GENERADA
		//AL PRINCIPIO
		//EN EL BOTON SIGUIENTE, despues de setpalabra
		lblPalabra.setText("");
		for (int i = 0; i < palabra.length(); i++) {
			lblPalabra.setText(lblPalabra.getText()+"- ");
		}
		
	}
	public void crearTeclado () {
		//Instanciar el arrayTeclado
		arrayTeclado = new  JButton[27];
		//Variable auxiliar JButton
		JButton btnAux;
		/*Hacer 27veces:
		 * Crear un boton
		 * Aplicar caracteristicas: 
		 * 		Tamaño
		 * 		Enabled
		 * 		Contenido (letra)
		 * 		POSICION
		 * Añadir al panel
		 * Añadir al array
		 */
		int inc = 0;
		for (int i = 0; i < arrayTeclado.length; i++) {
			btnAux=new JButton();
			if (i==0) {
				btnAux.setBounds(50, 100, ANCHO, ALTO);
			}else if(i%5==0)  { //botones de la columna 1
				btnAux.setBounds(arrayTeclado[i-5].getX(), arrayTeclado[i-5].getY() + ALTO + SEP,ANCHO,ALTO);
				;
			}else { //resto de botoones
				btnAux.setBounds(arrayTeclado [i-1].getX() +ANCHO+SEP,  arrayTeclado [i-1].getY(), ANCHO, ALTO);
			}
			if (i==14) {
				inc=1;
				btnAux.setText("Ñ");
			}else {
				btnAux.setText((char)('A'+i-inc)+"");
			}
			btnAux.setMargin (new Insets(0,0,0,0));
			arrayTeclado[i]=btnAux;
			this.add(btnAux);
	
		}
	}
	public void estadoBotones (boolean estado) {
		//poner el enabled de todos a true o a false, segun el parametro recibido
		for (JButton jButton : arrayTeclado) {
			jButton.setEnabled(estado);
			if (estado) { //CUANDO HABILITAMOS TODOS, RESTAURAMOS EL COLOR PRINCIPAL
				jButton.setBackground(null);
			}
		}
		
	}
}
