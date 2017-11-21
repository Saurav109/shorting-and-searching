package com.company;

import javax.swing.*;
import java.awt.*;

public class frame extends JPanel implements Runnable{
    Font f;
    int x[]=new int[10];
    int key;
    int a=0;
    Thread t;
    int i;

    frame(int[]y ){
        x=y;
        t=new  Thread(this);
        t.start();

    }
    public void paint(Graphics g){
        super.paint(g);
        f=g.getFont().deriveFont(50f);
        g.setFont(f);
        g.setColor(Color.BLACK);
        for(i=0;i<x.length;i++) {
            if (i == a + 1) {
                g.setColor(Color.red);
            } else {
                g.setColor(Color.BLACK);
            }
            g.fillRect(20* i , 70 + 100, 20, 30*x[i]);
            // g.drawString(x[i]+"",50*i+40,70+100);}
            g.setColor(Color.BLACK);
            //  g.drawString("Key ="+key,250,220);
            //  for(int i=0;i<x.length-1;i++)
            //    super.getGraphics().drawString(x[i]+"",10,10*i);
        }

    }


    @Override
    public void run() {
        for(int i=0;i<x.length;i++){
            key=x[i];
            a=i-1;
            while(a>=0 && key<x[a]){
                x[a+1]=x[a];
                a--;
                repaint();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            x[a+1]=key;
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
