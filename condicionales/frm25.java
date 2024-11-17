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


public class frm25 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtSueldoBruto, txtHijos;
    JLabel lblBonificacion, lblSueldoNeto;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm25 frame = new frm25();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm25() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 400,350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblSueldo = new JLabel("Sueldo Bruto (S/.):");
        lblSueldo.setBounds(50, 30, 150, 30);
        getContentPane().add(lblSueldo);

        JLabel lblHijos = new JLabel("Número de Hijos:");
        lblHijos.setBounds(50, 80, 150, 30);
        getContentPane().add(lblHijos);

        lblBonificacion = new JLabel("Bonificación: S/. ");
        lblBonificacion.setBounds(50, 180, 300, 30);
        getContentPane().add(lblBonificacion);

        lblSueldoNeto = new JLabel("Sueldo Neto: S/. ");
        lblSueldoNeto.setBounds(50, 220, 300, 30);
        getContentPane().add(lblSueldoNeto);

        txtSueldoBruto = new JTextField();
        txtSueldoBruto.setBounds(200, 30, 100, 30);
        txtSueldoBruto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSueldoBruto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSueldoBruto);

        txtHijos = new JTextField();
        txtHijos.setBounds(200, 80, 100, 30);
        txtHijos.setHorizontalAlignment(SwingConstants.RIGHT);
        txtHijos.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtHijos);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 130, 150, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
        double SueldoB = Double.parseDouble(txtSueldoBruto.getText());
        int hijos = Integer.parseInt(txtHijos.getText());
        double boni;
        if (hijos > 1) {
            boni = SueldoB * 0.125 + (hijos * 40);
        } else {
            boni = SueldoB * 10;
        }
        double SueldoN = SueldoB + boni;
        lblBonificacion.setText("Bonificacion S/." + String.format("%.2f", boni));
        lblSueldoNeto.setText("Sueldo Neto S/." + String.format("%.2f", SueldoN));
    }
}