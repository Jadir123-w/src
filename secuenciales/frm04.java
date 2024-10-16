package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm04 extends JFrame {
	private static final long serialVersionUID = 1L;
    JTextField txtMetros, txtPulgadas, txtPies;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public frm04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 300, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblMetros = new JLabel("Metros :");
        lblMetros.setBounds(50,50,80,30);
        getContentPane().add(lblMetros);

        JLabel lblPies = new JLabel("Pies :");
        lblPies.setBounds(50,130,80,30);
        getContentPane().add(lblPies);

        JLabel lblPulgadas = new JLabel("Pulgadas :");
        lblPulgadas.setBounds(50,170,80,30);
        getContentPane().add(lblPulgadas);

        txtMetros = new JTextField();
        txtMetros.setBounds(130,50,80,30);
        txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMetros.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtMetros);

        txtPies = new JTextField();
        txtPies.setBounds(130,130,80,30);
        txtPies.setFocusable(false);
        txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPies.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtPies);

        txtPulgadas = new JTextField();
        txtPulgadas.setBounds(130,170,80,30);
        txtPulgadas.setFocusable(false);
        txtPulgadas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPulgadas.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtPulgadas);


        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100,280,100,30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                btnCalcular_actionPerformed();
            }
        });


    }

	protected void btnCalcular_actionPerformed() {
		double metros = Double.parseDouble( txtMetros.getText() );

        double pulgadas = metros * 2.54;
        double pies = metros * 12;

        DecimalFormat df = new DecimalFormat( "####.00");
        txtMetros.setText( df.format(metros) );
        txtPulgadas.setText(df.format(pulgadas) );
        txtPies.setText(df.format(pies) );


	}
}