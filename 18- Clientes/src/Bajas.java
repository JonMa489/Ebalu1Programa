import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Bajas extends JPanel {
	private JTextField txtClave;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtEdad;
	private JTextField txtCalle;
	private JTextField txtNumero;
	private JTextField txtCP;

	/**
	 * Create the panel.
	 */
	public Bajas() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel Botones = new JPanel();
		add(Botones, BorderLayout.SOUTH);
		
		JButton btnBaja = new JButton("Dar de Baja");
		Botones.add(btnBaja);
		
		JPanel Informacion1 = new JPanel();
		add(Informacion1, BorderLayout.CENTER);
		Informacion1.setLayout(new BoxLayout(Informacion1, BoxLayout.Y_AXIS));
		
		JPanel Clave = new JPanel();
		Clave.setBorder(new TitledBorder(null, "Clientes:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Informacion1.add(Clave);
		Clave.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblClave = new JLabel("Clave:");
		Clave.add(lblClave);
		
		txtClave = new JTextField();
		Clave.add(txtClave);
		txtClave.setColumns(10);
		
		JPanel DatosPersonales = new JPanel();
		DatosPersonales.setBorder(new TitledBorder(null, "Datos Personales:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Informacion1.add(DatosPersonales);
		DatosPersonales.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNombre = new JLabel("Nombre:");
		DatosPersonales.add(lblNombre);
		
		txtNombre = new JTextField();
		DatosPersonales.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		DatosPersonales.add(lblApellidos);
		
		txtApellidos = new JTextField();
		DatosPersonales.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad:");
		DatosPersonales.add(lblEdad);
		
		txtEdad = new JTextField();
		DatosPersonales.add(txtEdad);
		txtEdad.setColumns(10);
		
		JPanel Direccion = new JPanel();
		Direccion.setBorder(new TitledBorder(null, "Direccion:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Informacion1.add(Direccion);
		Direccion.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblCalle = new JLabel("Calle:");
		Direccion.add(lblCalle);
		
		txtCalle = new JTextField();
		Direccion.add(txtCalle);
		txtCalle.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero:");
		Direccion.add(lblNumero);
		
		txtNumero = new JTextField();
		Direccion.add(txtNumero);
		txtNumero.setColumns(10);
		
		JLabel lblCP = new JLabel("Codigo Postal:");
		Direccion.add(lblCP);
		
		txtCP = new JTextField();
		Direccion.add(txtCP);
		txtCP.setColumns(10);

	}

}
