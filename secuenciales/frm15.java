package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm15 extends JFrame {
    JTextField txtJuan,txtRosa, txtDaniel, txtTotalCapital, txtPorcentajeJuan, txtPorcentajeRosa, txtPorcentajeDaniel;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public frm15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 450, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblJuan = new JLabel("Aporte de Juan (USD):");
        lblJuan.setBounds(50, 30, 150, 30);
        getContentPane().add(lblJuan);
        
        JLabel lblRosa = new JLabel("Aporte de Rosa (USD):");
        lblRosa.setBounds(50, 70, 150, 30);
        getContentPane().add(lblRosa);

        JLabel lblDaniel = new JLabel("Aporte de Daniel (Soles):");
        lblDaniel.setBounds(50, 110, 150, 30);
        getContentPane().add(lblDaniel);

        JLabel lblTotalCapital = new JLabel("Capital total (USD):");
        lblTotalCapital.setBounds(50, 150, 150, 30);
        getContentPane().add(lblTotalCapital);

        JLabel lblPorcentajeJuan = new JLabel("Porcentaje Juan:");
        lblPorcentajeJuan.setBounds(50, 190, 150, 30);
        getContentPane().add(lblPorcentajeJuan);
        
        JLabel lblPorcentajeRosa = new JLabel("Porcentaje Rosa:");
        lblPorcentajeRosa.setBounds(50, 230, 150, 30);
        getContentPane().add(lblPorcentajeRosa);

        JLabel lblPorcentajeDaniel = new JLabel("Porcentaje Daniel:");
        lblPorcentajeDaniel.setBounds(50, 270, 150, 30);
        getContentPane().add(lblPorcentajeDaniel);
        
        txtJuan = new JTextField();
        txtJuan.setBounds(220, 30, 100, 30);
        getContentPane().add(txtJuan);

        txtRosa = new JTextField();
        txtRosa.setBounds(220, 70, 100, 30);
        getContentPane().add(txtRosa);

        txtDaniel = new JTextField();
        txtDaniel.setBounds(220, 110, 100, 30);
        getContentPane().add(txtDaniel);

        txtTotalCapital = new JTextField();
        txtTotalCapital.setBounds(220, 150, 100, 30);
        txtTotalCapital.setFocusable(false);
        getContentPane().add(txtTotalCapital);

        txtPorcentajeJuan = new JTextField();
        txtPorcentajeJuan.setBounds(220, 190, 100, 30);
        txtPorcentajeJuan.setFocusable(false);
        getContentPane().add(txtPorcentajeJuan);

        txtPorcentajeRosa = new JTextField();
        txtPorcentajeRosa.setBounds(220, 230, 100, 30);
        txtPorcentajeRosa.setFocusable(false);
        getContentPane().add(txtPorcentajeRosa);

        txtPorcentajeDaniel = new JTextField();
        txtPorcentajeDaniel.setBounds(220, 270, 100, 30);
        txtPorcentajeDaniel.setFocusable(false);
        getContentPane().add(txtPorcentajeDaniel);
        
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 310, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                btnCalcular_actionPerformed();
            }
        });


    }

	protected void btnCalcular_actionPerformed() {
        double aporJuan = Double.parseDouble(txtJuan.getText());
        double aporRosa = Double.parseDouble(txtRosa.getText());
        double aporDanielSoles = Double.parseDouble(txtDaniel.getText());
        
        double aporteDanielUSD = aporDanielSoles / 3.00;
        double totalCapitalUSD = aporJuan + aporRosa + aporteDanielUSD;

        double porcentajeJuan =(aporJuan / totalCapitalUSD)* 100;
        double porcentajeRosa =(aporRosa / totalCapitalUSD)* 100;
        double porcentajeDaniel =(aporteDanielUSD / totalCapitalUSD) * 100;

        DecimalFormat df = new DecimalFormat("####.00");
        txtTotalCapital.setText(df.format(totalCapitalUSD));
        txtPorcentajeJuan.setText(df.format(porcentajeJuan) + " %");
        txtPorcentajeRosa.setText(df.format(porcentajeRosa) + " %");
        txtPorcentajeDaniel.setText(df.format(porcentajeDaniel) + " %");
	}
}