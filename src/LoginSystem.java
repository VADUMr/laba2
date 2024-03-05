import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import java.awt.*;
public class LoginSystem extends JFrame {
    LoginSystem(){
        super("Вікно входу");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,1,0,1));

        JTextField textField = new JTextField("Текстове поле", 40);
        textField.setCaretColor(Color.yellow);
        textField.setBackground(Color.blue);
        textField.setHorizontalAlignment(JTextField.CENTER);

        JPasswordField passwordField = new JPasswordField(40);
        passwordField.setCaretColor(Color.blue);
        passwordField.setBackground(Color.yellow);
        passwordField.setEchoChar('*');
        passwordField.setText("password");
        passwordField.setHorizontalAlignment(JPasswordField.CENTER);

        panel.add(textField, BorderLayout.NORTH);
        panel.add(passwordField, BorderLayout.SOUTH);

        JButton button = new JButton("Відправити");
        panel.add(button);

        setContentPane(panel);
        setSize(800, 400);
        setLocationRelativeTo(null); // Розміщення вікна по центру екрану
    }
}
