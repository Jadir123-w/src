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

public class frm18 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtMdonacion, txtCsalud, txtComeN, txtInbolsa;
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

	public frm18() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 400,400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblMdonacion = new JLabel("Monto de la Donación:");
        lblMdonacion.setBounds(50, 50, 150, 30);
        getContentPane().add(lblMdonacion);

		JLabel lblCsalud = new JLabel("Centro de Salud:");
        lblCsalud.setBounds(50, 100, 150, 30);
        getContentPane().add(lblCsalud);

        JLabel lblComeN = new JLabel("Comedor de Niños:");
        lblComeN.setBounds(50, 150, 150, 30);
        getContentPane().add(lblComeN);

        JLabel lblInbolsa = new JLabel("Inversión en Bolsa:");
        lblInbolsa.setBounds(50, 200, 150, 30);
        getContentPane().add(lblInbolsa);

        txtMdonacion = new JTextField();
        txtMdonacion.setBounds(200, 50, 100, 30);
        getContentPane().add(txtMdonacion);

		txtCsalud = new JTextField();
        txtCsalud.setBounds(200, 100, 100, 30);
        txtCsalud.setFocusable(false);
        getContentPane().add(txtCsalud);

        txtComeN = new JTextField();
        txtComeN.setBounds(200, 150, 100, 30);
        txtComeN.setFocusable(false);
        getContentPane().add(txtComeN);

        txtInbolsa = new JTextField();
        txtInbolsa.setBounds(200, 200, 100, 30);
        txtInbolsa.setFocusable(false);
        getContentPane().add(txtInbolsa);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(200, 250, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
		double Mdonacion = Double.parseDouble(txtMdonacion.getText());
        double Csalud, ComeN, Inbolsa;

        if (Mdonacion >= 10000) {
            Csalud = Mdonacion * 0.30;
            ComeN = Mdonacion * 0.50;
        } else {
            Csalud = Mdonacion * 0.25;
            ComeN = Mdonacion * 0.60;
        }

        Inbolsa = Mdonacion - (Csalud + ComeN);

        DecimalFormat df = new DecimalFormat("####.00");
        txtCsalud.setText(df.format(Csalud));
        txtComeN.setText(df.format(ComeN));
        txtInbolsa.setText(df.format(Inbolsa));
	}

}