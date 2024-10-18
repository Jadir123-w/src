package secuenciales;

import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class frm18 extends JFrame {
    JTextField txtCantidad, txtPrecioUnitario, txtImporteCompra,txtDescuento,txtImportePagar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm18 frame = new frm18();
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
	public frm18() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 450, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setBounds(50, 30, 150, 30);
        getContentPane().add(lblCantidad);
        
        JLabel lblPrecioUnitario = new JLabel("Precio unitario:");
        lblPrecioUnitario.setBounds(50, 70, 150, 30);
        getContentPane().add(lblPrecioUnitario);

        JLabel lblImporteCompra = new JLabel("Importe compra:");
        lblImporteCompra.setBounds(50, 110, 150, 30);
        getContentPane().add(lblImporteCompra);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 150, 150, 30);
        getContentPane().add(lblDescuento);

        JLabel lblImportePagar = new JLabel("Importe a pagar:");
        lblImportePagar.setBounds(50, 190, 150, 30);
        getContentPane().add(lblImportePagar);  
        
        txtCantidad = new JTextField();
        txtCantidad.setBounds(200, 30, 100, 30);
        getContentPane().add(txtCantidad);

        txtPrecioUnitario = new JTextField();
        txtPrecioUnitario.setBounds(200, 70, 100, 30);
        getContentPane().add(txtPrecioUnitario);

        txtImporteCompra = new JTextField();
        txtImporteCompra.setBounds(200, 110, 100, 30);
        txtImporteCompra.setFocusable(false);
        getContentPane().add(txtImporteCompra);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(200, 150, 100, 30);
        txtDescuento.setFocusable(false);
        getContentPane().add(txtDescuento);

        txtImportePagar = new JTextField();
        txtImportePagar.setBounds(200, 190, 100, 30);
        txtImportePagar.setFocusable(false);
        getContentPane().add(txtImportePagar);;
        
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
        double cantidad = Double.parseDouble(txtCantidad.getText());
        double precioUnitario = Double.parseDouble(txtPrecioUnitario.getText());
        
        double importeCompra = cantidad * precioUnitario;
        double primerDescuento = importeCompra * 0.15;
        double importeConPrimerDescuento = importeCompra - primerDescuento;
        double segundoDescuento = importeConPrimerDescuento * 0.15;
        double totalDescuento = primerDescuento + segundoDescuento;
        double importePagar = importeCompra - totalDescuento;

        DecimalFormat df = new DecimalFormat("####.00");
        txtImporteCompra.setText(df.format(importeCompra));
        txtDescuento.setText(df.format(totalDescuento));
        txtImportePagar.setText(df.format(importePagar));
    }
}