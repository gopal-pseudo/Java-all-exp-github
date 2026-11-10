import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Application Dashboard");
        frame.setLayout(new BorderLayout(5, 5));

        JLabel header = new JLabel("Dashboard Header", SwingConstants.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 22));
        header.setOpaque(true);
        header.setBackground(Color.LIGHT_GRAY);
        frame.add(header, BorderLayout.NORTH);

        JLabel footer = new JLabel("Footer - All rights reserved", SwingConstants.CENTER);
        footer.setOpaque(true);
        footer.setBackground(Color.LIGHT_GRAY);
        frame.add(footer, BorderLayout.SOUTH);

        JPanel menu = new JPanel(new GridLayout(4, 1, 5, 5));
        menu.add(new JButton("Home"));
        menu.add(new JButton("Profile"));
        menu.add(new JButton("Reports"));
        menu.add(new JButton("Settings"));
        frame.add(menu, BorderLayout.WEST);

        JPanel notifications = new JPanel(new GridLayout(3, 1, 5, 5));
        notifications.add(new JLabel("Notifications"));
        notifications.add(new JLabel("2 new messages"));
        notifications.add(new JLabel("1 pending task"));
        frame.add(notifications, BorderLayout.EAST);

        JTextArea content = new JTextArea("Main content area\n\nSelect an option from the menu.");
        content.setFont(new Font("Arial", Font.PLAIN, 16));
        frame.add(content, BorderLayout.CENTER);

        frame.setSize(650, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
