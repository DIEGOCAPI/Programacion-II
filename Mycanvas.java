import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.ArrayList;

public class Mycanvas extends JPanel implements ActionListener {
    ArrayList<Ovni> ovnis = new ArrayList<Ovni>();
    ArrayList<Car> cars = new ArrayList<Car>();
    Point pSun = new Point(Config.WINDOW_W - 370, Config.WINDOW_H - 280);
    Point p1Ovni = new Point(Config.OVNI_X_OVAL_BIG, Config.OVNI_Y_OVAL_BIG);
    Point p2Ovni = new Point(Config.OVNI_X_OVAL_SHORT, Config.OVNI_Y_OVAL_SHORT);

    public Mycanvas() {
        setPreferredSize(new Dimension(Config.WINDOW_W, Config.WINDOW_H));
        setBackground(Config.COLOR_BG);
        Timer timer = new Timer(500, this);
        timer.start();
        ovnis.add(new Ovni(100, 50, 6, 4, Color.PINK, Config.OVNI_W_OVAL_BIG, Config.OVNI_H_OVAL_BIG));
        ovnis.add(new Ovni(310, 230, -6, -4, Color.RED, Config.OVNI_W_OVAL_BIG, Config.OVNI_H_OVAL_BIG));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Painbrush painbrush = new Painbrush(g);
        painbrush.drawSky();
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
        for (Ovni c : ovnis) {
            c.move();
            c.draw(g);
        }

        /*
         * painbrush.drawVehicle();
         * painbrush.drawVehicle(p1Ovni, p2Ovni);
         */

        painbrush.drawSun(pSun);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}