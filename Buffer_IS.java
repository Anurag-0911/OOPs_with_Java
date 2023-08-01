package OOPs;
import java.io.*;

public class Buffer_IS {
    public static void main(String[] args) throws Exception{
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\anura\\IdeaProjects\\my project\\input.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while ((i = bin.read()) != -1)
            {
                System.out.print((char) i);
            }
            bin.close();
            fin.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
