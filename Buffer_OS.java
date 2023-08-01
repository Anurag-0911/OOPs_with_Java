package OOPs;
import java.io.*;
public class Buffer_OS {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("Buffer_os_output.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Text file for Buffer Output Stream";
        byte[]b = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Success");
    }
}
