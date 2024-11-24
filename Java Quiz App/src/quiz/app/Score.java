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

public class Score extends JFrame {
    Score(String name, int score) {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 150, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(60, 200, 200, 150);
        this.add(image);
        JLabel heading = new JLabel("Thank you " + name + " for Playing Java Quiz ");
        heading.setBounds(100, 80, 700, 30);
        heading.setFont(new Font("Tahoma", 1, 26));
        this.add(heading);
        JLabel Score = new JLabel("Your Score is " + score);
        Score.setBounds(350, 200, 300, 30);
        Score.setFont(new Font("Tahoma", 1, 26));
        this.add(Score);
        JButton exit = new JButton("Play Again");
        exit.setBounds(380, 270, 120, 30);
        exit.setBackground(new Color(22, 99, 54));
        exit.setForeground(Color.black);
        this.add(exit);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Score.this.setVisible(false);
                new Login();
            }
        });
        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/back.png"));
        Image i22 = i11.getImage().getScaledInstance(750, 550, 1);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel imagee = new JLabel(i33);
        imagee.setBounds(0, 0, 750, 550);
        this.add(imagee);
        this.setSize(750, 550);
        this.setLocation(400, 150);
        this.setLayout((LayoutManager)null);
        this.setUndecorated(true);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
