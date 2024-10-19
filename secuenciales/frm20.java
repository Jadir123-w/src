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
        int billetes200 = cantidad / 200;
        cantidad = cantidad % 200;

        int billetes100 = cantidad / 100;
        cantidad = cantidad % 100;

        int billetes50 = cantidad / 50;
        cantidad = cantidad % 50;

        int billetes20 = cantidad / 20;
        cantidad = cantidad % 20;
        
        int billetes10 = cantidad / 10;
        cantidad = cantidad % 10;
        
        int monedas5 = cantidad / 5;
        cantidad = cantidad % 5;
        
        int monedas2 = cantidad / 2;
        cantidad = cantidad % 2;

        int monedas1 = cantidad;

        String resultado = "Billetes de 200: " + billetes200 + "\n" +
                           "Billetes de 100: " + billetes100 + "\n" +
                           "Billetes de 50: " + billetes50 + "\n" +
                           "Billetes de 20: " + billetes20 + "\n" +
                           "Billetes de 10: " + billetes10 + "\n" +
                           "Monedas de 5: " + monedas5 + "\n" +
                           "Monedas de 2: " + monedas2 + "\n" +
                           "Monedas de 1: " + monedas1;
        
        txtResultado.setText(resultado);

    }
}