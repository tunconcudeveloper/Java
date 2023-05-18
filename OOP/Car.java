package OOP;

public class Car {
    String model = "Mustang";
    String color = "Blue";
    int speed = 100;
    int year = 2014;

    int speedUp(int arg){
        return speed+arg;
    }
    int slowDown(int arg){
        return speed-arg;
    }
}


