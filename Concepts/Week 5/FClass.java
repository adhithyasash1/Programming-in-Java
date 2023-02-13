package Practice;

class NumberFunction{
    public static <T extends Number> T max(T[] tArr){
        T max = tArr[0];
        for(int i = 0; i < tArr.length; i++) {
            if(tArr[i].doubleValue() > max.doubleValue()) {
                max = tArr[i];
            }
        }
        return max;
    }
}
public class FClass{
    public static void main(String[] args) {
        Double[] arr = {2.3, 4.2, 1.4, 2.6, 1.3};
        // Integer[] arr = {2, 4, 1, 6, 3}; // no error
        // Character[] arr = {’H’, ’e’, ’L’, ’l’, ’o’}; // runtime error, Character does not extend Number
        System.out.println(NumberFunction.max(arr));
    }
}
