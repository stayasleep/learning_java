package ch02;
import javax.swing.*;
import java.awt.*;

public class HelloJava {
    public static void main(String[] args){
        JFrame frame = new JFrame("Hello Stayasleep");
        //JLabel label = new JLabel("Hello, Stayasleep!", JLabel.CENTER);
        //frame.add(label);
        frame.add(new HelloComponent());
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}

class HelloComponent extends JComponent{
    public void paintComponent(Graphics g){
        g.drawString("Hello Stayasleep...!", 125,95);
    }
}