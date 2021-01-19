import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class EventosAhorcado {
	
private Ahorcado ahorcado;

public EventosAhorcado (Ahorcado ahorcado) {
	this.ahorcado=ahorcado;
	
	ahorcado.getBtnSiguiente().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			String palabra;
			palabra=ahorcado.getFichero().obtenerPalabra();
			if (palabra==null) {
				JOptionPane.showMessageDialog(ahorcado, "No quedan palabras, no se puede seguir");
			} //DESACTIVAR BOTONES
			ahorcado.getTeclado().setPalabra(palabra);
			ahorcado.getTeclado().ponerGuiones();
			ahorcado.getBtnSiguiente().setEnabled(false);
			
			//ACTIVAR 
		}
	});
}
}
