package recursividad;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class frm07 extends JFrame {
	private static final long serialVersionUID = 1L;
    JTextField txtBase, txtExponente;
    JTextArea txtResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm07 frame = new frm07();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 400, 300);
		setLayout(null);
		setLocationRelativeTo(null);

        JLabel lblBase = new JLabel("Base:");
        lblBase.setBounds(50, 30, 100, 30);
        add(lblBase);

        txtBase = new JTextField();
        txtBase.setBounds(150, 30, 100, 30);
        add(txtBase);

        JLabel lblExponente = new JLabel("Exponente:");
        lblExponente.setBounds(50, 70, 100, 30);
        add(lblExponente);

        txtExponente = new JTextField();
        txtExponente.setBounds(150, 70, 100, 30);
        add(txtExponente);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 120, 100, 30);
        add(btnCalcular);

        txtResultado = new JTextArea();
        txtResultado.setBounds(50, 170, 300, 70);
        txtResultado.setEditable(false);
        add(txtResultado);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int base = Integer.parseInt(txtBase.getText());
                    int exponente = Integer.parseInt(txtExponente.getText());
                    int resultado = calcularPotencia(base, exponente);
                    txtResultado.setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    txtResultado.setText("Por favor, ingrese números válidos.");
                }
            }
        });
    }

    private int calcularPotencia(int base, int exponente) {
        if (exponente == 0) return 1;
        return base * calcularPotencia(base, exponente - 1);
    }
}