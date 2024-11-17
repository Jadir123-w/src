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



public class frm06 extends JFrame {
	private static final long serialVersionUID = 1L;
    JTextField txtNumero;
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
		setBounds(0, 0, 400, 300);
		setLayout(null);
		setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Términos:");
        lblNumero.setBounds(50, 30, 100, 30);
        add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(150, 30, 100, 30);
        add(txtNumero);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 80, 100, 30);
        add(btnCalcular);

        txtResultado = new JTextArea();
        txtResultado.setBounds(50, 130, 300, 100);
        txtResultado.setEditable(false);
        add(txtResultado);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int numero = Integer.parseInt(txtNumero.getText());
                    if (numero <= 0) {
                        txtResultado.setText("Por favor, ingrese un número mayor a 0.");
                    } else {
                        StringBuilder resultado = new StringBuilder("Secuencia Fibonacci:\n");
                        for (int i = 0; i < numero; i++) {
                            resultado.append(calcularFibonacci(i)).append(" ");
                        }
                        txtResultado.setText(resultado.toString());
                    }
                } catch (NumberFormatException ex) {
                    txtResultado.setText("Por favor, ingrese un número válido.");
                }
            }
        });
    }

    private int calcularFibonacci(int n) {
        if (n <= 1) return n;
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }
}