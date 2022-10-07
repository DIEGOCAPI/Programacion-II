import java.awt.Dimension;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.*;

class Mycanvas extends JPanel implements KeyListener, ActionListener {
    Point pSun = new Point(Config.WINDOW_W / 2, Config.WINDOW_H / 2);
    Point p1Ovni = new Point(Config.OVNI_X_OVAL_BIG, Config.OVNI_Y_OVAL_BIG);
    Point p2Ovni = new Point(Config.OVNI_X_OVAL_SHORT, Config.OVNI_Y_OVAL_SHORT);

    public Mycanvas() {
        setPreferredSize(new Dimension(Config.WINDOW_W, Config.WINDOW_H));
        setBackground(Config.COLOR_BG);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Painbrush painbrush = new Painbrush(g);
        painbrush.drawSky();
        painbrush.drawMontains();
        painbrush.drawMontains(0, 100);
        painbrush.drawMontains(140, 110);
        painbrush.drawMontains(110, 110);
        painbrush.drawTree();
        painbrush.drawTree(50, 100);
        painbrush.drawTree(130, 120);
        painbrush.drawTree(340, 80);
        painbrush.drawTree(260, 115);
        painbrush.drawTree(200, 150);
        painbrush.drawVehicle();
        painbrush.drawVehicle(p1Ovni, p2Ovni);

        painbrush.drawSun(pSun);
    }

    @Override

    public void keyPressed(KeyEvent event) {

        int key = event.getKeyCode();
        if (key == KeyEvent.VK_UP) {
            pSun.setY(pSun.getY() - Config.SUN_STEP);
        }
        if (key == KeyEvent.VK_DOWN) {
            pSun.setY(pSun.getY() + Config.SUN_STEP);
        }

        if (key == KeyEvent.VK_RIGHT) {
            pSun.setX(pSun.getX() + Config.SUN_STEP);
        }

        if (key == KeyEvent.VK_LEFT) {
            pSun.setX(pSun.getX() - Config.SUN_STEP);
        }

        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}