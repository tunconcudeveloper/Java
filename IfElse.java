import java.util.Random;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(6)+1;
        System.out.println(number);
        System.out.println("Enter a number between 1-6");
        int guess = scanner.nextInt();
       
        if(guess == number){
            System.out.println("You Guessed Correct");
        }else{
            System.out.println("Try Again");
        }
        scanner.close();



    }
}
