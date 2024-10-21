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

public class frm16 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtIngMen, txtCtCasa, txtCuoIni, txtCuoMen;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm16 frame = new frm16();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm16() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 400,400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblIngMen = new JLabel("Ingreso Mensual:");
        lblIngMen.setBounds(50, 50, 120, 30);
        getContentPane().add(lblIngMen);

		JLabel lblCostoCasa = new JLabel("Costo de la Casa:");
        lblCostoCasa.setBounds(50, 100, 120, 30);
        getContentPane().add(lblCostoCasa);

        JLabel lblDesc = new JLabel("Desc:");
        lblDesc.setBounds(50, 170, 150, 30);
        getContentPane().add(lblDesc);

        JLabel lblCuoIni = new JLabel("Cuota Inicial:");
        lblCuoIni.setBounds(50, 150, 120, 30);
        getContentPane().add(lblCuoIni);

        JLabel lblCuoMen = new JLabel("Cuota Mensual:");
        lblCuoMen.setBounds(50, 200, 120, 30);
        getContentPane().add(lblCuoMen);

        txtIngMen = new JTextField();
        txtIngMen.setBounds(180, 50, 100, 30);
        getContentPane().add(txtIngMen);

		txtCtCasa = new JTextField();
        txtCtCasa.setBounds(180, 100, 100, 30);
        getContentPane().add(txtCtCasa);

        txtCuoIni = new JTextField();
        txtCuoIni.setBounds(180, 150, 100, 30);
        txtCuoIni.setFocusable(false);
        getContentPane().add(txtCuoIni);

        txtCuoMen = new JTextField();
        txtCuoMen.setBounds(180, 200, 100, 30);
        txtCuoMen.setFocusable(false);
        getContentPane().add(txtCuoMen);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(180, 250, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
        double IngMen = Double.parseDouble(txtIngMen.getText());
		double CtCasa = Double.parseDouble(txtCtCasa.getText());
        double CuoIni;
        double CuoMen;

        if (IngMen < 1250){
            CuoIni = CtCasa * 0.15;
            CuoMen = (CtCasa - CuoIni) / 120;
        } else {
            CuoIni = CtCasa * 0.30;
            CuoMen = (CtCasa - CuoIni) / 75;
        }

        DecimalFormat df = new DecimalFormat("####.00");
        txtCuoIni.setText(df.format(CuoIni));
        txtCuoMen.setText(df.format(CuoMen));
	}

}