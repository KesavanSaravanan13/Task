import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a Number between 1 and 100 : ");
        int guess = sc.nextInt();
        Random rand = new Random();
        int randomNum = rand.nextInt(100);
        if(randomNum == guess) {
            System.out.println("Congratulations! You guessed CORRECT!!");

        }else{
            System.out.println("Sorry, you guessed WRONG!!");
        }
    }
}
