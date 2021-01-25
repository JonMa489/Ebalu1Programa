import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventosJuegoLetras {

	private JuegoLetras juegoLetras;
	
	public EventosJuegoLetras(JuegoLetras juegoLetras) {
		this.juegoLetras=juegoLetras;
		
		this.juegoLetras.getBtnComenzar().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//PASAR EL NIVEL A AreaDibujo
				if(juegoLetras.getRbFacil().isSelected()) {
					juegoLetras.getAreaDibujo().setNivel(1);
				}else if(juegoLetras.getRbMedio().isSelected()) {
					juegoLetras.getAreaDibujo().setNivel(2);
				}else {
					juegoLetras.getAreaDibujo().setNivel(3);
				}
				
				//LLAMAR A CREAR LOS CIRCULOS
				juegoLetras.getAreaDibujo().crearCirculos();
				//LLAMAR A CREAR LOS CUADRADOS
				juegoLetras.getAreaDibujo().crearCuadrados();
				
				juegoLetras.getAreaDibujo().repaint();
				
				juegoLetras.estadoBotones(false);
			}
		});
	}
}
