import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
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
        setContentPane(panel);
        setSize(800, 800);
    }
}
