import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

public class ClaseGeometria extends JFrame {
	private Punto p1,p2;
	private JList<String> lstPuntos1;
	private JList<String> lstPuntos2;
	private JTextField txtDistan;
	private JButton btnCalcularDist;
	private ArrayList<Punto> arrayPuntos1, arrayPuntos2;
	private DefaultListModel<String> modelo1,modelo2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClaseGeometria frame = new ClaseGeometria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public ClaseGeometria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 338);
		JPanel contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(64, 64, 122, 145);
		contentPane.add(scrollPane);

		lstPuntos1 = new JList();
		scrollPane.setViewportView(lstPuntos1);
		//SU MODELO ASOCIADO
		modelo1=new DefaultListModel<String>();
		lstPuntos1.setModel(modelo1);

		JLabel Inicial = new JLabel("Puntos Iniciales");
		Inicial.setBounds(64, 39, 122, 14);
		contentPane.add(Inicial);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(245, 64, 115, 145);
		contentPane.add(scrollPane_1);

		lstPuntos2 = new JList();
		scrollPane_1.setViewportView(lstPuntos2);
		//SU MODELO ASOCIADO
		modelo2=new DefaultListModel<String>();
		lstPuntos2.setModel(modelo2);

		JLabel Final = new JLabel("Puntos Finales");
		Final.setBounds(245, 39, 115, 14);
		contentPane.add(Final);

		txtDistan = new JTextField();
		txtDistan.setBounds(411, 63, 122, 20);
		contentPane.add(txtDistan);
		txtDistan.setColumns(10);

		JLabel Distancia = new JLabel("Distancias:");
		Distancia.setBounds(411, 39, 122, 14);
		contentPane.add(Distancia);

		btnCalcularDist = new JButton("Calcular Distancia");
		btnCalcularDist.setBounds(411, 94, 122, 23);
		contentPane.add(btnCalcularDist);

		crearPuntos();
		btnCalcularDist.setEnabled(false);
		registrarEventos();
	}	//FIN DEL CONSTRUCTOR
	public void crearPuntos () {
		Punto p;
		Random r;
		//CREA 5 PUNTOS ALEATORIOS Y LOS AÑADE A CADA LISTA
		arrayPuntos1=new ArrayList<Punto>();
		arrayPuntos2=new ArrayList<Punto>();

		//CADA PUNTO CREADO SE AÑADE A:
		//ArrayList CORRESPONDIENTE (COMO OBJETO DE CLASE PUNTO)
		//AL MODELO CORRESPONDIENTE	(COMO STRING DE SUS CORDENADAS)
		r = new Random();
		for (int i = 0; i < 5 ; i++) {
			p=new Punto(r.nextDouble()*10, - r.nextDouble()*8);
			arrayPuntos1.add(p);
			modelo1.addElement(p.getStr());

			//LOS PUNTOS PARA LA LISTA
			p=new Punto(r.nextDouble()*10, - r.nextDouble()*8);
			arrayPuntos2.add(p);
			modelo2.addElement(p.getStr());
		}
	}
	public void registrarEventos() {
		//AL SELECCIONAR UN ELEMENTO DE UN LISTA, HABILITAR EL BOTON
		//CALCULAR  DIST SI HAY ELEMENTOS SELECIONADOS EN AMBAS LISTAS
		lstPuntos1.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				//
				if (lstPuntos2.getSelectedIndex()!=-1 && lstPuntos1.getSelectedIndex()!=-1){
					btnCalcularDist.setEnabled(true);
				}
			}
		});
		lstPuntos2.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				//
				if (lstPuntos2.getSelectedIndex()!=-1 && lstPuntos1.getSelectedIndex()!=-1){
					btnCalcularDist.setEnabled(true);
				}
			}
		});
		btnCalcularDist.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// 
				Punto punto1,punto2;
				String A;
				punto1=arrayPuntos1.get(lstPuntos1.getSelectedIndex());
				punto2=arrayPuntos1.get(lstPuntos1.getSelectedIndex());
				A=String.valueOf(punto1.distancia(punto2));
				txtDistan.setText(A);
				
			}
		});
	}
}