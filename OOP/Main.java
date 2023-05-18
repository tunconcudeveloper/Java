package OOP;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.speed);
        System.out.println(car.color);

       
        System.out.println(car.slowDown(20));
        System.out.println(car.speedUp(40));
    }
}
