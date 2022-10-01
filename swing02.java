import javax.swing.*;

class Swing02 {
    public static void main(String args[]) {
        JFrame window = new JFrame("Swing");
        Mycanvas canvas = new Mycanvas();

        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(400, 300);
        window.add(canvas);
        window.pack();
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}