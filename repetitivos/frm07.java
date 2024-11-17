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

public class frm07 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtNumero;
    JTextArea txtResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm07 frame = new frm07();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 400, 450);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(50, 50, 100, 30);
        getContentPane().add(lblNumero);

		txtNumero = new JTextField();
        txtNumero.setBounds(150, 50, 150, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);
		
		txtResultado = new JTextArea();
        txtResultado.setBounds(30, 130, 320, 200);
        txtResultado.setEditable(false);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado);

		JButton btnCalcular = new JButton("Generar");
        btnCalcular.setBounds(100, 100, 180, 30);
        getContentPane().add(btnCalcular);

		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt(txtNumero.getText());
		
		BigInteger factorial = BigInteger.ONE;
		for (int i = 1; i <= numero; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		txtResultado.setText("Resultado : "+ factorial.toString());
    }
}