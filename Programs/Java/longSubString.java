import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class longSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1 : ");  
        String str1 = sc.nextLine();
        System.out.print("Enter string 2 : ");
        String str2 = sc.nextLine();
        String result1="";
        String result2="";
        List<String> subStr1 = new ArrayList<>();
        List<String> subStr2 = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i; j < str1.length(); j++) {
                result1+=str1.charAt(j);
                subStr1.add(result1);
            }
            result1="";
        }
        for (int i = 0; i < str2.length(); i++) {
            for (int j = i; j < str2.length(); j++) {
                result2+=str2.charAt(j);
                subStr2.add(result2);
            }
            result2="";
        }
        subStr1.sort((o1, o2) -> o1.length()-o2.length());
        subStr2.sort((o1, o2) -> o1.length()-o2.length());
        List<String> result = new ArrayList<>();
        for (String st1 : subStr1){
            for(String st2 : subStr2){
                if(st1.equalsIgnoreCase(st2)){
                    result.add(st1);
                }
            }
        }
        System.out.print("\n\nThe Output : ");
        System.out.println(result.get(result.size()-1));
    }
}

