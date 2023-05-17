import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();


        int number = random.nextInt(6)+1;
        System.out.println(number);

        boolean isTrue = random.nextBoolean();
        System.out.println(isTrue);
        
        double value = random.nextDouble();
        System.out.println(value);

        double value2 = random.nextDouble()*100;
        System.out.println(value2);
       

        
    }
}
