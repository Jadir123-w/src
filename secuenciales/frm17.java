package secuenciales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class frm17 extends JFrame {
    JTextField txtDonacion, txtCentroSalud, txtComedorInfantil, txtEscuelaInfantil, txtAsiloAncianos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm17 frame = new frm17();
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
	public frm17() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblDonacion = new JLabel("Donación anual:");
        lblDonacion.setBounds(50, 30, 150, 30);
        getContentPane().add(lblDonacion);
        
        JLabel lblCentroSalud = new JLabel("Centro de Salud:");
        lblCentroSalud.setBounds(50, 70, 150, 30);
        getContentPane().add(lblCentroSalud);

        JLabel lblComedorInfantil = new JLabel("Comedor Infantil:");
        lblComedorInfantil.setBounds(50, 110, 150, 30);
        getContentPane().add(lblComedorInfantil);

        JLabel lblEscuelaInfantil = new JLabel("Escuela Infantil:");
        lblEscuelaInfantil.setBounds(50, 150, 150, 30);
        getContentPane().add(lblEscuelaInfantil);

        JLabel lblAsiloAncianos = new JLabel("Asilo de Ancianos:");
        lblAsiloAncianos.setBounds(50, 190, 150, 30);
        getContentPane().add(lblAsiloAncianos); 
        
        txtDonacion = new JTextField();
        txtDonacion.setBounds(200, 30, 100, 30);
        getContentPane().add(txtDonacion);

        txtCentroSalud = new JTextField();
        txtCentroSalud.setBounds(200, 70, 100, 30);
        txtCentroSalud.setFocusable(false);
        getContentPane().add(txtCentroSalud);

        txtComedorInfantil = new JTextField();
        txtComedorInfantil.setBounds(200, 110, 100, 30);
        txtComedorInfantil.setFocusable(false);
        getContentPane().add(txtComedorInfantil);

        txtEscuelaInfantil = new JTextField();
        txtEscuelaInfantil.setBounds(200, 150, 100, 30);
        txtEscuelaInfantil.setFocusable(false);
        getContentPane().add(txtEscuelaInfantil);

        txtAsiloAncianos = new JTextField();
        txtAsiloAncianos.setBounds(200, 190, 100, 30);
        txtAsiloAncianos.setFocusable(false);
        getContentPane().add(txtAsiloAncianos);
        
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
        double donacion = Double.parseDouble(txtDonacion.getText());
        double montoCentroSalud = donacion * 0.25;
        double montoComedorInfantil = donacion * 0.35;
        double montoEscuelaInfantil = donacion * 0.25;
        double montoAsiloAncianos = donacion - (montoCentroSalud + montoComedorInfantil + montoEscuelaInfantil);

        DecimalFormat df = new DecimalFormat("####.00");
        txtCentroSalud.setText(df.format(montoCentroSalud));
        txtComedorInfantil.setText(df.format(montoComedorInfantil));
        txtEscuelaInfantil.setText(df.format(montoEscuelaInfantil));
        txtAsiloAncianos.setText(df.format(montoAsiloAncianos));
    }
}