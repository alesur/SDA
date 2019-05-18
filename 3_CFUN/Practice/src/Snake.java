import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Snake extends JPanel implements KeyListener, ActionListener {
    int x = 0, y = 0;
    int x1 = 0, y1 = 0;

    int[] sq = new int[144];
    int presentsq=0;
    int presentsq1=0;

    Timer tm = new Timer(100, this);



    public Snake() {

        tm.start(); //start the timer ticking
        addKeyListener(this);
        setFocusable(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.fillRect(x, y, 50, 50);
        g.drawString("P1", x, y);

        g.setColor(Color.RED);
        g.fillRect(x1, y1, 50, 50);
        g.setColor(Color.BLACK);
        g.drawString("P2", x1, y1);



    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
       // System.out.println(e.getKeyChar());

        int key = e.getKeyCode();

        if(key == KeyEvent.VK_S){

            presentsq = presentsq + 12;
        }
        else if (key == KeyEvent.VK_W){

            presentsq = presentsq - 12;
        }
        else if (key == KeyEvent.VK_A){

            presentsq = presentsq - 1;
        }
        else if (key == KeyEvent.VK_D){

            presentsq = presentsq + 1;
        }
        //Second player movement
        else if (key == KeyEvent.VK_UP){

            presentsq1 = presentsq1 - 12;
        }
        else if (key == KeyEvent.VK_DOWN){

            presentsq1 = presentsq1 + 12;
        }
        else if (key == KeyEvent.VK_LEFT){

            presentsq1 = presentsq1 - 1;
        }
        else if (key == KeyEvent.VK_RIGHT){

            presentsq1 = presentsq1 + 1;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void actionPerformed(ActionEvent e) {
      //  System.out.println("BLUE: " + x + " | " + y);
      //  System.out.println("RED: " + x1 + " | " + y1);



        x= (presentsq % 12)*50;
        y= ( (int)(presentsq / 12) ) *50;
        x1= (presentsq1 % 12)*50;
        y1= ( (int)(presentsq1 / 12) ) *50;

        repaint();
    }


    public static void main(String[] args) {

        JFrame jf = new JFrame();

        Snake g1 = new Snake();
        jf.add(g1);

        jf.setTitle("My Game");
        jf.setSize(600, 600);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}