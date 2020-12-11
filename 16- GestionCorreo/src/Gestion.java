import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FileDialog;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
	private ArrayList<Persona> ArrayPersonas;
	private DefaultListModel<String> modelo1,modelo2,modelo3;
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
		txtNombre.setBounds(108, 49, 212, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		JLabel lblNewLabel = new JLabel("Correo");
		lblNewLabel.setBounds(52, 94, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Web");
		lblNewLabel_1.setBounds(52, 128, 46, 14);
		contentPane.add(lblNewLabel_1);

		txtCorreo = new JTextField();
		txtCorreo.setBounds(108, 91, 212, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);

		txtWeb = new JTextField();
		txtWeb.setBounds(108, 125, 212, 20);
		contentPane.add(txtWeb);
		txtWeb.setColumns(10);

		btnAnadir = new JButton("A\u00F1adir");
		btnAnadir.setBounds(330, 124, 89, 23);
		contentPane.add(btnAnadir);

		JLabel lblNewLabel_2 = new JLabel("Nombres:");
		lblNewLabel_2.setBounds(33, 199, 100, 14);
		contentPane.add(lblNewLabel_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 235, 100, 147);
		contentPane.add(scrollPane);

		lstNombre = new JList();
		scrollPane.setViewportView(lstNombre);
		//MODELO ASOCIADO
		modelo1=new DefaultListModel<String>();
		lstNombre.setModel(modelo1);

		JLabel lblNewLabel_3 = new JLabel("Direcciones de correo:");
		lblNewLabel_3.setBounds(171, 199, 140, 14);
		contentPane.add(lblNewLabel_3);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(171, 235, 123, 147);
		contentPane.add(scrollPane_1);

		lstCorreo = new JList();
		scrollPane_1.setViewportView(lstCorreo);
		//MODELO ASOCIADO
		modelo2=new DefaultListModel<String>();
		lstCorreo.setModel(modelo2);

		JLabel lblNewLabel_4 = new JLabel("Direcciones Web:");
		lblNewLabel_4.setBounds(321, 199, 149, 14);
		contentPane.add(lblNewLabel_4);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(321, 235, 137, 147);
		contentPane.add(scrollPane_2);

		lstWeb = new JList();
		scrollPane_2.setViewportView(lstWeb);
		//MODELO ASOCIADO
		modelo3=new DefaultListModel<String>();
		lstWeb.setModel(modelo3);

		btnEnviar = new JButton("Enviar Mail");
		btnEnviar.setBounds(496, 283, 115, 23);
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

		ArrayPersonas = new ArrayList<Persona>();
		registrarEventos();
	}//FIN DE CONSTRUCTOR
	public void registrarEventos() {

		//BOTON SALIR 
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(WIDTH);
			}
		});
		//BOTON AÑADIR (LABELS: NOMBRE, CORREO WEBS) A (LABELS: NOMBRES Y DIRECCIONES)
		btnAnadir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//CREAR UNA PERSONA CON LOS DATOS DE LOS JTextField
				Persona p;
				p=new Persona(txtNombre.getText(), txtCorreo.getText(), txtWeb.getText());
				// SI EL MAIL ES CORRECTO AÑADO A LA PERSONA AL ARRAYLIST, LOS DATOS DE LA PERSONA A LOS JList
				//SINO ES CORRECTO, LE DOY EL FOCO AL TEXTFIELD CORREO Y SELECCIONAMOS EL TEXTO.
				if (!p.nombreCorrecto()) {
					JOptionPane.showMessageDialog(Gestion.this, p.getStrErrorN());
					txtNombre.requestFocus();
					txtNombre.selectAll();
				}else { //SI EL CORREO ES CORRECTO AÑADO A LA PERSONA AL ARRAYLIST DATOS DE LA PERSONA A LOS JList
					//DATOS DE LA PERSON EN UN JLIST
					ArrayPersonas.add(p);
					modelo1.addElement(p.getNombre());
				}
				if (!p.esEmailCorrecto()) {
					JOptionPane.showMessageDialog(Gestion.this, p.getStrError());
					txtCorreo.requestFocus();
					txtCorreo.selectAll();
				}else { //SI EL CORREO ES CORRECTO AÑADO A LA PERSONA AL ARRAYLIST DATOS DE LA PERSONA A LOS JList
					//DATOS DE LA PERSON EN UN JLIST
					ArrayPersonas.add(p);
					modelo2.addElement(p.getMail());
					modelo3.addElement(p.getWeb());
					//VACIAR LOS JTextField Y DAR EL FOCO AL NOMBRE
					txtNombre.setText("");
					txtCorreo.setText("");
					txtWeb.setText("");
				}
			}
		});// FIN DE BOTON AÑADIR 
		//BOTON GUARDAR
		btnGuardar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				FileDialog dlgGuardar;
				PrintWriter pw;
				//ELEGIR EL ARCHIVO (FileDialog)
				dlgGuardar=new FileDialog(Gestion.this,"Guardar", FileDialog.SAVE);
				dlgGuardar.setVisible(true);
				if (dlgGuardar.getFile()==null) { //PULSAR CANCELAR
					return;
				}
				//ABRIR EL ARCHIVO PARA ESCRIBIR (PrintWriter)
				try {
					pw=new PrintWriter (new File(dlgGuardar.getDirectory()+dlgGuardar.getFile()));

					//RECORRER EL ARRAYLIST DE PERSONAS  Y GUARDAR CADA PERSONA EN EL ARCHIVO MEDIANTE UNA LLAMDA A GUARDAR DE LA CLASE
					//persona A LA CUAL LE PASAMOS el PRINTWRITER
					for (Persona p : ArrayPersonas) { //FOREACH PARA CADA UNO
						p.guardar(pw);
					}
					pw.close();
				} catch (FileNotFoundException e) { //EN CASO DE ERROR
					JOptionPane.showMessageDialog(Gestion.this, "Error de archivo");
				}
			}
		});
		//BOTON DE CARGAR
		btnCargar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//ELEGIR EL ARCHIVO (FileDialgo)
				
				//ABRIR EL ARCHIVO (Scanner o BufferReader)
				
				//LEER TODOS LOS DATOS DEL ARCHIVO Y CARGARLOS EN: 
					//ARRAYLIST
					//CADA DATO EN SU JLIST
					
			}
		});
	}//FIN DE REGISTRAR EVENTOS
}