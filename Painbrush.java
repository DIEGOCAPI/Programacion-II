import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

public class Painbrush {
    private Graphics g;

    public Painbrush(Graphics g) {
        this.g = g;
    }

    public void drawSky() {
        g.setColor(new Color(127, 233, 245));
        g.fillRect(0, 0, 400, 100);
    }

    public void drawSun(Point p) {
        g.setColor(Config.COLOR_SUN);
        g.fillOval(p.getX(), p.getY(), Config.SUN_SIZE, Config.SUN_SIZE);
    }

    public void drawMontains() {
        Polygon triangle = new Polygon();
        triangle.addPoint(15, 120);
        triangle.addPoint(100, 40);
        triangle.addPoint(180, 130);
        g.setColor(Config.COLOR_BROWN);
        g.fillPolygon(triangle);
    }

    public void drawMontains(int x, int y) {
        Polygon triangle = new Polygon();
        triangle.addPoint(x, y);
        triangle.addPoint(x + 60, y - 40);
        triangle.addPoint(x + 100, y + 10);
        g.setColor(Config.COLOR_BROWN);
        g.fillPolygon(triangle);
    }

    public void drawTree() {
        int start = 200;
        int top = 50;

        g.setColor(Config.COLOR_TRUNK_TREE);
        g.fillRect(start - 10, top + 100, 26, 40);
        g.setColor(Config.COLOR_TREE);

        for (int i = 0; i < 5; i++) {
            Polygon triangle = new Polygon();
            int height = 50;
            int width = 70;
            int spacing = 15;

            triangle.addPoint(start, top + (spacing * i));
            triangle.addPoint(start - (width / 2), top + height + (spacing * i));
            triangle.addPoint(start + (width / 2), top + height + (spacing * i));

            g.fillPolygon(triangle);
        }
    }

    public void drawTree(int x, int y) {
        g.setColor(Config.COLOR_TRUNK_TREE);
        g.fillRect(x - 10, y + 100, 26, 40);
        g.setColor(Config.COLOR_TREE);

        for (int i = 0; i < 5; i++) {
            Polygon triangle = new Polygon();
            int height = 50;
            int width = 70;
            int spacing = 15;

            triangle.addPoint(x, y + (spacing * i));
            triangle.addPoint(x - (width / 2), y + height + (spacing * i));
            triangle.addPoint(x + (width / 2), y + height + (spacing * i));

            g.fillPolygon(triangle);
        }
    }

    public void drawVehicle() {
        g.setColor(Config.COLOR_OVNI);
        g.fillOval(300, 30, 80, 20);
        g.fillOval(330, 20, 20, 15);
    }

    public void drawVehicle(Point p, Point p2) {
        g.setColor(Config.COLOR_OVNI2);
        g.fillOval(p.getX(), p.getY(), Config.OVNI_W_OVAL_BIG, Config.OVNI_H_OVAL_BIG);
        g.fillOval(p2.getX(), p2.getY(), Config.OVNI_W_OVAL_SHORT, Config.OVNI_H_OVAL_SHORT);
    }

    public void drawSea(int a, int b, int c, int d) {
        g.setColor(Color.BLUE);
        g.fillRect(a, b, c, d);
    }
}