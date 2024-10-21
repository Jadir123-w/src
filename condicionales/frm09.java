package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm09 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtcodigo, txtcantidad, txtImpCompra, txtDescuento, txtTPagar;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm09 frame = new frm09();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 400,400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblcodigo= new JLabel("Codigo:");
        lblcodigo.setBounds(50, 50, 150, 30);
        getContentPane().add(lblcodigo);

		JLabel lblcantidad= new JLabel("Cantidad:");
        lblcantidad.setBounds(50, 90, 150, 30);
        getContentPane().add(lblcantidad);

		JLabel lblImpCompra= new JLabel("Importe de compra:");
        lblImpCompra.setBounds(50, 130, 150, 30);
        getContentPane().add(lblImpCompra);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 170, 150, 30);
        getContentPane().add(lblDescuento);

        JLabel lblTPagar = new JLabel("Total a pagar:");
        lblTPagar.setBounds(50, 210, 150, 30);
        getContentPane().add(lblTPagar);

        txtcodigo= new JTextField();
        txtcodigo.setBounds(200,50,140,30);
        txtcodigo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtcodigo.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtcodigo);

		txtcantidad= new JTextField();
        txtcantidad.setBounds(200,90,140,30);
        txtcantidad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtcantidad.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtcantidad);

		txtImpCompra= new JTextField();
        txtImpCompra.setBounds(200,130,140,30);
        txtImpCompra.setFocusable(false);
        txtImpCompra.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtImpCompra);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(200, 170, 140, 30);
        txtDescuento.setFocusable(false);
        txtDescuento.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtDescuento);

        txtTPagar = new JTextField();
        txtTPagar.setBounds(200, 210, 140, 30);
        txtTPagar.setFocusable(false);
        txtTPagar.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtTPagar);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 260, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
		int codigo = Integer.parseInt(txtcodigo.getText());
        int cantidad = Integer.parseInt(txtcantidad.getText());
	
        double precioU = 0;
        double porDesc = 0;

        if (codigo == 101) {
            precioU = 17;
        } else if (codigo == 102) {
            precioU = 25;
        } else if (codigo == 103) {
            precioU =16;
        } else if (codigo == 104) {
            precioU = 27;
        } else{
            txtImpCompra.setText("Codigo no reconocido");
            return;
        }

        double impCom = precioU * cantidad;

        if (cantidad >= 1 && cantidad <= 10) {
            porDesc = 5;
        } else if (cantidad >= 11 && cantidad <= 20) {
            porDesc = 8;
        } else if (cantidad >= 21 && cantidad <= 30) {
            porDesc = 10;
        } else if (cantidad >= 31) {
            porDesc = 13;
        }
        double desc = impCom * porDesc / 100;
        double TPagar = impCom - desc;
        
        DecimalFormat df = new DecimalFormat("####.00");
        txtImpCompra.setText(df.format(impCom));
        txtDescuento.setText(df.format(desc));
        txtTPagar.setText(df.format(TPagar));
	}

}