package com.neuedu.swingdemo;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java第四个GUI程序");
        frame.setBounds(300,300,500,300);
        frame.setLayout(new FlowLayout(FlowLayout.LEADING,10,10));
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("10"));
        frame.add(new JButton("11"));
        frame.add(new JButton("12"));

        frame.setBackground(Color.gray);
        frame.setVisible(true);
    }
}
