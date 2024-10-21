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

public class frm07 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtNum1, txtNum2, txtNum3, txtResultado;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm07 frame = new frm07();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 400,400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNum1= new JLabel("Numero 1:");
        lblNum1.setBounds(50,50,120,30);
        getContentPane().add(lblNum1);

		JLabel lblNum2= new JLabel("Numero 2:");
        lblNum2.setBounds(50,90,120,30);
        getContentPane().add(lblNum2);

		JLabel lblNum3= new JLabel("Numero 3:");
        lblNum3.setBounds(50,130,120,30);
        getContentPane().add(lblNum3);

        txtNum1= new JTextField();
        txtNum1.setBounds(150,50,80,30);
        txtNum1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNum1.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtNum1);

		txtNum2= new JTextField();
        txtNum2.setBounds(150,90,80,30);
        txtNum2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNum2.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtNum2);

		txtNum3= new JTextField();
        txtNum3.setBounds(150,130,80,30);
        txtNum3.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNum3.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtNum3);

        txtResultado = new JTextField();
        txtResultado.setBounds(50,200,300,70);
        txtResultado.setMargin(new Insets(5,5,5,5));
        txtResultado.setFocusable(false);
        getContentPane().add(txtResultado);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(140, 300, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
		int num1 = Integer.parseInt(txtNum1.getText());
        int num2 = Integer.parseInt(txtNum2.getText());
        int num3 = Integer.parseInt(txtNum3.getText());
        int intermedio;

		if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
            intermedio = num1;
        } else if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
            intermedio = num2;
        } else {
            intermedio = num3;
        }

		txtResultado.setText("Numero intermedio es "+ intermedio);
	
	}

}