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



public class frm04 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtBase;
    JTextField txtExponente;
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
        btnCalcular.setBounds(150, 110, 100, 30);
        add(btnCalcular);

        txtResultado = new JTextArea();
        txtResultado.setBounds(50, 160, 300, 100);
        txtResultado.setEditable(false);
        add(txtResultado);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int base = Integer.parseInt(txtBase.getText());
                    int exponente = Integer.parseInt(txtExponente.getText());
                    if (exponente < 0) {
                        txtResultado.setText("Por favor, ingrese un exponente no negativo.");
                    } else {
                        int resultado = calcularPotencia(base, exponente);
                        txtResultado.setText("La potencia de " + base + " elevado a " + exponente + " es: " + resultado);
                    }
                } catch (NumberFormatException ex) {
                    txtResultado.setText("Por favor, ingrese valores válidos.");
                }
            }
        });
    }

    private int calcularPotencia(int base, int exponente) {
        if (exponente == 0) return 1;
        return base * calcularPotencia(base, exponente - 1);
    }
}