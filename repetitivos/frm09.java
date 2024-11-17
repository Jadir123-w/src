package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.Rectangle;
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

public class frm09 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtAltura;
    JLabel lblResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm09 frame = new frm09();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 300);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblAltura = new JLabel("Altura *n >= 4*:");
        lblAltura.setBounds(50, 30, 120, 30);
        getContentPane().add(lblAltura);
		
		lblResultado = new JLabel();
        lblResultado.setBounds(50, 110, 200, 150);
        getContentPane().add(lblResultado);
		
		txtAltura = new JTextField();
        txtAltura.setBounds(180, 30, 60, 30);
        txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAltura.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAltura);

		JButton btnCalcular = new JButton("Generar Rectángulo");
        btnCalcular.setBounds(50, 70, 180, 30);
        getContentPane().add(btnCalcular);

		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
		int altura = Integer.parseInt(txtAltura.getText());
		StringBuilder rectangulo = new StringBuilder();

		if (altura >= 4){
			for (int i = 0; i < altura; i++) {
				for (int j = 0; j < 2 * altura; j++) {
					rectangulo.append("*");
				}
				rectangulo.append("<br>");
			}
		}
		lblResultado.setText("<html>" + rectangulo.toString() + "</html>");
    }
}