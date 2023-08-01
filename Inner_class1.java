package OOPs;

class Outer_Demo{
    int num;
    // Inner Class

    private class Inner_Demo{
        public void Print(){
            System.out.println("This is an Inner Class.");
        }
    }

    // Accessing the Inner class from the method within

    void display_Inner(){
        Inner_Demo inner = new Inner_Demo();
        inner.Print();
    }
//    public static void main(String[] args) {
//        OOPs.Outer_Demo outer = new OOPs.Outer_Demo();              // This also works perfectly.
//        outer.display_Inner();
//    }
}
public class Inner_class1 {
    public static void main(String[] args) {
        Outer_Demo outer = new Outer_Demo();
        outer.display_Inner();
    }
}
