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

public class frm06 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtEdad1, txtEdad2, txtEdad3, txtResultado;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm06 frame = new frm06();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 400,400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblEdad1= new JLabel("Edad 1:");
        lblEdad1.setBounds(50,50,120,30);
        getContentPane().add(lblEdad1);

		JLabel lblEdad2= new JLabel("Edad 2:");
        lblEdad2.setBounds(50,90,120,30);
        getContentPane().add(lblEdad2);

		JLabel lblEdad3= new JLabel("Edad 3:");
        lblEdad3.setBounds(50,130,120,30);
        getContentPane().add(lblEdad3);

        txtEdad1= new JTextField();
        txtEdad1.setBounds(150,50,80,30);
        txtEdad1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad1.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtEdad1);

		txtEdad2= new JTextField();
        txtEdad2.setBounds(150,90,80,30);
        txtEdad2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad2.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtEdad2);

		txtEdad3= new JTextField();
        txtEdad3.setBounds(150,130,80,30);
        txtEdad3.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad3.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtEdad3);

        txtResultado = new JTextField();
        txtResultado.setBounds(50,180,300,50);
        txtResultado.setMargin(new Insets(5,5,5,5));
        txtResultado.setFocusable(false);
        getContentPane().add(txtResultado);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(140, 250, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
		int ed1 = Integer.parseInt(txtEdad1.getText());
        int ed2 = Integer.parseInt(txtEdad2.getText());
        int ed3 = Integer.parseInt(txtEdad3.getText());

		int edadM = Math.max(ed1, Math.max(ed2, ed3));
		int edadMe = Math.min(ed1, Math.min(ed2, ed3));

		txtResultado.setText("Edad mayor "+ edadM + "\ny Edad menor " + edadMe);
	
	}

}