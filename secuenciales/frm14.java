package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm14 extends JFrame {
    JTextField txtNum1,txtNum2, txtNum3, txtNum4, txtNum5, txtprom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm14 frame = new frm14();
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
	public frm14() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 300, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNum1 = new JLabel("Numero 1 :");
        lblNum1.setBounds(50,50,80,30);
        getContentPane().add(lblNum1);
        
        JLabel lblNum2 = new JLabel("Numero 2 :");
        lblNum2.setBounds(50,90,80,30);
        getContentPane().add(lblNum2);

        JLabel lblNum3 = new JLabel("Numero 3 :");
        lblNum3.setBounds(50,130,80,30);
        getContentPane().add(lblNum3);

        JLabel lblNum4 = new JLabel("Numero 4 :");
        lblNum4.setBounds(50,170,80,30);
        getContentPane().add(lblNum4);
        
        JLabel lblNum5 = new JLabel("Numero 5 :");
        lblNum5.setBounds(50,210,80,30);
        getContentPane().add(lblNum5);
        
        JLabel lblprom = new JLabel("Promedio :");
        lblprom.setBounds(50,250,80,30);
        getContentPane().add(lblprom);
        
        txtNum1 = new JTextField();
        txtNum1.setBounds(130,50,100,30);
        txtNum1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNum1.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtNum1);

        txtNum2 = new JTextField();
        txtNum2.setBounds(130,90,100,30);
        txtNum2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNum2.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtNum2);

        txtNum3 = new JTextField();
        txtNum3.setBounds(130,130,100,30);
        txtNum3.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNum3.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtNum3);

        txtNum4 = new JTextField();
        txtNum4.setBounds(130,170,100,30);
        txtNum4.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNum4.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtNum4);

        txtNum5 = new JTextField();
        txtNum5.setBounds(130,210,100,30);
        txtNum5.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNum5.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtNum5);

        txtprom = new JTextField();
        txtprom.setBounds(130,250,100,30);
        txtprom.setFocusable(false);
        txtprom.setHorizontalAlignment(SwingConstants.RIGHT);
        txtprom.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtprom);
        
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100,290,100,30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                btnCalcular_actionPerformed();
            }
        });


    }

	protected void btnCalcular_actionPerformed() {
        double num1 = Double.parseDouble(txtNum1.getText());
        double num2 = Double.parseDouble(txtNum2.getText());
        double num3 = Double.parseDouble(txtNum3.getText());
        double num4 = Double.parseDouble(txtNum4.getText());
        double num5 = Double.parseDouble(txtNum5.getText());

        double[] numeros = {num1,num2,num3,num4,num5};

        Arrays.sort(numeros);
        double temp;
        for(int i = 0; i < numeros.length / 2; i++) {
            temp = numeros[i];
            numeros[i] = numeros[numeros.length - i - 1];
            numeros[numeros.length - i - 1] = temp;
        }
        
        double promedio = (numeros[0] + numeros[1] + numeros[2]) /3;

        DecimalFormat df = new DecimalFormat("####.00");
        txtprom.setText(df.format(promedio));
	}
}