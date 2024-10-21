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

public class frm04 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtPrac1, txtPrac2, txtPrac3, txtResultado;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm04 frame = new frm04();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 400,400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblPrac1= new JLabel("Nota 1:");
        lblPrac1.setBounds(50,50,120,30);
        getContentPane().add(lblPrac1);

		JLabel lblPrac2= new JLabel("Nota 2:");
        lblPrac2.setBounds(50,90,120,30);
        getContentPane().add(lblPrac2);

		JLabel lblPrac3= new JLabel("Nota 3:");
        lblPrac3.setBounds(50,130,120,30);
        getContentPane().add(lblPrac3);

        txtPrac1= new JTextField();
        txtPrac1.setBounds(150,50,80,30);
        txtPrac1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPrac1.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtPrac1);

		txtPrac2= new JTextField();
        txtPrac2.setBounds(150,90,80,30);
        txtPrac2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPrac2.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtPrac2);

		txtPrac3= new JTextField();
        txtPrac3.setBounds(150,130,80,30);
        txtPrac3.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPrac3.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtPrac3);

        txtResultado = new JTextField();
        txtResultado.setBounds(50,180,300,70);
        txtResultado.setMargin(new Insets(5,5,5,5));
        txtResultado.setFocusable(false);
        getContentPane().add(txtResultado);

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
		double p1 = Double.parseDouble(txtPrac1.getText());
        double p2 = Double.parseDouble(txtPrac2.getText());
        double p3 = Double.parseDouble(txtPrac3.getText());

		if (p3 >= 10) {
			p3 += 2;

		double promedio = (p1 + p2 + p3) / 3;

		txtResultado.setText("Promedio Final: " + promedio);
		}
	}

}