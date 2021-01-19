import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Ahorcado extends JFrame {

	private JPanel contentPane;
	private JButton btnSiguiente;
	private TecladoVirtual teclado;
	private Fichero fichero;
	private EventosAhorcado eventosAhorcado;
	private AreaDibujo areaDibujo;
	private String Palabra;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ahorcado frame = new Ahorcado();
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
	public Ahorcado() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("JUEGO DEL AHORCADO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 18));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);

		btnSiguiente = new JButton("Siguiente Palabra >>");
		btnSiguiente.setEnabled(false);
		contentPane.add(btnSiguiente, BorderLayout.SOUTH);

		teclado=new TecladoVirtual(this);
		contentPane.add(teclado, BorderLayout.CENTER);

		fichero=new Fichero();
		teclado.setPalabra(fichero.obtenerPalabra());
		teclado.ponerGuiones();
		eventosAhorcado=new EventosAhorcado(this);

		areaDibujo=new AreaDibujo();
		areaDibujo.setBounds(0,0,450,600);
		areaDibujo.setBackground(Color.yellow);
		contentPane.add(areaDibujo, BorderLayout.EAST);
	}

	public JButton getBtnSiguiente() {
		return btnSiguiente;
	}

	public void setBtnSiguiente(JButton btnSiguiente) {
		this.btnSiguiente = btnSiguiente;
	}

	public TecladoVirtual getTeclado() {
		return teclado;
	}

	public void setTeclado(TecladoVirtual teclado) {
		this.teclado = teclado;
	}

	public Fichero getFichero() {
		return fichero;
	}

	public void setFichero(Fichero fichero) {
		this.fichero = fichero;
	}

	public AreaDibujo getAreaDibujo() {
		return areaDibujo;
	}

	public void setAreaDibujo(AreaDibujo areaDibujo) {
		this.areaDibujo = areaDibujo;
	}


}
