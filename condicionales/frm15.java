package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm15 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtMVendido, txtCate, txtComision, txtSbruto, txtDesc, txtSueldoN;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm15 frame = new frm15();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 450,400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblMvendido = new JLabel("Monto Vendido:");
        lblMvendido.setBounds(50, 50, 120, 30);
        getContentPane().add(lblMvendido);

        JLabel lblCate = new JLabel("Categoría (1-4):");
        lblCate.setBounds(50, 100, 120, 30);
        getContentPane().add(lblCate);

		JLabel lblComision = new JLabel("Comisión:");
        lblComision.setBounds(50, 150, 120, 30);
        getContentPane().add(lblComision);

        JLabel lblSbruto = new JLabel("Sueldo Bruto:");
        lblSbruto.setBounds(50, 200, 120, 30);
        getContentPane().add(lblSbruto);
        
        JLabel lblDesc = new JLabel("Descuento:");
        lblDesc.setBounds(50, 250, 120, 30);
        getContentPane().add(lblDesc);

        JLabel lblSueldoN = new JLabel("Sueldo Neto:");
        lblSueldoN.setBounds(50, 300, 120, 30);
        getContentPane().add(lblSueldoN);

        txtMVendido = new JTextField();
        txtMVendido.setBounds(180, 50, 100, 30);
        getContentPane().add(txtMVendido);

		txtCate = new JTextField();
        txtCate.setBounds(180, 100, 100, 30);
        getContentPane().add(txtCate);

        txtComision = new JTextField();
        txtComision.setBounds(180, 150, 100, 30);
        txtComision.setFocusable(false);
        getContentPane().add(txtComision);

        txtSbruto = new JTextField();
        txtSbruto.setBounds(180, 200, 100, 30);
        txtSbruto.setFocusable(false);
        getContentPane().add(txtSbruto);

        txtDesc = new JTextField();
        txtDesc.setBounds(180, 250, 100, 30);
        txtDesc.setFocusable(false);
        getContentPane().add(txtDesc);

        txtSueldoN = new JTextField();
        txtSueldoN.setBounds(180, 300, 100, 30);
        txtSueldoN.setFocusable(false);
        getContentPane().add(txtSueldoN);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(290, 50, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
		double sueldoB = 250;
        double Mvendido = Double.parseDouble(txtMVendido.getText());
        int Cate = Integer.parseInt(txtCate.getText());

        double porcentajeComision = 0.0;

        if (Mvendido <= 5000) {
            porcentajeComision = 0.05;
        } else if (Mvendido <= 10000) {
            porcentajeComision = 0.08; 
        } else if (Mvendido <= 20000) {
            porcentajeComision = 0.10; 
        } else {
            porcentajeComision = 0.15; 
        }

        double comision = Mvendido * porcentajeComision;
        double Sbruto = sueldoB + comision;
        double desc;

        if(Sbruto > 3500) {
            desc = Sbruto * 0.15;
        } else {
            desc = Sbruto * 0.08;
        }

        double SueldoN = Sbruto - desc;
        
        DecimalFormat df = new DecimalFormat("####.00");
        txtComision.setText(df.format(comision));
        txtSbruto.setText(df.format(Sbruto));
        txtDesc.setText(df.format(desc));
        txtSueldoN.setText(df.format(SueldoN));        
	}

}