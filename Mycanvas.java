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
        painbrush.drawTree();
    }
}
