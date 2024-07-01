import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Fahrenheit : ");
        double f = sc.nextDouble();
        double c = 0.5555555*(f-32);
        System.out.printf("Fahrenheit is equal to %.2f degree celsius",c);
    }
}
