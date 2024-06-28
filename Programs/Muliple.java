import java.util.Scanner;

public class Muliple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The First 10 Multiply table of the number is :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+" x "+n+" = "+i*n);
        }
    }
}
