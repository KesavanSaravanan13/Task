import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String str1=sc.nextLine();
         String str2=sc.nextLine();
         str1=str1.toLowerCase();
         str2=str2.toLowerCase();
         if(str1.length()!=str2.length()){
             System.out.println("Not an Anagram!!!");
         }else{
             char[] a = new char[str1.length()];
             char[] b = new char[str2.length()];
             for(int i=0;i<str1.length();i++){
                 a[i]=str1.charAt(i);
             }
             for(int i=0;i<str2.length();i++){
                 b[i]=str2.charAt(i);
             }
             for(int i=0;i<a.length;i++){
                 for(int j=1;j<a.length;j++){
                     if(a[j]<a[j-1]){
                         char temp=a[j];
                         a[j]=a[j-1];
                         a[j-1]=temp;
                     }
                 }
             }
             for(int i=0;i<b.length;i++){
                 for(int j=1;j<b.length;j++){
                     if(b[j]<b[j-1]){
                         char temp=b[j];
                         b[j]=b[j-1];
                         b[j-1]=temp;
                     }
                 }
             }
             str1=" ";
             str2=" ";
             for(int i=0;i<a.length;i++){
                 str1+=a[i];
             }
             System.out.println(str1);
             for(int i=0;i<b.length;i++){
                 str2+=b[i];
             }
             System.out.println(str2);
             if(str1.equalsIgnoreCase(str2)){
                 System.out.println("It is Anagram!!!");
             }else{
                 System.out.println("Not an Anagram!!!");
             }
         }
    }
}
