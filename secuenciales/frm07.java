package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm07 extends JFrame {
    JTextField txtAltura,txtBase, txtArea, txtPerimetro;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public frm07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 300, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblAltura = new JLabel("Altura :");
        lblAltura.setBounds(50,50,80,30);
        getContentPane().add(lblAltura);

        
        JLabel lblBase = new JLabel("Base :");
        lblBase.setBounds(50,90,80,30);
        getContentPane().add(lblBase);

        JLabel lblArea = new JLabel("Area :");
        lblArea.setBounds(50,130,80,30);
        getContentPane().add(lblArea);

        JLabel lblPerimetro = new JLabel("Perimetro :");
        lblPerimetro.setBounds(50,170,80,30);
        getContentPane().add(lblPerimetro);

        txtAltura = new JTextField();
        txtAltura.setBounds(130,50,100,30);
        txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAltura.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtAltura);

        txtBase = new JTextField();
        txtBase.setBounds(130,90,100,30);
        txtBase.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBase.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtBase);

        txtArea = new JTextField();
        txtArea.setBounds(130,130,100,30);
        txtArea.setFocusable(false);
        txtArea.setHorizontalAlignment(SwingConstants.RIGHT);
        txtArea.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtArea);

        txtPerimetro = new JTextField();
        txtPerimetro.setBounds(130,170,100,30);
        txtPerimetro.setFocusable(false);
        txtPerimetro.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPerimetro.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtPerimetro);

        
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
		int altura = Integer.parseInt( txtAltura.getText() );
        int base = Integer.parseInt( txtBase.getText() );

        double area = altura * base;
        double Perimetro = 2 * (base+altura) ;

        DecimalFormat df = new DecimalFormat("###.00");
        txtArea.setText(df.format(area));
        txtPerimetro.setText(df.format(Perimetro));
	}
}