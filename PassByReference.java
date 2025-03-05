class Car{
   String name;
   double price;
    }

    public class PassByReference {
    public static void main(String[] args) {
       Car car = new Car();
       car.name ="BMW";
       car.price = 24556.78;
       System.out.println(car.name);
       System.out.println(car.price); 

       Car secondCar = new Car();
       secondCar = car;
       System.out.println(secondCar.name);
       System.out.println(secondCar.price);

       secondCar.name= "mustang";
       secondCar.price = 56000;
       System.out.println(secondCar.name);
       System.out.println(secondCar.price);

       System.out.println(car.name);
       System.out.println(car.price); 

    }
}
