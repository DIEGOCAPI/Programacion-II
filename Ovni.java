import java.awt.Color;
import java.awt.Graphics;

public class Ovni extends Vehicle {
    int w, h;

    public Ovni(int x, int y, int speedX, int speedY, Color color, int w, int h) {
        super(x, y, speedX, speedY, color);
        this.w = w;
        this.h = h;
    }

    public void draw(Graphics g) {
        g.setColor(this.getColor());
        g.fillOval(getDot().getX(), getDot().getY(), w, h);
        g.fillOval(getDot().getX() + 30, getDot().getY() - 10, w - 60, h);
        g.setColor(Color.GRAY);
    }

}
