import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] array = {"Rock","Paper","Scissors"}; 
        
        

       

        String humanChoice = "";
        int compWin = 0;
        int humanWin = 0;

        
        while(compWin < 3 && humanWin < 3){
            System.out.println("Enter your choice Rock,Paper,Scissors");
            humanChoice = scanner.nextLine();
            int compChoice = random.nextInt(array.length);

            if(!humanChoice.equals("Paper") && !humanChoice.equals("Scissors") && !humanChoice.equals("Rock")){
                System.out.println("Please Enter valid values eg Paper,Scissors,Rock.case sensitive.");
            }


            if(array[compChoice].equals("Rock")){
                if(humanChoice.equals("Paper")){
                    System.out.println("Human Wins");
                    humanWin++;
                }else if(humanChoice.equals("Scissors")){
                    System.out.println("Computer Wins");
                    compWin++;
                }else if(humanChoice.equals("Rock")){
                    System.out.println("Draw");
                }
            }

            else if(array[compChoice].equals("Scissors")){
                if(humanChoice.equals("Paper")){
                    System.out.println("Computer Wins");
                    compWin++;
                }else if(humanChoice.equals("Rock")){
                    System.out.println("Human Wins");
                    humanWin++;
                }else if(humanChoice.equals("Scissors")){
                    System.out.println("Draw");
                }
            }

            else if(array[compChoice].equals("Paper")){
                if(humanChoice.equals("Rock")){
                    System.out.println("Computer Wins");
                    compWin++;
                }else if(humanChoice.equals("Scissors")){
                    System.out.println("Human Wins");
                    humanWin++;
                }else if(humanChoice.equals("Paper")){
                    System.out.println("Draw");
                }
            }
            

            System.out.println("Computer Score :"+compWin);
            System.out.println("Human Score :"+humanWin);

            if(compWin == 3){
                System.out.println("Computer WON *****************************************************");
            }
            if(humanWin == 3){
                System.out.println("Human WON *******************************************************");
            }

            }


            scanner.close();

    }
        
    }

