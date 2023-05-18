import java.util.ArrayList;

public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");

        System.out.println(names.size());

        System.out.println(names.toArray());

        System.out.println(names.indexOf("B"));

        System.out.println(names.set(0, "E"));

        System.out.println(names);

        System.out.println(names.remove(3));

        System.out.println(names);

        System.out.println(names.get(2));

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);

        

        


       

    }
}
