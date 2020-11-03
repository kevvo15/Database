package com.dreamteam.database;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JLabel label;

    public GUI() {

        //Create window frame
        frame = new JFrame();

        //Create label and button components
        label = new JLabel("What operation would you like to perform?");
        JButton create = new JButton("CREATE");
        JButton read = new JButton("READ");
        JButton update = new JButton("UPDATE");
        JButton delete = new JButton("DELETE");
        JButton process = new JButton("PROCESS ORDERS");
        JButton reports = new JButton("REPORTS");
        JButton quit = new JButton("QUIT");

        //Action Events for buttons
        create.addActionListener(this::actionPerformed);
        read.addActionListener(this::actionPerformed);
        update.addActionListener(this::actionPerformed);
        delete.addActionListener(this::actionPerformed);
        process.addActionListener(this::actionPerformed);
        reports.addActionListener(this::actionPerformed);
        quit.addActionListener(this::actionPerformed);

        //Create panel and configure size
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(125,300,100,300));
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand() == "CREATE"){
            label.setText("create clicked");
        }
        else if (e.getActionCommand() == "READ"){
            label.setText("read clicked");
        }
        else if (e.getActionCommand() == "UPDATE"){
            label.setText("update clicked");
        }
        else if (e.getActionCommand() == "DELETE"){
            label.setText("delete clicked");
        }
        else if (e.getActionCommand() == "PROCESS ORDERS"){
            label.setText("process clicked");
        }
        else if (e.getActionCommand() == "REPORTS"){
            label.setText("reports clicked");
        }
        else if (e.getActionCommand() == "QUIT"){
            System.exit(0);
        }
    }

    public static void main(String[] args) {

        new GUI();

    }

}
