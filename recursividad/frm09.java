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



public class frm09 extends JFrame {
	private static final long serialVersionUID = 1L;
    JTextField txtAltura;
    JTextArea txtResultado;

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
		setBounds(0, 0, 400, 300);
		setLayout(null);
		setLocationRelativeTo(null);

        JLabel lblAltura = new JLabel("Altura (n):");
        lblAltura.setBounds(50, 30, 100, 30);
        add(lblAltura);

        txtAltura = new JTextField();
        txtAltura.setBounds(150, 30, 100, 30);
        add(txtAltura);

        JButton btnGenerar = new JButton("Generar");
        btnGenerar.setBounds(150, 80, 100, 30);
        add(btnGenerar);

        txtResultado = new JTextArea();
        txtResultado.setBounds(50, 130, 300, 100);
        txtResultado.setEditable(false);
        add(txtResultado);

        btnGenerar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int n = Integer.parseInt(txtAltura.getText());
                    if (n >= 4) {
                        String resultado = generarRectanguloAsteriscos(n);
                        txtResultado.setText(resultado);
                    } else {
                        txtResultado.setText("La altura debe ser mayor o igual a 4.");
                    }
                } catch (NumberFormatException ex) {
                    txtResultado.setText("Por favor, ingrese un número válido.");
                }
            }
        });
    }

    private String generarRectanguloAsteriscos(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}