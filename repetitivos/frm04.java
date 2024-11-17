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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm04 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtNumero, txtCantidad;
    JTextArea txtResultado;

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
		setBounds(0, 0, 400, 320);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNumero = new JLabel("Número (n):");
        lblNumero.setBounds(30, 30, 100, 30);
        getContentPane().add(lblNumero);

		JLabel lblCantidad = new JLabel("Cantidad (m):");
        lblCantidad.setBounds(30, 70, 100, 30);
        getContentPane().add(lblCantidad);

		txtNumero = new JTextField();
        txtNumero.setBounds(140, 30, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

		txtCantidad = new JTextField();
        txtCantidad.setBounds(140, 70, 100, 30);
        txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCantidad.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCantidad);

		txtResultado = new JTextArea();
        txtResultado.setBounds(30, 160, 320, 80);
        txtResultado.setEditable(false);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado);

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
		int numero = Integer.parseInt(txtNumero.getText());
		int cantidad = Integer.parseInt(txtCantidad.getText());
		StringBuilder resultado = new StringBuilder ();

		for (int i = 1; i <= cantidad; i++){
			resultado.append(numero*i).append(" ");
		}
		txtResultado.setText("Los primeros "+ cantidad + " multiplos de " + numero + " son: \n"+ resultado.toString());
    }
}