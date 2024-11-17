package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm06 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtNumero, txtInicio, txtFin;
    JTextArea txtResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm06 frame = new frm06();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 400, 450);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(30, 30, 100, 30);
        getContentPane().add(lblNumero);
		
		JLabel lblFin = new JLabel("Tabla hasta:");
        lblFin.setBounds(30, 110, 100, 30);
        getContentPane().add(lblFin);

		txtNumero = new JTextField();
        txtNumero.setBounds(140, 30, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

		txtInicio = new JTextField();
        txtInicio.setBounds(140, 70, 100, 30);
        txtInicio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtInicio.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtInicio);

		txtFin = new JTextField();
        txtFin.setBounds(140, 110, 100, 30);
        txtFin.setHorizontalAlignment(SwingConstants.RIGHT);
        txtFin.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtFin);
		
		txtResultado = new JTextArea();
        txtResultado.setBounds(30, 190, 320, 150);
        txtResultado.setEditable(false);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado);

		JButton btnCalcular = new JButton("Generar");
        btnCalcular.setBounds(140, 150, 100, 30);
        getContentPane().add(btnCalcular);

		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt(txtNumero.getText());
		int inicio = Integer.parseInt(txtNumero.getText());
		int fin = Integer.parseInt(txtNumero.getText());
		
		StringBuilder resultado = new StringBuilder();
		for (int i = inicio; i <= fin; i++) {
			resultado.append(numero).append(" x ").append(i).append(" = ").append(numero *i).append("\n");
		}
		txtResultado.setText("Tabla de multiplicar del : "+ numero + " desde "+ inicio +" hasta " + fin + ":\n" + resultado.toString());
    }
}