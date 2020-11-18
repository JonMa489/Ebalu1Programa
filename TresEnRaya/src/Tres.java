import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Window;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tres extends JFrame { 

	private JPanel contentPane;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn8;
	private JButton btn7;
	private JButton btn9;
	private JButton NuvParti;
	private JLabel lblj1;
	private JLabel lblj2;
	private JButton exit;
	private JButton[] arrayBotones;
	private int turno;//(1) Juega el 1 y (2) cuando juega el jugador dos
	private int numFichas;
	private JButton btnColor1;
	private JButton btnColor2;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tres frame = new Tres();
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
	public Tres() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 5, 0, 0));

		btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(btn1);

		btn2 = new JButton("");
		contentPane.add(btn2);

		btn3 = new JButton("");
		contentPane.add(btn3);

		lblj1 = new JLabel("Jug1");
		lblj1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblj1);

		btnColor1 = new JButton("");
		btnColor1.setBackground(Color.ORANGE);
		contentPane.add(btnColor1);

		btn4 = new JButton("");
		contentPane.add(btn4);

		btn5 = new JButton("");
		contentPane.add(btn5);

		btn6 = new JButton("");
		contentPane.add(btn6);

		lblj2 = new JLabel("Jug2");
		lblj2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblj2);

		btnColor2 = new JButton("");
		btnColor2.setBackground(Color.BLUE);
		contentPane.add(btnColor2);

		btn7 = new JButton("");
		contentPane.add(btn7);

		btn8 = new JButton("");
		contentPane.add(btn8);

		btn9 = new JButton("");
		contentPane.add(btn9);

		NuvParti = new JButton("Nueva Partida");
		contentPane.add(NuvParti);

		exit = new JButton("Exit");
		contentPane.add(exit);
		inicializar();
		registrarEventos();
		//FIN DE LA CONSTRUCION
	}
	private void inicializar () {
		Random r;
		//METER LOS 9 BOTONES EN EL ARRAY
		arrayBotones=new JButton[9];
		arrayBotones[0]=btn1;
		arrayBotones[1]=btn2;
		arrayBotones[2]=btn3;
		arrayBotones[3]=btn4;
		arrayBotones[4]=btn5;
		arrayBotones[5]=btn6;
		arrayBotones[6]=btn7;
		arrayBotones[7]=btn8;
		arrayBotones[8]=btn9;

		numFichas = 0;
		r=new Random();
		turno=r.nextInt(2)+1;

	}
	private void registrarEventos() {
		//CLICK EN EL BOTON SALIR
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(Tres.this, 
						"Seguro que quieres salir?",
						"Salir",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		for (int i = 0; i < arrayBotones.length; i++) {
			arrayBotones[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					/*PONER COLOR AL BOTON PULSADO SEGUN EL TURNO
					 * DESACTIVAR EL BOTON PULSADO
					 * COMPROBAR SI LA PARTIDA HA FINALIZADO (FUNCION)
					 * SI HA FINALIZADO HACER????
					 * SI NO HA FINALIZADO --> CAMBIAR TURNO
					 */
					JButton btn;
					btn=(JButton)e.getSource();
					if (turno==1) {
						
						btn.setBackground(btnColor1.getBackground());
					}else {
						
						btn.setBackground(btnColor2.getBackground());
					}
					btn.setEnabled(false);
					//COMPROBAR
					turno=turno%2+1;
					((JButton)e.getSource()).setBackground(Color.blue);
					
				}
			});
		}
		//PARA CAMBIAR NOMBRE DE LOS JUGADORES
		lblj1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				@SuppressWarnings("unused")
				String nombre;
				if (lblj1.isEnabled()) {
					return;
				}
				do {

					//LO QUE DEVUELVA JOptionPane.showInputDialog
					nombre=JOptionPane.showInputDialog(null,"Introduce el nombre"
							,"Nombre Jugador", JOptionPane.OK_CANCEL_OPTION);
					//si ese nombre no lo tiene el jugador 2 lo damos por bueno pero el jugador 1 
					//lo asignamos al label correspondiente.
					if (nombre==null) {
						break;
					}
				}while(nombre.trim().equalsIgnoreCase(lblj1.getText()) || nombre.trim().equals(" "));
				if (nombre!=null && !nombre.trim().equals("")) {
					lblj1.setText(nombre);
				}

			}
		});	
		lblj2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				@SuppressWarnings("unused")
				String nombre;
				if (lblj2.isEnabled()) {
					return;
				}
				do {

					//LO QUE DEVUELVA JOptionPane.showInputDialog
					nombre=JOptionPane.showInputDialog(null,"Introduce el nombre"
							,"Nombre Jugador", JOptionPane.OK_CANCEL_OPTION);
					//si ese nombre no lo tiene el jugador 2 lo damos por bueno pero el jugador 1 
					//lo asignamos al label correspondiente.
					if (nombre==null) {
						break;
					}
				}while(nombre.trim().equalsIgnoreCase(lblj2.getText()) || nombre.trim().equals(" "));
				if (nombre!=null && !nombre.trim().equals("")) {
					lblj2.setText(nombre);
				}
			}
		});	

	}//FIN DE REGISTRAR EVENTOS

	//UNA SOLA FUNCION QUE DESABILITE O HABILITE LOS 9 BOTONES
	public void estadoBotones(boolean estado) {
		for (int i = 0; i < arrayBotones.length; i++) {
			arrayBotones[i].setEnabled(estado);
		}
	}
	public int comprobar() {
		for (int fila = 0; fila < arrayBotones.length; fila++) {
			if (arrayBotones [(fila*3)+0].getBackground()==arrayBotones[(fila*3)+1].getBackground() &&
					arrayBotones[(fila*3)+0].getBackground()==arrayBotones[(fila*3)+2].getBackground() &&
					arrayBotones[(fila*3)+0].getBackground()!=exit.getBackground()) {
				return 1;
			}	
			return 0;
		}
		for (int colm = 0; colm <3; colm++) {
			if (arrayBotones [colm+0].getBackground()==arrayBotones[colm+3].getBackground() &&
					arrayBotones[colm+0].getBackground()==arrayBotones[colm+6].getBackground() &&
					arrayBotones[colm+0].getBackground()!=exit.getBackground()) {
				return 1;
			}	
			return 0;
		}
		if (arrayBotones [0].getBackground()==arrayBotones[4].getBackground() &&
				arrayBotones[0].getBackground()==arrayBotones[7].getBackground() &&
				arrayBotones[0].getBackground()!=exit.getBackground()) {
			return 1;
		}	
		return 0;
		if (arrayBotones [2].getBackground()==arrayBotones[5].getBackground() &&
				arrayBotones[2].getBackground()==arrayBotones[8].getBackground() &&
				arrayBotones[2].getBackground()!=exit.getBackground()) {
			return 1;
		}	
		return 0;

		if (numFichas==9) {
			return=2;
		}
	}

}