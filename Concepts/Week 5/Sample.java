package Reflections;

class Vehicle{
}
class Car extends Vehicle{
}

public class Sample {
    public static void main(String[] args) {
        Vehicle vehicle1=new Vehicle();
        Vehicle vehicle2=(Vehicle)new Car();
        Class c1=vehicle1.getClass();
        Class c2=vehicle2.getClass();
        if(c1==c2){
            System.out.println("Both objects are equal....");
        }
        else{
            System.out.println("Both objects are not equal...");
        }
    }
}
