/*
Write a Java program as instructed.

Abstract class UPIPayment has two abstract methods : 
-> abstract void payment ()
-> abstract void rewards ()

Class PhonePay extends class UP IPayment and has the following members :
-> private int amount as private instance variable
-> Constructor to initialize the instance variable

You should override method public void payment () such that the overridden
method displays the message "Phone pay : Payment success: " and invokes
method rewards ().

You should override method public void rewards () as follows.
-> If amount < 500, then display the message "Sorry no rewards".
-> Else, if amount >= 500, then display the message "10 off on next mobile rc".

Class Paytm extends class UPIPayment and has the following members :
-> private int amount as private instance variable
-> Constructor to initialize the instance variable

You should override method public void payment () such that the overridden
method displays the message "Paytm : Payment success: " and invokes method
rewards ().

You should override method public void rewards () as follows :
-> If amount < 500, then display the message "Sorry no rewards"
-> Else, if amount >= 500, then display message "10 off on next DTH rc".

Class UPIUser has the following method.
-> Method public void transferAndGetRewards (UPIPayment obj) that invokes
	method payment () using obj.

Class AbstractTest has the main method, and has the following functionality.
-> Creates an object of UP IUser
	Takes two amounts al for PhonePay and a2 for Paytm
-> Invokes method transferAndGetRewards () first by passing an object of PhonePay
	with amount al as parameter, and then by passing an object of Paytm with
	amount a2 as parameter.
*/

import java.util.*;
abstract class UPIPayment{
    abstract void payment();
    abstract void rewards();
}
class PhonePay extends UPIPayment{
    private int amount;
    public PhonePay(int amount) {
        this.amount = amount;
    } 
    public void payment() {
        System.out.println("Phone pay:Payment success:");
        rewards();
    }
    public void rewards() {
        if(amount < 500)
            System.out.println("Sorry no rewards");
        else if(amount >= 500)
            System.out.println("10 off on next mobile rc");
    }
}
class Paytm extends UPIPayment{
    private int amount;
    public Paytm(int amount) {
        this.amount = amount;
    }
    public void payment() {
        System.out.println("Paytm:Payment success:");
        rewards();
    }
    public void rewards() {
        if(amount < 500)
             System.out.println("Sorry no rewards");
        else if(amount >= 500)
             System.out.println("10 off on next DTH rc");
    }
}
class UPIUser{
    public void transferAndGetRewards(UPIPayment obj) {
        obj.payment();
    }
}
public class AbstractTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        UPIUser u = new UPIUser(); 
        u.transferAndGetRewards(new PhonePay(a1));
        u.transferAndGetRewards(new Paytm(a2));
   }
}