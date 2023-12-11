package OopsBasicPrograms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class BankAccount
{
    Scanner sc = new Scanner(System.in);
    double balance = 5000;
    public void Deposit()
    {
        System.out.println("Enter the amount to deposit");
        int dep = sc.nextInt();
        double totalAmount = balance+dep;
        System.out.println("Total amount: " + totalAmount);
    }
    public void Withdrawal()
    {
        System.out.println("Enter the amount to withdrawal");
        int withdraw = sc.nextInt();
        double totalAmount = balance-withdraw;
        System.out.println("Total amount: " + totalAmount);
    }
}
    class Account extends BankAccount {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String ch = "";
            Account banking = new Account();
            do {
                System.out.println("Enter 1 for deposit or enter 2 for withdrawal");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        banking.Deposit();
                        break;
                    case 2:
                        banking.Withdrawal();
                        break;
                }
                System.out.println("Do you want to perform operation press sc");
                ch = sc.next();
            }while (ch != "sc");

        }
    }

