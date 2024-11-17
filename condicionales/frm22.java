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


public class frm22 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtUniA, txtUniB;
    JLabel lblImpBruto, lblDesc, lblTotal;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm22 frame = new frm22();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm22() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 350,420);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblProductoA = new JLabel("Unidades Producto A:");
        lblProductoA.setBounds(50, 30, 150, 30);
        getContentPane().add(lblProductoA);
        
        JLabel lblProductoB = new JLabel("Unidades Producto B:");
        lblProductoB.setBounds(50, 70, 150, 30);
        getContentPane().add(lblProductoB);

		lblImpBruto = new JLabel("Importe Bruto: S/.");
        lblImpBruto.setBounds(50, 160, 300, 30);
        getContentPane().add(lblImpBruto);

        lblDesc = new JLabel("Descuento: S/.");
        lblDesc.setBounds(50, 190, 300, 30);
        getContentPane().add(lblDesc);

        lblTotal = new JLabel("Total a Pagar: S/.");
        lblTotal.setBounds(50, 220, 300, 30);
        getContentPane().add(lblTotal);

        txtUniA = new JTextField();
        txtUniA.setBounds(200, 30, 100, 30);
        txtUniA.setHorizontalAlignment(SwingConstants.RIGHT);
        txtUniA.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtUniA);

        txtUniB = new JTextField();
        txtUniB.setBounds(200, 70, 100, 30);
        txtUniB.setHorizontalAlignment(SwingConstants.RIGHT);
        txtUniB.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtUniB);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(140, 120, 100, 30);
        getContentPane().add(btnCalcular);

        
        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
    int uniA = Integer.parseInt(txtUniA.getText());
    int uniB = Integer.parseInt(txtUniB.getText());
    
    double precioA = 25.0;   
    double precioB = 30.0;
    double descA =  uniA > 50 ? 0.15 : 0.0;
    double descB =  uniB > 60 ? 0.10 : 0.0;
    
    double impBa = uniA * precioA ;
    double impBb = uniB * precioB ;
    double desctA = impBa * descA;
    double desctB = impBb * descB;
    double impBr = impBa + impBb;
    double descuento = desctA + desctB ;
    double total = impBr - descuento;

    lblImpBruto.setText("El importe es de S/."+ String.format("%.2f",impBr));
    lblDesc.setText("El descuento es de S/."+ String.format("%.2f", descuento));
    lblTotal.setText("El total es S/."+ String.format("%.2f", total));

    } 
}