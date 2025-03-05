package StaticExample;

public class Outer {
     void sayHello() {
        System.out.println("Hello");
    }

    static class Inner {
         static void displayInnerClassDetails() {
            System.out.println("The data is from inner class.");
        }
    }

    public static void main(String[] args) {
        // Outer.sayHello();           Calling without creating an object (also need static keyword )
        
        Outer outer = new Outer();    //Calling with creating object
        outer.sayHello();

       

        Outer.Inner.displayInnerClassDetails(); // Calling without creating an object   (also need static keyword )
       
        // Outer outer = new Outer();     // Calling with creating object
        // Outer.Inner inner = new Outer.Inner(); 
        // inner.displayInnerClassDetails(); 
    }
}
