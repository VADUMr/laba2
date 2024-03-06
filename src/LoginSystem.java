import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class LoginSystem extends JFrame {
    LoginSystem(){
        super("Вікно входу");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2,1,0));

        JLabel Namelabel = new JLabel("Введіть свій нік");
        Namelabel.setOpaque(true); // включаємо непрозорий фон
        Namelabel.setBackground(Color.blue);
        Namelabel.setHorizontalAlignment(JTextField.CENTER);
        panel.add(Namelabel);

        JTextField textField = new JTextField();
        textField.setBorder(null);
        textField.setCaretColor(Color.yellow);
        textField.setBackground(Color.blue);
        textField.setHorizontalAlignment(JTextField.CENTER);
        panel.add(textField);

        JLabel Passwordlabel = new JLabel("Введіть свій пароль");
        Passwordlabel.setOpaque(true); // включаємо непрозорий фон
        Passwordlabel.setBackground(Color.yellow);
        Passwordlabel.setHorizontalAlignment(JTextField.CENTER);
        panel.add(Passwordlabel);

        JPasswordField passwordField = new JPasswordField(40);
        passwordField.setBorder(null);
        passwordField.setCaretColor(Color.blue);
        passwordField.setBackground(Color.yellow);
        passwordField.setEchoChar('*');
        passwordField.setHorizontalAlignment(JPasswordField.CENTER);
        panel.add(passwordField);

        JButton SubmitButton = new JButton("Відправити");
        SubmitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(textField.getText().equals("Вадим") &&
                        Arrays.equals(passwordField.getPassword(), "123".toCharArray())){
                    JOptionPane.showMessageDialog(SubmitButton, "Ви ввійшли в акаунт","ОК",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(SubmitButton, "Данні для входу неправильні","О НІ",
                            JOptionPane.WARNING_MESSAGE);
                }
                } });
        panel.add(SubmitButton);

        JButton ClearButton = new JButton("Очистити");
        ClearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent b) {
                passwordField.setText("");
                textField.setText("");
            } });
        panel.add(ClearButton);

        setContentPane(panel);
        setSize(800, 400);
        setLocationRelativeTo(null); // Розміщення вікна по центру екрану
    }
}
