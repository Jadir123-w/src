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


public class frm26 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtMontoTotal;
    JLabel lblPropio, lblPrestamo;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm26 frame = new frm26();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm26() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 400,350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblMonto = new JLabel("Monto Total de Compra $:");
        lblMonto.setBounds(50, 50, 200, 30);
        getContentPane().add(lblMonto);

        lblPropio = new JLabel("Pago Propio: $ ");
        lblPropio.setBounds(50, 150, 300, 30);
        getContentPane().add(lblPropio);
        
        lblPrestamo = new JLabel("Préstamo con interés: $ ");
        lblPrestamo.setBounds(50, 200, 300, 30);
        getContentPane().add(lblPrestamo);

        txtMontoTotal = new JTextField();
        txtMontoTotal.setBounds(250, 50, 100, 30);
        txtMontoTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMontoTotal.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMontoTotal);

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
        double total = Double.parseDouble(txtMontoTotal.getText());
        double porPrestamo = total > 5000 ? 0.30 : 0.20;
        double prestamo = total * porPrestamo;
        double interes = prestamo * 0.10;
        double tPrestamoInt = prestamo + interes;
        double  pPropio = total - prestamo;

        lblPropio.setText("Pago propio $ " + String.format("%.2f", pPropio));
        lblPrestamo.setText("Prestamo con interes $ "+ String.format("%.2f", tPrestamoInt));
    }
}