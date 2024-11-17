package recursividad;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class frm08 extends JFrame {
	private static final long serialVersionUID = 1L;
    JTextField txtNumero;
    JTextArea txtResultado;

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
		setBounds(0, 0, 400, 300);
		setLayout(null);
		setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(50, 30, 100, 30);
        add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(150, 30, 100, 30);
        add(txtNumero);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 80, 100, 30);
        add(btnCalcular);

        txtResultado = new JTextArea();
        txtResultado.setBounds(50, 130, 300, 70);
        txtResultado.setEditable(false);
        add(txtResultado);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int numero = Integer.parseInt(txtNumero.getText());
                    long resultado = calcularFactorial(numero);
                    txtResultado.setText("Factorial: " + resultado);
                } catch (NumberFormatException ex) {
                    txtResultado.setText("Por favor, ingrese un número válido.");
                }
            }
        });
    }

    private long calcularFactorial(int numero) {
        if (numero == 0 || numero == 1) return 1;
        return numero * calcularFactorial(numero - 1);
    }
}