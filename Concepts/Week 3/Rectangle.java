package Week3_2;

public class Rectangle extends Shape{
    private int w, h;
    private int area;
    //implement Rectangle class
    public Rectangle(int w, int h) {
        this.w = w;
        this.h = h;
    }
    public int area(){
        area = this.w*this.h;
        return area;
    }
}
