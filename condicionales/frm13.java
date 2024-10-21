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

public class frm13 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtNumero, txtResultado;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm13 frame = new frm13();
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
	public frm13() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 400,250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero= new JLabel("Numero de 3 cifras :");
        lblNumero.setBounds(50,30,160,30);
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

        JButton btnCalcular = new JButton("Calcular");
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
		if (numero.length() != 3 || !numero.matches("\\d+")) {
        }
		int c1 = Character.getNumericValue(numero.charAt(0));
		int c2 = Character.getNumericValue(numero.charAt(1));
		int c3 = Character.getNumericValue(numero.charAt(2));

        if (c1 + 1 == c2 && c2 + 1 == c3) {
			txtResultado.setText("Las cifras estan en orden ascendente");
		} else if (c1 - 1 == c2 && c2 - 1 == c3) {
			txtResultado.setText("Las cifras estan en orden descendente");
		}else {
			txtResultado.setText("Las cifras no estan en ningun orden");
		}
		 
	}

}