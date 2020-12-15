import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JList;

public class Correo extends JFrame {

	private JPanel contentPane;
	private JTextField txtPara;
	private JTextField txtCC;
	private JTextField txtAsunto;
	private JButton btnEnviar;
	private JButton btnVolver;
	private Gestion  gestion;
	private JButton btnPersonas;
	private JList lstPersonas;
	private DefaultListModel<String> modelo;
	private ArrayList<Persona>ArrayPersonas;



	/**
	 * Create the frame.
	 */
	public Correo(Gestion gestion) {
		this.gestion=gestion;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 693, 599);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Para:");
		lblNewLabel.setBounds(47, 57, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(47, 86, 46, 14);
		contentPane.add(lblNewLabel_1);

		txtPara = new JTextField();
		txtPara.setBounds(116, 54, 339, 20);
		contentPane.add(txtPara);
		txtPara.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("CC :");
		lblNewLabel_2.setBounds(47, 111, 46, 14);
		contentPane.add(lblNewLabel_2);

		txtCC = new JTextField();
		txtCC.setBounds(116, 108, 339, 20);
		contentPane.add(txtCC);
		txtCC.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Asunto: ");
		lblNewLabel_3.setBounds(47, 157, 46, 14);
		contentPane.add(lblNewLabel_3);

		txtAsunto = new JTextField();
		txtAsunto.setBounds(116, 154, 339, 20);
		contentPane.add(txtAsunto);
		txtAsunto.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Mensaje:");
		lblNewLabel_4.setBounds(47, 205, 46, 14);
		contentPane.add(lblNewLabel_4);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(116, 202, 339, 221);
		contentPane.add(scrollPane);

		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);

		btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(102, 449, 89, 23);
		contentPane.add(btnEnviar);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(215, 449, 89, 23);
		contentPane.add(btnVolver);

		btnPersonas = new JButton("+");
		btnPersonas.setBounds(465, 53, 46, 23);
		contentPane.add(btnPersonas);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(505, 107, 146, 218);
		contentPane.add(scrollPane_1);

		lstPersonas = new JList();
		scrollPane_1.setViewportView(lstPersonas);

		modelo=new DefaultListModel<String>();
		lstPersonas.setModel(modelo);
		
		JLabel lblNewLabel_5 = new JLabel("LISTA DE NOMBRES:");
		lblNewLabel_5.setBounds(505, 86, 162, 14);
		contentPane.add(lblNewLabel_5);
		registrarEventos();

	}//FIN DEL CONTRUCTOR

	//GETTERS Y SETTERS
	public JTextField getTxtPara() {
		return txtPara;
	}
	public void setTxtPara(JTextField txtPara) {
		this.txtPara = txtPara;
	}

	//EVENTOS
	public void registrarEventos () {
		//BOTON VOLVER
		btnVolver.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Correo.this.dispose();

				//NECESITO LA UNICA INSTANCIA DE GESTION  ( se ha pasado y asignado en el constructor)
				gestion.setVisible(true);
			}
		});
		btnPersonas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//CARGAR LOS DATOS DEL ARRAY DE GESTION
				//EN ESTE JLIST . LUEGO DESACTIVAREMOS EL BOTON
				//PARA NO VOLVER A PONER LOS DATOS VARIAS VECES
				ArrayPersonas=gestion.getArrayPersonas();
				for (Persona persona : ArrayPersonas) {
					modelo.addElement(persona.getNombre());
					
					btnPersonas.setEnabled(false);
				}

			}
		});
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				Correo.this.dispose();
				gestion.setVisible(true);
			}

		});
	}
}
