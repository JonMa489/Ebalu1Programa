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
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	private JButton btnLimpiar;
	private JButton btnAlta;
	private JTextField txtApellido1;
	private JTextField txtApellido2;
	private clientes cliente;

	public JTextField getTxtApellidos() {
		return txtApellidos;
	}
	public void setTxtApellidos(JTextField txtApellidos) {
		this.txtApellidos = txtApellidos;
	}
	public int getActivado() {
		return activado;
	}
	public void setActivado(int activado) {
		this.activado = activado;
	}
	/**
	 * Create the panel.
	 */
	public Altas() {
		setLayout(new BorderLayout(0, 0));

		JPanel Botones = new JPanel();
		add(Botones, BorderLayout.SOUTH);
		Botones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		btnLimpiar = new JButton("Limpiar");
		Botones.add(btnLimpiar);

		btnAlta = new JButton("Dar de alta");
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
				if (activado==0) {
					apellidos = new Apellidos(Altas.this);
					apellidos.setVisible(true);
					//Altas.this.setVisible(false);
					activado=1;
				}
			}
		});
		
		//NOMBRE
		txtNombre.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Persona p = null;
				if (!p.nombreCorrecto()) {
					JOptionPane.showMessageDialog(Altas.this, p.getStrErrorN());
					txtNombre.requestFocus();
					txtNombre.selectAll();
				}
			}
		});
		
		//BOTON GUARDAR (ALTA)
		btnAlta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				estadoTextDatos(true);
				bd.obtenerDatos();
				//PONER NUMER DE SOCIO: +1 DEL QUE AHORA ES EL MAX
				txtClave.setText(bd.obtenerMaxNumCliente()+1+"");
				txtClave.setEditable(false);
				txtNombre.requestFocus();
				if (bd.ejecutarSQL("INSERT INTO clientes (nombre,apellido1,apellido2,edad,calle,codigoPostal) VALUES ('"+ txtNombre.getText()+"', '"+ txtApellido1.getText()+"', '"+ txtApellido2.getText()+"', '"+ txtEdad.getText()+"', '"+ txtCalle.getText()+"', '"+ txtNumero.getText()+"', '"+ txtCP.getText()+"');")==0) {
					JOptionPane.showMessageDialog(Altas.this, "Error al insertar");
					estadoTextDatos(false);
					rs=bd.obtenerDatos();
				}
			}
		});
	}
	
	//AL INICIALIZAR DATOS
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
	public void estadoTextDatos (boolean estado) {
		txtNombre.setEditable(estado);
		txtApellidos.setEditable(estado);
		txtEdad.setEditable(estado);
		txtCalle.setEditable(estado);
		txtNumero.setEditable(estado);
		txtCP.setEditable(estado);
	}


}
