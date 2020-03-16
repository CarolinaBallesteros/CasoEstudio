
import dominio.usuario.dto.UsuarioDto;
import dominio.usuario.servicio.RegistrarUsuarioServicio;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

public class Arrendatarios {

    private JFrame frame;
    private JTextField tNombre;
    private JTextField tApellido;
    private JTextField tTelefono;
    private JTextField tCedula;
    private JTextField tEmail;

    private RegistrarUsuarioServicio registrarUsuario = new RegistrarUsuarioServicio();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Arrendatarios window = new Arrendatarios();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }

    public Arrendatarios() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("ARRENDATARIOS");
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);

        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(34, 26, 46, 14);
        frame.getContentPane().add(lblNombre);

        tNombre = new JTextField();
        tNombre.setBounds(102, 23, 231, 20);
        frame.getContentPane().add(tNombre);
        tNombre.setColumns(10);

        JLabel lblApellido = new JLabel("Apellido");
        lblApellido.setBounds(34, 51, 46, 14);
        frame.getContentPane().add(lblApellido);

        tApellido = new JTextField();
        tApellido.setBounds(102, 48, 231, 20);
        frame.getContentPane().add(tApellido);
        tApellido.setColumns(10);

        JLabel lblTelefono = new JLabel("Telefono");
        lblTelefono.setBounds(34, 80, 46, 14);
        frame.getContentPane().add(lblTelefono);

        tTelefono = new JTextField();
        tTelefono.setBounds(102, 77, 231, 20);
        frame.getContentPane().add(tTelefono);
        tTelefono.setColumns(10);

        JLabel lblCedula = new JLabel("Cedula");
        lblCedula.setBounds(34, 105, 66, 14);
        frame.getContentPane().add(lblCedula);

        tCedula = new JTextField();
        tCedula.setBounds(102, 102, 231, 20);
        frame.getContentPane().add(tCedula);
        tCedula.setColumns(10);

        JLabel lblEmail = new JLabel("Email");
        lblEmail.setBounds(34, 130, 46, 14);
        frame.getContentPane().add(lblEmail);

        tEmail = new JTextField();
        tEmail.setBounds(102, 130, 231, 20);
        frame.getContentPane().add(tEmail);
        tEmail.setColumns(10);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                UsuarioDto usuarioDto = new UsuarioDto();
                usuarioDto.setNombre(tNombre.getText());
                usuarioDto.setApellido(tApellido.getText());
                usuarioDto.setCedula(tCedula.getText());
                usuarioDto.setTelefono(tTelefono.getText());
                usuarioDto.setEmail(tEmail.getText());

                try {
                    registrarUsuario.ejecutar(usuarioDto);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }

            }
        });
        btnGuardar.setBounds(335, 196, 89, 23);
        frame.getContentPane().add(btnGuardar);

        JButton btnSalir = new JButton("Salir");
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "My Goodness, this is so concise");
            }
        });
        btnSalir.setBounds(23, 196, 89, 23);
        frame.getContentPane().add(btnSalir);

        JLabel label = new JLabel("");
        label.setIcon(new ImageIcon("C:\\Users\\karol\\OneDrive\\Desktop\\LOGO INMOBILIARIA INTERNACIONAL.PNG"));
        label.setBounds(361, 26, 63, 52);
        frame.getContentPane().add(label);
    }

}
