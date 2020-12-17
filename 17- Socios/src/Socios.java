import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;

public class Socios extends JFrame {

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
	private BaseDatos j;


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
		setBounds(100, 100, 540, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero socio:");
		lblNewLabel.setBounds(73, 104, 104, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(73, 145, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Direcci\u00F3n:");
		lblNewLabel_2.setBounds(73, 189, 69, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Telefono: ");
		lblNewLabel_3.setBounds(73, 236, 104, 14);
		contentPane.add(lblNewLabel_3);
		
		txtNumSocio = new JTextField();
		txtNumSocio.setBounds(175, 101, 86, 20);
		contentPane.add(txtNumSocio);
		txtNumSocio.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(175, 142, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtDir = new JTextField();
		txtDir.setBounds(175, 187, 86, 17);
		contentPane.add(txtDir);
		txtDir.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(175, 233, 86, 20);
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
		
		BaseDatos bd = new BaseDatos();
		bd.conectar();
		registrarEventos();
	}//FIN DEL CONSTRUCTOR
	public void registrarEventos(){
		
	}
}
