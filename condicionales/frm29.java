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


public class frm29 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtCuota, txtdPago;
    JLabel lblTotalPagar;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm29 frame = new frm29();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm29() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 400,350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCuota = new JLabel("Cuota Mensual:");
        lblCuota.setBounds(50, 30, 120, 30);
        getContentPane().add(lblCuota);

        JLabel lbldPago = new JLabel("Día de Pago:");
        lbldPago.setBounds(50, 70, 120, 30);
        getContentPane().add(lbldPago);

        lblTotalPagar = new JLabel("Total a Pagar: $0.00");
        lblTotalPagar.setBounds(50, 160, 200, 30);
        getContentPane().add(lblTotalPagar);
        
        txtCuota = new JTextField();
        txtCuota.setBounds(180, 30, 100, 30);
        txtCuota.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCuota.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCuota);

        txtdPago = new JTextField();
        txtdPago.setBounds(180, 70, 100, 30);
        txtdPago.setHorizontalAlignment(SwingConstants.RIGHT);
        txtdPago.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtdPago); 
        

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(130, 120, 100, 30);
        getContentPane().add(btnCalcular);

        
        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
        double cuota = Double.parseDouble(txtCuota.getText());
        int dPago = Integer.parseInt(txtdPago.getText());

        double totalPagar;

        if (dPago >= 1 && dPago <= 10) {
            double descuento = Math.max(5, cuota * 0.02);
            totalPagar = cuota - descuento;
        } else if (dPago >= 11 && dPago <= 20) {
            totalPagar = cuota;
        } else if (dPago >= 21 && dPago <= 31) {
            double recargo = Math.max(10, cuota * 0.03);
            totalPagar = cuota + recargo;
        } else {
            lblTotalPagar.setText("Dia de pago invalido");
            return;
        }

        lblTotalPagar.setText("Total Pagar $ " + String.format("%.2f",totalPagar));
    }
}