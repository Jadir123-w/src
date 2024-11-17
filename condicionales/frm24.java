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


public class frm24 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtVentas;
    JLabel lblSueldo;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm24 frame = new frm24();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm24() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 400,350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblVentas = new JLabel("Monto Total de Ventas (S/.):");
        lblVentas.setBounds(50, 30, 200, 30);
        getContentPane().add(lblVentas);

        lblSueldo = new JLabel("Sueldo: S/. ");
        lblSueldo.setBounds(50, 130, 300, 30);
        getContentPane().add(lblSueldo);
        
        txtVentas = new JTextField();
        txtVentas.setBounds(250, 30, 100, 30);
        txtVentas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtVentas.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtVentas);

        JButton btnCalcular = new JButton("Calcular Sueldo");
        btnCalcular.setBounds(130, 80, 150, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
    double ventas = Double.parseDouble(txtVentas.getText());
    double sueldo = ventas * 0.10;

    if (ventas > 5000) {
        double exceso = ventas - 5000;
        int bonos = (int) (exceso/500);
        sueldo += bonos * 25;
    }

    lblSueldo.setText("sueldo S/." + String.format("%.2f", sueldo));
    } 
}