
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Propietarios {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Propietarios window = new Propietarios();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Propietarios() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("PROPIETARIOS");
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(78, 42, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblClave = new JLabel("Clave");
		lblClave.setBounds(78, 80, 46, 14);
		frame.getContentPane().add(lblClave);
		
		textField = new JTextField();
		textField.setBounds(134, 36, 191, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(134, 77, 136, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(310, 187, 89, 23);
		frame.getContentPane().add(btnIngresar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(35, 187, 89, 23);
		frame.getContentPane().add(btnSalir);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\karol\\OneDrive\\Desktop\\LOGO INMOBILIARIA INTERNACIONAL.PNG"));
		label.setBounds(347, 42, 63, 55);
		frame.getContentPane().add(label);
	}
}
