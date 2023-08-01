package OOPs;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class A_Event extends Frame implements ActionListener{
    TextField tf;
    A_Event(){
        //create components
        Frame f = new Frame();
        tf= new TextField();
        tf.setBounds(60,50,170,20);
        Button b = new Button("Click Me");
        b.setBounds(100,120,80,30);
        //register listner
        b.addActionListener(this); //passing current instance
        //add components and set size,layout and visibility
        f.add(b);f.add(tf);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("Welcome");
    }

    public static void main(String[] args) {
        new A_Event();
    }


}
