package Week3_3;

public class BankAccount {

        int accountNumber;
        String name;
        int balance;
        final int minBalance = 100;
        private boolean checkMinBalance(int amount){
            if(balance - amount <= minBalance){
                return false;
            }
            else{
                return true;
            }
        }
        //Fill the code here
        public BankAccount(int accountNumber, String name, int balance) {
            this.name = name;
            this.balance = balance;
            this.accountNumber = accountNumber;
        }
        public void balance(){
            System.out.println(balance);
        }
        public void deposit(int amount){
            balance += amount;
        }
        public void withdraw(int amount){
            if (checkMinBalance(amount)){
                balance = balance - amount;
            }
            else{
                System.out.println("Transaction failed");
            }
        }
}

