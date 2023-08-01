package OOPs;  //java event handling by outer class
import java.awt.*;
import java.awt.event.*;
class A_Event2 extends Frame {
    TextField tf;
    A_Event2(){
        //create components
        tf=new TextField();
        tf.setBounds(60,50,170,30);
        Button b = new Button("Click Me");
        b.setBounds(100,120,80,30);
        //register listner
        Outer_1 o = new Outer_1(this);
        b.addActionListener(o);//passing outer class instance
        //add components and set size,layout and visibility
        add(b);add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new A_Event2();
    }
}
