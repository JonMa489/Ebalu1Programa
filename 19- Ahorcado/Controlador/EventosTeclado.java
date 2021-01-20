import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EventosTeclado {
	private TecladoVirtual teclado;
	private Ahorcado ahorcado;
	private int numFallos;

	public EventosTeclado (TecladoVirtual teclado) {
		this.teclado=teclado;
		JButton [] arrayTeclado;
		//REGISTRAR EVENTOS
		// PARA CADA BOTON:
			//REGISTRAR EVENTO
			//DESACTIVAR EL BOTON 
			//SI LA LETRA ESTA:
				//PONER BOTON VERDE
				//SUSTITUIS EN EL JLABEL CADA APARICION DE LA LETRA POR EL - DE LA POSICION CORRESPONDIENTE
				//COMPROBAR SI LA PALABRA COMPLETADA

			//SI LA LETRA NO ESTA:
				//PONER BOTON ROJO
				//INCREMENTAR EL NUMERO DE FALLOS
				//ACTUALIZAR LA IMAGEN DEL CANVAS
				//COMPROBAR SI ES FINAL POR MAS FALLOS ALCANZADO
		final int i;
		arrayTeclado=teclado.getArrayTeclado ();
		/*for (i = 0; i < arrayTeclado.length; i++) {
			arrayTeclado[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					arrayTeclado[i].setEnabled(false);
					((JButton)e.getSource().setEnabled(false);
				}
			});
		}*/
		for (JButton jButton : arrayTeclado) {
			jButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					jButton.setEnabled(false);
					//COMPROBAR SI LA LETRA PULSADA NOOO ESTA EN LA PALABRA
					if (!teclado.getPalabra().contains(jButton.getText())) {
						jButton.setBackground(Color.red);
						numFallos++;
					}else {
						teclado.getPalabra().indexOf();
					}
					
				}
			});
		}
		registrarEventos();

	}
	public void registrarEventos () {


	}
}
