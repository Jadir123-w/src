package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm02 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtNumero1, txtNumero2;
	JLabel lblResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm02 frame = new frm02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 400, 280);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNumero1 = new JLabel("Número 1:");
        lblNumero1.setBounds(50, 30, 120, 30);
        getContentPane().add(lblNumero1);

		JLabel lblNumero2 = new JLabel("Número 2:");
        lblNumero2.setBounds(50, 70, 120, 30);
        getContentPane().add(lblNumero2);
		
		lblResultado = new JLabel("Resultado: 0");
        lblResultado.setBounds(50, 160, 200, 30);
        getContentPane().add(lblResultado);

		txtNumero1 = new JTextField();
        txtNumero1.setBounds(180, 30, 100, 30);
        txtNumero1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero1);

		txtNumero2 = new JTextField();
        txtNumero2.setBounds(180, 70, 100, 30);
        txtNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero2);
		
		JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(130, 120, 100, 30);
        getContentPane().add(btnCalcular);

		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
		int n1 = Integer.parseInt(txtNumero1.getText());
		int n2 = Integer.parseInt(txtNumero2.getText());

		int resultado = 0;
		int veces = Math.abs(n2);

		for (int i = 0; i < veces; i++) {
			resultado+=n1;
		}
		
		if ((n1 < 0 && n2 > 0) || (n1 > 0 && n2 < 0)) {
			resultado = -resultado;
		}

		lblResultado.setText("Resultado: "+ resultado);
    }
}