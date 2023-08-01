package OOPs;

class My_employee{
    private int id;
    private String name;
    void setId(int ID){
        this.id=ID;
    }
    void setName(String NAME){
        this.name=NAME;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    public My_employee(){
        id=1;
        name="Anurag";
    }
    public My_employee(int myid,String myname){
        id=myid;
        name=myname;
    }
}
public class constructors {
    public static void main(String[] args) {
        My_employee E1 = new My_employee();
        My_employee E2 = new My_employee(2,"Karan");
        System.out.println(E1.getId());
        System.out.println(E1.getName());
        System.out.println(E2.getId());
        System.out.println(E2.getName());
    }
}
