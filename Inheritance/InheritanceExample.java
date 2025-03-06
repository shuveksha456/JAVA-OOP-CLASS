package Inheritance;
//Parent class
class Vehicle {
    void run (){
        System.out.println("Vehicle is running");
    }
}

//Child class
class Car  extends Vehicle{
    void stop (){
        System.out.println("Vehicle is stopped.");
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        
    
    Vehicle vehicle = new Vehicle();
    vehicle.run();
    
    Car car = new Car();
    car.run();
    car.stop();
}
}
