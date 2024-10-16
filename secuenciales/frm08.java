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

public class frm08 extends JFrame {
    JTextField txtAltura,txtRadio, txtAreaL, txtAreaB, txtAreaT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm08 frame = new frm08();
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
	public frm08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 300, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblAltura = new JLabel("Altura :");
        lblAltura.setBounds(50,50,80,30);
        getContentPane().add(lblAltura);

        
        JLabel lblRadio = new JLabel("Radio :");
        lblRadio.setBounds(50,90,80,30);
        getContentPane().add(lblRadio);

        JLabel lblAreaL = new JLabel("Area Lateral :");
        lblAreaL.setBounds(50,130,80,30);
        getContentPane().add(lblAreaL);

        JLabel lblAreaB = new JLabel("Area Base :");
        lblAreaB.setBounds(50,170,80,30);
        getContentPane().add(lblAreaB);
        
        JLabel lblAreaT = new JLabel("Area Total :");
        lblAreaT.setBounds(50,210,80,30);
        getContentPane().add(lblAreaT);

        txtAltura = new JTextField();
        txtAltura.setBounds(130,50,100,30);
        txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAltura.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtAltura);

        txtRadio = new JTextField();
        txtRadio.setBounds(130,90,100,30);
        txtRadio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtRadio.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtRadio);

        txtAreaL = new JTextField();
        txtAreaL.setBounds(130,130,100,30);
        txtAreaL.setFocusable(false);
        txtAreaL.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAreaL.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtAreaL);

        txtAreaB = new JTextField();
        txtAreaB.setBounds(130,170,100,30);
        txtAreaB.setFocusable(false);
        txtAreaB.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAreaB.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtAreaB);

        txtAreaT = new JTextField();
        txtAreaT.setBounds(130,210,100,30);
        txtAreaT.setFocusable(false);
        txtAreaT.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAreaT.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtAreaT);

        
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
		int altura = Integer.parseInt( txtAltura.getText() );
        int radio = Integer.parseInt( txtRadio.getText() );

        double AreaB = Math.PI * Math.pow(radio, 2);
        double AreaL = 2 * Math.PI * altura;
        double AreaT = 2 * AreaB * AreaL;

        DecimalFormat df = new DecimalFormat("###.00");
        txtAreaL.setText(df.format(AreaL));
        txtAreaB.setText(df.format(AreaB));
        txtAreaT.setText(df.format(AreaT));
	}
}