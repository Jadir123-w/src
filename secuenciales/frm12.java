package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm12 extends JFrame {
    JTextField txtA,txtB, txtC, txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm12 frame = new frm12();
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
	public frm12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 600, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblA = new JLabel("A :");
        lblA.setBounds(50,50,80,30);
        getContentPane().add(lblA);

        
        JLabel lblB = new JLabel("B :");
        lblB.setBounds(50,90,80,30);
        getContentPane().add(lblB);

        JLabel lblC = new JLabel("C :");
        lblC.setBounds(50,130,80,30);
        getContentPane().add(lblC);

        JLabel lblResultado = new JLabel("Resultado :");
        lblResultado.setBounds(50,170,80,30);
        getContentPane().add(lblResultado);
        
        txtA = new JTextField();
        txtA.setBounds(130,50,300,30);
        txtA.setHorizontalAlignment(SwingConstants.RIGHT);
        txtA.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtA);

        txtB = new JTextField();
        txtB.setBounds(130,90,300,30);
        txtB.setHorizontalAlignment(SwingConstants.RIGHT);
        txtB.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtB);

        txtC = new JTextField();
        txtC.setBounds(130,130,300,30);
        txtC.setHorizontalAlignment(SwingConstants.RIGHT);
        txtC.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtC);

        txtResultado = new JTextField();
        txtResultado.setBounds(130,170,300,30);
        txtResultado.setFocusable(false);
        txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResultado.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtResultado);


        
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100,290,100,30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                btnCalcular_actionPerformed();
            }
        });


    }

	protected void btnCalcular_actionPerformed() {
		try{
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            double c = Double.parseDouble(txtC.getText());

            double discriminante = Math.pow(b, 2) - 4 * a * c;

            if (discriminante < 0){
                txtResultado.setText("No hay soluciones reales");
                return;
            }
            
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            txtResultado.setText("Raices"+ raiz1 + "," + raiz2 );
        } catch (NumberFormatException ex) {
            txtResultado.setText("");
        }
	}
}