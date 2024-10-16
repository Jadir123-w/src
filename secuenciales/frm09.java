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

public class frm09 extends JFrame {
    JTextField txtNumero,txtSumaCifras;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public frm09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 300, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Numero :");
        lblNumero.setBounds(50,50,80,30);
        getContentPane().add(lblNumero);

        
        JLabel lblSumaCifras = new JLabel("Suma de Sifras :");
        lblSumaCifras.setBounds(50,90,100,30);
        getContentPane().add(lblSumaCifras);

        txtNumero = new JTextField();
        txtNumero.setBounds(170,50,100,30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtNumero);

        txtSumaCifras = new JTextField();
        txtSumaCifras.setBounds(170,90,100,30);
        txtSumaCifras.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSumaCifras.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtSumaCifras);

        
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
        if (texto.matches("\\d{4}")) {
            int numero = Integer.parseInt(texto);
            int suma = 0;
            int temp = numero;

            while (temp > 0) {
                suma += temp % 10;
                temp /= 10 ;
            }
            txtSumaCifras.setText(String.valueOf(suma));
        } else {
            txtSumaCifras.setText("");
        }   
    }
}