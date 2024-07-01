import java.util.Scanner;

public class MultipleMatrics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] result=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;i<2;i++){
                System.out.print("Enter the "+i+j+"th Element : ");
                a[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<2;i++){
            for(int j=0;i<2;i++){
                System.out.print("Enter the "+i+j+"th Element : ");
                b[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        for(int i=0;i<2;i++){
            for(int j=0;i<2;i++){
                result[i][j]=a[i][j]*b[i][j];
            }
        }

        for(int i=0;i<result.length;i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
