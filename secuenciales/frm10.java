package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm10 extends JFrame {
    JTextField txtNumero,txtInvertido;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public frm10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 300, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Numero :");
        lblNumero.setBounds(50,50,80,30);
        getContentPane().add(lblNumero);

        
        JLabel lblInvertido = new JLabel("Invertido :");
        lblInvertido.setBounds(50,90,100,30);
        getContentPane().add(lblInvertido);

        txtNumero = new JTextField();
        txtNumero.setBounds(170,50,100,30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtNumero);

        txtInvertido = new JTextField();
        txtInvertido.setBounds(170,90,100,30);
        txtInvertido.setHorizontalAlignment(SwingConstants.RIGHT);
        txtInvertido.setFocusable(false);
        txtInvertido.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtInvertido);

        
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100,280,100,30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                btnCalcular_actionPerformed();
            }
        });


    }

	protected void btnCalcular_actionPerformed() {
		String texto = txtNumero.getText();
        int numero = Integer.parseInt(texto);
        if (numero < 1000 || numero > 9999) {
            txtInvertido.setText("");
            return;
        }
        int invertido = 0;
        int temp = numero;

        while (temp > 0) {
            invertido = invertido * 10 + temp % 10;
            temp /= 10;
        }

        txtInvertido.setText(String.valueOf(invertido));
    }   
}