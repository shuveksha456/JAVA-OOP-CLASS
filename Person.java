public class Person {
    String _name;
    int _age;
    float _salary;

    // Parameterized Constructor
    Person(String _name, int _age, float _salary){
        this._name = _name;
        this._age = _age;
        this._salary = _salary; 
    }

    void displayPersonDetails(){
        System.out.println("Name: " + _name);
        System.out.println("Age: " + _age);
        System.out.println("Salary: " + _salary);
    }

    public static void main(String[] args) {
        Person person = new Person("Shuveksha Gurung", 21, 345.78f);
        person.displayPersonDetails();
    }    
}


