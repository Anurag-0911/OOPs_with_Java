package OOPs;

import java.util.Scanner;
public class swap {
    public static void main(String args[]){
        System.out.println("Enter first number:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("That is after swapping,we have "+ num1 + " as first number and " + num2 + " as second number.");
    }
}
