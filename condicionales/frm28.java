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


public class frm28 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtHora24;
    JLabel lblHora12;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm28 frame = new frm28();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm28() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 400,350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblIngreseHora = new JLabel("Ingrese la Hora (24h):");
        lblIngreseHora.setBounds(50, 50, 150, 30);
        getContentPane().add(lblIngreseHora);

        lblHora12 = new JLabel("");
        lblHora12.setBounds(50, 140, 250, 30);
        getContentPane().add(lblHora12);

        txtHora24 = new JTextField();
        txtHora24.setBounds(200, 50, 60, 30);
        txtHora24.setHorizontalAlignment(SwingConstants.RIGHT);
        txtHora24.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtHora24);

        JButton btnConvertir = new JButton("Convertir");
        btnConvertir.setBounds(120, 100, 100, 30);
        getContentPane().add(btnConvertir);

        btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
        int h24 = Integer.parseInt(txtHora24.getText());
        if(h24 < 0 || h24 >= 24){
            lblHora12.setText("Hora invalida, ingrese un valor entre 0 y 23.");
            return;
        }
        String periodo = (h24 < 12) ? "AM" : "PM";
        int h12 = (h24 % 12 == 0) ? 12 : h24 % 12;
        lblHora12.setText("Hora en formato 12h: "+ h12 + " " + periodo);
    }
}