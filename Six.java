package OOPs;

public class Six {
    public static void main(String[] args) {
        int num = 6;
        for(int i = 1;i <= 33 ; i++){
            int product = num*i;
            if(product%4 != 0){
                System.out.println(product);
            }
        }
    }
}
