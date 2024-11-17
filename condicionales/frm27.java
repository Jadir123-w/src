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


public class frm27 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtMontoVendido;
    JLabel lblsBruto, lblDescuento, lblsNeto, lblPolosObsequiados;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm27 frame = new frm27();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm27() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 400,350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblMontoVendido = new JLabel("Monto Total Vendido (S/):");
        lblMontoVendido.setBounds(50, 50, 200, 30);
        getContentPane().add(lblMontoVendido);

        lblsBruto = new JLabel("Sueldo Bruto: S/ ");
        lblsBruto.setBounds(50, 150, 300, 30);
        getContentPane().add(lblsBruto);

        lblDescuento = new JLabel("Descuento: S/ ");
        lblDescuento.setBounds(50, 200, 300, 30);
        getContentPane().add(lblDescuento);

        lblsNeto = new JLabel("Sueldo Neto: S/ ");
        lblsNeto.setBounds(50, 250, 300, 30);
        getContentPane().add(lblsNeto);

        lblPolosObsequiados = new JLabel("Polos Obsequiados: ");
        lblPolosObsequiados.setBounds(50, 300, 300, 30);
        getContentPane().add(lblPolosObsequiados);

        txtMontoVendido = new JTextField();
        txtMontoVendido.setBounds(250, 50, 100, 30);
        txtMontoVendido.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMontoVendido.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMontoVendido);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 100, 150, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
        double mVendido = Double.parseDouble(txtMontoVendido.getText());
        double sBasico = 600;
        double comision = mVendido * 0.15;
        double sBruto = sBasico + comision;

        double descuento = sBruto > 1800 ? sBruto * 0.10 : sBruto *0.05;
        double sNeto = sBruto - descuento;
        int polosObs= mVendido > 1000 ? 3 : 1;

        lblsBruto.setText("Sueldo Bruto S/." + String.format("%.2f", sBruto));
        lblDescuento.setText("Descuento S/." + String.format("%.2f", descuento));
        lblsNeto.setText("Sueldo Neto S/." + String.format("%.2f", sNeto));
        lblPolosObsequiados.setText("Polos Regalados :" + String.format("%.2f", polosObs));

    }
}