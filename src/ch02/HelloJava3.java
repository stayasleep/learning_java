package ch02;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class HelloJava3 {
    public static void main(String[] args){
        JFrame frame = new JFrame("This is HelloJava3");
        frame.add( new HelloComponent3("Hello Java, am back!"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);
    }
}

class HelloComponent3 extends JComponent implements MouseMotionListener, ActionListener {

    String theMessage;
    int messageX=125, messageY=95; //msg coords
    JButton theButton;//var of type JButton holds instance of javax.swing.JButton class

    int colorIndex;//current index into someColors
    static Color[] someColors = {Color.black, Color.red, Color.green, Color.blue, Color.magenta};

    //constructor
    public HelloComponent3(String message){
        theMessage = message;
        theButton = new JButton("Change Color");
        setLayout(new FlowLayout());//tells parent how it should arrange comps that are added to it for display
        add( theButton );//adds to our display
        theButton.addActionListener( this );//registering as a listener with a diff obj-the btn- whereas before we were asking for our own events
        addMouseMotionListener( this );
    }

    public void paintComponent(Graphics g){
        g.drawString(theMessage, messageX, messageY);
    }

    public void mouseDragged( MouseEvent e ){
        messageX= e.getX();
        messageY=e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e){}

    //JButton clicks emit an ActionEvent, for which JComponent is listening for now in the constructor
    public void actionPerformed(ActionEvent e){
        //was btn clicked the same as btn we instantiated to allow color changes, or was it a diff btn altogether
        if (e.getSource() == theButton){
            changeColor();
        }
    }

    synchronized private void changeColor(){
        //change the index to the next color
        if (++colorIndex == someColors.length){
            colorIndex = 0;
        }
        setForeground( currentColor());//uses the new color
        repaint();
    }

    synchronized private Color currentColor(){
        return someColors[colorIndex];
    }
}
