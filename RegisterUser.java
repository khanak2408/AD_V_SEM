import javax.swing.*;
import java.awt.*;
class RegistrationForm extends JFrame{
    Container c;
    JLabel lblFirstName, lblLastName;
    JTextField txtFirstName, txtLastName;
    JButton btnRegister;

    public RegistrationForm(){
        c=getContentPane();

        lblFirstName=new JLabel("First Name");
        lblLastName=new JLabel("Last Name");

        txtFirstName=new JTextField(10);
        txtLastName=new JTextField(10);
        btnRegister=new JButton("Register");

        
        JLabel lblCourse = new JLabel("choose your Course");
        JCheckBox cb1=new JCheckBox("C++");
        JCheckBox cb2=new JCheckBox("Java");
        JCheckBox cb3=new JCheckBox("Python");

        JLabel lblGender=new JLabel("Select your gender");
        JRadioButton rdo1=new JRadioButton();
        rdo1.setText("Male");
        JRadioButton rdo2=new JRadioButton();
        rdo2.setText("Female");


        ButtonGroup bg=new ButtonGroup();
        bg.add(rdo1);
        bg.add(rdo2);

        lblFirstName.setBounds(20, 20, 100, 30);
        txtFirstName.setBounds(130, 20, 150, 30);
        lblLastName.setBounds(20, 60, 100, 30);
        txtLastName.setBounds(130, 60, 150, 30);
        
        lblCourse.setBounds(20, 100, 150, 30);
        cb1.setBounds(20, 130, 100, 30);
        cb2.setBounds(130, 130, 100, 30);
        cb3.setBounds(240, 130, 100, 30);
                
        lblGender.setBounds(20, 170, 150, 30);
        rdo1.setBounds(20, 200, 100, 30);
        rdo2.setBounds(130, 200, 100, 30);
                
        btnRegister.setBounds(20, 240, 100, 30);
        c.add(lblFirstName);
        c.add(txtFirstName);
        c.add(lblLastName);
        c.add(txtLastName);
        c.add(lblCourse);
        c.add(cb1);
        c.add(cb2);
        c.add(cb3);
        c.add(lblGender);
        c.add(rdo1);
        c.add(rdo2);
        c.add(btnRegister);
       
    }
}

public class RegisterUser{
    public static void main(String args[]){
        RegistrationForm f=new RegistrationForm();
        f.setLayout(null);
        f.setTitle("Registration Form");
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}