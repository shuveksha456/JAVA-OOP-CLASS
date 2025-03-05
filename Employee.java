public class Employee {
    String name;
    int id ;
    double salary;

      // Parameterized Constructor
      Employee(String _name, int _id, double _salary){
        this.name = _name;
        this.id = _id;
        this.salary = _salary;
    }
    
    //method
    double CalculateBonus(){
        return salary * 0.1;
    }
    //display employee details
    void displayEmployeeDetails(){
        System.out.println("Employee name:" + name);
        System.out.println("Employee id:" + id);
        System.out.println("Employee salary:" + salary);
        System.out.println();
    }
    
}
