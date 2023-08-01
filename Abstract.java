package OOPs;

abstract class Fruit{
    String taste;
    String season;
    abstract void setseason(String s);
    abstract void settaste(String t);
    abstract void getseason();
    abstract void gettaste();
}
class subFruit extends Fruit{
    public void setseason(String s){
        season=s;
    }
    public void settaste(String t){
        taste=t;
    }
    public void getseason(){
        System.out.println("Winter season");
    }
    public void gettaste(){
        System.out.println("Sweet");
    }
}
public class Abstract {
    public static void main(String[] args) {
        subFruit Apple = new subFruit();
        Apple.getseason();
        Apple.gettaste();
    }
}