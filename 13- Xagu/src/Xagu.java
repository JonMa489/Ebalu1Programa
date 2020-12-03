import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

public class Xagu extends JFrame {

	public static final int FILAS=10;
	public static final int COLS=10;
	public static final String MURO="muro.jpg";
	public static final String Cagu="imgXagu.jpg;";

	private JPanel contentPane;
	private JPanel panelLaberinto;
	private JPanel panelAcciones;
	private JButton btnBuscarSalida;
	private JButton btnCargarMapa;
	private JLabel[][] laberinto;
	private int filaXagu, colXagu;
	private boolean salidaEncontrada=false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Xagu frame = new Xagu();
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
	public Xagu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 814, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		panelLaberinto = new JPanel();
		contentPane.add(panelLaberinto, BorderLayout.CENTER);
		panelLaberinto.setLayout(new GridLayout(10, 10, 0, 0));

		panelAcciones = new JPanel();
		contentPane.add(panelAcciones, BorderLayout.SOUTH);

		btnBuscarSalida = new JButton("Buscar Salida");
		panelAcciones.add(btnBuscarSalida);

		btnCargarMapa = new JButton("cargar Mapa");
		panelAcciones.add(btnCargarMapa);

		registrarEventos();
		crearLabels();

	}//FIN DEL CONSTRUCTOR

	private void registrarEventos() {
		//CLICK EN EL BOTON PARA CARGAR UN MAPA
		btnCargarMapa.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Scanner scFich;
				String strFich, strLinea;
				int numLinea;
				ImageIcon imagen=new ImageIcon("muro.jpg");
				ImageIcon image1=new ImageIcon("tierra1.jpg");
				ImageIcon imgXagu=new ImageIcon("imgXagu.jpg");
				//ELEGIR EL ARCHIVO DEL QUE QUEREMOS LEER
				//LO DEJAMOS PARA MÁS ADELANTE
				//FileDialog dlgCargar;
				//dlgCargar=new FileDialog(Xagu.this);
				FileDialog dlgAbrir;
				dlgAbrir=new FileDialog (Xagu.this, "Cargar mapa", FileDialog.LOAD);
				dlgAbrir.setVisible(true);
				strFich=dlgAbrir.getFile();
				if (strFich==null) {
					return; 
				}
				//LEER CADA LÍNEA DEL FICHERO
				try {
					scFich=new Scanner(new File(strFich));
					//EN LA POSICION CORRESPONDIENTE A CADA CARACTER DE LA
					//LINEA EN EL LABEL CORRESPONDIENTE DEL ARRAY PONDREMOS
					//IMAGEN O DEJAREMOS VACÍO
					numLinea=0;
					do {
						strLinea=scFich.nextLine();
						for(int col=0;col<COLS;col++) {
							if(strLinea.charAt(col)=='1') {
								laberinto[numLinea][col].setText("1");
								laberinto[numLinea][col].setIcon(imagen);
							}else if (strLinea.charAt(col)=='2') {
								laberinto[numLinea][col].setText("2");
								laberinto[numLinea][col].setIcon(imgXagu);
								filaXagu=numLinea;
								colXagu=col;
							}else /*if (strLinea.charAt(col)=='0') {
								laberinto[numLinea][col].setText("");
								laberinto[numLinea][col].setIcon(image1);
							}else */{
								laberinto[numLinea][col].setText("");
								laberinto[numLinea][col].setIcon(null);
							}
						}
						numLinea++;
					} while(scFich.hasNext());
					scFich.close();
					salidaEncontrada=false;
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}		
			}
		});
		btnBuscarSalida.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// LLAMADA A LA FUNCION RECURSIVA
				buscarSalida(laberinto, filaXagu, colXagu);
				
			}

		});
	}

	private void buscarSalida(JLabel[][] laberinto, int filaXagu, int colXagu) {
		// CASOS BASICOS
		if (filaXagu==0 || filaXagu==FILAS-1 || colXagu==0 || colXagu==COLS-1) {
			laberinto[filaXagu][colXagu].setText("*");
			salidaEncontrada=true;
			return;
		}else { //CASO GENERAL
			//MARCAR EL CAMINO
			laberinto[filaXagu][colXagu].setText("-");
			
			//INTER MOVER AL NORTE
			if (!salidaEncontrada && laberinto[filaXagu-1][colXagu].getText().equals("")) {
				buscarSalida(laberinto, filaXagu-1, colXagu);
			}
			//MOVER AL SUR
			if (!salidaEncontrada && laberinto[filaXagu+1][colXagu].getText().equals("")) {
				buscarSalida(laberinto, filaXagu+1, colXagu);
			}
			//MOVER AL OESTE
			if (!salidaEncontrada && laberinto[filaXagu][colXagu-1].getText().equals("")) {
				buscarSalida(laberinto, filaXagu, colXagu-1);
			}
			//MOVER AL ESTE
			if (!salidaEncontrada && laberinto[filaXagu][colXagu+1].getText().equals("")) {
				buscarSalida(laberinto, filaXagu, colXagu+1);
			}

		}
		//MARCAR EL CAMINO 
		if (salidaEncontrada) {
			laberinto[filaXagu][colXagu].setText("*");
		}

	}

	private void crearLabels() {
		//CREAR 100 LABELS EN EJECUCIÓN, AÑDIÉNDOLOS AL ARRAYLABERINTO
		//Y AL panelLaberinto
		JLabel lblAux;
		laberinto=new JLabel[FILAS][COLS];
		for(int fila=0;fila<FILAS;fila++) {
			for(int col=0;col<COLS;col++) {
				//crear un label
				lblAux=new JLabel("*");
				//darle caracteristicas
				lblAux.setFont(new Font("Arial", Font.BOLD, 60));
				lblAux.setVerticalAlignment(JLabel.CENTER);
				lblAux.setHorizontalAlignment(JLabel.CENTER);
				//añadirla al arrayLaberinto
				laberinto[fila][col]=lblAux;
				//añadirla al panellaberinto
				panelLaberinto.add(lblAux);
			}
		}
	}

}
