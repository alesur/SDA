import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BoxGame extends JPanel implements KeyListener, ActionListener {
    int x = 0, y = 0;
    int x1 = 0, y1 = 0;

    //  int[] sq = new int[144];
    int presentsq = 0;
    int presentsq1 = 131;
    int animation = 0;
    int anispeed = 3;
    int score = 0;
    int holder = 0;

    Timer tm = new Timer(100, this);


    public BoxGame() {

        tm.start(); //start the timer ticking
        addKeyListener(this);
        setFocusable(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.fillRect(200 - animation, 200 - animation, 149 + animation * anispeed, 149 + animation * anispeed);
        if (x > 150 && x < 350 && y > 150 && y < 350 && x1 > 150 && x1 < 350 && y1 > 150 && y1 < 350) {
            g.setColor(Color.GREEN);
            animation++;

            if (animation >= 10) {
                animation = 0;
            }

        } else if (x > 150 && x < 350 && y > 150 && y < 350) {
            g.setColor(Color.BLUE);
        } else if (x1 > 150 && x1 < 350 && y1 > 150 && y1 < 350) {

            g.setColor(Color.RED);
        } else {
            g.setColor(Color.WHITE);
        }


        g.fillRect(210 - animation, 210 - animation, 129 + animation * anispeed, 129 + animation * anispeed);
        g.setColor(Color.BLACK);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
        g.drawString("" + animation, 265, 290);
        g.setColor(Color.BLACK);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
        g.drawString("Highest score is:" + score, 170, 30);
        g.setColor(Color.BLUE);
        g.fillRect(x, y, 50, 50);
        g.setColor(Color.BLACK);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
//        g.drawString("W", x + 15, y);
//        g.drawString("S", x + 15, y+66);
//        g.drawString("A", x -15, y+33);
//        g.drawString("D", x + 50, y+33);
        g.setColor(Color.WHITE);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 40));
        g.drawString("P1", x + 0, y + 40);

        //Second Player
        g.setColor(Color.RED);
        g.fillRect(x1, y1, 50, 50);
        g.setColor(Color.WHITE);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 40));
        g.drawString("P2", x1 + 0, y1 + 40);

    }


    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // System.out.println(e.getKeyChar());

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_S) {

            presentsq = presentsq + 12;
        } else if (key == KeyEvent.VK_W) {

            presentsq = presentsq - 12;
        } else if (key == KeyEvent.VK_A) {

            presentsq = presentsq - 1;
        } else if (key == KeyEvent.VK_D) {

            presentsq = presentsq + 1;
        }
        //Second player movement
        else if (key == KeyEvent.VK_UP) {

            presentsq1 = presentsq1 - 12;
        } else if (key == KeyEvent.VK_DOWN) {

            presentsq1 = presentsq1 + 12;
        } else if (key == KeyEvent.VK_LEFT) {

            presentsq1 = presentsq1 - 1;
        } else if (key == KeyEvent.VK_RIGHT) {

            presentsq1 = presentsq1 + 1;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void actionPerformed(ActionEvent e) {
        //  System.out.println("BLUE: " + x + " | " + y);
        //  System.out.println("RED: " + x1 + " | " + y1);


        x = (presentsq % 12) * 50;
        y = ((int) (presentsq / 12)) * 50;
        x1 = (presentsq1 % 12) * 50;
        y1 = ((int) (presentsq1 / 12)) * 50;


        repaint();
    }


    public static void main(String[] args) {

        JFrame jf = new JFrame();

        BoxGame g1 = new BoxGame();
        jf.add(g1);

        jf.setTitle("My Game");
        jf.setSize(620, 600);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}