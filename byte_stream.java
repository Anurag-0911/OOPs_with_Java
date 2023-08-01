package OOPs;

import java.io.*;
public class byte_stream {
    public static void main(String[] args) throws IOException{
        FileInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new FileInputStream("C:\\Users\\anura\\IdeaProjects\\my project\\input.txt") ;
            out = new FileOutputStream("output.txt");

            int c ;
            while((c=in.read())!=-1){
                out.write(c);
            }
        }finally {
            if (in!=null){
                in.close();

            }
            if(out!=null){
                out.close();
            }
        }
    }
}
