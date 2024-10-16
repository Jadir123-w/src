package secuenciales;

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

public class frm03 extends JFrame {
	private static final long serialVersionUID = 1L;
    JTextField txtKilometros,txtPies, txtMillas, txtMetros, txtYardas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm03 frame = new frm03();
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
	public frm03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 300, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblKilometros = new JLabel("Kilometros :");
        lblKilometros.setBounds(50,50,80,30);
        getContentPane().add(lblKilometros);
        
        JLabel lblPies = new JLabel("Pies :");
        lblPies.setBounds(50,90,80,30);
        getContentPane().add(lblPies);

        JLabel lblMillas = new JLabel("Millas :");
        lblMillas.setBounds(50,130,100,30);
        getContentPane().add(lblMillas);

        JLabel lblMetros = new JLabel("Metros :");
        lblMetros.setBounds(50,210,80,30);
        getContentPane().add(lblMetros);
        
        JLabel lblYardas = new JLabel("Yardas totales:");
        lblYardas.setBounds(50, 250, 100, 30);
        getContentPane().add(lblYardas);

        txtKilometros = new JTextField();
        txtKilometros.setBounds(150,50,100,30);
        txtKilometros.setHorizontalAlignment(SwingConstants.RIGHT);
        txtKilometros.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtKilometros);

        txtPies = new JTextField();
        txtPies.setBounds(150,90,100,30);
        txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPies.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtPies);

        txtMillas = new JTextField();
        txtMillas.setBounds(150,130,100,30);
        txtMillas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMillas.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtMillas);

        txtMetros = new JTextField();
        txtMetros.setBounds(150,210,100,30);
        txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMetros.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtMetros);

        txtYardas = new JTextField();
        txtYardas.setBounds(150, 250, 100, 30);
        txtYardas.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtYardas);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100,300,100,30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                btnCalcular_actionPerformed();
            }
        });


    }

	protected void btnCalcular_actionPerformed() {
        double kilometros = Double.parseDouble(txtKilometros.getText());
        double pies = Double.parseDouble(txtPies.getText());
        double millas = Double.parseDouble(txtMillas.getText());

        double metrosDesdeKilometros = kilometros * 1000;
        double metrosDesdePies = pies / 3.2808;
        double metrosDesdeMillas = millas * 1609;

        double metrosTotales = metrosDesdeKilometros + metrosDesdePies + metrosDesdeMillas;

        double yardasTotales = metrosTotales / 0.9144;

        DecimalFormat df = new DecimalFormat("####.00");
        txtMetros.setText(df.format(metrosTotales));
        txtYardas.setText(df.format(yardasTotales));
    }  
}
