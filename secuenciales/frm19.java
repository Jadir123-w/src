package secuenciales;

import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class frm19 extends JFrame {
    JTextField txtVentas, txtComision, txtSueldoBruto, txtDescuento, txtSueldoNeto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm19 frame = new frm19();
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
	public frm19() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 450, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblVentas = new JLabel("Ventas totales:");
        lblVentas.setBounds(50, 30, 150, 30);
        getContentPane().add(lblVentas);
        
        JLabel lblComision = new JLabel("Comisión:");
        lblComision.setBounds(50, 70, 150, 30);
        getContentPane().add(lblComision);

        JLabel lblSueldoBruto = new JLabel("Sueldo Bruto:");
        lblSueldoBruto.setBounds(50, 110, 150, 30);
        getContentPane().add(lblSueldoBruto);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 150, 150, 30);
        getContentPane().add(lblDescuento);

        JLabel lblSueldoNeto = new JLabel("Sueldo Neto:");
        lblSueldoNeto.setBounds(50, 190, 150, 30);
        getContentPane().add(lblSueldoNeto); 
        
        txtVentas = new JTextField();
        txtVentas.setBounds(200, 30, 100, 30);
        getContentPane().add(txtVentas);

        txtComision = new JTextField();
        txtComision.setBounds(200, 70, 100, 30);
        txtComision.setFocusable(false);
        getContentPane().add(txtComision);

        txtSueldoBruto = new JTextField();
        txtSueldoBruto.setBounds(200, 110, 100, 30);
        txtSueldoBruto.setFocusable(false);
        getContentPane().add(txtSueldoBruto);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(200, 150, 100, 30);
        txtDescuento.setFocusable(false);
        getContentPane().add(txtDescuento);

        txtSueldoNeto = new JTextField();
        txtSueldoNeto.setBounds(200, 190, 100, 30);
        txtSueldoNeto.setFocusable(false);
        getContentPane().add(txtSueldoNeto);
        
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 230, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                btnCalcular_actionPerformed();
            }
        });


    }

	protected void btnCalcular_actionPerformed() {
        double ventas = Double.parseDouble(txtVentas.getText());
        double sueldoBasico = 500.0;
        double comision = ventas * 0.09;
        double sueldoBruto = sueldoBasico + comision;
        double descuento = sueldoBruto * 0.11;
        double sueldoNeto = sueldoBruto - descuento;


        DecimalFormat df = new DecimalFormat("####.00");
        txtComision.setText(df.format(comision));
        txtSueldoBruto.setText(df.format(sueldoBruto));
        txtDescuento.setText(df.format(descuento));
        txtSueldoNeto.setText(df.format(sueldoNeto));
    }
}