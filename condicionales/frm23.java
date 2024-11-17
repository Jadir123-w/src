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


public class frm23 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtMatematicas, txtFisica;
    JLabel lblPropina, lblReloj;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm23 frame = new frm23();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm23() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 350,420);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblMatematicas = new JLabel("Nota Matemáticas:");
        lblMatematicas.setBounds(50, 30, 150, 30);
        getContentPane().add(lblMatematicas);
        
        JLabel lblFisica = new JLabel("Nota Física:");
        lblFisica.setBounds(50, 70, 150, 30);
        getContentPane().add(lblFisica);

        lblPropina = new JLabel("Propina: S/.");
        lblPropina.setBounds(50, 160, 300, 30);
        getContentPane().add(lblPropina);

        lblReloj = new JLabel("");
        lblReloj.setBounds(50, 190, 300, 30);
        getContentPane().add(lblReloj);

        txtMatematicas = new JTextField();
        txtMatematicas.setBounds(200, 30, 100, 30);
        txtMatematicas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMatematicas.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMatematicas);

        txtFisica = new JTextField();
        txtFisica.setBounds(200, 70, 100, 30);
        txtFisica.setHorizontalAlignment(SwingConstants.RIGHT);
        txtFisica.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtFisica);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(140, 120, 100, 30);
        getContentPane().add(btnCalcular);
        
        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
    double nMatematica = Double.parseDouble(txtMatematicas.getText());
    double nFisica = Double.parseDouble(txtFisica.getText());
    double proMatematica = nMatematica > 17 ? 3.0 : nMatematica;
    double proFisica = nFisica > 15 ? 2.0 : (nFisica * 0.5);
    double proTotal = proMatematica + proFisica;
    double promedio = (nMatematica + nFisica) /2;
    boolean rReloj = promedio > 16;

    lblPropina.setText("Propina S/."+ String.format("%.2f", proTotal));
    lblReloj.setText(rReloj ?"De regalo : Recibira un Reloj" : "De regalo: No recibira nada");

    } 
}