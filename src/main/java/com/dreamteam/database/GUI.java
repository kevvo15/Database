package com.dreamteam.database;

import javax.swing.*;
import java.awt.*;

public class GUI {

    public GUI() {

        //Create window frame
        JFrame frame = new JFrame();

        //Create label and button components
        JLabel label = new JLabel("What operation would you like to perform?");
        JButton create = new JButton("CREATE");
        JButton read = new JButton("READ");
        JButton update = new JButton("UPDATE");
        JButton delete = new JButton("DELETE");
        JButton process = new JButton("PROCESS ORDERS");
        JButton reports = new JButton("REPORTS");
        JButton quit = new JButton("QUIT");

        //Create panel and configure size
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(150,300,100,300));
        panel.setLayout(new GridLayout(0,1));

        //Add components to panel
        panel.add(label);
        panel.add(create);
        panel.add(read);
        panel.add(update);
        panel.add(delete);
        panel.add(process);
        panel.add(reports);
        panel.add(quit);

        //Attach panel to frame
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("DREAMTEAM DATABASES");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {

        new GUI();

    }

}
