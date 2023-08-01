package OOPs;

public class TestThrows {
    public static int DivideNum(int m,int n) throws ArithmeticException{
        int div=m/n;
        return div;
    }

    public static void main(String[] args) {
        TestThrows obj = new TestThrows();
        try {
            System.out.println(obj.DivideNum(45,0));
        }
        catch (ArithmeticException ex){
            System.out.println("\nNumber cannot be divisible by zero");
        }
        System.out.println("Rest of the code");
    }
}
