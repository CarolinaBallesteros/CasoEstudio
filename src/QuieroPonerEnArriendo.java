import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class QuieroPonerEnArriendo {

	private JFrame frame;
	private JTextField textFieldNombre;
	private JTextField textFieldTelefono;
	private JTextField textFieldEmail;
	private JTextField textFieldDireccion;
	private JTextField textFieldValorEstimado;
	private JComboBox comboZona;
	private JComboBox comboTipo;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuieroPonerEnArriendo window = new QuieroPonerEnArriendo();
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
	public QuieroPonerEnArriendo() {
		initialize();
		
		
		
		this.modelo.addColumn("Nombre");
		this.modelo.addColumn("Tel�fono");
		this.modelo.addColumn("Email");
		this.modelo.addColumn("Tipo de Inmueble");
		this.modelo.addColumn("Direcci�n");
		this.modelo.addColumn("Zona");
		this.modelo.addColumn("Valor Estimado");
		
		
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				int fila_seleccionada = table.getSelectedRowCount();
				if(fila_seleccionada>= 0) {
					modelo.removeRow(fila_seleccionada);
				}else {
					JOptionPane.showMessageDialog(null, "Seleccione un fila por favor");
				}
			}
		});
		btnEliminar.setBounds(228, 352, 89, 23);
		frame.getContentPane().add(btnEliminar);
		
		JComboBox comboZona = new JComboBox();
		comboZona.setModel(new DefaultComboBoxModel(new String[] {"Selecci\u00F3n ", "SurOccidental ", "CentroOccidental", "NorOccidental"}));
		comboZona.setBounds(104, 122, 100, 20);
		frame.getContentPane().add(comboZona);
		
		JComboBox comboTipo = new JComboBox();
		comboTipo.setModel(new DefaultComboBoxModel(new String[] {"Selecci\u00F3n", "Casa", "Apartamento"}));
		comboTipo.setBounds(341, 122, 92, 17);
		frame.getContentPane().add(comboTipo);
	
	}
	
	@SuppressWarnings("unchecked")
	DefaultTableModel modelo = new DefaultTableModel();
	private JTable table;

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300, 300, 487, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("QUIERO PONER EN ARRIENDO");
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(28, 22, 46, 14);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(28, 50, 55, 14);
		frame.getContentPane().add(lblTelefono);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(28, 75, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setBounds(28, 100, 55, 14);
		frame.getContentPane().add(lblDireccin);
		
		JLabel lblZona = new JLabel("Zona");
		lblZona.setBounds(28, 125, 55, 14);
		frame.getContentPane().add(lblZona);
		
		JLabel lblTipoDeInmueble = new JLabel("Tipo de Inmueble");
		lblTipoDeInmueble.setBounds(239, 125, 92, 14);
		frame.getContentPane().add(lblTipoDeInmueble);
		
		JLabel lblValorEstimado = new JLabel("Valor estimado ");
		lblValorEstimado.setBounds(28, 164, 89, 14);
		frame.getContentPane().add(lblValorEstimado);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(104, 19, 220, 20);
		frame.getContentPane().add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldTelefono = new JTextField();
		textFieldTelefono.setBounds(104, 47, 220, 20);
		frame.getContentPane().add(textFieldTelefono);
		textFieldTelefono.setColumns(10);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(104, 72, 220, 20);
		frame.getContentPane().add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		textFieldDireccion = new JTextField();
		textFieldDireccion.setBounds(104, 97, 221, 20);
		frame.getContentPane().add(textFieldDireccion);
		textFieldDireccion.setColumns(10);
		
		textFieldValorEstimado = new JTextField();
		textFieldValorEstimado.setBounds(129, 161, 175, 20);
		frame.getContentPane().add(textFieldValorEstimado);
		textFieldValorEstimado.setColumns(10);
		
		
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				String nombre = textFieldNombre.getText();
				String telefono = textFieldTelefono.getText();
				String email = textFieldEmail.getText();
				String direccion = textFieldDireccion.getText();
				String valor = textFieldValorEstimado.getText();
				String zona = comboZona.getActionCommand();
				String tipo = comboTipo.getActionCommand();
			
				
				int phone = Integer.parseInt(telefono);
				double value = Double.parseDouble(valor);
				
				InmobiliariaInteramericana2.enviar(nombre, telefono, email, tipo, direccion, valor, zona);
		}
			
		});
		
		btnEnviar.setBounds(375, 179, 89, 23);
		frame.getContentPane().add(btnEnviar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(375, 352, 89, 23);
		frame.getContentPane().add(btnSalir);
		
		JLabel labelLogo = new JLabel("");
		labelLogo.setIcon(new ImageIcon("C:\\Users\\karol\\OneDrive\\Desktop\\LOGO INMOBILIARIA INTERNACIONAL.PNG"));
		labelLogo.setBounds(375, 36, 67, 53);
		frame.getContentPane().add(labelLogo);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			int filas;
			public void actionPerformed(ActionEvent arg0) {
				
				String [] datos = new String [10];
				
				datos [0] = textFieldNombre.getText();
				datos [1] = textFieldTelefono.getText();
				datos [2] = textFieldEmail.getText();
				datos [3] = textFieldDireccion.getText();
				datos [4] = textFieldValorEstimado.getText();
				datos [5] = comboTipo.getActionCommand();
				datos [6] = comboZona.getActionCommand();
				;
				
				for (int i = 0; i < table.getColumnCount(); i++) {
					modelo.setValueAt(datos, filas, i);
				}
				

			}
			
			
		});
		btnModificar.setBounds(126, 352, 89, 23);
		frame.getContentPane().add(btnModificar);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textFieldNombre.setText("");
				textFieldTelefono.setText("");
				textFieldEmail.setText("");
				textFieldDireccion.setText("");
				textFieldValorEstimado.setText("");
				comboZona.setSelectedIndex(0);
				comboTipo.setSelectedIndex(0);
				
			}
		});
		btnNuevo.setBounds(28, 352, 89, 23);
		frame.getContentPane().add(btnNuevo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			int filas;
			
			@Override
			
			public void mouseClicked(MouseEvent arg0) {
				
				int fila_seleccionada = table.getSelectedColumn();
				textFieldNombre.setText(table.getValueAt(fila_seleccionada, 0).toString());
				textFieldTelefono.setText(table.getValueAt(fila_seleccionada, 1).toString());
				textFieldEmail.setText(table.getValueAt(fila_seleccionada, 2).toString());
				textFieldDireccion.setText(table.getValueAt(fila_seleccionada, 3).toString());
				textFieldValorEstimado.setText(table.getValueAt(fila_seleccionada, 4).toString());
				comboZona.getSelectedItem().toString();
				comboTipo.getSelectedItem().toString();
			
				filas = fila_seleccionada;
			}
		});
		scrollPane.setBounds(23, 209, 438, 119);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		scrollPane.setColumnHeaderView(table);
	}

	public void setVisible() {

	}

	public void setVisible(boolean b) {

	}

	public void guardardatos(RegistroPonerEnArriendo registroPonerEnArriendo) {
		

	}
}
