import java.util.Scanner;

public class celsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Celsius : ");
        double c = sc.nextDouble();
        double f = (c/0.5555555)+32;
        System.out.printf("degree celsius is equal to %.2f Fahrenheit",f);
    }
}
