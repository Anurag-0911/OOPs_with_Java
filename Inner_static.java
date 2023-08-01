package OOPs;

public class Inner_static {
    static class Nested_demo{
        public void mymethod(){
            System.out.println("Static Nested class");
        }
    }

    public static void main(String[] args) {
        Inner_static.Nested_demo inner = new Inner_static.Nested_demo();
        inner.mymethod();
    }
}
