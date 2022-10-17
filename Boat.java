import java.awt.Color;
import java.awt.Graphics;

public class Boat extends Vehicle {
    int w, h;

    public Boat(int x, int y, int speedX, int speedY, Color color, int w, int h) {
        super(x, y, speedX, speedY, color);
        this.w = w;
        this.h = h;

    }

    public void draw(Graphics g) {
        g.setColor(Color.DARK_GRAY);
        g.fillRect(getDot().getX() + 15, getDot().getY() - 15, w - 40, h + 10);
        g.setColor(this.getColor());
        g.fillRect(getDot().getX(), getDot().getY(), w, h);
        g.setColor(Color.white);
        g.fillRect(getDot().getX() + 10, getDot().getY() - 5, w - 20, h - 15);
    }
}
