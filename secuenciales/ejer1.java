package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ejer1 extends JFrame {
    JTextField txtNum, txtSum;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejer1 frame = new ejer1();
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
	public ejer1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNum = JLabel("Numero :");
        lblNum.setBounds(50,50,60,30);
        getContentPane().add(lblNum);

        JLabel lblSum = JLabel("Suma :");
        lblSum.setBounds(50,90,60,30);
        getContentPane().add(lblSum);

        txtNum = new JTextField();
        txtNum.setBounds(120,50,60,30);
        txtNum.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNum.setFocusable(false);
        txtNum.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtNum);

        txtSum = new JTextField();
        txtSum.setBounds(120,90,60,30);
        txtSum.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSum.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtSum);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 140, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                btnCalcular_actionPerformed();
            }
        });


    }

	protected void btnCalcular_actionPerformed() {
        
    }        
}