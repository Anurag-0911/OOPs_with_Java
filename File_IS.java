package OOPs;
import java.io.FileInputStream;
public class File_IS {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("C:\\Users\\anura\\IdeaProjects\\my project\\input.txt");
        int j=1;
        try {
            while( j<4){
                int i = fin.read();
                System.out.print((char)i);
            j++;
            }


        }catch (Exception e){
            System.out.println(e);
            fin.close();
        }
    }
}
