package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class frm20 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtA, txtB, txtC, txtResul;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm20 frame = new frm20();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm20() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 400,400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblA = new JLabel("Número A:");
        lblA.setBounds(50, 50, 100, 30);
        getContentPane().add(lblA);

		JLabel lblB = new JLabel("Número B:");
        lblB.setBounds(50, 100, 100, 30);
        getContentPane().add(lblB);

        JLabel lblC = new JLabel("Número C:");
        lblC.setBounds(50, 150, 100, 30);
        getContentPane().add(lblC);

        JLabel lblResul = new JLabel("Resultado:");
        lblResul.setBounds(50, 200, 100, 30);
        getContentPane().add(lblResul);

		txtA = new JTextField();
        txtA.setBounds(150, 50, 100, 30);
        getContentPane().add(txtA);

        txtB = new JTextField();
        txtB.setBounds(150, 100, 100, 30);
        getContentPane().add(txtB);

        txtC = new JTextField();
        txtC.setBounds(150, 150, 100, 30);
        getContentPane().add(txtC);

        txtResul = new JTextField();
        txtResul.setBounds(150, 200, 100, 30);
        txtResul.setFocusable(false);
        getContentPane().add(txtResul);
        
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 250, 120, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);
        
        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
    int a = Integer.parseInt(txtA.getText());		
    int b = Integer.parseInt(txtB.getText());
    int c = Integer.parseInt(txtC.getText());
    String resul;

    if (a < b && b < c) {
        resul = "Ascendente";
    } else if (a > b && b > c) {
        resul = "Descendente";
    } else {
        resul = "Desordenado";
    }
    
    txtResul.setText(resul);
    }
}