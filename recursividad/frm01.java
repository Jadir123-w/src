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



public class frm01 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtNumero;
	JTextArea txtResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm01 frame = new frm01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 400, 300);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNumero = new JLabel("Ingrese N:");
        lblNumero.setBounds(50, 30, 100, 30);
        add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(150, 30, 100, 30);
        add(txtNumero);


        txtResultado = new JTextArea();
        txtResultado.setBounds(50, 120, 300, 100);
        txtResultado.setEditable(false);
        add(txtResultado);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 70, 100, 30);
        add(btnCalcular);

		btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(txtNumero.getText());
                int suma = sumarNumeros(n);
                txtResultado.setText("La suma del 1 al " + n + " es: " + suma);
            }
        });
    }

    private int sumarNumeros(int n) {
        if (n == 1) return 1;
        return n + sumarNumeros(n - 1);
    }
}