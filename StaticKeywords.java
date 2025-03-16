public class StaticKeywords {
  String employeeName;
  static String employeeCeo;
  double employeeSalary;

  void displayDetails() {
    System.out.println("Employee Name:" + employeeName);
    System.out.println("Employee CEO:" + employeeCeo);
    System.out.println("Employee Salary:" + employeeSalary);
  }

  public static void main(String[] args) {
    StaticKeywords object1 = new StaticKeywords();
    StaticKeywords object2 = new StaticKeywords();

    // Stataic Data Initialization
    StaticKeywords.employeeCeo = "Alpha";

    object1.employeeName = "EMP1";
    // OBJECT1.employeeCEO = "alpha";
    object1.employeeSalary = 12000;

    object2.employeeName = "EMP2";
    // OBJECT2 .employeeCEO = "alpha";
    object1.employeeSalary = 20000;

    object1.displayDetails();

    System.out.println("---------------------");

    object2.displayDetails();
  }
}
