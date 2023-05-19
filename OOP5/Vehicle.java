package OOP5;

public class Vehicle {
    int speed;
    String model;
    String horsePower;

    Vehicle(String horsePower){
        this.horsePower = horsePower;

    }

    void speedUp(){
        System.out.println("Speeding up fast");
    }
}
