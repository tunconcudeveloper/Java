public class Expressions {
    public static void main(String[] args) {
        int age = 20;
        age++;
        System.out.println(age);
        ++age;
        System.out.println(age);
        age = age - 5;
        age -= 5;
        System.out.println(age);
        age += 10;
        System.out.println(age);
        age *= 5;
        System.out.println(age);
        age /= 5;
        System.out.println(age);
        age %= 10;
        System.out.println(age);

        double doubleAge = age;
        System.out.println(doubleAge);

        int intAge = (int) doubleAge;

        System.out.println(intAge);
    }
}
