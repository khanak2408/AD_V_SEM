import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JLabel;
class RegistrationForm extends JFrame{
    Container c;
    JLabel lblFirstName,lblLastName,lblEmail;
    JTextField txtFirstName,txtLastName,txtEmail;
    JButton btnRegister;

    public RegistrationForm(){
        c=getContentPane();
        lblFirstName=new JLabel("First Name");
        lblFirstName.setBounds(10,10,100,100);
        lblLastName=new JLabel("Last Name");
        lblEmail=new JLabel("Email");

        txtFirstName=new JTextField(10);
        txtLastName=new JTextField(10);
        txtEmail=new JTextField(10);

        btnRegister=new JButton();
        btnRegister.setText("Register");

        c.add(lblFirstName);
        c.add(txtFirstName);
        c.add(lblLastName);
        c.add(txtLastName);
        c.add(lblEmail);
        c.add(txtEmail);
        c.add(btnRegister);
    }
}
public class Swing_A{
    public static void main(String args[]){
        RegistrationForm f=new RegistrationForm();
        f.setSize(600,600);
        f.setLayout(null);
        f.setTitle("Registration Form");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}