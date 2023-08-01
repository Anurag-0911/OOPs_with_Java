package OOPs;

import java.util.Scanner;

public class bubble_object {
    int size,arr[];
    public void input(){
        System.out.println("Enter the no. of elements in the array:");
        Scanner sc = new Scanner(System.in);
        size = sc.nextByte();
        System.out.println("Enter the value in array:");
        arr = new int[size];
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
    }
    void sort(){
        for (int i=0;i<size;i++){
            for (int j=0;j<size-i-1;j++){
                if (arr[j]>arr[j+1] && (j+1)<size){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    void print_arr(){
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        bubble_object array = new bubble_object();
        array.input();
        array.print_arr();
        array.sort();
        array.print_arr();
    }
}