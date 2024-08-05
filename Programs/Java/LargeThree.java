import java.util.Scanner;

public class LargeThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
        System.out.println("The First Three Large Number : ");
        for(int i = a.length-1; i >=0; i--){
            System.out.print(a[i]+" ");
        }
    }
}
