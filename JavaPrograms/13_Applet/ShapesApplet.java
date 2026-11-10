import java.applet.Applet;
import java.awt.Graphics;

public class ShapesApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Rectangle", 40, 30);
        g.drawRect(30, 40, 120, 70);

        g.drawString("Circle", 220, 30);
        g.drawOval(200, 40, 80, 80);

        g.drawString("Line", 40, 170);
        g.drawLine(30, 180, 150, 250);

        g.drawString("Triangle", 215, 170);
        int[] x = {240, 190, 290};
        int[] y = {180, 260, 260};
        g.drawPolygon(x, y, 3);
    }
}
