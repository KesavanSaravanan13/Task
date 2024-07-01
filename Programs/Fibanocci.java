import java.util.Scanner;

public class Fibanocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int value = sc.nextInt();
        int[] a= new int[value];
        a[0]=0;
        a[1]=1;
        for(int i=2;i<value;i++){
            a[i]=a[i-1]+a[i-2];

        }
        System.out.print("The First "+value+" Fibonacci number is : ");
        for(int i=0;i<value;i++){
            System.out.print(a[i]+" ");
        }
    }
}
