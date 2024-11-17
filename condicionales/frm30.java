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


public class frm30 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtCuota, txtDiaPago;
    JLabel lblTotalPagar;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm30 frame = new frm30();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm30() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 400,350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCuota = new JLabel("Cuota Mensual ($):");
        lblCuota.setBounds(50, 30, 120, 30);
        getContentPane().add(lblCuota);

        JLabel lblDiaPago = new JLabel("Día de Pago:");
        lblDiaPago.setBounds(50, 70, 120, 30);
        getContentPane().add(lblDiaPago);

        txtDiaPago = new JTextField();
        txtDiaPago.setBounds(180, 70, 100, 30);
        txtDiaPago.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtDiaPago);

        txtCuota = new JTextField();
        txtCuota.setBounds(180, 30, 100, 30);
        txtCuota.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtCuota);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(130, 120, 100, 30);
        getContentPane().add(btnCalcular);

        lblTotalPagar = new JLabel("Total a Pagar: $0.00");
        lblTotalPagar.setBounds(50, 160, 200, 30);
        getContentPane().add(lblTotalPagar);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularPago();
            }
        });
    }

    private void calcularPago() {
        double cuota = Double.parseDouble(txtCuota.getText());
        int diaPago = Integer.parseInt(txtDiaPago.getText());
        double totalPagar;

        if (diaPago <= 10) {
            double descuento = Math.max(5, cuota * 0.02);
            totalPagar = cuota - descuento;
        } else if (diaPago <= 20) {
            totalPagar = cuota;
        } else {
            double recargo = Math.max(10, cuota * 0.03);
            totalPagar = cuota + recargo;
        }

        lblTotalPagar.setText(String.format("Total a Pagar: $%.2f", totalPagar));
    }
}