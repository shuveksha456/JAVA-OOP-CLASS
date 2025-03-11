package SuperKeyword;
class Parent {
    int num = 100;
    
    //Constructor
    Parent(){
        System.out.println("Parent class constructor called");
    }

    //Parent method .0
    void otherMethod(){
        System.out.println("Parent other method called");
    }

    //Parent second method
    void secondMethod(){
        System.out.println("Parent second method is called ");
    }
}

class Child extends Parent{
    int num = 200;     //attribute

    //Child method 
    void display(){
        super.otherMethod();      //call the otherMethod of Parent class
        super.secondMethod();
        System.out.println("Parent class number: " + super.num);   //200
        System.out.println("Child class number: " + this.num);     //100
        
    }
}
public class Example1 {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
} 
