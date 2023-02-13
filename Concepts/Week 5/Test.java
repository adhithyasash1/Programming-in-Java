package Activity;

class Repository<T1,T2>{
    T1 item1;
    T2 item2;
    Repository(T1 x,T2 y){
        this.item1=x;
        this.item2=y;
    }
    public T1 getItem1(){
        return item1;
    }
    public T2 getItem2(){
        return item2;
    }
}

public class Test{
    public static void main(String[] args){
        Repository<String, Double> obj=new Repository<String, Double>("ABC",5.5);
        System.out.println(obj.getItem1()+"\n"+obj.getItem2());
    }
}
