package OOPs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener{
    TextField tf;
    int v1= 0;
    int v2 = 0;
    int flag = 0;

    Calculator(){

        tf = new TextField();
        tf.setBounds(50,50,170,30);
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button b0 = new Button("0");
        Button sum = new Button("+");
        Button sub = new Button("-");
        Button mult = new Button("x");
        Button div = new Button("/");
        Button del = new Button("Del");
        Button ac = new Button("A/C");
        Button equals = new Button("=");
        Button perct = new Button("%");

        //
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        sum.addActionListener(this);
        sub.addActionListener(this);
        mult.addActionListener(this);
        div.addActionListener(this);
        del.addActionListener(this);
        ac.addActionListener(this);
        equals.addActionListener(this);
        perct.addActionListener(this);




        ac.setBounds(50,80,40,40);
        del.setBounds(90,80,40,40);
        div.setBounds(130,80,40,40);
        mult.setBounds(170,80,40,40);
        b7.setBounds(50,120,40,40);
        b8.setBounds(90,120,40,40);
        b9.setBounds(130,120,40,40);
        sum.setBounds(170,120,40,40);
        b4.setBounds(50,160,40,40);
        b5.setBounds(90,160,40,40);
        b6.setBounds(130,160,40,40);
        sub.setBounds(170,160,40,40);
        b1.setBounds(50,200,40,40);
        b2.setBounds(90,200,40,40);
        b3.setBounds(130,200,40,40);
        perct.setBounds(170,200,40,40);
        b0.setBounds(90,240,40,40);
        equals.setBounds(130,240,40,40);

//        b1.addActionListener((ActionListener) this);

        add(tf);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b0);
        add(sum);
        add(sub);
        add(mult);
        add(div);
        add(del);
        add(ac);
        add(perct);
        add(equals);

        setSize(300,300);
        setLayout(null);
        setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand() == "1")
        {
           tf.setText(tf.getText()+"1");
        }
        if (e.getActionCommand() == "2")
        {
            tf.setText(tf.getText()+"2");
        }
        if (e.getActionCommand() == "3")
        {
            tf.setText(tf.getText()+"3");
        }
        if (e.getActionCommand() == "4")
        {
            tf.setText(tf.getText()+"4");
        }
        if (e.getActionCommand() == "5")
        {
            tf.setText(tf.getText()+"5");
        }
        if (e.getActionCommand() == "6")
        {
            tf.setText(tf.getText()+"6");
        }
        if (e.getActionCommand() == "7")
        {
            tf.setText(tf.getText()+"7");
        }
        if (e.getActionCommand() == "8")
        {
            tf.setText(tf.getText()+"8");
        }
        if (e.getActionCommand() == "9")
        {
            tf.setText(tf.getText()+"9");
        }
        if (e.getActionCommand() == "0")
        {
            tf.setText(tf.getText()+"0");
        }
        if (e.getActionCommand() == "+")
        {
            v1 = Integer.parseInt(tf.getText());
            flag = 1;
            tf.setText("");

        }
        if (e.getActionCommand() == "-")
        {
            v1 = Integer.parseInt(tf.getText());
            flag = 2;
            tf.setText("");
        }
        if (e.getActionCommand() == "x")
        {
            v1 = Integer.parseInt(tf.getText());
            flag = 3;
            tf.setText("");
        }
        if (e.getActionCommand() == "/" )
        {
            v1 = Integer.parseInt(tf.getText());
            flag = 4;
            tf.setText("");
        }
        if (e.getActionCommand() == "%" )
        {
            v1 = Integer.parseInt(tf.getText());
            flag = 5;
            tf.setText("");
        }
        if (e.getActionCommand() == "Del")
        {
            tf.setText(tf.getText()+"Del");
        }
        if (e.getActionCommand() == "A/C")
        {
            tf.setText("");
        }
        if (e.getActionCommand() == "=")
        {
            v2 = Integer.parseInt(tf.getText());

            if (flag == 1)
            {
                int res = v1+v2;
                System.out.println(res);
                tf.setText(String.valueOf(res));

            }
            else if (flag==2){
                int res = v1-v2;
                System.out.println(res);
                tf.setText(String.valueOf(res));
            }
            else if (flag == 3) {
                int res = v1*v2;
                System.out.println(res);
                tf.setText(String.valueOf(res));
            }
            else if(flag==4){
                double res = v1/v2;
                System.out.println(res);
                tf.setText(String.valueOf(res));
            }
            else if(flag==5){
                float res = v1%v2;
                System.out.println(res);
                tf.setText(String.valueOf(res));
            }
            else if (flag == 0) {
                System.out.println("flag = 0");
            }
            flag =0;
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }


}
