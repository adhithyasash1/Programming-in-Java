package Ba2ch;
import java.util.*;

// Define Abstract class Vehicle
abstract class Vehicle {
    int mileage;
    String vehicleModel;
    String vehicleType;

    public Vehicle(String u) {
        this.vehicleType = u.substring(0,1);
        this.vehicleModel = u.substring(0,u.length());
    }

    public String getVehicleModel() {
        return vehicleModel;
    }
    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }
    public int getMileage() {
        return mileage;
    }
    public void setMileage(int x) {
        this.mileage = x;
    }

    public abstract String computeMileage();
}

// Define class Car
class Car extends Vehicle {
    public Car(String u) {
        super(u);
        setMileage(20);
    }

    public String computeMileage() {
        return (this.vehicleModel + " has a mileage of 20km/L");
    }
}

// Define class Train
class Train extends Vehicle {

    public Train(String u) {
        super(u);
        setMileage(20);
    }

    public String computeMileage() {
        return (this.vehicleModel + " has a mileage of 100km/L");
    }
}

public class InheritTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> messagesList = new ArrayList<>();

        int numVehicles = sc.nextInt();
        for (int i = 0; i < numVehicles; i++) {
            String type = sc.next();
            if (type.equals("C")) {
                Vehicle n = new Car(sc.nextLine().trim());
                messagesList.add(n.computeMileage());
            }
            else if (type.equals("T")) {
                Vehicle n = new Train(sc.nextLine().trim());
                messagesList.add(n.computeMileage());
            }
        }
        for (String s : messagesList) {
            System.out.println(s);
        }
        sc.close();
    }
}
