package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.regex.Matcher;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm13 extends JFrame {
    JTextField txtCatetoA,txtCatetoB,txtHipotenusa;

	/**
	 * Launch the application.
	 */
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
		setBounds(0, 00, 400, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCatetoA = new JLabel("CatetoA :");
        lblCatetoA.setBounds(50,50,80,30);
        getContentPane().add(lblCatetoA);

        
        JLabel lblCatetoB = new JLabel("CatetoB :");
        lblCatetoB.setBounds(50,90,130,30);
        getContentPane().add(lblCatetoB);

        JLabel lblHipotenusa = new JLabel("Hipotenusa :");
        lblHipotenusa.setBounds(50,140,130,30);
        getContentPane().add(lblHipotenusa);

        txtCatetoA = new JTextField();
        txtCatetoA.setBounds(170,50,130,30);
        txtCatetoA.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCatetoA.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtCatetoA);

        txtCatetoB = new JTextField();
        txtCatetoB.setBounds(170,90,130,30);
        txtCatetoB.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCatetoB.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtCatetoB);
        
        txtHipotenusa = new JTextField();
        txtHipotenusa.setBounds(170,140,130,30);
        txtHipotenusa.setHorizontalAlignment(SwingConstants.RIGHT);
        txtHipotenusa.setFocusable(false);
        txtHipotenusa.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtHipotenusa);

        
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(130,280,130,30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                btnCalcular_actionPerformed();
            }
        });


    }

	protected void btnCalcular_actionPerformed() {
        double catetoA= Double.parseDouble(txtCatetoA.getText());
        double catetoB= Double.parseDouble(txtCatetoB.getText());

        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
        DecimalFormat df = new DecimalFormat("####.00");
        txtHipotenusa.setText(df.format(hipotenusa));
    }
}
