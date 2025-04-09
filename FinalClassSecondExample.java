class Parent {
    String name = "Shuveksha";
    final double salary = 2343.23;
}
   
  


class Child extends Parent {
void details(){
    System.out.println("child name:" + name);
    System.out.println("child salary:" + salary);
}
 
   
}

public class FinalClassSecondExample {
    public static void main(String[] args){
        Child obj = new Child("Alice", 50000.0);
        System.out.println("Name from Parent: " + obj.name);
        System.out.println("Salary from Parent: " + obj.salary);
    }
}

