import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class ColorApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(30, 30, 150, 90);

        g.setColor(Color.BLUE);
        g.fillOval(220, 30, 150, 90);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Java Applets are fun!", 90, 180);
    }
}
