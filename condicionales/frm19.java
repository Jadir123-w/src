package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm19 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txtSexo, txtEdad, txtCate;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm19 frame = new frm19();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm19() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 00, 400,400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblSexo = new JLabel("Sexo M o F:");
        lblSexo.setBounds(50, 50, 100, 30);
        getContentPane().add(lblSexo);

		JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(50, 100, 100, 30);
        getContentPane().add(lblEdad);

        JLabel lblCategoria = new JLabel("Categoría:");
        lblCategoria.setBounds(50, 150, 100, 30);
        getContentPane().add(lblCategoria);

        txtSexo = new JTextField();
        txtSexo.setBounds(150, 50, 100, 30);
        txtSexo.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtSexo);

		txtEdad = new JTextField();
        txtEdad.setBounds(150, 100, 100, 30);
        txtEdad.setMargin(new Insets(5,5,5,5));
        getContentPane().add(txtEdad);

        txtCate = new JTextField();
        txtCate.setBounds(150, 150, 100, 30);
        txtCate.setMargin(new Insets(5,5,5,5));
        txtCate.setFocusable(false);
        getContentPane().add(txtCate);


        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 200, 120, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
		String sexo = txtSexo.getText().toUpperCase();
        int edad = Integer.parseInt(txtEdad.getText());
        String cate;

        if (sexo.equals("F")) {
            if (edad < 23) {
                cate = "FA";
            } else {
                cate = "FB";
            }    
        } else if (sexo.equals("M")) {
            if (edad < 25) {
                cate = "MA";
            } else {
                cate = "MB";

            }
        } else {
            cate = "No valido solo F o M";
        }
        txtCate.setText((cate));
    }
}