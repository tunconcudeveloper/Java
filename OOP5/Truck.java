package OOP5;

public class Truck extends Vehicle{
    String horsePower;
    Truck(String horsePower){
        super(horsePower);
        this.horsePower = horsePower;
        
    }

    @Override
    void speedUp(){
        System.out.println("Accelerating slowly");
    }
    
}
