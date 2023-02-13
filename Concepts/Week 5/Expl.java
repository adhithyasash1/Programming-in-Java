package genericsAtRuntime;

class Work<T>{
    T ob;
    Work(T x){
        this.ob=x;
    }
    public String show(){
        return ""+ob.getClass().getName();
    }
    public T get(){
        return ob;
    }
}
public class Expl {
    public static void main(String[] args){
        Work<String> n=new Work<String>("Hello");
        Work<Double> e=new Work<Double>(10.5);
        if(n.getClass()==e.getClass()){
            System.out.print(n.show()+"\n"+n.get());
        }
        else{
            System.out.print(e.show()+"\n"+e.get());
        }
    }
}

/*
do not misinterpret the class for generic in the above question.

n and e are objects of class Work and as they are same “hello” is printed (returned from n.get())
T ob creates an object of class java.lang.<T> ; In this case java.lang.String.
So n.show() returns ob.getClass().getName().
ob.getClass() ------ returns “class java.lang.String”
the .getName() ----- drops the word “class” and hence java.lang.String is printed
 */