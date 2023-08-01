package OOPs;
import java.io.*;
public class Read_Console {
    public static void main(String[] args) throws IOException {
        InputStreamReader cin = null;

        FileOutputStream cout = null;
        char c;

        try{
            cin = new InputStreamReader(System.in);

            cout = new FileOutputStream("output_2.txt");


            System.out.println("Enter characters,'q' to quit");

            do {
                c = (char)cin.read();
                cout.write((char)c);
                System.out.print(c);
                cout.flush();
            }while (c != 'q');
        }finally {
            if(cin != null){
                c = (char)cin.read();
                System.out.print(c);
                cin.close();

            }
            if(cout != null){
                cout.close();
            }
        }
    }
}
