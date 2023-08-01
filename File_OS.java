package OOPs;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class File_OS {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("C:\\Users\\anura\\IdeaProjects\\my project\\input.txt");
            String s ="abcp";
//            byte b[] = s.getBytes();
            fout.write(s.getBytes());    //
            fout.close();
            System.out.println("Success....");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
