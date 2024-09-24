/* 
Made by
    Seif Usama Sheikhelarab
    Amaal Saged Mansour
    Mennatullah Sherif Mohammed
    Mostafa Mohammed Ibrahim
*/

import javax.swing.*;
import java.awt.*;
class duckie extends JPanel {

    int w=200,h=200;
    int c1=0,c2=100,c3=150,c4=260,c5=450;
        
    void cloud(Graphics g,int x,int y)
    {
        g.setColor(Color.white);
        g.fillRect(x+30, y-50, 110, 50);
        g.fillRect(x+10, y-10, 80, 30);
        g.fillRect(x+80, y-60, 40, 10);
        

        g.setColor(new Color(91, 176, 236));
        g.fillRect(x, y, 10, 20);
        g.fillRect(x+10, y-10, 10, 20);
        g.fillRect(x+20, y-20, 20, 10);
        g.fillRect(x+20, y-40, 10, 20);
        g.fillRect(x+30, y-50, 20, 10);
        g.fillRect(x+50, y-60, 30, 10);
        g.fillRect(x+80, y-70, 50, 10);
        g.fillRect(x+120, y-60, 20, 10);
        g.fillRect(x+140, y-50, 10, 30);
        g.fillRect(x+130, y-20, 10, 20);
        g.fillRect(x+90, y, 40, 10);
        g.fillRect(x+90, y-20, 20, 30);
        g.fillRect(x+90, y+10, 10, 10);
        g.fillRect(x+10, y+20, 80, 10);
        g.fillRect(x+20, y-20, 20, 10);
        g.fillRect(x+40, y-30, 20, 10);
        g.fillRect(x+60, y-40, 30, 10);
        g.fillRect(x+80, y-30, 20, 10);

    }

    public void paintComponent(Graphics g) {

        //w=220 h=300
        // Color Background
        g.setColor(new Color(38, 116, 240));
        g.fillRect(0, 0, 800, 600);

            cloud(g, c1, 100);
            cloud(g, c2, 150);
            cloud(g, c3, 200);
            cloud(g, c4, 50);
            cloud(g, c5, 75);

        g.setColor(Color.white);
        g.fillRect(w+30, h+60, 100, 70);
        g.fillRect(w+20, h+90, 10, 40);
        g.fillRect(w+40, h+130, 130, 30);
        g.fillRect(w+50, h-90, 50, 150);
        g.fillRect(w+40, h-90, 10, 70);
        g.fillRect(w+100, h+70, 100, 60);
        g.fillRect(w+160, h+60, 20, 80);
        g.fillRect(w+30, h+130, 10, 10);

        g.setColor(Color.orange);
        g.fillRect(w+30, h-20, 30, 30);
        g.fillRect(w+20, h-10, 50, 20);
        g.fillRect(w+70, h+160, 10, 20);
        g.fillRect(w+50, h+180, 20, 30);
        g.fillRect(w+130, h+160, 10, 20);
        g.fillRect(w+110, h+180, 20, 30);

        g.setColor(new Color(173,216,230));
        g.fillRect(w+40, h-90, 80, 30);
        g.fillRect(w+100, h-90, 20, 80);
        g.fillRect(w+120, h-50, 20, 30);

        g.setColor(Color.blue);
        g.fillRect(w+40, h-60, 60, 10);
        g.fillRect(w+90, h-50, 40, 10);

        g.setColor(Color.red);
        g.fillRect(w+50, h-70, 30, 10);
        g.fillRect(w+110, h-80, 10, 30);
        
        g.setColor(new Color(0,0,139));
        g.fillRect(w+110, h-40, 30, 30);


        g.setColor(Color.black);
        g.fillRect(w+10, h+90, 10, 40);
        g.fillRect(w+20, h+70, 10, 20);
        g.fillRect(w+30, h+60, 10, 10);
        g.fillRect(w+40, h+50, 10, 10);
        g.fillRect(w+50, h+20, 10, 30);
        g.fillRect(w+20, h+10, 30, 10);
        g.fillRect(w+10, h+0, 10, 10);
        g.fillRect(w+20, h-10, 10, 10);
        g.fillRect(w+30, h-80, 10, 70);
        g.fillRect(w+40, h-90, 10, 10);
        g.fillRect(w+50, h-100, 60, 10);
        g.fillRect(w+110, h-90, 10, 10);
        g.fillRect(w+120, h-80, 10, 30);
        g.fillRect(w+130, h-50, 10, 10);
        g.fillRect(w+140, h-40, 10, 20);
        g.fillRect(w+100, h-20, 40, 10);
        g.fillRect(w+100, h-50, 10, 30);
        g.fillRect(w+90, h-20, 10, 70);
        g.fillRect(w+100, h+50, 10, 10);
        g.fillRect(w+110, h+60, 20, 10);
        g.fillRect(w+130, h+70, 20, 10);
        g.fillRect(w+140, h+60, 20, 10);
        g.fillRect(w+160, h+50, 20, 10);
        g.fillRect(w+170, h+60, 10, 20);
        g.fillRect(w+180, h+70, 20, 10);
        g.fillRect(w+200, h+70, 10, 40);
        g.fillRect(w+190, h+110, 10, 20);
        g.fillRect(w+180, h+120, 10, 20);
        g.fillRect(w+170, h+110, 10, 10);
        g.fillRect(w+160, h+90, 10, 20);
        g.fillRect(w+140, h+80, 20, 10);
        g.fillRect(w+170, h+140, 10, 10);
        g.fillRect(w+130, h+150, 40, 10);
        g.fillRect(w+140, h+140, 10, 40);
        g.fillRect(w+130, h+180, 10, 30);
        g.fillRect(w+100, h+200, 10, 10);
        g.fillRect(w+110, h+180, 10, 20);
        g.fillRect(w+120, h+160, 10, 20);
        g.fillRect(w+80, h+160, 40, 10);
        g.fillRect(w+80, h+170, 10, 10);
        g.fillRect(w+70, h+180, 10, 30);
        g.fillRect(w+40, h+200, 10, 10);
        g.fillRect(w+50, h+180, 10, 20);
        g.fillRect(w+60, h+150, 10, 30);
        g.fillRect(w+40, h+150, 20, 10);
        g.fillRect(w+30, h+140, 10, 10);
        g.fillRect(w+20, h+130, 10, 10);
        g.fillRect(w+70, h-40, 10, 20);
        


        g.setColor(new Color(2, 122, 30));
        g.fillRect(0, w+210, 5000, 4000);
        g.setColor(new Color(3, 79, 21));
        g.fillRect(700, 500, 10, 10);
        g.fillRect(560, 430, 10, 10);
        g.fillRect(230, 510, 10, 10);
        g.fillRect(120, 480, 10, 10);
        g.fillRect(460, 530, 10, 10);
        g.fillRect(530, 500, 10, 10);
        g.fillRect(700, 500, 10, 10);
        g.fillRect(330, 460, 10, 10);
        g.fillRect(270, 590, 10, 10);

       if(c1 < 800) 
        {
            c1++;
            repaint();
        }
        else
        {
            c1=-150;
            repaint();
        }
        if(c2 < 800) 
        {
            c2=c2+2;
            repaint();
        }
        else
        {
            c2=-150;
            repaint();
        }
        if(c3 < 800) 
        {
            c3=c3+3;
            repaint();
        }
        else
        {
            c3=-150;
            repaint();
        }
        if(c4 < 800) 
        {
            c4=c4+4;
            repaint();
        }
        else
        {
            c4=-150;
            repaint();
        }
        if(c5 < 800) 
        {
            c5++;
            repaint();
        }
        else
        {
            c5=-150;
            repaint();
        }
        try {
            Thread.sleep(75);
            } 
           catch (InterruptedException e) {
            e.printStackTrace();
            }       
    }
        public static void main(String[] args) {
        JFrame frame = new JFrame("duck");
        frame.add(new duckie());
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}