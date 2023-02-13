package Activity;

class Show {
    <S, T> Show(S[] elements1, T[] elements2) {
        for (S element : elements1) {
            System.out.println(element);
        }
        for (T element : elements2) {
            System.out.println(element);
        }
    }
}

public class showExample {
    public static void main(String[] args){
        Integer[] arr1 = { 10, 20 };
        String[] arr2 = {"IIT-M","Programming Concepts using Java"};
        Show obj1=new Show(arr1,arr2);
        System.out.println();
        Show obj2=new Show(arr2,arr1);
    }
}