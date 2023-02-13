package Activity;
import java.io.*;

class Example2 implements Serializable{
    transient static String str;
    int x;
    Example2(String str, int x){
        this.str = str;
        this.x = x;
    }
    public String getStr(){
        return str;
    }
    public int getX(){
        return x;
    }
}

class TransientStatic {
    public static void main(String[] args) throws Exception{
        new ObjectOutputStream(new FileOutputStream("File.ser")).
                writeObject(new Example2("Moon",1));
        FileInputStream fis=new FileInputStream("File.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Example2 e=(Example2)ois.readObject();
        System.out.print(e.getStr()+"\n"+e.getX());
    }
}
