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

public class frm11 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtNum, txtSigno;
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
		setBounds(0, 00, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNum = new JLabel("Numero :");
        lblNum.setBounds(50,50,60,30);
        getContentPane().add(lblNum);

        JLabel lblSigno = new JLabel("Signo :");
        lblSigno.setBounds(50,90,60,30);
        getContentPane().add(lblSigno);

        txtNum = new JTextField();
        txtNum.setBounds(120,50,60,30);
        txtNum.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNum.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtNum);

        txtSigno = new JTextField();
        txtSigno.setBounds(120,90,60,30);
        txtSigno.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSigno.setMargin(new Insets(5,5,5,5));
        txtSigno.setFocusable(false);
        getContentPane().add(txtSigno);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 140, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt(txtNum.getText() );

		//if( numero > 0) txtSigno.setText("Positivo");
		//else if (numero == 0 ) txtSigno.setText("Cero");
		//else txtSigno.setText("Negativo");
		txtSigno.setText(numero > 0 ? "Positivo" : numero < 0 ? "Negativo" : "Cero");
	}

}