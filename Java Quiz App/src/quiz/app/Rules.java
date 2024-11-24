//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package quiz.app;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rules extends JFrame implements ActionListener {
    JButton start;
    JButton back;
    String name;

    Rules(String name) {
        this.name = name;
        JLabel heading = new JLabel("Welcome " + name + " to Java Quiz");
        heading.setBounds(150, 100, 700, 30);
        heading.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
        heading.setForeground(new Color(22, 99, 54));
        this.add(heading);
        JLabel rules = new JLabel();
        rules.setBounds(70, 150, 700, 350);
        rules.setFont(new Font("Comic Sans MS", 0, 20));
        rules.setForeground(new Color(22, 99, 54));
        rules.setText("<html>1. Participation in the quiz is free and open to all persons above 18 years old.<br><br>2. There are a total 10 questions. <br><br>3. You only have 30 seconds to answer the question.<br><br>4. No cell phones or other secondary devices in the room or test area.<br><br>5. No talking.<br><br>6. No one else can be in the room with you.<br><br><html>");
        this.add(rules);
        this.back = new JButton("Back");
        this.back.setBounds(300, 500, 100, 30);
        this.back.setBackground(new Color(22, 99, 54));
        this.back.setForeground(Color.blue);
        this.back.addActionListener(this);
        this.add(this.back);
        this.start = new JButton("Start");
        this.start.setBounds(450, 500, 100, 30);
        this.start.setBackground(new Color(22, 99, 54));
        this.start.setForeground(Color.green);
        this.start.addActionListener(this);
        this.add(this.start);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/back.png"));
        Image i = i1.getImage().getScaledInstance(800, 650, 1);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(0, 0, 800, 650);
        this.add(image);
        this.setSize(800, 650);
        this.setLocation(350, 100);
        this.setLayout((LayoutManager)null);
        this.setUndecorated(true);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.start) {
            this.setVisible(false);
            new Quiz(this.name);
        } else {
            this.setVisible(false);
            new Login();
        }

    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
