package Ejercicio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;

public class SerieFibo extends JFrame {

	private JPanel contentPane;
	private JButton btnCalcular;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtPrimero;
	private JTextField txtSegundo;
	private JLabel lblNewLabel_2;
	private JTextField txtIteraciones;
	private JList listSerie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SerieFibo frame = new SerieFibo();
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
	public SerieFibo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		{
			JList listSerie = new JList();
			DefaultListModel Numeros = new DefaultListModel();
			listSerie.setBounds(46, 121, 202, 204);
			contentPane.setLayout(null);
			contentPane.add(listSerie);
			btnCalcular = new JButton("Calcular");
			btnCalcular.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					int Numero1=0,Numero2=0,Numero3,i=0,Iteracion;
					Numero1 = Integer.parseInt(txtPrimero.getText());
					Numero2 = Integer.parseInt(txtSegundo.getText());
					Iteracion = Integer.parseInt(txtIteraciones.getText());
					while(i<Iteracion)
					{
						Numero3=Numero1+Numero2;
						Numeros.addElement("Iteraciones "+i+": "+" "+Numero3);
					    Numero1=Numero2;
					    Numero2=Numero3;
					    i=i+1;
					}
					listSerie.setModel(Numeros);
				}
			});
			btnCalcular.setBounds(241, 87, 89, 23);
			contentPane.add(btnCalcular);
		}
		{
			lblNewLabel = new JLabel("primer numero");
			lblNewLabel.setBounds(46, 24, 89, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("segundo numero");
			lblNewLabel_1.setBounds(46, 60, 83, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			txtPrimero = new JTextField();
			txtPrimero.setBounds(145, 21, 86, 20);
			contentPane.add(txtPrimero);
			txtPrimero.setColumns(10);
		}
		{
			txtSegundo = new JTextField();
			txtSegundo.setBounds(145, 57, 86, 20);
			contentPane.add(txtSegundo);
			txtSegundo.setColumns(10);
		}
		{
			lblNewLabel_2 = new JLabel("Iteraciones");
			lblNewLabel_2.setBounds(46, 96, 89, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			txtIteraciones = new JTextField();
			txtIteraciones.setBounds(145, 88, 86, 20);
			contentPane.add(txtIteraciones);
			txtIteraciones.setColumns(10);
		}
		{
			JList listSerie = new JList();
			DefaultListModel Numeros = new DefaultListModel();
			listSerie.setBounds(46, 121, 202, 204);
			contentPane.setLayout(null);
			contentPane.add(listSerie);
			
		}
	}
}













