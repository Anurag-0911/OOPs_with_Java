package OOPs;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Outer_1 implements ActionListener {
    A_Event2 obj;

    Outer_1(A_Event2 obj) {
        this.obj = obj;

    }



    public void actionPerformed(ActionEvent e) {
        obj.tf.setText("Welcome");
    }
}