package secuenciales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class frm16 extends JFrame {
    JTextField txtHorasTrabajadas, txtTarifaHoraria, txtSueldoBasico, txtSueldoBruto, txtSueldoNeto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm16 frame = new frm16();
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
	public frm16() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 450, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblHorasTrabajadas = new JLabel("Horas trabajadas:");
        lblHorasTrabajadas.setBounds(50, 30, 150, 30);
        getContentPane().add(lblHorasTrabajadas);
        
        JLabel lblTarifaHoraria = new JLabel("Tarifa por hora:");
        lblTarifaHoraria.setBounds(50, 70, 150, 30);
        getContentPane().add(lblTarifaHoraria);

        JLabel lblSueldoBasico = new JLabel("Sueldo básico:");
        lblSueldoBasico.setBounds(50, 110, 150, 30);
        getContentPane().add(lblSueldoBasico);

        JLabel lblSueldoBruto = new JLabel("Sueldo bruto:");
        lblSueldoBruto.setBounds(50, 150, 150, 30);
        getContentPane().add(lblSueldoBruto);

        JLabel lblSueldoNeto = new JLabel("Sueldo neto:");
        lblSueldoNeto.setBounds(50, 190, 150, 30);
        getContentPane().add(lblSueldoNeto);
        
        txtHorasTrabajadas = new JTextField();
        txtHorasTrabajadas.setBounds(200, 30, 100, 30);
        getContentPane().add(txtHorasTrabajadas);

        txtTarifaHoraria = new JTextField();
        txtTarifaHoraria.setBounds(200, 70, 100, 30);
        getContentPane().add(txtTarifaHoraria);

        txtSueldoBasico = new JTextField();
        txtSueldoBasico.setBounds(200, 110, 100, 30);
        txtSueldoBasico.setFocusable(false);
        getContentPane().add(txtSueldoBasico);

        txtSueldoBruto = new JTextField();
        txtSueldoBruto.setBounds(200, 150, 100, 30);
        txtSueldoBruto.setFocusable(false);
        getContentPane().add(txtSueldoBruto);

        txtSueldoNeto = new JTextField();
        txtSueldoNeto.setBounds(200, 190, 100, 30);
        txtSueldoNeto.setFocusable(false);
        getContentPane().add(txtSueldoNeto);
        
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 230, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                btnCalcular_actionPerformed();
            }
        });


    }

	protected void btnCalcular_actionPerformed() {
        double horasTrabajadas = Double.parseDouble(txtHorasTrabajadas.getText());
        double tarifaHoraria = Double.parseDouble(txtTarifaHoraria.getText());
        
        double sueldoBasico = horasTrabajadas * tarifaHoraria;
        double sueldoBruto = sueldoBasico + (sueldoBasico * 0.20);
        double sueldoNeto = sueldoBruto - (sueldoBruto * 0.10);
        

        DecimalFormat df = new DecimalFormat("####.00");
        txtSueldoBasico.setText(df.format(sueldoBasico));
        txtSueldoBruto.setText(df.format(sueldoBruto));
        txtSueldoNeto.setText(df.format(sueldoNeto));
	}
}