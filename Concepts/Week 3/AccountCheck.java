package Week3_3;
import java.util.*;

public class AccountCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amnt = sc.nextInt( );
        int amnt1 = sc.nextInt( );
        BankAccount b = new BankAccount(1890, "rahul", 1000);
        b.deposit(amnt);
        b.balance();
        b.withdraw(amnt1);
        b.balance();
    }
}
