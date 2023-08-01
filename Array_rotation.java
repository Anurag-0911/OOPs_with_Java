package OOPs;

import java.util.Scanner;

public class Array_rotation {
    int size,arr[],rot;
    public void input(){
        System.out.println("Enter the no. of elements in the array:");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        System.out.println("Enter the value in array:");
        arr = new int[size];
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter how many rotation you want:");
        rot = sc.nextInt();
    }
    void print_arr(){
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void rotation(){
        for (int i=0;i<rot;i++){
            int temp = arr[0];
            for (int j=1;j<size;j++){
                arr[j-1]=arr[j];
            }
            arr[size-1]=temp;
        }
    }
    public static void main(String[] args) {
        Array_rotation Arr=new Array_rotation();
        Arr.input();
        Arr.print_arr();
        Arr.rotation();
        Arr.print_arr();
    }
}