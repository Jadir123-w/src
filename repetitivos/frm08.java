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

public class frm08 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtBase, txtExponente;
    JLabel lblResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm08 frame = new frm08();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 350, 300);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblBase = new JLabel("Base:");
        lblBase.setBounds(50, 30, 100, 30);
        getContentPane().add(lblBase);
		
		JLabel lblExponente = new JLabel("Exponente:");
        lblExponente.setBounds(50, 70, 100, 30);
        getContentPane().add(lblExponente);
		
		lblResultado = new JLabel("Resultado: ");
        lblResultado.setBounds(50, 170, 300, 30);
        getContentPane().add(lblResultado);

		txtBase = new JTextField();
        txtBase.setBounds(150, 30, 100, 30);
        txtBase.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtBase);

		txtExponente = new JTextField();
        txtExponente.setBounds(150, 70, 100, 30);
        txtExponente.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtExponente);

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
		int base = Integer.parseInt(txtBase.getText());
		int exponente = Integer.parseInt(txtExponente.getText());
		int resultado = 1;

		for (int i = 0; i < exponente; i++) {
			resultado *= base;
		}
		lblResultado.setText("Resultado : "+ resultado);
    }
}