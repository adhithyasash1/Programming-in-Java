package Wildcards;
import java.util.*;

class Pair<T extends Number> {
    T x;
    T y;

    public Pair(T x1, T y1) {
        x = x1;
        y = y1;
    }

    public T getX() {
        return this.x;
    }

    public T getY() {
        return this.y;
    }

    public void setX(T x2) {
        this.x = x2;
    }

    public void setY(T y2) {
        this.y = y2;
    }

    public void display() {
        System.out.println(this.x + " " + this.y);
    }

    public Pair<? extends Number> addPair(Pair<? extends Number> p) {
        Pair<?> point = new Pair<>((this.getX().doubleValue() + p.getX().doubleValue()),
                this.getY().doubleValue() + p.getY().doubleValue());
        return point;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pair<Double> p1 = new Pair<>(sc.nextDouble(), sc.nextDouble());
        Pair<Double> p2 = new Pair<>(sc.nextDouble(), sc.nextDouble());
        Pair<Integer> p3 = new Pair<>(sc.nextInt(), sc.nextInt());
        Pair<?> p4 = p1.addPair(p2);
        p4.display();
        Pair<?> p5 = p1.addPair(p3);
        p5.display();
    }
}
