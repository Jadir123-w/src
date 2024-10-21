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

public class frm01 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtCant, txtImpC, txtDesc, txtPTotal;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm01 frame = new frm01();
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
	public frm01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCant= new JLabel("Cantidad :");
        lblCant.setBounds(50,50,88,30);
        getContentPane().add(lblCant);

        JLabel lblImpC = new JLabel("Importe :");
        lblImpC.setBounds(50,90,80,30);
        getContentPane().add(lblImpC);

		JLabel lblDesc = new JLabel("Descuento :");
        lblDesc.setBounds(50,130,80,30);
        getContentPane().add(lblDesc);

		JLabel lblPTotal = new JLabel("Total a pagar :");
        lblPTotal.setBounds(50,170,80,30);
        getContentPane().add(lblPTotal);

        txtCant= new JTextField();
        txtCant.setBounds(140,50,100,30);
        txtCant.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCant.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtCant);

        txtImpC = new JTextField();
        txtImpC.setBounds(140,90,100,30);
        txtImpC.setHorizontalAlignment(SwingConstants.RIGHT);
        txtImpC.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtImpC);

		txtDesc = new JTextField();
        txtDesc.setBounds(140,130,100,30);
        txtDesc.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDesc.setMargin(new Insets(5,5,5,5));
        txtDesc.setFocusable(false);
        getContentPane().add(txtDesc);

		txtPTotal = new JTextField();
        txtPTotal.setBounds(140,170,100,30);
        txtPTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPTotal.setMargin(new Insets(5,5,5,5));
        txtPTotal.setFocusable(false);
        getContentPane().add(txtPTotal);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 210, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
		int cantidad = Integer.parseInt(txtCant.getText());

		double precioUni;
		double Desc;
		double impCompra;
		double tPagar;

		if (cantidad >= 1 && cantidad <= 25) {
            precioUni = 27.0;
		} else if (cantidad >= 26&& cantidad <= 50) {
			precioUni = 25;
		} else  {
			precioUni = 23;
		}

		impCompra = cantidad * precioUni;
		
		if (cantidad > 50) {
            Desc = impCompra * 0.15;
        } else {
			Desc = impCompra * 0.05;
		}

		tPagar = impCompra - Desc;

		DecimalFormat df = new DecimalFormat("####.00");
		txtImpC.setText(df.format(impCompra));
		txtDesc.setText(df.format(Desc));
		txtPTotal.setText(df.format(tPagar));
	}
}