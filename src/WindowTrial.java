import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;

public class WindowTrial extends JFrame {
    WindowTrial() {
        super("Пробне вікно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,3,5,10));
        panel.add(new JButton("Кнопка"));
        panel.add(new JButton("+"));
        panel.add(new JButton("-"));
        panel.add(new JButton("Кнопка з довгим написом"));
        panel.add(new JButton("Ще кнопка"));
        setContentPane(panel);setSize(400, 600);
    }
}
