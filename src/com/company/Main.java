package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int x[]=new int [11];
        x= new int[]{7,4,9,4,7,1,3,7,4,9,1,3,9,1,3,9,4,7,1,3,7,4,9,1,3,9,4,7,4,7,1,3,7,4,9,1,3,9,3,};

        frame d=new frame(x);
	// write your code here
        JFrame f=new JFrame("Shorting And Searching ");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(500,700,900,500);
        f.add(d);
        f.setVisible(true);
       // d.marge();
    }
}
