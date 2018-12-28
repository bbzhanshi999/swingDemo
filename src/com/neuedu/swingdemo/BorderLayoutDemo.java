package com.neuedu.swingdemo;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Java第三个GUI程序");
        jFrame.setLayout(new BorderLayout(10,10));
        jFrame.add(new JButton("上"),BorderLayout.NORTH);
        jFrame.add(new JButton("下"),BorderLayout.SOUTH);
        jFrame.add(new JButton("左"),BorderLayout.EAST);
        jFrame.add(new JButton("右"),BorderLayout.WEST);
        jFrame.add(new JButton("中"),BorderLayout.CENTER);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setBounds(100,100,500,300);
        jFrame.setVisible(true);
    }
}
