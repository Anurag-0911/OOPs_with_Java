package OOPs;

abstract class Abs{
    abstract void t1();
    public void t2(){
        System.out.println("t2 method of abstract class");
    }
}
interface I{
    public void m1();
    public void m2();
    public void m3();
}
interface J{
    public void m4();
    public void m5();
    public void m6();
}
class C extends Abs implements I,J{
    public void t1(){
        System.out.println("t1 from child class");
    }
    public void m1(){
        System.out.println("method m1");
    }
    public void m2(){
        System.out.println("method m2");
    }
    public void m3(){
        System.out.println("method m3");
    }
    public void m4(){
        System.out.println("method m4");
    }
    public void m5(){
        System.out.println("method m5");
    }
    public void m6(){
        System.out.println("method m6");
    }
}
public class Interface {
    public static void main(String[] args) {
        C obj = new C();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
        obj.m5();
        obj.m6();
        obj.t2();
        obj.t1();
    }
}

