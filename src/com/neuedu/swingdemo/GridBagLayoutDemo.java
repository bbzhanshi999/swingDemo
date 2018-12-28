package com.neuedu.swingdemo;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("拨号盘");
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        frame.setLayout(layout);
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 0.0;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        JTextField tf = new JTextField("1361234567");
        layout.setConstraints(tf,constraints);
        frame.add(tf);
        constraints.weightx = 0.5;
        constraints.weighty = 0.2;
        constraints.gridwidth = 2;

        makeButton("7",frame, layout, constraints);
        makeButton("8",frame, layout, constraints);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        makeButton("9",frame, layout, constraints);
        constraints.gridwidth = 1;
        makeButton("4",frame, layout, constraints);
        makeButton("5",frame, layout, constraints);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        makeButton("6",frame, layout, constraints);

        constraints.gridwidth = 1;
        makeButton("1",frame, layout, constraints);
        makeButton("2",frame, layout, constraints);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        makeButton("3",frame, layout, constraints);

        constraints.gridwidth = 2;
        makeButton("返回",frame,layout,constraints);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        makeButton("拨号",frame,layout,constraints);


        frame.setBounds(400,400,400,400);
        frame.setVisible(true);
    }

    private static void makeButton(String title,JFrame frame, GridBagLayout layout, GridBagConstraints constraints) {
        JButton jButton = new JButton(title);
        layout.setConstraints(jButton,constraints);
        frame.add(jButton);
    }
}
