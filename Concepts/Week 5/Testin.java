package Activity;

// T1 is unbounded and Only T2 extends Number
class Exampl<T1,T2 extends Number>{
    T1 ob1;
    T2 ob2;
    void push(T1 obj){
        this.ob1=obj;
        System.out.println(ob1);
    }
    void push(T2 obj){
        this.ob2=obj;
        System.out.println(ob2);
    }
}
public class Testin{
    public static void main(String[] args){
        Exampl<String,Integer> s = new Exampl<String,Integer>();
        s.push("Hello");
    }
}

/*
T1 is unbounded and T2 extends Number, hence Exampl<String, Number> works!
here T1 = String, T2 = Integer (Integer extends Number)

If both T1 and T2 are Number (or extends Number), the push method becomes ambiguous. which results in
Compile time error because reference to method is ambiguous.

If both T1 and T2 extend number, then

    void push(<some class that extends Number> obj) {
          this.ob1=obj;
          System.out.println(ob1);
      }
    void push(<some class that extends Number> obj) {
          this.ob2=obj;
          System.out.println(ob2);
      }
Now, the push methods are ambiguous.
On the other hand, If only T2 extends number,
then T1 is unbounded and hence the Java compiler replaces it with Object.

Hence, it can accept String, and hence there is no ambiguity.

If there is an Ambiguity look at te following Code,

class Example<T1,T2 extends Number>{
    T1 ob1;
    T2 ob2;
    void push(T1 obj){
        this.ob1=obj;
        System.out.println(ob1);
    }
    void push(T2 obj){
        this.ob2=obj;
        System.out.println(ob2);
    }
 }
class Test{
    public static void main(String[] args){
        Example<Number,Number> n = new Example<Number,Number>();
        n.push(5.5);
    }
}

error occurs due to -> Compile time error because reference to method is ambiguous.
 */
