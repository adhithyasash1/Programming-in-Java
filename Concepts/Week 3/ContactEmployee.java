package Week3_1;

public class ContactEmployee extends Employee{
    final private static double hourlyPay = 100.00;
    private int contactHour;
    private double s;

    //implement the constructor
    public ContactEmployee(String name, long aadharno, int contactHour) {
        super(name, aadharno);
        this.contactHour = contactHour;
        s = super.getSalary();
        s += contactHour * hourlyPay;
        super.setSalary(s);
    }
    //salary is computed as contactHour * hourlyPay
}
