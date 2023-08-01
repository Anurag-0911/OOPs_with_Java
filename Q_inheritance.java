package OOPs;

class Person{
    private String name;
    Person(String aName){
        name=aName;
    }
    public String getName(){
        return name;
    }
}
class Employee extends Person{
    private float basic_salary;
    private String employee_number;
    Employee(String aName,String aEmployee_number,float aBasic_salary) {
        super(aName);
        employee_number=aEmployee_number;
        basic_salary=aBasic_salary;
    }
    public String getEmployee_number(){
        return employee_number;
    }
    public float getBasicSalary(){
        return basic_salary;
    }

}
public class Q_inheritance {
    public static void main(String[] args) {
        Manager m = new Manager("Simon","1234M", 9000.0F, 2000.0F);
        Secretary s = new Secretary("Selena","2468P",2500.0F);
        System.out.println("The Manager "+m.getName()+"(Employee number "+m.getEmployee_number()+")");
        System.out.println("has the salary of "+m.getBasicSalary());
        System.out.println("The Secretary "+s.getName()+"(Employee number "+s.getEmployee_number()+")");
        System.out.println("has the salary of "+s.getBasicSalary());
        System.out.println("The Manager "+m.getName()+" also has an Allownace of "+m.getAllowance());
    }
}
class Manager extends Employee{
    private float allowance;
    Manager(String aName, String aEmployee_number, float aBasic_salary,float aAllownaceAmt) {
        super(aName, aEmployee_number, aBasic_salary);
        allowance=aAllownaceAmt;
    }
    public float getAllowance(){
        return allowance;
    }
}
class Secretary extends Employee{

    Secretary(String aName, String aEmployee_number, float aBasic_salary) {
        super(aName, aEmployee_number, aBasic_salary);
    }
}