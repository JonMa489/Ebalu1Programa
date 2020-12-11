import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gestion extends JFrame {

	

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCorreo;
	private JTextField txtWeb;
	private JButton btnAnadir;
	private JList lstNombre;
	private JList lstCorreo;
	private JList lstWeb;
	private JButton btnEnviar;
	private JButton btnCargar;
	private JButton btnGuardar;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gestion frame = new Gestion();
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
	public Gestion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(52, 52, 46, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(108, 49, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Correo");
		lblNewLabel.setBounds(52, 94, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Web");
		lblNewLabel_1.setBounds(52, 128, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(108, 91, 86, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtWeb = new JTextField();
		txtWeb.setBounds(108, 125, 86, 20);
		contentPane.add(txtWeb);
		txtWeb.setColumns(10);
		
		btnAnadir = new JButton("A\u00F1adir");
		btnAnadir.setBounds(270, 124, 89, 23);
		contentPane.add(btnAnadir);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres:");
		lblNewLabel_2.setBounds(33, 199, 100, 14);
		contentPane.add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 235, 100, 147);
		contentPane.add(scrollPane);
		
		lstNombre = new JList();
		scrollPane.setViewportView(lstNombre);
		
		JLabel lblNewLabel_3 = new JLabel("Direcciones de correo:");
		lblNewLabel_3.setBounds(171, 199, 140, 14);
		contentPane.add(lblNewLabel_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(171, 235, 123, 147);
		contentPane.add(scrollPane_1);
		
		lstCorreo = new JList();
		scrollPane_1.setViewportView(lstCorreo);
		
		JLabel lblNewLabel_4 = new JLabel("Direcciones Web:");
		lblNewLabel_4.setBounds(321, 199, 149, 14);
		contentPane.add(lblNewLabel_4);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(321, 235, 137, 147);
		contentPane.add(scrollPane_2);
		
		lstWeb = new JList();
		scrollPane_2.setViewportView(lstWeb);
		
		btnEnviar = new JButton("Enviar Mail");
		btnEnviar.setBounds(496, 283, 89, 23);
		contentPane.add(btnEnviar);
		
		btnCargar = new JButton("Cargar Datos");
		btnCargar.setBounds(87, 423, 131, 23);
		contentPane.add(btnCargar);
		
		btnGuardar = new JButton("Guardar Datos");
		btnGuardar.setBounds(250, 423, 131, 23);
		contentPane.add(btnGuardar);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(496, 423, 89, 23);
		contentPane.add(btnSalir);
		registrarEventos();
	}//FIN DE CONSTRUCTOR
	public void registrarEventos() {
		
		//BOTON SALIR 
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(WIDTH);
			}
		});
		
		
	}
}