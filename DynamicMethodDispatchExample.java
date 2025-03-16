// Dynamic Method dispatch ( Type Of Override.)
// is a mechanism in java where the method call 
// i. It is also known as  Runtime Polymorphism.
// ii. No initialization

//   Advantages :-
//   a. Loose coupling can be achieved.(loose couping- dependent wit each other, no condition .)
//   b. Achieve runtime polymorphism
//   b. Code Reliability
//   c. Code Reusability
   
// It can be achieved in :
//    i. Abstract classes
//    ii. Interfaces 
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

    class Cat extends Animal{
        @Override
        void makeSound(){
            System.out.println("Cat meows");
        }
    }
public class DynamicMethodDispatchExample {
    public static void main(String[] args) {
        Animal animal ;
        animal = new Dog();
        animal.makeSound();

        animal = new Cat();
        animal.makeSound();
    
    }
}
    
