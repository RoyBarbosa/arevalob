package sesion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class VentanaSesion extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaSesion frame = new VentanaSesion();
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
	public VentanaSesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 246);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Iniciar Sesion");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 51));
		lblNewLabel.setBounds(177, 13, 309, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(138, 91, 66, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contrase\u00F1a");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(103, 143, 101, 24);
		contentPane.add(lblNewLabel_2);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Arial", Font.PLAIN, 20));
		txtUsuario.setBounds(227, 88, 166, 24);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContra = new JPasswordField();
		txtContra.setFont(new Font("Arial", Font.PLAIN, 20));
		txtContra.setBounds(227, 143, 166, 25);
		contentPane.add(txtContra);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<String> Usuario = new ArrayList<String>();
				Usuario.add("Roy");
				Usuario.add("Mau");
				
				
				List<String> Contra = new ArrayList<String>();
				Contra.add("Roy12345");
				Contra.add("Mau12345");
				
				if (Usuario.contains(txtUsuario.getText())&&Contra.contains(txtContra.getText())) {
					JOptionPane.showMessageDialog(null, "Bienvenido al sistema " + txtUsuario.getText(), "Sesion Iniciada", JOptionPane.INFORMATION_MESSAGE);
					Ventana2 g = new Ventana2();
					
					g.setVisible(true);
					
					
				}else {
					JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecta", "Error",JOptionPane.ERROR_MESSAGE);
				}
				txtUsuario.setText("");
				txtContra.setText("");
				txtUsuario.requestFocus();
			}
		});
		btnIngresar.setFont(new Font("Arial", Font.PLAIN, 20));
		btnIngresar.setBounds(438, 105, 157, 33);
		contentPane.add(btnIngresar);
	}
}
