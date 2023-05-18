import java.util.ArrayList;

public class For_Each {
    public static void main(String[] args) {
        String[] names = {"A","B","C","D"};

        for (String i : names) {
            System.out.println(i);
        }

        ArrayList<Double> numbers = new ArrayList<Double>();
        numbers.add(1.2);
        numbers.add(1.3);
        numbers.add(1.4);

        for (Double i : numbers) {
            System.out.println(i);
        }
    }
}
