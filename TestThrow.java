package OOPs;

public class TestThrow {
    public static void checkNum(int num) {
        int [] a = new int[5];
        a[5]=0;
        if(num<1){
            throw new ArithmeticException("\nNumber is negative,cannot calculate square");
        }
        else{
              throw new ArrayIndexOutOfBoundsException("Array out of bound") ;
//            System.out.println("Square of "+num+" is"+(num*num));

        }
    }

    public static void main(String[] args) {
        try{
            TestThrow obj = new TestThrow();
            obj.checkNum(-3);
        }
        catch (java.lang.Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Rest of the code");
    }
}
