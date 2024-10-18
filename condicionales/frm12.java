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

public class frm12 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtDia, txtNum;
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
		setBounds(0, 00, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);
        
		JLabel lblDia = new JLabel("Dia :");
        lblDia.setBounds(50,50,60,30);
        getContentPane().add(lblDia);

        JLabel lblNum = new JLabel("Numero :");
        lblNum.setBounds(50,90,60,30);
        getContentPane().add(lblNum);

        txtNum = new JTextField();
        txtNum.setBounds(120,90,60,30);
        txtNum.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNum.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtNum);

        txtDia = new JTextField();
        txtDia.setBounds(120,50,60,30);
        txtDia.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDia.setMargin(new Insets(5,5,5,5));
        txtDia.setFocusable(false);
        getContentPane().add(txtDia);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 140, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt(txtNum.getText() );

		String[] aDias = {"lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
		if (numero>=1 && numero <= 7)
			txtDia.setText(aDias[numero - 1] );
		else txtDia.setText("Error");

		//if( numero == 1) txtDia.setText("lunes");
		//else if ( numero==2 ) txtDia.setText("martes");
		//else if ( numero==3 ) txtDia.setText("miercoles");
		//else if ( numero==4 ) txtDia.setText("jueves");
		//else if ( numero==5 ) txtDia.setText("viernes");
		//else if ( numero==6 ) txtDia.setText("sabado");
		//else if ( numero==7 ) txtDia.setText("domingo");

	}

}