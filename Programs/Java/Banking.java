import java.util.Scanner;
class Customer{
    private int id;
    private String name;
    private char gender;
    public double balance;
    public Customer() {
    }
    public Customer(int id,String name,char gender) {
        this.id=id;
        this.name=name;
        this.gender=gender;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    public String toString() {
        return "Customer_ID : "+getId()+"\n"+
                "Customer_Name : "+getName()+"\n"+
                "Customer_Gender :"+getGender();
    }
}

class Account extends Customer{
    private int id;
    Customer customer;
    private double balance =0.0;
    public Account() {
    }
    public Account(int id,Customer customer) {
        this.id=id;
        this.customer=customer;
    }
    public Account(int id,Customer customer,double balance) {
        this.id=id;
        this.customer=customer;
        this.balance=balance;
    }

    public double deposit(double amount) {
        customer.balance+=amount;
        return customer.balance;
    }
    public double withdraw(double amount) {
        if(balance>=amount) {
            customer.balance-=amount;
        }
        else {
            System.out.println("Amount withdrawn exceeds the current balance!!!");
        }
        return customer.balance;
    }
    public void setBalance(double balance) {
        this.balance=balance;
    }
    public String getCustomerName() {
        String name=super.getName();
        return name;
    }
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getBalance() {
        return customer.balance;
    }
    public String toString() {
        return "******************************"+
                "Customer Name : "+getName()+
                "Customer ID : "+getId()+
                "Your Current balance : "+String.format("%.2f",getBalance());
    }
}
public class Banking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Please login to your Account : ");
        System.out.println("Username : ");
        String name =sc.nextLine();
        System.out.println("Password : ");
        String password = sc.nextLine();
        Customer customer = new Customer(12345,name,'m');
        Account account=new Account(7655,customer);
        Account account1=new Account(7655,customer,0.0);
        System.out.println("Welcome "+name+" for ABC Banking Services!!!");
        System.out.println("===============================================");
        char value ='y';
        do {
            System.out.println();
            System.out.println("===============================================");
            System.out.println("PLEASE SELECT ONE OPTION FROM BELOW");
            System.out.println("1.Account Info ");
            System.out.println("2.Withdraw ");
            System.out.println("3.Deposit ");
            System.out.println("4.Check Balance ");
            System.out.println("5.Exit ");
            System.out.print("Option : ");
            int num =sc.nextInt();
            switch(num) {
                case 1:
                    System.out.println("===============================================");
                    System.out.println("            WELCOME TO BANK OF ABC");
                    System.out.println("ACCOUNT DETAILS ");

                    System.out.print("ACCOUNT_ID      : ");
                    System.out.println(account.getId());
                    System.out.println(customer);
                    System.out.print("ACCOUNT_BALANCE : ");
                    System.out.println(account.getBalance());
                    System.out.println();
                    System.out.println("===============================================");
                    break;
                case 2:
                    System.out.println("Enter Amount to Withdraw : ");
                    double withAmount=sc.nextDouble();
                    System.out.println(account.withdraw(withAmount));
                    System.out.println("Please Check Again!!!");
                    System.out.println("===============================================");
                    break;
                case 3:
                    System.out.println("Enter Amount to Deposit : ");
                    double DepAmount=sc.nextDouble();
                    System.out.println(account.deposit(DepAmount));
                    System.out.println("Amount Deposited SuccessFully!!!");
                    System.out.println("===============================================");

                    break;
                case 4:
                    System.out.println("===============================================");
                    System.out.println("            WELCOME TO BANK OF ABC");
                    System.out.println("ACCOUNT DETAILS ");

                    System.out.print("ACCOUNT_ID      : ");
                    System.out.println(account.getId());
                    System.out.println(customer);
                    System.out.print("ACCOUNT_BALANCE : ");
                    System.out.println(account.getBalance());
                    System.out.println();
                    System.out.println("===============================================");
                    break;
                case 5:
                    value='n';
                    break;
            }
        }while(value=='y');
        System.out.println("Thank You for Banking with Us!!!!");
    }
}
