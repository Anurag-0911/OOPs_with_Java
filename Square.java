package OOPs;

public class Square {
    int side;

    Square(int s)
    {
        side = s;
    }

    int area() {
        // System.out.println("Area = "+side*side);
        return side * side;
    }

    void pattern() {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++){
                if (i == 0 || j == 0 || i == side - 1 || j == side - 1) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // System.out.println("Enter the side of square:"); Q1
        // Scanner sc = new Scanner(System.in);
        // int s = sc.nextInt();
        // OOPs.Square s1 = new OOPs.Square(s);
        // s1.area();
        int tot_area = 0;
        for (int i = 0; i < 10; i++) {
            double sd = Math.random();
            int s = (int) (sd * 10);
            Square sq = new Square(s);
            System.out.println("Side = " + sq.side);
            System.out.println("Area = " + sq.area());
            System.out.println("And Pattern is:");
            tot_area += sq.area();
            sq.pattern();
        }
        System.out.println("Sum of Area of all the   uare is " + tot_area);
    }
}

