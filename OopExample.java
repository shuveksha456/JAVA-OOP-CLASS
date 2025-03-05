// Defining a class named Car
class Car{
    //Fields or Data members or attributes
    String brand;
    int speed;
    
    //Method
    void displayCarDetails(){
        System.out.println("Brand:"+ brand);
        System.out.println("Speed:" + speed + "km/hr");
    }
}
public class OopExample {
    public static void main(String[] args) {
        // Creating objects of Car class
        Car car1 = new Car();
        Car car2 = new Car();
        //Assigning values to attributes
        car1.brand = "BMW";
        car1.speed = 42; 

        car2.brand = "Audi";
        car2.speed = 20;
        //Calling methods on object
        car1.displayCarDetails();
        car2.displayCarDetails();
    }
}
// Volume of cube (3 objects)
// Volume of cuboid (3 objects)