import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class Correo extends JFrame {

	private JPanel contentPane;
	private JTextField txtPara;
	private JTextField txtCC;
	private JTextField txtAsunto;
	private JTextField txtMensaje;
	private JButton btnEnviar;

	

	/**
	 * Create the frame.
	 */
	public Correo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 522);
		contentPane = new JPanel();
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
		
		txtMensaje = new JTextField();
		scrollPane.setViewportView(txtMensaje);
		txtMensaje.setColumns(10);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(102, 449, 89, 23);
		contentPane.add(btnEnviar);
	}
}
