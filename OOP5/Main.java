package OOP5;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("200");
        Truck truck = new Truck("500");

        vehicle.speedUp();
        truck.speedUp();

        System.out.println(vehicle.horsePower);
        System.out.println(truck.horsePower);
    }

    
}
