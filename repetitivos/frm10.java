package repetitivos;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;



public class frm10 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextArea txtResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm10 frame = new frm10();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 500, 400);
		setLayout(null);
		setLocationRelativeTo(null);

		txtResultado = new JTextArea();
        txtResultado.setBounds(50, 80, 400, 250);
        txtResultado.setEditable(false);
        txtResultado.setFont(new Font("Arial", Font.PLAIN, 14));
        getContentPane().add(txtResultado);

		JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 30, 150, 30);
        getContentPane().add(btnCalcular);

		btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularNumeros();
            }
		});

	}

	protected void calcularNumeros() {
		StringBuilder resultado = new StringBuilder();
		int cantidad = 0;

		for (int num = 1000; num <=9999; num++) {
			int dig1 = num / 1000;
			int dig2 = (num / 100) % 10;
			int dig3 = (num / 10) % 10;
			int dig4 = num % 10;

			int sumaPares = 0, sumaImpares = 0;


			if (dig1 % 2 == 0) sumaPares+= dig1; else sumaImpares += dig1;
			if (dig2 % 2 == 0) sumaPares+= dig2; else sumaImpares += dig2;
			if (dig3 % 2 == 0) sumaPares+= dig3; else sumaImpares += dig3;
			if (dig4 % 2 == 0) sumaPares+= dig4; else sumaImpares += dig4;
			
			if(sumaPares == sumaImpares) {
				resultado.append(num + "\n");
				cantidad++;
			}
		}

		if (cantidad > 0 ) {
			resultado.append("\nCantidad de numeros encontrados: "+ cantidad);
		} else {
			resultado.append("\nNose encontraron numeros que  cumplan la condicion: "+ cantidad);
		}

		txtResultado.setText(resultado.toString());
	}
}