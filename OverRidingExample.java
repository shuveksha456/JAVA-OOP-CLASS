class Animal{
 void makeSound(){
    System.out.println("Animal make sound.");
 }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog Barks");
    }
}
public class OverRidingExample  {
    public static void main(String[] args) {
    Animal animal = new Animal();
    animal.makeSound();

    Dog dog = new Dog();
    dog.makeSound();
    }
}
