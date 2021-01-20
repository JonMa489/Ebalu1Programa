import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Apellidos extends JFrame {

	private JPanel contentPane;
	private JTextField txtApellido1;
	private JTextField txtApellido2;
	private clientes cliente;
	private JButton btnConfirmar;
	private Altas altas;
	private int activado=1;


	public Apellidos(Altas altas) {
		setResizable(false);
		this.altas=altas;
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 477, 126);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblNewLabel = new JLabel("Primer Apellido");
		panel.add(lblNewLabel);

		txtApellido1 = new JTextField();
		panel.add(txtApellido1);
		txtApellido1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Segundo Apellido");
		panel.add(lblNewLabel_1);

		txtApellido2 = new JTextField();
		panel.add(txtApellido2);
		txtApellido2.setColumns(10);

		btnConfirmar = new JButton("Confirmar");
		panel.add(btnConfirmar);


		registrarEventos();
	}// FIN DE CONSTRUCTOR

	//GETTERS Y SETTERS
	public int getActivado() {
		return activado;
	}
	public void setActivado(int activado) {
		this.activado = activado;
	}
	public JTextField getTxtApellido1() {
		return txtApellido1;
	}
	public void setTxtApellido1(JTextField txtApellido1) {
		this.txtApellido1 = txtApellido1;
	}
	public JTextField getTxtApellido2() {
		return txtApellido2;
	}
	public void setTxtApellido2(JTextField txtApellido2) {
		this.txtApellido2 = txtApellido2;
	}

	//REGISTRAR EVENTOS
	public void registrarEventos () {
		btnConfirmar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				altas.getTxtApellidos().setText(txtApellido1.getText()+", "+txtApellido2.getText());
				altas.setActivado(0);
				altas.setVisible(true);
				Apellidos.this.setVisible(false);
			}
		});
	}
}
