package Activity;
import java.io.*;

public class SampleCode {
    public static void main(String[] args) {
        try {
            var in=new FileInputStream("E:\\Files\\tree.txt");
            var din=new DataInputStream(in);
            int bytesAvailable = in.available();
            if (bytesAvailable > 0){
                var data = new byte[bytesAvailable];
                din.read(data, 1, 10);//Line 1
                String hi=new String(data);//Line 2
                System.out.println(hi);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
