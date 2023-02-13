package Activity;

import java.io.*;
class Example1 implements Serializable{
    transient String str;
    int x;
    Example1(String str, int x){
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
class Transient {
    public static void main(String[] args) throws Exception{
        new ObjectOutputStream(new FileOutputStream("File.ser")).
                writeObject(new Example1("Moon",1));
        FileInputStream fis=new FileInputStream("File.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Example1 e=(Example1)ois.readObject();
        System.out.print(e.getStr()+"\n"+e.getX());
    }
}