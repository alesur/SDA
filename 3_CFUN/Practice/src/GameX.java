import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

public class GameX extends JPanel implements ActionListener{
        int x = 0, y = 0, moveBy = 1;

        Timer tm = new Timer(100, this);


public GameX() {

        tm.start(); //start the timer ticking
        }

public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.fillRect(x+50, y+50, 50, 50);



        }

public void actionPerformed(ActionEvent e) {

        if (x <= 0) {
        x = 0;
        moveBy = 25;
        }

        if (x >= 500) {
        x = 500;
        moveBy = -25;
        }

        if (y <= 0) {
        //dir = 'd';
        y = 0;
        }

        if (y >= 500) {
        //dir = 'u';
        y = 300;
        }

        x = x + moveBy;
        y = x + moveBy;
        repaint();
        }


public static void main(String[] args) {

        JFrame jf = new JFrame();

        GameX g1 = new GameX();
        jf.add(g1);

        jf.setTitle("My Game");
        jf.setSize(600, 600);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

}