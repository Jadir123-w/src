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

public class frm03 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtNumero;
	JLabel lblResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm03 frame = new frm03();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 400, 280);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(50, 30, 120, 30);
        getContentPane().add(lblNumero);

		lblResultado = new JLabel("Cantidad de divisores: 0");
        lblResultado.setBounds(50, 130, 200, 30);
        getContentPane().add(lblResultado);

		txtNumero = new JTextField();
        txtNumero.setBounds(180, 30, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

		JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(130, 80, 100, 30);
        getContentPane().add(btnCalcular);

		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
		int n = Integer.parseInt(txtNumero.getText());

		int cantidadDiv = 0;

		for (int i = 1; i <= Math.abs(n); i++) {
			if (n % i == 0 ) {
				cantidadDiv++;
			}
		}

		lblResultado.setText("Cantidad de divisores: "+ cantidadDiv);
    }
}