import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import java.awt.*;

public class WindowTrial extends JFrame {
    WindowTrial() {
        super("Пробне вікно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        ImageIcon icon = new ImageIcon("src/icon.png");
        panel.add(new JLabel(icon));
        panel.add(new JButton("Ще кнопка", new ImageIcon("src/icon.png")));

        JTextField textField = new JTextField("Текстове поле", 20);
        textField.setCaretColor(Color.RED);
        textField.setBackground(Color.yellow);
        textField.setHorizontalAlignment(JTextField.CENTER);
        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setEchoChar('?');
        passwordField.setText("пароль");
        JTextArea textArea = new JTextArea(5, 20);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        for (int i = 0; i <= 20; i++)
            textArea.append("Область для вводу тексту");
        panel.add(textField, BorderLayout.NORTH);
        panel.add(new JScrollPane(textArea));
        panel.add(passwordField, BorderLayout.SOUTH)
        ;
        JToolBar toolBar = new JToolBar("Інструментальна панель");
        toolBar.add(new JButton("Кнопка 1"));
        toolBar.add(new JButton("Кнопка 2"));
        toolBar.addSeparator();toolBar.add(new JButton("Кнопка 3"));
        panel.add(toolBar);

        String[] elements = new String[] {"Василь", "Петро","<html><font size = +1 color = yellow>Іван</font>"};
        JComboBox combo = new JComboBox(elements);
        combo.setSelectedIndex(1);
        panel.add(combo);

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 75, 100, 75);
        slider.setMajorTickSpacing(5);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);//позначки
        slider.setPaintLabels(true);//числа під позначками
        slider.setSnapToTicks(true);//прилипання до позначки

        panel.add(slider);
        setContentPane(panel);
        setSize(800, 800);
    }
}
