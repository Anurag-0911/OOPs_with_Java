package OOPs;

public class Local_Innerclass {
    void mymethod() {
        int num = 25;

        class Method_inner_demo {                             //creating method in java name class then
            // creating another inner class in that method
            // and accessing it into that the same method.
            public void print() {
                System.out.println("Creating Local Inner Class");
            }
        }
        Method_inner_demo inner = new Method_inner_demo();
        inner.print();
    }

    public static void main(String[] args) {
        Local_Innerclass local = new Local_Innerclass();
        local.mymethod();
    }
}
