package OOPs;

public class Multiple_catch {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[0]=a[5]/0;
        }
        catch (ArithmeticException ex){
            System.out.println("Arithmetic Exception Occured");
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Array Index Out of Bound Exception Occured");
        }
        catch (Exception ex){
            System.out.println("Exception Occured");
        }
        System.out.println("Rest of the code");
    }
}
