import java.util.Scanner;

public class ConsonantsAndVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] vowels = new char[]{'a','e','i','o','u','A','E','I','O','U'};
        int v=0;
        int c=0;
        int space=0;
        for(int i=0;i<str.length();i++){
            for(int j=0;j<vowels.length;j++){
                if(str.charAt(i)==vowels[j]) {
                    v++;
                }
            }
            for(int j=0;j<=0;j++){
                if (str.charAt(i)==' '){
                    space++;
                }
            }
        }
        c=str.length()-v-space;
        System.out.println("Vowels : "+v);
        System.out.println("Consonants : "+c);
    }
}