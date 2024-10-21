package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class frm17 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtDoc, txtMcompra, txtDesc, txtTPagar, txtLapi;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm17 frame = new frm17();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm17() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 400,400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblDoc = new JLabel("Cantidad de Docenas:");
        lblDoc.setBounds(50, 50, 150, 30);
        getContentPane().add(lblDoc);

		JLabel lblMcompra = new JLabel("Monto de la Compra:");
        lblMcompra.setBounds(50, 100, 150, 30);
        getContentPane().add(lblMcompra);

        JLabel lblDesc = new JLabel("Descuento:");
        lblDesc.setBounds(50, 150, 150, 30);
        getContentPane().add(lblDesc);

        JLabel lblTPagar = new JLabel("Total a Pagar:");
        lblTPagar.setBounds(50, 200, 150, 30);
        getContentPane().add(lblTPagar);;

        JLabel lblLapi = new JLabel("Lapiceros de Obsequio:");
        lblLapi.setBounds(50, 250, 150, 30);
        getContentPane().add(lblLapi);

        txtDoc = new JTextField();
        txtDoc.setBounds(200, 50, 100, 30);
        getContentPane().add(txtDoc);

		txtMcompra = new JTextField();
        txtMcompra.setBounds(200, 100, 100, 30);
        txtMcompra.setFocusable(false);
        getContentPane().add(txtMcompra);

        txtDesc = new JTextField();
        txtDesc.setBounds(200, 150, 100, 30);
        txtDesc.setFocusable(false);
        getContentPane().add(txtDesc);

        txtTPagar = new JTextField();
        txtTPagar.setBounds(200, 200, 100, 30);
        txtTPagar.setFocusable(false);
        getContentPane().add(txtTPagar);

        txtLapi = new JTextField();
        txtLapi.setBounds(200, 250, 100, 30);
        txtLapi.setFocusable(false);
        getContentPane().add(txtLapi);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(200, 300, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
       int Doc = Integer.parseInt(txtDoc.getText());
       double pxDocena = 100;
       double Mcompra = Doc * pxDocena;
       double Desc = 0;
       int Lapi = 0;

       if (Doc >= 6) {
            Desc = (Mcompra * 0.15);
        } else {
            Desc = (Mcompra * 0.10);
        }
        if (Doc >= 30) {
            Lapi = (Doc / 3) * 2;
        }
        double TPagar = Mcompra - Desc;

        DecimalFormat df = new DecimalFormat("####.00");
        txtMcompra.setText(df.format(Mcompra));
        txtDesc.setText(df.format(Desc));
        txtTPagar.setText(df.format(TPagar));
        txtLapi.setText(df.format(Lapi));
    }

}