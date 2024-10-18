package secuenciales;

import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class frm20 extends JFrame {
    JTextField txtCantidad;
    JTextArea txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm20 frame = new frm20();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frm20() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 450, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCantidad = new JLabel("Cantidad en soles:");
        lblCantidad.setBounds(50, 30, 150, 30);
        getContentPane().add(lblCantidad);
        
        txtCantidad = new JTextField();
        txtCantidad.setBounds(200, 30, 100, 30);
        getContentPane().add(txtCantidad);

        txtResultado = new JTextArea();
        txtResultado.setBounds(50, 70, 300, 150);
        txtResultado.setEditable(false);
        getContentPane().add(txtResultado);

        
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 230, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                btnCalcular_actionPerformed();
            }
        });


    }

	protected void btnCalcular_actionPerformed() {
        int cantidad = Integer.parseInt(txtCantidad.getText());
        int[] denominaciones = {200, 100, 50, 20, 10, 5, 2, 1};
        int[] cantidadBilletes = new int[denominaciones.length];

        for (int i = 0; i < denominaciones.length; i++) {
            cantidadBilletes[i] = cantidad / denominaciones[i];
            cantidad %= denominaciones[i];
        }
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < denominaciones.length; i++) {
            resultado.append("Billetes o Monedas de ").append(denominaciones[i]).append(": ")
                    .append(cantidadBilletes[i]).append("\n");
        }
        txtResultado.setText(resultado.toString());
    }
}