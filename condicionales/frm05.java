package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm05 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtNumero, txtResultado;
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

	/**
	 * Create the frame.
	 */
	public frm05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 400,250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero= new JLabel("Digita un numero de 4 cifras :");
        lblNumero.setBounds(50,30,250,30);
        getContentPane().add(lblNumero);

        txtNumero= new JTextField();
        txtNumero.setBounds(50,70,100,30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtNumero);

        txtResultado = new JTextField();
        txtResultado.setBounds(50,110,300,50);
        txtResultado.setMargin(new Insets(5,5,5,5));
        txtResultado.setFocusable(false);
        getContentPane().add(txtResultado);

        JButton btnCalcular = new JButton("Mayor numero");
        btnCalcular.setBounds(160, 70, 150, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
		String numero = txtNumero.getText();
		if (numero.length() != 4 || !numero.matches("\\d+")) {
            return;
        }
		char cifraM = numero.charAt(0);
        char cifraMe = numero.charAt(0);
		for (int i = 1; i < numero.length(); i++) {
            char cifraAc = numero.charAt(i);
			if (cifraAc > cifraM) cifraM = cifraAc;
        	if (cifraAc < cifraMe) cifraMe = cifraAc;
		}
		txtResultado.setText("Mayor número posible: " + cifraM + cifraMe);
	}

}