import javax.swing.*;
import java.awt.*;
public class Square extends JPanel {
int x=0,i=0;
protected void paintComponent(Graphics g) {
super.paintComponent(g);
// Body
int [] 
x_body={0+x,10+x,10+x,30+x,30+x,60+x,60+x,70+x,70+x,90+x,90+x,30+x,30+x,0+x};
int [] y_body={130,130,150,150,130,130,110,110,130,130,170,170,160,160};
g.setColor(Color.pink);
g.fillPolygon(x_body,y_body,14);
g.fillArc(70+x, 130, 40, 40, 270, 180);
// Window
g.setColor(Color.black);
g.fillRect(40+x, 140, 10, 10);
g.fillRect(60+x, 140, 10, 10);
g.fillRect(80+x, 140, 10, 10);
 // fan
 g.setColor(Color.RED);
 g.fillArc(10+x, 100, 110, 30, 0+i, 20);
 g.fillArc(10+x, 100, 110, 30, 90+i, 20);
 g.fillArc(10+x, 100, 110, 30, 180+i, 20);
 g.fillArc(10+x, 100, 110, 30, 270+i, 20);
 x++;
 if(x==this.getBounds().width)
 x=-120;
 i++;
 if(i==360)
 i=0;
 repaint();
 try {
    Thread.sleep(20);  // This will cause a 20 millisecond delay between repaints
    } 
   catch (InterruptedException e) {
    e.printStackTrace();
    }
 }
 public static void main(String[] args) {
 // Create a JFrame and add the custom panel
 JFrame frame = new JFrame("Square");
 frame.add(new Square());
 // Set frame size and closing behavior
 frame.setSize(400, 300);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);   }}
