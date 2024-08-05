import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result=gcd(a,b);
        System.out.println(result);
        result=lcm(a,b);
        System.out.println(result);
    }

    public static int gcd(int a, int b) {
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result;
    }
    public static int lcm(int a, int b) {
        int result = Math.max(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result++;
        }
        return result;
    }
}
