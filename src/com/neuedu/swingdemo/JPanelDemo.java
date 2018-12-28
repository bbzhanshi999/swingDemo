package com.neuedu.swingdemo;

import javax.swing.*;

public class JPanelDemo {

    public static void main(String[] args) {
        JFrame jf = new JFrame("这是第二个GUI程序");
        jf.setBounds(500,300,500,300);
        JPanel jp = new JPanel();
        JLabel jLabel = new JLabel("这是一个JPanel例子");
        jp.add(jLabel);
        jf.add(jp);
        jf.setVisible(true);
    }
}
