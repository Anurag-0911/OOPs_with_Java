package OOPs;

public class Square2{
    int side;
    private static int tot_area = 0;
    Square2(int s){
        side = s;
    }
    int area(){
        return side*side;
    }
    void ascii(){
        for(int i=0;i<side;i++){
            for(int j=0;j<side;j++){
                if(i==0||j==0||i==side-1||j==side-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            double length = Math.random();
            int len = (int) (length * 10);
            Square2 l = new Square2(len);
            System.out.println("Side = " + l.side);
            l.area();
            tot_area+=l.area();
            System.out.println("Area = " + l.area()); 
            l.ascii();
        }
        System.out.println("Total area = "+tot_area);
    }
}