import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.Component;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.Dimension;

public class Tunning extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tunning frame = new Tunning();
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
	public Tunning() {
		setBackground(Color.BLUE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 655);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel tituloOficial = new JPanel();
		tituloOficial.setBackground(Color.BLUE);
		contentPane.add(tituloOficial, BorderLayout.NORTH);
		
		JLabel titulo = new JLabel("TALLER TUNING");
		titulo.setForeground(Color.WHITE);
		tituloOficial.add(titulo);
		
		JPanel Botones = new JPanel();
		Botones.setBackground(Color.CYAN);
		contentPane.add(Botones, BorderLayout.SOUTH);
		Botones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnEnviar = new JButton("ENVIAR");
		btnEnviar.setBackground(Color.BLUE);
		btnEnviar.setForeground(Color.WHITE);
		Botones.add(btnEnviar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBackground(Color.BLUE);
		btnCancelar.setForeground(Color.WHITE);
		Botones.add(btnCancelar);
		
		JPanel PanelMain = new JPanel();
		contentPane.add(PanelMain, BorderLayout.CENTER);
		PanelMain.setLayout(new BoxLayout(PanelMain, BoxLayout.Y_AXIS));
		
		JPanel PrimeraFila = new JPanel();
		PrimeraFila.setBackground(Color.CYAN);
		PanelMain.add(PrimeraFila);
		PrimeraFila.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel Nombre = new JLabel("Nombre: ");
		Nombre.setHorizontalAlignment(SwingConstants.RIGHT);
		Nombre.setBackground(Color.BLACK);
		PrimeraFila.add(Nombre);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(Color.LIGHT_GRAY);
		PrimeraFila.add(textField);
		
		JLabel Apellidos = new JLabel("Apellidos: ");
		Apellidos.setHorizontalAlignment(SwingConstants.RIGHT);
		PrimeraFila.add(Apellidos);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(Color.LIGHT_GRAY);
		PrimeraFila.add(textField_1);
		
		JLabel Direccion = new JLabel("Direccion: ");
		Direccion.setHorizontalAlignment(SwingConstants.RIGHT);
		PrimeraFila.add(Direccion);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(Color.LIGHT_GRAY);
		PrimeraFila.add(textField_2);
		
		JLabel Provincia = new JLabel("Provincia: ");
		Provincia.setHorizontalAlignment(SwingConstants.RIGHT);
		PrimeraFila.add(Provincia);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.LIGHT_GRAY);
		PrimeraFila.add(comboBox);
		
		JLabel Edad = new JLabel("Edad: ");
		Edad.setHorizontalAlignment(SwingConstants.RIGHT);
		PrimeraFila.add(Edad);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.LIGHT_GRAY);
		PrimeraFila.add(comboBox_1);
		
		JLabel Sexo = new JLabel("Sexo: ");
		Sexo.setHorizontalAlignment(SwingConstants.RIGHT);
		PrimeraFila.add(Sexo);
		
		JPanel panelSexo = new JPanel();
		panelSexo.setBackground(Color.LIGHT_GRAY);
		PrimeraFila.add(panelSexo);
		panelSexo.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JRadioButton Hombre = new JRadioButton("Hombre");
		Hombre.setBackground(Color.LIGHT_GRAY);
		panelSexo.add(Hombre);
		
		JRadioButton Mujer = new JRadioButton("Mujer");
		Mujer.setBackground(Color.LIGHT_GRAY);
		panelSexo.add(Mujer);
		
		JPanel segundaFila = new JPanel();
		segundaFila.setBackground(Color.CYAN);
		PanelMain.add(segundaFila);
		segundaFila.setLayout(new BorderLayout(0, 0));
		
		JPanel SujetaPreferencias = new JPanel();
		SujetaPreferencias.setBackground(Color.BLUE);
		segundaFila.add(SujetaPreferencias, BorderLayout.NORTH);
		SujetaPreferencias.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Preferencias: ");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		SujetaPreferencias.add(lblNewLabel);
		
		JPanel Nada = new JPanel();
		Nada.setBackground(Color.BLUE);
		SujetaPreferencias.add(Nada);
		
		JPanel lista = new JPanel();
		lista.setBackground(Color.CYAN);
		segundaFila.add(lista, BorderLayout.SOUTH);
		lista.setLayout(new GridLayout(0, 2, 0, 0));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Tunning");
		chckbxNewCheckBox.setBackground(Color.CYAN);
		lista.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Equipamiento");
		chckbxNewCheckBox_3.setBackground(Color.CYAN);
		lista.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Recambios");
		chckbxNewCheckBox_2.setBackground(Color.CYAN);
		lista.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Reparaciones");
		chckbxNewCheckBox_7.setBackground(Color.CYAN);
		lista.add(chckbxNewCheckBox_7);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Puesto a punto");
		chckbxNewCheckBox_6.setBackground(Color.CYAN);
		lista.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Mantenimiento");
		chckbxNewCheckBox_5.setBackground(Color.CYAN);
		lista.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Competicion");
		chckbxNewCheckBox_4.setBackground(Color.CYAN);
		lista.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Vehiculos Ocasion");
		chckbxNewCheckBox_1.setBackground(Color.CYAN);
		lista.add(chckbxNewCheckBox_1);
		
		JPanel TerceraFila = new JPanel();
		TerceraFila.setBackground(Color.BLUE);
		PanelMain.add(TerceraFila);
		TerceraFila.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Comentarios: ");
		lblNewLabel_1.setForeground(Color.WHITE);
		TerceraFila.add(lblNewLabel_1);
		
		TextArea textArea = new TextArea();
		TerceraFila.add(textArea);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		panel.setBackground(Color.BLUE);
		TerceraFila.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLUE);
		TerceraFila.add(panel_1);
		
		JLabel lblNewLabel_4 = new JLabel("Pedidos: ");
		lblNewLabel_4.setForeground(Color.WHITE);
		TerceraFila.add(lblNewLabel_4);
		
		TextArea textArea_1 = new TextArea();
		TerceraFila.add(textArea_1);
	}
}
