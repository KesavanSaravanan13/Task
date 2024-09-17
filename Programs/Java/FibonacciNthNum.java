import java.util.Scanner;

public class FibonacciNthNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index : ");
        int index = sc.nextInt();
        int[] arr = new int[index + 1];
        arr[0] = 0;
        if (index > 0) {
            arr[1] = 1;
            for (int i = 2; i < arr.length; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        System.out.println("The nth Element : " + arr[index]);
    }
}
