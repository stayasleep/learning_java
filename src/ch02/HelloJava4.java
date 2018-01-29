package ch02;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloJava4 {

    public static void main(String[] args){
        JFrame frame = new JFrame("Back At It Again Part4");
        frame.add( new HelloComponent4("Hello Stayasleep - 4"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
        frame.setVisible(true);
    }
}

class HelloComponent4 extends JComponent implements MouseMotionListener, ActionListener, Runnable{
    String theMessage;
    int messageX = 125, messageY= 95;
    JButton theButton;
    int colorIndex;//index for someColors
    static Color[] someColors = {Color.black, Color.red, Color.green, Color.blue, Color.magenta};
    boolean blinkState;

    public HelloComponent4(String message){
        theMessage = message;
        theButton = new JButtton("Change Color");
        setLayout(new FlowLayout());
        add(theButton);
        theButton.addActionListener(this);
        addMouseMotionListener(this);
        Thread t=new Thread(this);
        t.start();
    }
}