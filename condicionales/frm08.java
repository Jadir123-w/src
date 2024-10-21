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

public class frm08 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtExamAp, txtResultado;
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
		setBounds(0, 00, 400,300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblExamAp= new JLabel("Examenes aprobados:");
        lblExamAp.setBounds(50,30,250,30);
        getContentPane().add(lblExamAp);

        txtExamAp= new JTextField();
        txtExamAp.setBounds(200,30,100,30);
        txtExamAp.setHorizontalAlignment(SwingConstants.RIGHT);
        txtExamAp.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtExamAp);

        txtResultado = new JTextField();
        txtResultado.setBounds(50,80,300,100);
        txtResultado.setMargin(new Insets(5,5,5,5));
        txtResultado.setFocusable(false);
        getContentPane().add(txtResultado);

        JButton btnCalcular = new JButton("Propina");
        btnCalcular.setBounds(130, 200, 150, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
		double pMensual = 20.0;
        double pxExam = 5.0;

		int exAp = Integer.parseInt(txtExamAp.getText());
		double totalP = pMensual + (exAp * pxExam);

		txtResultado.setText("Monto de propina S/. "+ totalP);
	}

}