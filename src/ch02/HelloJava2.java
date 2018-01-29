package ch02;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloJava2 {
    public static void main( String[] args){
        JFrame frame = new JFrame("HelloJava2");
        frame.add(new HelloComponent2("Ayyy Java!")); //creates new object instance and returns it as a value
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}


class HelloComponent2 extends JComponent implements MouseMotionListener{
    String theMessage;
    int messageX = 125, messageY = 95; //coordinates of the message

    //constructor sets the text of the theMessge instance and calls a method
    public HelloComponent2(String message){
        theMessage = message; //same as this.theMessage = message;
        //pass a reference of our obj to another class so methods in other classes can use invoke our public vars/methods
        addMouseMotionListener(this);//arg is an obj implements MML()
    }

    public void paintComponent(Graphics g){
        g.drawString(theMessage, messageX, messageY);
    }

    public void mouseDragged(MouseEvent e){
        //save the mouse coordinates and paint the message
        messageX = e.getX();
        messageY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e){}
}
