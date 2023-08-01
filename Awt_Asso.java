package OOPs;
import java.awt.*;

//class Awt_Association directly creates instance of Frame class

class Awt_Asso{
    //initializing using construtor

    Awt_Asso(){
        //creating frames
        Frame f = new Frame();
        //creating label
        Label l = new Label();
        //creating a Button
        Button b = new Button("Submit");

        //creating a TextField
        TextField t = new TextField();
        //setting position of above components int the frame
        l.setBounds(20,80,80,30);
        t.setBounds(20,100,80,30);
        b.setBounds(100,100,80,30);
        //adding components into frame
        f.add(b);
        f.add(l);
        f.add(t);
        //frame size 300 width and 300 height
        f.setSize(400,300);
        //setting title of frame
        f.setTitle("Employee info");
        //no layout
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        //creating instance of Frame class
        Awt_Asso awt_obj = new Awt_Asso();
    }
}
