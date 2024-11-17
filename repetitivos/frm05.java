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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm05 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtNumero;
    JTextArea txtResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm05 frame = new frm05();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 400, 450);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(30, 30, 100, 30);
        getContentPane().add(lblNumero);

		txtNumero = new JTextField();
        txtNumero.setBounds(140, 30, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);
		
		txtResultado = new JTextArea();
        txtResultado.setBounds(30, 130, 320, 200);
        txtResultado.setEditable(false);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado);

		JButton btnGenerar = new JButton("Generar");
        btnGenerar.setBounds(140, 80, 100, 30);
        getContentPane().add(btnGenerar);

		btnGenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt(txtNumero.getText());
		StringBuilder resultado = new StringBuilder();

		for (int i = 1; i <= 12; i++) {
			resultado.append(numero).append(" x ").append(i).append(" = ").append(numero *i).append("\n");
		}
		txtResultado.setText("Tabla de multiplicar del "+ numero +":\n"+ resultado.toString());
    }
}