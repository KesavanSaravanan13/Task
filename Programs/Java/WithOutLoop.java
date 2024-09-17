import java.util.*;

class WithOutLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range : ");
        System.out.print("Start : ");
        int start = sc.nextInt();
        System.out.print("End : ");
        int end = sc.nextInt();
        calcRange(start, end);
    }

    public static void calcRange(int start, int end) {
        if (end == start) {
            System.out.print(end);
        } else if (end <= start) {
            System.out.print((start--) + " ");
            calcRange(start, end);
        } else {
            System.out.print((start++) + " ");
            calcRange(start, end);
        }
    }
}
