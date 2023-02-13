import java.util.*;

class Shape{
    public int area() {
        return 0;
    }
    public int volume() {
        return 0;
    }
}

class Rectangle extends Shape{
    private int w, h;
    private int area;
    
    public Rectangle(int w, int h) {
        this.w = w;
        this.h = h;
    }
    public int area(){
        area = this.w*this.h;
        return area;
    }
}

class Cube extends Shape{
    private int a;
    private int volume;

    public Cube(int a) {
        this.a = a;
    }
    public int volume(){
        volume = this.a*this.a*this.a;
        return volume;
    }
}

class FClass{
    private static void caller(Shape s) {
        if (s instanceof Rectangle) {
            System.out.println(s.area());
        }
        if (s instanceof Cube) {
            System.out.println(s.volume());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int a = sc.nextInt();
        caller(new Rectangle(w, h));
        caller(new Cube(a));
    }
}