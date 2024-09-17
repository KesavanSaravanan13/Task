import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

class Bank {
    private int accountNum;
    private String accountHolderName;
    private double accountBalance;

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    private int pin;

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Bank(int accountNum, String accountHolderName, double accountBalance, int pin) {
        this.accountNum = accountNum;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "\n    --- Your Account Info ---  \n\n" +
                "     Account Number = " + this.getAccountNum() + "\n" +
                "Account Holder Name = " + this.getAccountHolderName() + "\n" +
                "                Pin = " + this.getPin() + "\n" +
                "            Balance = " + this.getAccountBalance() + "\n\n";
    }
}

public class BankCrud {

    static Scanner sc = new Scanner(System.in);
    private static int accNum;
    private static int pinNum;

    public int getPinNum() {
        return pinNum;
    }

    public static void setPinNum(int pin) {
        pinNum = pin;
    }

    public int getAccNum() {
        return accNum;
    }

    public static void setAccNum(int acc) {
        accNum = acc;
    }

    public static void main(String[] args) {
        List<Bank> listOfAccounts = new ArrayList<>(
                Arrays.asList(
                        new Bank(1001, "John Doe", 5000.00, 1234),
                        new Bank(1002, "Jane Doe", 6500.00, 5678),
                        new Bank(1003, "Sam Smith", 3000.00, 2345),
                        new Bank(1004, "Alice Johnson", 9000.00, 7890),
                        new Bank(1005, "Bob Brown", 1200.00, 3456),
                        new Bank(1006, "Charlie Black", 4300.00, 9012),
                        new Bank(1007, "Eve White", 15000.00, 6543),
                        new Bank(1008, "Grace Green", 2700.00, 8765)
                )
        );
        System.out.print("\n  --- Welcome to ACC Banking --- \n\n  Choose Below :\n   1.Login\n   2.Create Account\n\n Enter your Choice : ");
        int choice =sc.nextInt();
        sc.nextLine();
        switch (choice){
            case 1:
                loginAcc(listOfAccounts);
                break;
            case 2:
                createAcc(listOfAccounts);
                break;
        }
    }
    public static void createAcc(List<Bank> listOfAccounts){
        System.out.println("\n   --- Enter the Details --- \n");
        System.out.print("Your Name : ");
        String name=sc.nextLine();
        System.out.print("Set your Pin : ");
        int pin=sc.nextInt();
        listOfAccounts.add(new Bank(listOfAccounts.get(listOfAccounts.size()-1).getAccountNum()+1,name,1000.0,pin));
        System.out.println("Your Account Number : "+listOfAccounts.get(listOfAccounts.size()-1).getAccountNum());
        System.out.println("\n   --- Account Created --- \n Please Login to see Your Details...");
        loginAcc(listOfAccounts);
    }
    public static void loginAcc(List<Bank> listOfAccounts){
        System.out.print("Enter your Account number : ");
        setAccNum(sc.nextInt());
        System.out.print("Enter the pin : ");
        setPinNum(sc.nextInt());
        int flag = 0;
        for (Bank b : listOfAccounts) {
            if (b.getAccountNum() == accNum && b.getPin() == pinNum) {
                flag = 1;
            }
        }
        switch (flag) {
            case 1:
                System.out.println("\n    --- LOGGED IN --- \n");
                accCrud(listOfAccounts);
                break;
            case 0:
                System.out.println("Wrong Account Number or Password !!!!");
                break;
        }
    }

    public static void accCrud(List<Bank> listOfAccounts) {
        int cc = 1;
        do {
            System.out.println("Choose Below Service : \n   1.View Details\n   2.Update Details\n   3.Withdraw\n   4.Deposit\n");
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    cc = 0;
                    listOfAccounts.stream().filter(bank -> bank.getAccountNum() == accNum && bank.getPin() == pinNum).forEach(System.out::println);
                    break;
                case 2:
                    cc = 0;
                    updateDetail(listOfAccounts);
                    break;
                case 3:
                    System.out.print("Enter the Amount : ");
                    double amt = sc.nextDouble();
                    for (Bank b : listOfAccounts) {
                        if (b.getAccountNum() == accNum && b.getPin() == pinNum) {
                            if (b.getAccountBalance() > amt) {
                                b.setAccountBalance(b.getAccountBalance() - amt);
                            } else {
                                System.out.println("\n  --- Your Balance is too Low --- \n");
                            }
                            ;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter the Amount : ");
                    double depo = sc.nextDouble();
                    for (Bank b : listOfAccounts) {
                        if (b.getAccountNum() == accNum && b.getPin() == pinNum) {
                            b.setAccountBalance(b.getAccountBalance() + depo);
                        }
                    }
                    break;
                default:
                    cc = 1;
                    break;
            }
        } while (cc == 0);
    }

    public static void updateDetail(List<Bank> listOfAccounts) {
        System.out.println("Choose the Below to Update : \n   1.Account Number\n   2.Holder Name\n   3.Pin Number");
        System.out.print("Enter the choice : ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.print("Enter the New Number : ");
                int newNum = sc.nextInt();
                for (Bank b : listOfAccounts) {
                    if (b.getAccountNum() == newNum) {
                        System.out.println("Sorry Account Number Already Exist !!!");
                    } else {
                        if (b.getAccountNum() == accNum && b.getPin() == pinNum) {
                            b.setAccountNum(newNum);
                            setAccNum(newNum);
                            System.out.println("\n  --- UPDATED --- \n\n");
                        }
                    }
                }
                ;
                break;
            case 2:
                System.out.print("Enter the New Name : ");
                String newName = sc.nextLine();
                for (Bank b : listOfAccounts) {
                    if (b.getAccountNum() == accNum && b.getPin() == pinNum) {
                        b.setAccountHolderName(newName);
                        System.out.println("\n  --- UPDATED --- \n");
                    }
                }
                ;
                break;
            case 3:
                System.out.print("Enter the New Pin : ");
                int newPin = sc.nextInt();
                for (Bank b : listOfAccounts) {
                    if (b.getAccountNum() == accNum && b.getPin() == pinNum) {
                        b.setPin(newPin);
                        setPinNum(newPin);
                        System.out.println("\n  --- UPDATED --- \n");
                    }
                }
                ;
                break;
        }
    }
}
