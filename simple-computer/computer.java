import javax.swing.*;
import java.awt.*;
class computer extends JPanel {
    protected void paintComponent(Graphics g) {
        g.setColor(Color.black);
        g.fillArc(30, 120, 70, 20, 180, 360);
        g.setColor(Color.blue);
        g.fillRect(10, 30, 110, 100);
        g.fillRect(160, 10, 50, 140);
        g.fillRect(10, 140, 110, 10);
        g.setColor(Color.white);
        g.fillRect(15, 35, 100, 90);
        g.fillRect(170, 20, 30, 10);
        g.fillRect(170, 40, 30, 10);
        g.fillOval(170, 100, 30, 30);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rainbow");
        frame.add(new computer());
        frame.setSize(240, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}