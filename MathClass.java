
public class MathClass {
    public static void main(String[] args) {
        
        double y = 2;
        double a = -10;
        double x = 5;
        double z = 2.13;

        System.out.println(Math.max(y, x));

        System.out.println(Math.min(y, x));

        System.out.println(Math.abs(a));

        System.out.println(Math.ceil(z));

        System.out.println(Math.floor(z));

        System.out.println(Math.pow(y, x));

        System.out.println(Math.round(z));

        System.out.println(Math.sqrt(5));

        double side1 = 3;
        double side2 = 4;
        double side3 = Math.sqrt(side1*side1 + side2*side2);
        System.out.println(side3);
        
        
    }
}
