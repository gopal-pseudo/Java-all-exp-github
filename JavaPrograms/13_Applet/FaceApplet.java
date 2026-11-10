import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class FaceApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200);
        g.setColor(Color.BLACK);
        g.drawOval(50, 50, 200, 200);

        g.fillOval(100, 110, 25, 25);
        g.fillOval(175, 110, 25, 25);

        int[] nx = {150, 140, 160};
        int[] ny = {140, 175, 175};
        g.drawPolygon(nx, ny, 3);

        g.setColor(Color.RED);
        g.drawArc(100, 170, 100, 50, 180, 180);
    }
}
