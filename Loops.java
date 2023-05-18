public class Loops {
    public static void main(String[] args) {
        

        for(int i=1;i<101;i++){

            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }

        for(int i=0;i<5;i++){
            System.out.println("  i = "+i);
            for(int j=0;j<=i;j++){
                System.out.print(" * j = " + j);
            }
        }


    }
}
