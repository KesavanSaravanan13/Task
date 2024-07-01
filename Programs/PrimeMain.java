import java.util.Scanner;

public class PrimeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int value = sc.nextInt();
        int[] a= new int[value];
        for(int i=1;i<=value;i++)
        {
            if(value%i==0){
                a[i-1]=1;
            }else{
                a[i-1]=0;
            }
        }
        int sum=0;
        for(int i=0;i<a.length;i++) {
            sum += a[i];
        }
        if(sum==2){
            System.out.println("This is a Prime number");
        }else{
            System.out.println("This is Not a Prime number");
        }
    }
}
