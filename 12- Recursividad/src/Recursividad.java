import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Recursividad extends JFrame {
	private JPanel contentPane;
	private JTextField txtFactorial;
	private JTextField txtNum1;
	private JTextField txtNum3;
	private JTextField txtNum2;
	private JTextField txtpotencia;
	private JButton btnFactorial;
	private JButton btnPotencia;
	private JTextField txtFigo;
	private JTextField txtNum4;
	private JButton btnFigo;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recursividad frame = new Recursividad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Recursividad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtFactorial = new JTextField();
		txtFactorial.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFactorial.setBounds(133, 82, 153, 20);
		contentPane.add(txtFactorial);
		txtFactorial.setColumns(10);

		JLabel lblNewLabel = new JLabel("Factorial:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(135, 57, 79, 14);
		contentPane.add(lblNewLabel);

		btnFactorial = new JButton("Calcular Factorial");
		btnFactorial.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnFactorial.setBounds(314, 81, 184, 23);
		contentPane.add(btnFactorial);

		txtNum1 = new JTextField();
		txtNum1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNum1.setBounds(56, 82, 46, 20);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Num:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(56, 57, 46, 14);
		contentPane.add(lblNewLabel_1);

		txtNum3 = new JTextField();
		txtNum3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNum3.setBounds(61, 158, 57, 20);
		contentPane.add(txtNum3);
		txtNum3.setColumns(10);

		txtpotencia = new JTextField();
		txtpotencia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpotencia.setBounds(128, 158, 158, 20);
		contentPane.add(txtpotencia);
		txtpotencia.setColumns(10);

		btnPotencia = new JButton("Calcular potencia");
		btnPotencia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPotencia.setBounds(314, 157, 184, 23);
		contentPane.add(btnPotencia);

		JLabel lblNewLabel_2 = new JLabel("Potencia:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(134, 134, 80, 14);
		contentPane.add(lblNewLabel_2);

		txtNum2 = new JTextField();
		txtNum2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNum2.setColumns(10);
		txtNum2.setBounds(10, 158, 41, 20);
		contentPane.add(txtNum2);
		
		txtFigo = new JTextField();
		txtFigo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFigo.setColumns(10);
		txtFigo.setBounds(128, 225, 158, 20);
		contentPane.add(txtFigo);
		
		JLabel lblNewLabel_2_1 = new JLabel("Figonaci:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(133, 205, 80, 14);
		contentPane.add(lblNewLabel_2_1);
		
		btnFigo = new JButton("Calcular Figonaci");
		btnFigo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnFigo.setBounds(314, 226, 184, 23);
		contentPane.add(btnFigo);
		
		txtNum4 = new JTextField();
		txtNum4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNum4.setColumns(10);
		txtNum4.setBounds(56, 227, 46, 20);
		contentPane.add(txtNum4);

		registrarEventos();

	}//FIN DEL CONSTRUCTOR
	private void registrarEventos() {
		btnFactorial.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//CALCULAR EL FACTORIAL DEL NUMERO INTRODUCIDO EN 
				//EL JTEXTFIELD txtNum1
				int num;
				if(!txtNum1.getText().equals("")) {
					num=Integer.parseInt(txtNum1.getText());
					txtFactorial.setText(factorial(num)+"");
				}
			}
		});
		btnPotencia.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int base, exp;
				if (!txtNum2.getText().equals("") && !txtNum3.getText().equals("")) {
					base=Integer.parseInt(txtNum2.getText());
					exp=Integer.parseInt(txtNum3.getText());
					txtpotencia.setText(potencia(base,exp)+"");
				}
			}
		});
		btnFigo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int num5;
				if (!txtNum4.getText().equals("")) {
					num5=Integer.parseInt(txtNum4.getText());
					txtFigo.setText(figo(num5)+"");
				}
			}
		});
	}
	/*FUNCION QUE CALCULE EL FACTORIAL DE UN NUMERO ENTERO POSITIVO
	 * RECIBIDO COMO PARÁMETRO. EL RESULTADO SERÁ DOUBLE
	 */
	public double factorial(int num) {
		double aux;
		if(num<=1) {
			return 1;
		}else {
			return(num*factorial(num-1));
		}
	}
	public double potencia (int base, int exp) {
		if (exp==1) {
			return base;
		}else if (exp==0) {
			return 1;
		}else {
			return(base*potencia(base,exp-1));
		}
	}
	public double figo(int num5) { //FIBO*
		if (num5==0 || num5==1) {
			return num5;
		}else {
			return (figo(num5-1)+ figo(num5-2));
		}
	}
}