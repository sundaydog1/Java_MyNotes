package day18_garbageCollection;

public class TestBankAccObjects {
    public static void main(String[] args) {
         BankAccount acc1 = new BankAccount();
         acc1.setInfo("Black",1829634,25000);
        System.out.println(acc1);

        acc1.deposit(1000);
       acc1.checkbalance();

acc1.withdraw(700);
acc1.checkbalance();


acc1.withdraw(28000);

acc1.checkbalance();
















    }















}
