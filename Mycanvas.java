import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.ArrayList;

public class Mycanvas extends JPanel implements ActionListener {
    ArrayList<Ovni> ovnis = new ArrayList<Ovni>();
    ArrayList<Car> cars = new ArrayList<Car>();
    ArrayList<Boat> boats = new ArrayList<Boat>();
    ArrayList<Airplane> airplanes = new ArrayList<Airplane>();
    Point pSun = new Point(Config.WINDOW_W - 370, Config.WINDOW_H - 280);
    /*
     * Point p1Ovni = new Point(Config.OVNI_X_OVAL_BIG, Config.OVNI_Y_OVAL_BIG);
     * Point p2Ovni = new Point(Config.OVNI_X_OVAL_SHORT, Config.OVNI_Y_OVAL_SHORT);
     */

    public Mycanvas() {
        setPreferredSize(new Dimension(Config.WINDOW_W, Config.WINDOW_H));
        setBackground(Config.COLOR_BG);
        Timer timer = new Timer(500, this);
        timer.start();
        cars.add(new Car(15, 120, 1, 0, Color.MAGENTA, 40, 20));
        cars.add(new Car(380, 150, -1, 0, Color.ORANGE, 40, 20));
        cars.add(new Car(10, 200, 1, 0, Color.lightGray, 40, 20));
        ovnis.add(new Ovni(100, 50, 6, 4, Color.PINK, Config.OVNI_W_OVAL_BIG, Config.OVNI_H_OVAL_BIG));
        ovnis.add(new Ovni(310, 230, -6, -4, Color.RED, Config.OVNI_W_OVAL_BIG, Config.OVNI_H_OVAL_BIG));
        ovnis.add(new Ovni(50, 250, 7, -5, Color.GRAY, Config.OVNI_W_OVAL_BIG, Config.OVNI_H_OVAL_BIG));
        boats.add(new Boat(40, 265, +2, 0, Color.YELLOW, 50, 25));
        boats.add(new Boat(190, 265, +2, 0, Color.RED, 50, 25));
        boats.add(new Boat(340, 275, -2, 0, Color.green, 50, 25));
        airplanes.add(new Airplane(25, 15, 3, 1, Color.BLACK, 60, 20));
        airplanes.add(new Airplane(390, 15, -3, 0, Color.ORANGE, 60, 20));
        airplanes.add(new Airplane(80, 10, 3, -1, Color.RED, 60, 20));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Painbrush painbrush = new Painbrush(g);
        painbrush.drawSky();
        painbrush.drawSun(pSun);
        for (Car c : cars) {
            c.move();
            c.draw(g);
        }
        painbrush.drawMontains();
        painbrush.drawMontains(0, 100);
        painbrush.drawMontains(140, 110);
        painbrush.drawMontains(110, 110);
        painbrush.drawTree();
        painbrush.drawTree(50, 100);
        painbrush.drawTree(130, 120);
        painbrush.drawTree(340, 80);
        painbrush.drawTree(260, 115);
        painbrush.drawSun(pSun);
        painbrush.drawSea(0, 261, 400, 130);
        for (Ovni o : ovnis) {
            o.move();
            o.draw(g);
        }
        for (Boat b : boats) {
            b.move();
            b.draw(g);
        }
        for (Airplane a : airplanes) {
            a.move();
            a.draw(g);
        }
        /*
         * painbrush.drawVehicle();
         * painbrush.drawVehicle(p1Ovni, p2Ovni);
         */

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}