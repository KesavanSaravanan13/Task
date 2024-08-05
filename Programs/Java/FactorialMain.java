import java.util.Scanner;

class Factorial{
    public int  fact(int value){
        if(value<1){
            return 1;
        }
        return value*fact(value-1);
    }
}

public class FactorialMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  Value : ");
        int value=sc.nextInt();
        Factorial fc = new Factorial();
        int result=fc.fact(value);
        System.out.println("The fac is : "+result);
    }
}
