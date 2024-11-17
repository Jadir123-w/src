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
        txtResultado.setBounds(50, 130, 300, 100);
        txtResultado.setEditable(false);
        add(txtResultado);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int numero = Integer.parseInt(txtNumero.getText());
                    if (numero < 0) {
                        txtResultado.setText("Por favor, ingrese un número no negativo.");
                    } else {
                        int resultado = calcularSumatoria(numero);
                        txtResultado.setText("La sumatoria de 1 a " + numero + " es: " + resultado);
                    }
                } catch (NumberFormatException ex) {
                    txtResultado.setText("Por favor, ingrese un número válido.");
                }
            }
        });
    }

    private int calcularSumatoria(int numero) {
        if (numero == 0) return 0;
        return numero + calcularSumatoria(numero - 1);
    }
}