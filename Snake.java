import java.util.ArrayList;
import java.awt.Color;

class Snake {
    private int lifes;
    private Color color;
    private Color colorHead;
    private Color colorTail;
    private ArrayList<Point> body = new ArrayList<Point>();
    private int speed;

    enum Direction {
        UP, DOWN, LEFT, RIGHT
    };

    private Direction dir;

    public Snake() {
        body.add(new Point(5, 2));
        body.add(new Point(4, 2));
        body.add(new Point(3, 2));
        color = Color.GREEN;
        colorHead = Color.MAGENTA;
        colorTail = Color.YELLOW;
        lifes = 3;
        speed = 1;
        dir = Direction.DOWN;
    }

    public ArrayList<Point> getBody() {
        return body;
    }

    public int getSpeed() {
        return speed;
    }

    public Color getColor() {
        return color;
    }

    public void setDir(Direction dir) {
        this.dir = dir;
    }

    public Direction getDir() {
        return dir;
    }

    public Color getColorHead() {
        return colorHead;
    }

    public Color getColorTail() {
        return colorTail;
    }

    public void setLifes(int lifes) {
        this.lifes = lifes;
    }

    public int getLifes() {
        return lifes;
    }
}