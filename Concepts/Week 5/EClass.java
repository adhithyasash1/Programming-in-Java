package Practice;
import java.lang.reflect.*;
import java.util.Arrays;

class SampleClass{
    private final int pr_data = 9;
    private String pr_str;
    public static int pu_data;
    private SampleClass() {
        //some code
    }
    public SampleClass(int pr_data_, String pr_str_) {
        pr_str = pr_str_;
    }
    public SampleClass(SampleClass tObj) {
        this.pr_str = tObj.pr_str;
    }
    private boolean isValid() {
        //some code
        return true;
    }
    public int get_pr_data() {
        return pr_data;
    }
    public String get_pr_str() {
        return pr_str;
    }
}

/*
public class EClass {
    public static void main(String[] args) {
         Field[] fields1 = c.getFields();
         Field[] fields2 = c.getDeclaredFields();
         for(Field f2 : fields2) {
            bool = Arrays.asList(fields1).contains(f2); //fields1 contains f2?
            if (!bool) {
            pvt_fields[i] = f2.getName(); //add to private variables
            i = i + 1;
              }
         }
         for (j = 0; j < i; j++) {
              System.out.println(pvt_fields[j]);
                }
    }
}
*/
