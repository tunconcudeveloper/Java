import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        String name = "";
        String pword = "123";

        while(name.isEmpty()){
            System.out.println("Enter your name");
            name = scanner.nextLine();

        }
        while(pword.isEmpty() || pword.length()<7){
            System.out.println("Enter your password");
            pword = scanner.nextLine();
            if(pword.length()<7){
                System.out.println("Password is weak");
                System.out.println("Try entering more than 7 characters");
            }
        }
        scanner.close();




        
        
    }
}
