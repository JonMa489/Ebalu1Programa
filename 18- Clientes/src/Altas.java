import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.GridBagLayout;
import javax.swing.border.TitledBorder;

public class Altas extends JPanel {
	private JTextField txtClave;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtEdad;
	private JTextField txtCalle;
	private JTextField txtNumero;
	private JTextField txtCP;
	private BaseDeDatos bd;
	private ResultSet rs;
	private Apellidos apellidos = null;
	private int activado;

	/**
	 * Create the panel.
	 */
	public Altas() {
		setLayout(new BorderLayout(0, 0));

		JPanel Botones = new JPanel();
		add(Botones, BorderLayout.SOUTH);
		Botones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnLimpiar = new JButton("Limpiar");
		Botones.add(btnLimpiar);

		JButton btnAlta = new JButton("Dar de alta");
		Botones.add(btnAlta);

		JPanel Informacion = new JPanel();
		add(Informacion, BorderLayout.CENTER);
		Informacion.setLayout(new BoxLayout(Informacion, BoxLayout.Y_AXIS));

		JPanel PrimeraFila = new JPanel();
		PrimeraFila.setBorder(new TitledBorder(null, "Datos Personales:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Informacion.add(PrimeraFila);
		PrimeraFila.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lblClave = new JLabel("Clave:");
		PrimeraFila.add(lblClave);

		txtClave = new JTextField();
		PrimeraFila.add(txtClave);
		txtClave.setColumns(10);

		JLabel lblNombre = new JLabel("Nombre:");
		PrimeraFila.add(lblNombre);

		txtNombre = new JTextField();
		PrimeraFila.add(txtNombre);
		txtNombre.setColumns(10);

		JLabel btnApellidos = new JLabel("Apellidos:");
		PrimeraFila.add(btnApellidos);

		txtApellidos = new JTextField();
		PrimeraFila.add(txtApellidos);
		txtApellidos.setColumns(10);

		JLabel lblEdad = new JLabel("Edad:");
		PrimeraFila.add(lblEdad);

		txtEdad = new JTextField();
		PrimeraFila.add(txtEdad);
		txtEdad.setColumns(10);

		JPanel SegundaFila = new JPanel();
		SegundaFila.setBorder(new TitledBorder(null, "Direccion:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Informacion.add(SegundaFila);
		SegundaFila.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lblCalle = new JLabel("Calle:");
		SegundaFila.add(lblCalle);

		txtCalle = new JTextField();
		SegundaFila.add(txtCalle);
		txtCalle.setColumns(10);

		JLabel lblNumero = new JLabel("Numero:");
		SegundaFila.add(lblNumero);

		txtNumero = new JTextField();
		SegundaFila.add(txtNumero);
		txtNumero.setColumns(10);

		JLabel lblCP = new JLabel("Codigo Postal:");
		SegundaFila.add(lblCP);

		txtCP = new JTextField();
		SegundaFila.add(txtCP);
		txtCP.setColumns(10);
		
		registrarEventos();
	}//FIN DEL CONSTRUCTOR
	//REGISTRAR EVENTOS
	public void registrarEventos() {
		//APELLIDOS
		txtApellidos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (activado == 0) {
					apellidos = new Apellidos(Altas.this);
					apellidos.setVisible(true);
					activado=1;
					//apellidos.setActivado(1);
					//Altas.this.setVisible(false);
				}

			}
		});
		
		//NOMBRE
		txtNombre.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				

			}
		});
	}
	public void inicializar () {
		bd= new BaseDeDatos ();
		bd.conectar();
		rs=bd.obtenerDatos();
		txtNombre.setText("");
		txtApellidos.setText("");
		txtEdad.setText("");
		txtCalle.setText("");
		txtNumero.setText("");
		txtCP.setText("");
	}

	
}
