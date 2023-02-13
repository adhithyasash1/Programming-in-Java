package openSession;

interface Generatable {
    abstract double billGenerate(int units);
}

class Powerbill {
    private double totalBill;

    private class Domestic implements Generatable {
        public double billGenerate(int units) {
            if (units > 0 && units <= 100) {
                totalBill = units * 1.6;
            }
            else if (units > 100 && units <= 200) {
                totalBill = units * 2.5;
            }
            else if (units >250) {
                totalBill = units * 5.6;
            }
            return totalBill;
        }
    }

    private class Commercial implements Generatable {
        public double billGenerate(int units) {
            if (units > 0 && units <= 100) {
                totalBill = units * 5.6;
            }
            else if (units > 100 && units <= 200) {
                totalBill = units * 7.5;
            }
            else if (units >250) {
                totalBill = units * 20.0;
            }
            return totalBill;
        }
    }

    public Generatable getDomesticBill() {
        return new Domestic();
    }

    public Generatable getCommercialBill() {
        return new Commercial();
    }
}

class BillingTest {
    public static String getBill(int units, String type) {
        if (units < 0) {
            return ("Invalid Input!");
        }
        else if (type == "home") {
            Powerbill pb = new Powerbill();
            Generatable home = pb.getDomesticBill();
            return (home.billGenerate(units) + " ");
        }
        else if (type == "shop") {
            Powerbill pb = new Powerbill();
            Generatable home = pb.getCommercialBill();
            return (home.billGenerate(units) + " ");
        }
        else {
            return("Invalid Input!");
        }
    }
}

public class Billing {
    public static void main(String[] args) {
        System.out.println(BillingTest.getBill(50, "shop"));
    }
}

