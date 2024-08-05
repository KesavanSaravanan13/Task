import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int sum = 0;
        int digit=0;
        while(n!=0){
            digit = n%10;
            n/=10;
            sum += digit*digit*digit;

        }
        if(sum==n){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }
}
