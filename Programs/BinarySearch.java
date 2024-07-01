import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=10;
        int[] a = new int[10];
        System.out.println("Enter 10 Values : ");
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the Key : ");
        int key=sc.nextInt();
        int low=0;
        int high=a.length-1;
        BSearch(a,key,low,high);
    }
    public static void BSearch(int[] a,int key,int low,int high){
        int mid=(low+high)/2;
        if(a[mid]==key){
            System.out.println("Found the Key");
        }else if(a[mid]<key){
            BSearch(a,key,mid+1,high);
        }
        else if(a[mid]>key){
            BSearch(a,key,low,mid-1);
        }
    }
}
