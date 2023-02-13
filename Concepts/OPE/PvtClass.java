package Mock2;
import java.util.Scanner;
import static java.lang.Math.abs;

class Rectangle {
    private Point cp1;
    private Point cp2;

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.cp1 = new Point(x1, y1);
        this.cp2 = new Point(x2, y2);
    }

    int getWidth() {
        return(abs(this.cp1.x - this.cp2.x));
    }

    int getHeight() {
        return(abs(this.cp1.y - this.cp2.y));
    }
    private static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

public class PvtClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        Rectangle r = new Rectangle(x1, y1, x2, y2);
        System.out.println("Area : "+r.getWidth()*r.getHeight());
        sc.close();
    }
}
