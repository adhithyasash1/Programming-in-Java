package Week3_2;

public class Cube extends Shape{
    private int a;
    private int volume;
    //implement Cube class
    public Cube(int a) {
        this.a = a;
    }
    public int volume(){
        volume = this.a*this.a*this.a;
        return volume;
    }
}
