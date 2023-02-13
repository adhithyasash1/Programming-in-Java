package Cloning;

class Sample implements Cloneable{
    int x;
    int y;
    Sample(int a,int b){
        this.x=a;
        this.y=b;
    }
    public String toString(){
        return ""+x+y;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class GClass{
    public static void main(String[] args) throws Exception{
        Sample obj=new Sample(0,1);
        Sample obj2=(Sample)obj.clone();
        obj2.x=2;
        System.out.println(obj);
        System.out.println(obj2);
    }
}