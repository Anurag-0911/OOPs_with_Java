package OOPs;//class Employee{
//    private int id;
//    private String name;
//    void setId(int ID){
//        this.id=ID;
//    }
//    void setName(String NAME){
//        this.name=NAME;
//    }
//    int getId(){
//        return id;
//    }
//    String getName(){
//        return name;
//    }
//}
//public class OOPs.private_use {
//    public static void main(String[] args) {
//        Employee E1 = new Employee();
//        E1.setId(25);
//        E1.setName("Anurag");
//        System.out.println(E1.getId());
//        System.out.println(E1.getName());
//    }
//}




class Circle{
    private int radius;
    private int area;
    private int perimeter;
    void setRadius(int r){
        radius=r;
    }
    void setArea(int a){
        area=a;
    }
    void setPerimeter(int p){
        perimeter=p;
    }
    int getRadius(){
        return radius;
    }
    int getArea(){
        return area;
    }
    int getPerimeter(){
        return perimeter;
    }

}
public class private_use{
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.setRadius(5);
        c1.setArea(70);
        c1.setPerimeter(31);
        System.out.println("Radius = "+c1.getRadius());
        System.out.println("Area = "+c1.getArea());
        System.out.println("Perimeter = "+c1.getPerimeter());
//        double AREA=((3.14*c1.getRadius()*c1.getRadius()));
//        System.out.println(AREA);
//        double PERI=(2*3.14*c1.getRadius());                                  // Just for checking the values
//        System.out.println(PERI);
        if (c1.getArea() != (int)(Math.PI*c1.getRadius()*c1.getRadius())){
            System.out.println("Area is incorrect");
        }
        else
            System.out.println("Area is Correct");
        if (c1.getPerimeter() != (int)(2*Math.PI*c1.getRadius())){
            System.out.println("Perimeter is incorrect");
        }
        else
            System.out.println("Perimeter is Correct");
    }
}
