package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm01 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtDividendo, txtDivisor;
	JLabel lblCociente, lblResto;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm01 frame = new frm01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 400, 280);
		setLayout(null);
		setLocationRelativeTo(null);


		JLabel lblDividendo = new JLabel("Dividendo:");
        lblDividendo.setBounds(50, 30, 120, 30);
        getContentPane().add(lblDividendo);

		JLabel lblDivisor = new JLabel("Divisor:");
        lblDivisor.setBounds(50, 70, 120, 30);
        getContentPane().add(lblDivisor);

		lblCociente = new JLabel("Cociente: 0");
        lblCociente.setBounds(50, 160, 200, 30);
        getContentPane().add(lblCociente);
     
        lblResto = new JLabel("Resto: 0");
        lblResto.setBounds(50, 190, 200, 30);
        getContentPane().add(lblResto);

		txtDividendo = new JTextField();
        txtDividendo.setBounds(180, 30, 100, 30);
        txtDividendo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDividendo.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDividendo);

		txtDivisor = new JTextField();
        txtDivisor.setBounds(180, 70, 100, 30);
        txtDivisor.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDivisor.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDivisor);

		JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(130, 120, 100, 30);
        getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
		int dividendo = Integer.parseInt(txtDividendo.getText());
		int divisor = Integer.parseInt(txtDivisor.getText());

		if (divisor == 0) {
			JOptionPane.showMessageDialog(this, "El divisor no puede ser cero.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
		}

		int cociente = 0;
		int resto = dividendo;

		while (resto >=divisor){
			resto-= divisor;
			cociente++;
		}

		lblCociente.setText("Cociente:"+ cociente);
		lblResto.setText("Resto :"+ resto);
    }
}