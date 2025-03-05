public class Student {
    String _name;
    int _rollnumber;
    float _marks;

      // Parameterized Constructor
      Student(String _name, int _rollnumber, float _marks){
        this._name = _name;
        this._rollnumber = _rollnumber;
        this._marks = _marks; 
    }

    void displayStudentDetails(){
        System.out.println("Name: " + _name);
        System.out.println("RollNumber:" + _rollnumber);
        System.out.println("Marks:" + _marks);
    }

    public static void main(String[] args) {
        Student student = new Student("Shuveksha Gurung", 4, 345.78f);
        student.displayStudentDetails();
    }
} 
