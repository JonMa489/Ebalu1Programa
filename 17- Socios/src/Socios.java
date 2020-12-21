import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Socios extends JFrame {
	public static final int ADD=1;
	public static final int EDIT=2;
	private JPanel contentPane;
	private JTextField txtNumSocio;
	private JTextField txtNombre;
	private JTextField txtDir;
	private JTextField txtTelefono;
	private JButton btnPrim;
	private JButton btnAnt;
	private JTextField txtRegistro;
	private JButton btnSig;
	private JButton btnUltimo;
	private BaseDatos bd;
	private ResultSet rs;
	private int numReg;
	private JButton btnAnadir;
	private JButton btnModificar;
	private JButton btnOk;
	private JButton btnCancel;
	private int accion;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Socios frame = new Socios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Socios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 516);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Numero socio:");
		lblNewLabel.setBounds(73, 104, 104, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(73, 145, 93, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Direcci\u00F3n:");
		lblNewLabel_2.setBounds(73, 189, 123, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Telefono: ");
		lblNewLabel_3.setBounds(73, 236, 104, 14);
		contentPane.add(lblNewLabel_3);

		txtNumSocio = new JTextField();
		txtNumSocio.setEnabled(false);
		txtNumSocio.setEditable(false);
		txtNumSocio.setBounds(169, 101, 123, 20);
		contentPane.add(txtNumSocio);
		txtNumSocio.setColumns(10);

		txtNombre = new JTextField();
		txtNombre.setEnabled(false);
		txtNombre.setEditable(false);
		txtNombre.setBounds(169, 142, 123, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtDir = new JTextField();
		txtDir.setEnabled(false);
		txtDir.setEditable(false);
		txtDir.setBounds(169, 187, 123, 17);
		contentPane.add(txtDir);
		txtDir.setColumns(10);

		txtTelefono = new JTextField();
		txtTelefono.setEnabled(false);
		txtTelefono.setEditable(false);
		txtTelefono.setBackground(Color.WHITE);
		txtTelefono.setBounds(169, 233, 123, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);

		btnPrim = new JButton("<<");
		btnPrim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPrim.setBounds(73, 282, 60, 23);
		contentPane.add(btnPrim);

		btnAnt = new JButton("<");
		btnAnt.setBounds(143, 282, 60, 23);
		contentPane.add(btnAnt);

		btnSig = new JButton(">");
		btnSig.setBounds(302, 282, 60, 23);
		contentPane.add(btnSig);

		btnUltimo = new JButton(">>");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnUltimo.setBounds(372, 282, 60, 23);
		contentPane.add(btnUltimo);

		txtRegistro = new JTextField();
		txtRegistro.setBounds(206, 283, 86, 20);
		contentPane.add(txtRegistro);
		txtRegistro.setColumns(10);

		btnAnadir = new JButton("Nuevo socio");
		btnAnadir.setBounds(324, 100, 123, 23);
		contentPane.add(btnAnadir);

		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(324, 141, 123, 23);
		contentPane.add(btnModificar);

		btnOk = new JButton("S");
		btnOk.setBounds(457, 118, 53, 23);
		contentPane.add(btnOk);

		btnCancel = new JButton("N");
		btnCancel.setBounds(520, 118, 53, 23);
		contentPane.add(btnCancel);

		inicializar();

		registrarEventos();
	}//FIN DEL CONSTRUCTOR
	public void registrarEventos(){
		btnSig.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (rs.next()) {
						mostrarDatos();
					}else {
						rs.last();
					}
				} catch (Exception e) {
				}
			}
		});
		btnAnt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (rs.previous()) {
						mostrarDatos();
					}else {
						rs.first();
					}
				} catch (Exception e) {
				}
			}
		});
		btnPrim.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (rs.first()) {
						mostrarDatos();
					}else {

					}
				} catch (Exception e) {	
				}
			}
		});
		btnUltimo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (rs.last()) {
						mostrarDatos();
					}else {

					}
				} catch (Exception e) {
				}	
			}
		});
		//AL PULSAR ENTER EN EL JTextField
		txtRegistro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//COMPROBRAR QUE SE HAYA ESCRITO UN NUMERO
				int reg;
				try {
					reg=Integer.parseInt(txtRegistro.getText());
					// ES UN NUMERO

					//NO EXISTA ESE REGISTRO: NO HACER NADA Y VOLVER A MOSTRAR DATOS PARA ACTUALICE EL TEXTODEL JTEXTFIELD
					if (reg>numReg || reg<=0) {
						mostrarDatos();
					}else {
						//ESE REGISTRO SI EXISTE: NADA Y VOLVER A MOSTRARDATOS PARA QUE 
						//ACTUALIZE EL TEXODEL JTEXTFIELD
						rs.absolute(reg);
						mostrarDatos();
					}

				} catch (NumberFormatException | SQLException ex) {
					/// NO ES UN NUMERO; NADA Y VOLVER A MOSTRARDATOS PARA QUE 
					//ACTUALIZE EL TEXODEL JTEXTFIELD
					mostrarDatos();
				}
			}
		});
		txtRegistro.addFocusListener(new FocusAdapter() {

			@Override
			public void focusGained(FocusEvent arg0) {
				//txRegistro

			}
		});
		btnAnadir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				txtNumSocio.selectAll();

			}
		});
		btnAnadir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//JTextField editar
				estadoTextDatos(true);
				//Vaciar los JTextField
				txtDir.setText("");
				txtNombre.setText("");
				txtTelefono.setText("");
				

				txtNumSocio.setText(bd.obtenerMaxNumSocio()+1+"");
				//Foco a jtextnombre
				//Accion: ADD
				//PONER NUMER DE SOCIO: +1 DEL QUE AHORA ES EL MAX
				//ACTIVAR DOS BOTONES OK-CANCEL


			}
		});
	}
	public void inicializar() {
		bd = new BaseDatos();
		bd.conectar();
		rs=bd.obtenerDatos();
		//MOSTRAR EL PRIMERO 
		try {
			if (rs.first()) {
				//RECORRER EL RESULTSET Y CONTAR LOS REGISTROS
				rs.last();
				numReg=rs.getRow();
				/*numReg=0;
				do {

					numReg++;
				}while(rs.next());*/
				rs.first();
				mostrarDatos();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void mostrarDatos() {
		try {
			txtNumSocio.setText(rs.getString("id_socios"));
			txtNombre.setText(rs.getString("nombre"));
			txtDir.setText(rs.getString("direccion"));
			txtTelefono.setText(rs.getString("Telefono"));
			txtRegistro.setText(rs.getRow()+" de " + numReg);
		} catch (Exception e) {

		}
	}
	public void estadoTextDatos (boolean estado) {
		txtNombre.setEnabled(estado);
		txtDir.setEnabled(estado);
		txtTelefono.setEnabled(estado);
	}
}
