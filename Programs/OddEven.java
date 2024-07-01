import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int value = sc.nextInt();
        if(value%2==0){
            System.out.println("This is a Even Number");
        }else{
            System.out.println("This is a Odd Number");
        }
    }
}
