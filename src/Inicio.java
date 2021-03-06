import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Max_Sandoval on 10/09/2015.
 */
public class Inicio extends JFrame implements ActionListener, ChangeListener {

    private JCheckBox chbTipo;
    private JLabel labUsuario, labContrasena;
    private JTextField txtUsuario, txtContrasena;

    JButton btnDesarrolla, btnIngresar;

    public Inicio(){
        setLayout(null);
        btnDesarrolla = new JButton("...");
        btnDesarrolla.setBounds(250,20,30,30);
        btnDesarrolla.addActionListener(this);
        add(btnDesarrolla);

        chbTipo = new JCheckBox("Administrador");
        chbTipo.setBounds(95, 190, 200, 30);
        chbTipo.addChangeListener(this);
        add(chbTipo);

        labUsuario = new JLabel("Usuario ");
        labUsuario.setBounds(75, 215, 200, 30);
        add(labUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(75,240,150,25);
        add(txtUsuario);

        labContrasena = new JLabel("Contraseña ");
        labContrasena.setBounds(75,265,200,30);
        add(labContrasena);

        txtContrasena = new JTextField();
        txtContrasena.setBounds(75,290,150,25);
        add(txtContrasena);

        btnIngresar = new JButton("Ingresar");
        btnIngresar.setBounds(100,350,100,30);
        btnIngresar.addActionListener(this);
        add(btnIngresar);




    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnIngresar){
            String usuario = txtUsuario.getText();
            String contrasena  = txtContrasena.getText();



        }
        if (e.getSource() == btnDesarrolla){
            System.exit(0);
        }
    }

    public void stateChanged(ChangeEvent e){
        if(chbTipo.isSelected() == true ){
            boolean admin = true;
        }
    }

    public static void main (String[] args){
        Inicio ventana = new Inicio();
        ventana.setBounds(500,200,300,450);
        ventana.setTitle("Iniciar Sesion");
        ventana.setResizable(false);
        ventana.setVisible(true);
    }
}
