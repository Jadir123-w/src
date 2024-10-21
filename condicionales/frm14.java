package condicionales;

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

public class frm14 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtNumTarjeta, txtMnCompra, txtDesc, txtTPagar;
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

	public frm14() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 400,400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumTarjeta= new JLabel("Numero tarjeta:");
        lblNumTarjeta.setBounds(50, 50, 150, 30);
        getContentPane().add(lblNumTarjeta);

		JLabel lblMnCompra= new JLabel("monto de compra:");
        lblMnCompra.setBounds(50, 90, 150, 30);
        getContentPane().add(lblMnCompra);

        JLabel lblDesc = new JLabel("Descuento:");
        lblDesc.setBounds(50, 170, 150, 30);
        getContentPane().add(lblDesc);

        JLabel lblTPagar = new JLabel("Total a pagar:");
        lblTPagar.setBounds(50, 210, 150, 30);
        getContentPane().add(lblTPagar);

        txtNumTarjeta= new JTextField();
        txtNumTarjeta.setBounds(200,50,100,30);
        txtNumTarjeta.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumTarjeta.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtNumTarjeta);

		txtMnCompra= new JTextField();
        txtMnCompra.setBounds(200,90,100,30);
        txtMnCompra.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMnCompra.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtMnCompra);

        txtDesc = new JTextField();
        txtDesc.setBounds(200, 170, 100, 30);
        txtDesc.setFocusable(false);
        txtDesc.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtDesc);

        txtTPagar = new JTextField();
        txtTPagar.setBounds(200, 210, 100, 30);
        txtTPagar.setFocusable(false);
        txtTPagar.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtTPagar);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(200, 130, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
		int numT = Integer.parseInt(txtNumTarjeta.getText());
        double mCompra = Double.parseDouble(txtMnCompra.getText());
        double desc;

        if (numT % 2 == 0 && numT >=100) {
            desc = mCompra * 0.15; 
        } else {
            desc = mCompra *0.05;
        }

        double TPagar = mCompra - desc;
        
        DecimalFormat df = new DecimalFormat("####.00");
        txtDesc.setText(df.format(desc));
        txtTPagar.setText(df.format(TPagar));
	}

}