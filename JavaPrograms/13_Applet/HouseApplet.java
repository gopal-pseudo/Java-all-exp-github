import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class HouseApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        int[] rx = {50, 175, 300};
        int[] ry = {150, 50, 150};
        g.fillPolygon(rx, ry, 3);

        g.setColor(Color.ORANGE);
        g.fillRect(70, 150, 210, 150);

        g.setColor(new Color(139, 69, 19));
        g.fillRect(150, 220, 50, 80);

        g.setColor(Color.CYAN);
        g.fillRect(90, 180, 40, 40);
        g.fillRect(220, 180, 40, 40);

        g.setColor(Color.BLACK);
        g.drawRect(90, 180, 40, 40);
        g.drawRect(220, 180, 40, 40);
        g.drawLine(110, 180, 110, 220);
        g.drawLine(90, 200, 130, 200);
        g.drawLine(240, 180, 240, 220);
        g.drawLine(220, 200, 260, 200);
        g.fillOval(190, 260, 6, 6);
    }
}
