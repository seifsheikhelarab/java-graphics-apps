/* 
Made by
    Seif Usama Sheikhelarab
    Menna Atta Elbardawil
    Ahmed Samy Mohammed
    Ola Saleh Ibrahim
*/

import javax.swing.*;
import java.awt.*;
class main extends JPanel {

    int w=200,h=200;
    int frame = 0;
    int rainx = 0, rainy1=0, rainy2=0, legx=0;
    int headx=0;

    void star1(Graphics g,int x,int y)
        {
            g.setColor(Color.white);
            g.fillRect(x, y, 10, 10);
            g.fillRect(x-20, y+10, 10, 10);
            g.fillRect(x+20, y+10, 10, 10);
            g.fillRect(x-30, y+30, 10, 10);
            g.fillRect(x+30, y+30, 10, 10);
            g.fillRect(x-20, y+50, 10, 10);
            g.fillRect(x+20, y+50, 10, 10);
            g.fillRect(x, y+60, 10, 10);
        }
    void star2(Graphics g,int x,int y)
        {
            g.setColor(Color.white);
            g.fillRect(x, y, 10, 10);
            g.fillRect(x+25, y+25, 10, 10);
            g.fillRect(x, y+50, 10, 10);
            g.fillRect(x-25, y+25, 10, 10);
        }
    void star3(Graphics g, int x,int y)
        {
            g.setColor(Color.white);
            g.fillRect(x, y, 10, 10);
            g.fillRect(x, y+20, 10, 20);
            g.fillRect(x, y-30, 10, 20);
            g.fillRect(x+20, y, 20, 10);
            g.fillRect(x-30, y, 20, 10);
        }
    void star4(Graphics g,int x,int y)
        {  
            g.setColor(Color.white);
            g.fillRect(x, y-10, 10, 10);
            g.fillRect(x, y+10, 10, 10);
            g.fillRect(x+10, y, 10, 10);
            g.fillRect(x-10, y, 10, 10);

        }

    public void paintComponent(Graphics g) {

        // Purple Background
        g.setColor(new Color(0, 50, 100));
        g.fillRect(0, 0, 800, 600);

        //values and stars
        switch (frame) {
            case 0:
                rainx=0;
                rainy1=0;
                rainy2=0;
                h=200;
                headx=0;
                legx=0;
                star3(g,770, 120);
                star4(g, 390, 420);
                star2(g, 150, 370);
                star4(g, 10, 180);
                break;

            case 1:
                rainx=-10;
                rainy1=0;
                rainy2=0;
                h=200;
                headx=10;
                legx=0;
                star3(g, 310, 420);
                star1(g, 700, 100);
                break;

            case 2:
                rainx=0;
                rainy1=10;
                rainy2=-10;
                h=220;
                headx=10;
                legx=10;
                star3(g, 770,200);
                star2(g,650,400);
                star1(g, 230, 410);
                star2(g, 600, 130);
                star4(g, 20, 400);    
                break;

            case 3:
                rainx=-10;
                rainy1=+10;
                rainy2=-10;
                headx=10;
                legx=0;
                star1(g,650,100);
                star1(g, 600, 400);
                star2(g, 200,400);    
                break;

        }


        //Rainbow!!!!!
        g.setColor(Color.red);
        g.fillRect(w+0+rainx, h+0+rainy1, 80, 30);
        g.fillRect(w-80+rainx, h+10+rainy2, 80, 30);
        g.fillRect(w-160+rainx, h+0+rainy1, 80, 30);
        g.fillRect(w-240+rainx, h+10+rainy2, 80, 30);

        g.setColor(Color.orange);
        g.fillRect(w+0+rainx, h+30+rainy1, 80, 30);
        g.fillRect(w-80+rainx, h+40+rainy2, 80, 30);
        g.fillRect(w-160+rainx, h+30+rainy1, 80, 30);
        g.fillRect(w-240+rainx, h+40+rainy2, 80, 30);

        g.setColor(Color.yellow);
        g.fillRect(w+0+rainx, h+60+rainy1, 80, 30);
        g.fillRect(w-80+rainx, h+70+rainy2, 80, 30);
        g.fillRect(w-160+rainx, h+60+rainy1, 80, 30);
        g.fillRect(w-240+rainx, h+70+rainy2, 80, 30);

        g.setColor(Color.green);
        g.fillRect(w+0+rainx, h+90+rainy1, 80, 30);
        g.fillRect(w-80+rainx, h+100+rainy2, 80, 30);
        g.fillRect(w-160+rainx, h+90+rainy1, 80, 30);
        g.fillRect(w-240+rainx, h+100+rainy2, 80, 30);

        g.setColor(new Color(0, 155, 255));
        g.fillRect(w+0+rainx, h+120+rainy1, 80, 30);
        g.fillRect(w-80+rainx, h+130+rainy2, 80, 30);
        g.fillRect(w-160+rainx, h+120+rainy1, 80, 30);
        g.fillRect(w-240+rainx, h+130+rainy2, 80, 30);

        g.setColor(new Color(100, 50, 255));
        g.fillRect(w+0+rainx, h+150+rainy1, 80, 30);
        g.fillRect(w-80+rainx, h+160+rainy2, 80, 30);
        g.fillRect(w-160+rainx, h+150+rainy1, 80, 30);
        g.fillRect(w-240+rainx, h+160+rainy2, 80, 30);
        

        // Light Orange Cat Color
        g.setColor(new Color(250, 200, 150));
        g.fillRect(w+70,h+10,190,160);

        // Pink Cat Color
        g.setColor(new Color(255, 150, 255));
        g.fillRect(w+90,h+30,150,120);
        g.fillRect(w+100,h+20,130,10);
        g.fillRect(w+80,h+40,10,100);
        g.fillRect(w+100,h+150,170,10);
        g.fillRect(w+240,h+40,10,130);

        // Gray Cat Color
        g.setColor(new Color(155, 155, 155));
        g.fillRect(w+180+headx,h+90,120,80); //head
        g.fillRect(w+170+headx,h+100,10,60); //head
        g.fillRect(w+300+headx,h+100,10,60); //head
        g.fillRect(w+180+headx,h+60,30,30); //head
        g.fillRect(w+270+headx,h+60,30,30); //head
        g.fillRect(w+210+headx,h+80,60,10); //head
        g.fillRect(w+200+headx+legx,h+180,20,10); //leg 3
        g.fillRect(w+250+headx+legx,h+180,20,10); //leg 4 
        switch (frame) {

            case 0:
                g.fillRect(w+10,h+80,20,20); //tail
                g.fillRect(w+30,h+90,20,20); //tail
                g.fillRect(w+40,h+110,20,10); //tail
                g.fillRect(w+50,h+170,30,20); //leg 1
                g.fillRect(w+110,h+180,20,10); //leg 2    
                break;
            
            case 1:
                g.fillRect(w+10,h+80,20,20); //tail
                g.fillRect(w+20,h+100,40,20); //tail
                g.fillRect(w+50,h+170,30,20); //leg 1
                g.fillRect(w+110,h+180,20,10); //leg 2
                break;
            
            case 2:
                g.fillRect(w+10,h+120,50,20); //tail
                g.fillRect(w+70,h+170,20,20); //leg 1
                g.fillRect(w+120,h+180,20,10); //leg 2
                break;

            case 3:
                g.fillRect(w+20,h+120,40,20); //tail
                g.fillRect(w+10,h+140,20,20); //tail
                g.fillRect(w+50,h+170,30,20); //leg 1
                g.fillRect(w+110,h+180,20,10); //leg 2
                break;
        }

        //White Eyes!!!!
        g.setColor(Color.white);
        g.fillRect(w+270+headx,h+110,10,10);
        g.fillRect(w+200+headx,h+110,10,10);

        //Rose Cheeks!!!
        g.setColor(new Color(255, 155, 155));
        g.fillRect(w+180+headx,h+130,20,20);
        g.fillRect(w+290+headx,h+130,20,20);

        //Pink Dots!!!
        g.setColor(new Color(255, 55, 155));
        g.fillRect(w+100,h+40,10,10);
        g.fillRect(w+150,h+30,10,10);
        g.fillRect(w+180,h+30,10,10);
        g.fillRect(w+220,h+50,10,10);
        g.fillRect(w+140,h+70,10,10);
        g.fillRect(w+110,h+90,10,10);
        g.fillRect(w+150,h+100,10,10);
        g.fillRect(w+90,h+110,10,10);
        g.fillRect(w+130,h+130,10,10);
        g.fillRect(w+100,h+140,10,10);

        // Black Lines :3
        g.setColor(Color.black);
        g.fillRect(w+80,h+0,170,10); //body
        g.fillRect(w+70,h+10,10,10); //body
        g.fillRect(w+60,h+20,10,140); //body
        g.fillRect(w+250,h+10,10,10); //body
        g.fillRect(w+260,h+20,10,60); //body
        g.fillRect(w+80,h+170,210+legx,10); //body + all legs
        if(frame == 0)
        {
            g.fillRect(w+40,h+170,10,30); //leg1
            g.fillRect(w+40,h+190,40,10); //leg1
            g.fillRect(w+70,h+180,20,10); //leg1
            g.fillRect(w+50,h+160,30,10); //body + leg1
            g.fillRect(w+100,h+180,10,20); //leg2
            g.fillRect(w+110,h+190,20,10); //leg2
            g.fillRect(w+130,h+180,10,10); //leg2

        }
        else if(frame == 1 || frame ==3)
        {
            g.fillRect(w+60,h+160,20,10); //body + leg1
            g.fillRect(w+50, h+170, 10, 30);//leg1
            g.fillRect(w+60, h+190, 20, 10);//leg1
            g.fillRect(w+80, h+170, 10, 20);//leg1
            g.fillRect(w+100,h+180,10,10); //leg2
            g.fillRect(w+110,h+190,20,10); //leg2
            g.fillRect(w+130,h+180,10,20); //leg2
    
        }
        else if(frame==2)
        {
            g.fillRect(w+60, h+160, 10, 40);//leg1
            g.fillRect(w+70, h+160, 10, 10);//leg1 + body
            g.fillRect(w+90, h+180, 10, 10);//leg1
            g.fillRect(w+70, h+190, 20, 10);//leg1
            g.fillRect(w+110,h+180,10,10); //leg2
            g.fillRect(w+120,h+190,20,10); //leg2
            g.fillRect(w+140,h+180,10,20); //leg2
            g.fillRect(w+270+headx+legx,h+190,10,10); //leg4
            
    
        }
        g.fillRect(w+220+headx,h+80,40,10); //head
        g.fillRect(w+210+headx,h+70,10,10); //head
        g.fillRect(w+200+headx,h+60,10,10); //head
        g.fillRect(w+180+headx,h+50,20,10); //head
        g.fillRect(w+170+headx,h+60,10,40); //head
        g.fillRect(w+160+headx,h+100,10,50); //head
        g.fillRect(w+170+headx,h+150,10,10); //head
        g.fillRect(w+180+headx,h+160,10,10); //head
        g.fillRect(w+290+headx,h+160,10,10); //head 
        g.fillRect(w+300+headx,h+150,10,10); //head
        g.fillRect(w+310+headx,h+100,10,50); //head
        g.fillRect(w+300+headx,h+60,10,40); //head
        g.fillRect(w+280+headx,h+50,20,10); //head
        g.fillRect(w+270+headx,h+60,10,10); //head
        g.fillRect(w+260+headx,h+70,10,10); //head
        g.fillRect(w+190+headx+legx,h+180,10,10); //leg3
        g.fillRect(w+200+headx+legx,h+190,30,10); //leg3
        g.fillRect(w+220+headx+legx,h+180,10,10); //leg3
        g.fillRect(w+240+headx+legx,h+180,10,10); //leg4
        g.fillRect(w+250+headx+legx,h+190,20,10); //leg4
        g.fillRect(w+270+headx+legx,h+180,10,10); //leg4
        switch (frame) {

            case 0:
                g.fillRect(w+0,h+70,10,30); //tail
                g.fillRect(w+10,h+90,10,20); //tail
                g.fillRect(w+20,h+100,10,20); //tail
                g.fillRect(w+30,h+110,10,20); //tail 
                g.fillRect(w+40,h+120,20,10); //tail
                g.fillRect(w+50,h+130,10,10); //tail
                g.fillRect(w+10,h+70,30,10); //tail
                g.fillRect(w+30,h+80,20,10); //tail
                g.fillRect(w+40,h+90,20,10); //tail
                g.fillRect(w+50,h+100,10,10); //tail
                break;
            
            case 1:
                g.fillRect(w+30,h+90,30,10); //tail
                g.fillRect(w+30,h+80,10,10); //tail
                g.fillRect(w+10,h+70,20,10); //tail
                g.fillRect(w+0,h+80,10,20); //tail
                g.fillRect(w+10,h+100,10,10); //tail
                g.fillRect(w+20,h+110,20,10); //tail
                g.fillRect(w+40,h+120,20,10); //tail
                g.fillRect(w+290,h+170,10,10); //head+leg3
                g.fillRect(w+270+headx,h+190,10,10); //leg4
                break;
                
            case 2:
                g.fillRect(w+50,h+100,10,10); //tail
                g.fillRect(w+20,h+110,40,10); //tail
                g.fillRect(w+0,h+120,20,10); //tail
                g.fillRect(w+0,h+130,10,10); //tail
                g.fillRect(w+10,h+140,40,10); //tail
                g.fillRect(w+40,h+130,20,10); //tail
                g.fillRect(w+270+headx,h+190,10,10); //leg4
                break;

            case 3:
                g.fillRect(w+40,h+110,20,10); //tail
                g.fillRect(w+20,h+120,20,10); //tail
                g.fillRect(w+10,h+130,10,10); //tail
                g.fillRect(w+0,h+140,10,20); //tail
                g.fillRect(w+10,h+160,20,10); //tail
                g.fillRect(w+30,h+150,10,10); //tail
                g.fillRect(w+30,h+140,30,10); //tail
                g.fillRect(w+270+headx,h+190,10,10); //leg4
                g.fillRect(w+280+headx,h+170,10,10); //leg4
                break;
        }
        g.fillRect(w+280+headx,h+110,10,20); //eye2
        g.fillRect(w+270+headx,h+120,10,10); //eye2
        g.fillRect(w+250+headx,h+120,10,10); //nose
        g.fillRect(w+210+headx,h+110,10,20); //eye1
        g.fillRect(w+200+headx,h+120,10,10); //eye1
        g.fillRect(w+210+headx,h+150,70,10); //mouth
        g.fillRect(w+210+headx,h+140,10,10); //mouth
        g.fillRect(w+240+headx,h+140,10,10); //mouth
        g.fillRect(w+270+headx,h+140,10,10); //mouth

       if(frame < 3) 
        {
            frame++;
            repaint();
        }
        else
        {
            frame = 0;
            repaint();
        }
        try {
            Thread.sleep(100);
            } 
           catch (InterruptedException e) {
            e.printStackTrace();
            }
            
    }
        public static void main(String[] args) {
        JFrame frame = new JFrame("MEOWWWWWW:3");
        frame.add(new main());
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}