//An abstract class can have both abstract(without body) and concrete methods.
abstract class Animal{
    //Abstract Method
    abstract void makeSound();

    void sleep(){
        System.out.println("Sleeping...");
    }
    
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog Barks");
    }
 }

 class Cat extends Animal{
     @Override
     void makeSound(){
         System.out.println("Cat meows");
     }
 }


public class DynamicMethodDispatchUsingAbstractClassExample {
    public static void main(String[] args) {
      Animal animal;
      
        
      animal = new Dog();
      animal.makeSound();

      animal = new Cat();
      animal.makeSound();
    }
}
