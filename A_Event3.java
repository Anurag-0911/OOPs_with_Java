package OOPs;//Java event handling by anonymous class
import java.awt.*;
import java.awt.event.*;
class A_Event3 extends Frame {
    TextField tf;
    A_Event3(){
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button b = new Button("Click Me");
        b.setBounds(50,120,80,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Hello");
            }
        });
        add(b);add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new A_Event3();
    }
}
