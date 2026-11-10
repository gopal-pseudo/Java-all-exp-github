import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Flow Layout Demo");
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
        frame.add(new JLabel("Name:"));
        frame.add(new JTextField(15));
        for (int i = 1; i <= 6; i++) {
            frame.add(new JButton("Button " + i));
        }
        frame.setSize(420, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
