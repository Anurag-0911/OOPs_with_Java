package OOPs;

import java.util.*;
public class Vehicle {
    int tyres;                            //data member
    String engine;                        //data member
    String horn;                          //data member
    int gears;                            //data member
    float speed;                          //data member
    //method for printing values;
    void display()
    {
        System.out.println("no of tyres = "+ tyres);
        System.out.println("Engine = "+ engine);
        System.out.println("Horn = "+ horn);
        System.out.println("No of Gears = "+ gears);
        System.out.println("Speed = "+ speed);
    }
    void input_data(){                               //member practice.function
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of tyres:");
        tyres = sc.nextInt();
        System.out.println("Enter type of Engine:");
        engine = sc.next();
        System.out.println("Enter type of Horn:");
        horn = sc.next();
        System.out.println("Enter no. of Gears:");
        gears = sc.nextInt();
        System.out.println("Enter the Speed:");
        speed = sc.nextFloat();

    }


    public static void main(String[] args) {
        Vehicle luna = new Vehicle();              //object
        Vehicle car = new Vehicle();               //object
//        luna.tyres = 2;
//        luna.engine = "100 CC";
//        luna.horn = "Pee pee";
//        luna.gears = 0;
//        luna.speed=50;
//        OOPs.Vehicle Car = new OOPs.Vehicle();
//        Car.tyres=4;
//        Car.engine="1000 CC";
//        Car.horn="pow pow";
//        Car.gears=6;
//        Car.speed=200;
//        System.out.println("Features of Luna bike are:");
//        luna.display();
//        System.out.println("Features of Car are:");
//        Car.display();
        System.out.println("Enter the features of luna:");
        luna.input_data();
        luna.display();
        System.out.println("Enter the features of car:");
        car.input_data();
        car.display();
    }
}
