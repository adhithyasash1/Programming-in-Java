package Activity;

class Example<T extends Number>{
    T x;
    Example(T x){
        this.x = x;
    }
    T get(){
        return x;
    }
}
public class Testing{
    public static void main(String[] args){
        Example<Integer> obj = new Example<Integer>((int)'A');
        System.out.println(obj.get());
    }
}