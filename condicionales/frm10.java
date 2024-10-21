package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm10 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtN1, txtN2, txtN3, txtN4, txtN5, txtNeliminadaM, txtNeliminadaMe, txtProm;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm10 frame = new frm10();
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
	public frm10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 400, 400);
        setLayout(null);
        setLocationRelativeTo(null);
		
		JLabel lblN1 = new JLabel("Nota 1:");
        lblN1.setBounds(50, 50, 80, 30);
        getContentPane().add(lblN1);

		JLabel lblN2 = new JLabel("Nota 2:");
        lblN2.setBounds(50, 90, 80, 30);
        getContentPane().add(lblN2);

		JLabel lblN3 = new JLabel("Nota 3:");
        lblN3.setBounds(50, 130, 80, 30);
        getContentPane().add(lblN3);

		JLabel lblN4 = new JLabel("Nota 4:");
        lblN4.setBounds(50, 170, 80, 30);
        getContentPane().add(lblN4);

		JLabel lblN5 = new JLabel("Nota 5:");
        lblN5.setBounds(50, 210, 80, 30);
        getContentPane().add(lblN5);

		JLabel lblNeliminadaM = new JLabel("Nota Mayor Eliminada:");
        lblNeliminadaM.setBounds(50, 250, 150, 30);
        getContentPane().add(lblNeliminadaM);

		JLabel lblNeliminadaMe = new JLabel("Nota Menor Eliminada:");
        lblNeliminadaMe.setBounds(50, 290, 150, 30);
        getContentPane().add(lblNeliminadaMe);

		JLabel lblProm = new JLabel("Promedio:");
        lblProm.setBounds(50, 330, 80, 30);
        getContentPane().add(lblProm);

		txtN1= new JTextField();
        txtN1.setBounds(150, 50, 80, 30);
        txtN1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtN1.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtN1);

		txtN2= new JTextField();
        txtN2.setBounds(150, 90, 80, 30);
        txtN2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtN2.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtN2);
		
		txtN3= new JTextField();
        txtN3.setBounds(150, 130, 80, 30);
        txtN3.setHorizontalAlignment(SwingConstants.RIGHT);
        txtN3.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtN3);

		txtN4= new JTextField();
        txtN4.setBounds(150, 170, 80, 30);
        txtN4.setHorizontalAlignment(SwingConstants.RIGHT);
        txtN4.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtN4);

		txtN5 = new JTextField();
        txtN5.setBounds(150, 210, 80, 30);
		txtN5.setHorizontalAlignment(SwingConstants.RIGHT);
		txtN5.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtN5);

		txtNeliminadaM = new JTextField();
        txtNeliminadaM.setBounds(200, 250, 80, 30);
        txtNeliminadaM.setFocusable(false);
        getContentPane().add(txtNeliminadaM);
		
		txtNeliminadaMe = new JTextField();
        txtNeliminadaMe.setBounds(200, 290, 80, 30);
        txtNeliminadaMe.setFocusable(false);
        getContentPane().add(txtNeliminadaMe);

		txtProm = new JTextField();
        txtProm.setBounds(150, 330, 80, 30);
        txtProm.setFocusable(false);
        getContentPane().add(txtProm);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(250, 50, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
		double[] notas = new double[5];
		notas[0] = Double.parseDouble(txtN1.getText());
		notas[1] = Double.parseDouble(txtN2.getText());
		notas[2] = Double.parseDouble(txtN3.getText());
		notas[3] = Double.parseDouble(txtN4.getText());
		notas[4] = Double.parseDouble(txtN5.getText());

		double nMayor = notas[0];
		double nMenor = notas[0];

		for (int i = 1; i < notas.length; i++) {
			if( notas[i] > nMayor) {
				nMayor = notas[i];
			}
			if (notas[i] < nMenor) {
				nMenor = notas[i];
			}
		}

		double suma = 0;
		int contador = 0;
		for (double nota : notas) {
			if (nota != nMayor && nota != nMenor) {
				suma += nota;
				contador++;
			}
		}

		double promedio = suma / contador;

		DecimalFormat df = new DecimalFormat("####.00");
		txtNeliminadaM.setText(df.format(nMayor));
		txtNeliminadaMe.setText(df.format(nMenor));
		txtProm.setText(df.format(promedio));
	}
}