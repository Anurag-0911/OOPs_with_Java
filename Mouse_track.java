package OOPs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Mouse_track extends Frame{
    TextField tf;
    Mouse_track(){
        tf = new TextField();
        tf.setBounds(100,120,80,30);
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tf.setText("Mouse Clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                tf.setText("Mouse Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("5");
                tf.setText("Mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                tf.setText("Mouse Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                tf.setText("Mouse Exited");
            }
        });
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Mouse_track();
    }
}

