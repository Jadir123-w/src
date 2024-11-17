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


public class frm21 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtNempleado;
    JLabel lblEstadoCivil, lblEdad, lblSexo;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm21 frame = new frm21();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm21() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 350,420);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNempleado  = new JLabel("Número de empleado:");
        lblNempleado.setBounds(50, 30, 150, 30);
        getContentPane().add(lblNempleado);

		lblEstadoCivil = new JLabel("Estado Civil: ");
        lblEstadoCivil.setBounds(50, 130, 250, 30);
        getContentPane().add(lblEstadoCivil);

        lblEdad = new JLabel("Edad: ");
        lblEdad.setBounds(50, 170, 250, 30);
        getContentPane().add(lblEdad);

        lblSexo = new JLabel("Sexo: ");
        lblSexo.setBounds(50, 210, 250, 30);
        getContentPane().add(lblSexo);

        txtNempleado = new JTextField();
        txtNempleado.setBounds(180, 30, 100, 30);
        txtNempleado.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNempleado.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNempleado);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 280, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);
        
        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
    int numero = Integer.parseInt(txtNempleado.getText());
        if (numero < 1000 || numero > 9999) {
            lblEstadoCivil.setText("Estado Civil :");
            lblEdad.setText("Edad Numero invalido");
            lblSexo.setText("Sexo: Numero invalido");
            return;
        }

        int estCivilCodigo= numero / 1000;
        int edad = (numero / 10) % 100;
        int sexoCodigo = numero % 10;

        String estadoCivil;
        switch (estCivilCodigo) {
            case 1: estadoCivil = "Soltero" ; break ; 
            case 2: estadoCivil = "Casado" ; break ;
            case 3: estadoCivil = "Divorciado" ; break ;
            case 4: estadoCivil = "Viudo" ; break ;
            default : estadoCivil = "Codigo invalido"; break;
        }

        String sexo;
        if (sexoCodigo == 1){
            sexo = "Masculino";
        } else if (sexoCodigo == 2){
            sexo = "Femenino";
        } else {
            sexo = "Codigo no valido";
        }

        lblEstadoCivil.setText("Estado civil : "+ estadoCivil);
        lblEdad.setText("Edad: " + edad);
        lblSexo.setText("Sexo: " + sexo);
    }  
}