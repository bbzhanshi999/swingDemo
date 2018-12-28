package com.neuedu.swingdemo;

import javax.swing.*;
import java.awt.*;

public class CardLayoutDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel cards = new JPanel(new CardLayout(20,20));
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        p1.add(new JButton("登录按钮"));
        p1.add(new JButton("注册按钮"));
        p1.add(new JButton("找回密码按钮"));
        p2.add(new JTextField("请输入用户名",20));
        p2.add(new JPasswordField("请输入密码",20));
        p2.add(new JTextField("请输入验证码",20));
        cards.add(p1,"card1");
        cards.add(p2,"card2");
        CardLayout layout = (CardLayout)cards.getLayout();
        layout.show(cards,"card2    ");
        frame.add(cards);
        frame.setBounds(300,300,500,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
