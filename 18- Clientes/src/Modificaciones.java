import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Modificaciones extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Create the panel.
	 */
	public Modificaciones() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		
		JButton btnModificar = new JButton("Modificar");
		panel.add(btnModificar);
		
		JPanel Informacion2 = new JPanel();
		add(Informacion2, BorderLayout.CENTER);
		Informacion2.setLayout(new BoxLayout(Informacion2, BoxLayout.Y_AXIS));
		
		JPanel Clave = new JPanel();
		Clave.setBorder(new TitledBorder(null, "Clientes:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Informacion2.add(Clave);
		Clave.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblClave = new JLabel("Clave:");
		Clave.add(lblClave);
		
		textField = new JTextField();
		textField.setColumns(10);
		Clave.add(textField);
		
		JPanel DatosPersonales = new JPanel();
		DatosPersonales.setBorder(new TitledBorder(null, "Datos Personales:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Informacion2.add(DatosPersonales);
		DatosPersonales.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNombre = new JLabel("Nombre:");
		DatosPersonales.add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		DatosPersonales.add(textField_1);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		DatosPersonales.add(lblApellidos);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		DatosPersonales.add(textField_2);
		
		JLabel lblEdad = new JLabel("Edad:");
		DatosPersonales.add(lblEdad);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		DatosPersonales.add(textField_3);
		
		JPanel Direccion = new JPanel();
		Direccion.setBorder(new TitledBorder(null, "Direccion:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Informacion2.add(Direccion);
		Direccion.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblCalle = new JLabel("Calle:");
		Direccion.add(lblCalle);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		Direccion.add(textField_4);
		
		JLabel lblNumero = new JLabel("Numero:");
		Direccion.add(lblNumero);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		Direccion.add(textField_5);
		
		JLabel lblCP = new JLabel("Codigo Postal:");
		Direccion.add(lblCP);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		Direccion.add(textField_6);

	}

}
