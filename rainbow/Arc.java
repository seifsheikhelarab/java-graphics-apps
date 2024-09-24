import javax.swing.*;
import java.awt.*;
class Arc extends JPanel {
    protected void paintComponent(Graphics g) {
        
        
        g.setColor(Color.red);
        g.fillArc(300,100,400,320,0,180) ;
        g.setColor(Color.orange);
        g.fillArc(325,120,350,280,0,180) ;
        g.setColor(Color.yellow);
        g.fillArc(350,140,300,240,0,180) ;
        g.setColor(Color.green);
        g.fillArc(375,160,250,200,0,180) ;
        g.setColor(Color.blue);
        g.fillArc(400,180,200,160,0,180) ;
        g.setColor(Color.white);
        g.fillArc(425, 200, 150, 120, 0, 180);
        g.setColor(Color.red);
        g.drawString("Rainbow", 475, 250);

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rainbow");
        frame.add(new Arc());
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}