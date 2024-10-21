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

public class frm03 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtAngulo, txtResultado;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm03 frame = new frm03();
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
	public frm03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 400,400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblAngulo= new JLabel("Digita el Angulo (grados):");
        lblAngulo.setBounds(50,50,200,30);
        getContentPane().add(lblAngulo);

        txtAngulo= new JTextField();
        txtAngulo.setBounds(250,50,100,30);
        txtAngulo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAngulo.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtAngulo);

        txtResultado = new JTextField();
        txtResultado.setBounds(50,100,300,150);
        txtResultado.setMargin(new Insets(5,5,5,5));
        txtResultado.setFocusable(false);
        getContentPane().add(txtResultado);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 280, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
		double Angulo = Integer.parseInt(txtAngulo.getText() );
		String clasi;
		if (Angulo == 0) {
			clasi = "Nulo 0°";
		} else if (Angulo > 0 && Angulo < 90) {
			clasi = "Agudo 0° a 90°";
		} else if (Angulo == 90) {
			clasi = "Recto 90°";
		} else if (Angulo > 90 && Angulo < 180) {
			clasi = "Obtuso 90° a 180°";
        } else if (Angulo == 180) {
			clasi = "Llano 180°";
        } else if (Angulo > 180 && Angulo < 360) {
			clasi = "Cóncavo 180° a 360°";
        } else if (Angulo == 360) {
            clasi = "Completo 360°";
		} else {
			clasi = "No se puede clasificar mayor a 360°";
		}

		txtResultado.setText("tipo de angulo: "+ clasi);
	}

}