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

public class frm11 extends JFrame {
    JTextField txtNumero, txtNumero2, txtInvertido, txtInvertido2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm11 frame = new frm11();
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
	public frm11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 300, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Numero :");
        lblNumero.setBounds(50,50,80,30);
        getContentPane().add(lblNumero);
        
        JLabel lblNumero2 = new JLabel("Numero 2:");
        lblNumero2.setBounds(50,100,80,30);
        getContentPane().add(lblNumero2);

        
        JLabel lblInvertido = new JLabel("Invertido :");
        lblInvertido.setBounds(50,150,110,30);
        getContentPane().add(lblInvertido);

        JLabel lblInvertido2 = new JLabel("Invertido 2:");
        lblInvertido2.setBounds(50,200,110,30);
        getContentPane().add(lblInvertido2);

        txtNumero = new JTextField();
        txtNumero.setBounds(170,50,110,30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtNumero);
        
        
        txtNumero2 = new JTextField();
        txtNumero2.setBounds(170,100,110,30);
        txtNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero2.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtNumero2);

        txtInvertido = new JTextField();
        txtInvertido.setBounds(170,150,110,30);
        txtInvertido.setHorizontalAlignment(SwingConstants.RIGHT);
        txtInvertido.setFocusable(false);
        txtInvertido.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtInvertido);
        
        txtInvertido2 = new JTextField();
        txtInvertido2.setBounds(170,200,110,30);
        txtInvertido2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtInvertido2.setFocusable(false);
        txtInvertido2.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtInvertido2);

        
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(110,280,110,30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                btnCalcular_actionPerformed();
            }
        });


    }

	protected void btnCalcular_actionPerformed() {
    try {
        int numero1 = Integer.parseInt(txtNumero.getText());
        int numero2 = Integer.parseInt(txtNumero2.getText());

        if(numero1 < 100 || numero1 > 999 || numero2 < 100 || numero2 > 999) {
            txtInvertido.setText("Error");
            txtInvertido2.setText("Error");
            return;
        }

        int centenas1 = numero1 / 100;
        int decenas1 = (numero1 / 10) % 10;
        int unidades1 = numero1 % 10;

        int centenas2 = numero2 / 100;
        int decenas2 = (numero2 / 10) % 10;
        int unidades2 = numero2 % 10;

        int nuevoNumero1 = centenas2 * 100 + decenas1 * 10 + unidades2;
        int nuevoNumero2 = centenas1 * 100 + decenas2 * 10 + unidades1;

        txtInvertido.setText(String.valueOf(nuevoNumero1));
        txtInvertido2.setText(String.valueOf(nuevoNumero2));
    } catch (NumberFormatException ex) {
        txtInvertido.setText("");
        txtInvertido2.setText("");
    }
}
}