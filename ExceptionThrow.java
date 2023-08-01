package OOPs;

public class ExceptionThrow {
    static int divideByZero(int a, int b) {
        int i = a / b;
        return i;
    }

    static int computeDivision(int a, int b) {
        int res = 0;
        try {
            res = divideByZero(a, b);
        } catch (NumberFormatException ex) {
            System.out.println("NumberFormatException is occured");
        }
        return res;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            int i = computeDivision(a, b);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

//    public static class Inner_class_local {
//        void mymethod(){
//            int num = 23;
//
//            // Method local Inner class
//
//            class Method_Inner_Demo{
//                public void Print(){
//                    System.out.println("This is method Inner Class "+ num);
//                }
//            }
//            //  End of Inner Class
//
//            //Accessing the Inner class
//
//            Method_Inner_Demo inner = new Method_Inner_Demo();
//            inner.Print();
//        }
//        public static void main(String[] args) {
//            Inner_class_local outer = new Inner_class_local();
//            outer.mymethod();
//        }
//    }
//}
