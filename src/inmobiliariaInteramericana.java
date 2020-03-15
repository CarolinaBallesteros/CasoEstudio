
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import org.omg.CORBA.OBJECT_NOT_EXIST;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.function.ObjLongConsumer;
import java.awt.event.ActionEvent;

public class inmobiliariaInteramericana {

	private JFrame frame;
	private JTextField textValor;
	private JTextField textZona;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inmobiliariaInteramericana window = new inmobiliariaInteramericana();
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
	public inmobiliariaInteramericana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("INMOBILIARIA INTERAMERICANA");
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		textValor = new JTextField();
		textValor.setBounds(143, 65, 86, 20);
		frame.getContentPane().add(textValor);
		textValor.setColumns(10);
		
		textZona = new JTextField();
		textZona.setBounds(239, 65, 86, 20);
		frame.getContentPane().add(textZona);
		textZona.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(335, 64, 89, 23);
		frame.getContentPane().add(btnBuscar);
		
		JComboBox comboBoxDisponible = new JComboBox();
		comboBoxDisponible.setModel(new DefaultComboBoxModel(new String[] {"Disponible Arriendo ", "Disponible Venta"}));
		comboBoxDisponible.setToolTipText("");
		comboBoxDisponible.setBounds(10, 65, 123, 20);
		frame.getContentPane().add(comboBoxDisponible);
		
		JLabel labelImagen = new JLabel("");
		labelImagen.setIcon(new ImageIcon("C:\\Users\\karol\\OneDrive\\Desktop\\34.PNG"));
		labelImagen.setBounds(10, 110, 414, 119);
		frame.getContentPane().add(labelImagen);
		
		JLabel labelLogo = new JLabel("");
		labelLogo.setIcon(new ImageIcon("C:\\Users\\karol\\OneDrive\\Desktop\\LOGO INMOBILIARIA INTERNACIONAL.PNG"));
		labelLogo.setBounds(351, 11, 58, 52);
		frame.getContentPane().add(labelLogo);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnClientes = new JMenu("Clientes");
		menuBar.add(mnClientes);
		
		JMenuItem mntmPropietarios = new JMenuItem("Propietarios");
		mntmPropietarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Propietarios obj = new Propietarios();
				obj.main(null);
			}
		});
		mnClientes.add(mntmPropietarios);
		
		JMenuItem mntmArrendatarios = new JMenuItem("Arrendatarios");
		mntmArrendatarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Arrendatarios obj = new Arrendatarios();
				obj.main(null);
			}
		});
		mnClientes.add(mntmArrendatarios);
		
		JMenu mnArrendamientos = new JMenu("Arrendamientos");
		menuBar.add(mnArrendamientos);
		
		JMenuItem mntmQuieroPonerEn = new JMenuItem("Quiero poner en arriendo");
		mntmQuieroPonerEn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				QuieroPonerEnArriendo obj = new QuieroPonerEnArriendo();
				obj.main(null);
			
			}
		});
		mnArrendamientos.add(mntmQuieroPonerEn);
	}
}
