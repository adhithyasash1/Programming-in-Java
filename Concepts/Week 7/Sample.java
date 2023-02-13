package Practice;

public class Sample{
    int show(){
        try{
            return 10;
        }
        catch (Exception e){
            return 20;
        }
        finally {
            return 100;
        }
    }
    public static void main(String[] args) {
        Sample object=new Sample();
        System.out.println(object.show());
    }
}