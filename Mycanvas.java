import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.Graphics;

class Mycanvas extends JPanel {
    public Mycanvas() {
        setPreferredSize(new Dimension(400, 300));
        setBackground(Color.GRAY);
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
    }
}
