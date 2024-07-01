import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileReadWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        read("Problems.txt");
        write("Problems.txt");
    }
    public static void read(String str){
        try{
            FileInputStream file = new FileInputStream(str);
            int i=file.read();
            while(i!=-1){
                System.out.print((char)i);
                i=file.read();
            }
            file.close();
        }catch(Exception e){
            System.out.println(e);

        }
    }
    public static void write(String str){
        try{
            Scanner sc = new Scanner(System.in);
            FileOutputStream file = new FileOutputStream(str);
            System.out.println("Enter a string to write in file : ");
            String string =sc.nextLine();
            byte[] i=string.getBytes();
            file.write(i);
            file.close();
        }catch(Exception e){
            System.out.println(e);

        }
    }
}
