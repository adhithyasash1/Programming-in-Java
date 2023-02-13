import java.util.*;

class Point {
    
    private int x, y;
 
    // Constructor
    public Point(int a, int b){
        this.x = a;
        this.y = b;
    }

    // override the toString() and equals() methods
    
    public boolean equals(Object obj){
        if(obj instanceof Point){
            Point p = (Point) obj;
            return (this.x==p.x && this.y==p.y);
        }
        return false;
    }
    
    public String toString(){
        return "("+this.x+", "+this.y+")";
    }
}

class FClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
	    
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
		
        if(p1.equals(p2))
            System.out.println(p1 + "==" + p2);
        else
            System.out.println(p1 + "!=" + p2);
    }
}