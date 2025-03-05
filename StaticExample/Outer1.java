package StaticExample;
//Non-static Nested Class / Inner class
//Create non-static class

public class Outer1{
    class Inner{
        void displayInnerClassDetails(){
            System.out.println("Inside Non-Static Nested (Inner) Class");
        }
    }
    public static void  main(String[]args){
        Outer1 outer = new Outer1();
        Outer1.Inner nonstaticObjectExample = outer.new Inner();
        nonstaticObjectExample.displayInnerClassDetails();
    }
}
