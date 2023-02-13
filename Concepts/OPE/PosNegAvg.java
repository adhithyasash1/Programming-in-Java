package Mock9;
import java.util.*;

public class PosNegAvg {
    double posAvg=0, negAvg=0;
    double posCount=0, negCount=0;

    public void avg(int[] arr) {
        //write your code here
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negCount++;
                neg += Math.abs(arr[i]);
            } else if (arr[i] > 0) {
                posCount++;
                pos += Math.abs(arr[i]);
            }
        }
        posAvg = pos / posCount;
        negAvg = -1*(neg / negCount);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        PosNegAvg obj=new PosNegAvg();
        int length=scanner.nextInt();
        int[] arr =new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
        }
        obj.avg(arr);
        System.out.println(obj.posAvg);
        System.out.println(obj.negAvg);
    }
}
