package com.neuedu.swingdemo;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo extends JFrame {

    public JFrameDemo() throws HeadlessException {
        this.setTitle("Java第一个GUI程序");
        this.setSize(400,200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel label = new JLabel("这是使用JFrame类创建的窗口");
        Container c = this.getContentPane();
        c.add(label);
        setVisible(true);

    }

    public static void main(String[] args) {
        new JFrameDemo();
    }
}
