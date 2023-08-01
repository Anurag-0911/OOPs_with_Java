package OOPs;

abstract class AnonymousInner{
    public abstract void mymethod();
}
public class Inner_Anonymous {
    public static void main(String[] args) {
    AnonymousInner inner = new AnonymousInner() {
        @Override
        public void mymethod() {
            System.out.println("This is an example of Anonymous Inner Class");
        }
    };
    inner.mymethod();
    }
}
