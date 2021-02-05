import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class MiPanel extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JButton btnArriba;
	private JButton btnIzquierda;
	private JButton btnDerecha;
	private JButton btnAbajo;
	private JButton btnAgregar;
	private AreaDibujo areaDibujo;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiPanel frame = new MiPanel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JButton getBtnArriba() {
		return btnArriba;
	}

	public void setBtnArriba(JButton btnArriba) {
		this.btnArriba = btnArriba;
	}

	public JButton getBtnIzquierda() {
		return btnIzquierda;
	}

	public void setBtnIzquierda(JButton btnIzquierda) {
		this.btnIzquierda = btnIzquierda;
	}

	public JButton getBtnDerecha() {
		return btnDerecha;
	}

	public void setBtnDerecha(JButton btnDerecha) {
		this.btnDerecha = btnDerecha;
	}

	public JButton getBtnAbajo() {
		return btnAbajo;
	}

	public void setBtnAbajo(JButton btnAbajo) {
		this.btnAbajo = btnAbajo;
	}

	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}

	/**
	 * Create the frame.
	 */
	public MiPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setBounds(0, 0, 400, 200);
		panel_1.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(61, 70, 123, 29);
		panel_1.add(txtNombre);
		txtNombre.setColumns(10);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(194, 73, 89, 23);
		panel_1.add(btnAgregar);
		
		btnArriba = new JButton("\u2191");
		btnArriba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnArriba.setBounds(185, 359, 76, 66);
		panel_1.add(btnArriba);
		
		btnDerecha = new JButton("\u2192");
		btnDerecha.setBounds(221, 426, 76, 54);
		panel_1.add(btnDerecha);
		
		btnIzquierda = new JButton("\u2190");
		btnIzquierda.setBounds(108, 401, 76, 54);
		panel_1.add(btnIzquierda);
		
		btnAbajo = new JButton("\u2193");
		btnAbajo.setBounds(148, 454, 76, 54);
		panel_1.add(btnAbajo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(72, 162, 139, 169);
		panel_1.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 200, 200);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	
		areaDibujo=new AreaDibujo(this);
		areaDibujo.setBounds(0, 0, 200, 400);
		areaDibujo.setBackground(Color.cyan);
		contentPane.add(areaDibujo);
	}
}
