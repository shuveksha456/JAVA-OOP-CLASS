public class PolymerphismExample {
    // Polymerphism :- Having multiple forms

     //Method Overloading
    //Example:
    //1. int add(int a , int b);
    //2. int add(int a , int b, int c);
    //3. double add(double a, double b, double c) 

    // Program Example

    static int add (int a, int b){
        return a + b;
    }

    //Method Overload with 3 int type parameters
    static int add (int a, int b, int c){
        return a + b + c;
    }

     //Method Overload with 2 double type parameters
      double add (double a, double b){
        return a + b;
     }
     public static void main(String[] args) {

        //static na lekhni vaye object banauni
        // PolymerphismExample object1 = new PolymerphismExample();
        // int result = object1.add(4, 5);
        // System.out.println("Addition of two numbers:" + result);

        System.out.println("Addition of two numbers:" + add(3,4));
     
        //Using Static
       System.out.println("Additon of three numbers:" + add(4, 5, 1));

       //Using object
       PolymerphismExample object1 = new PolymerphismExample();
       int result = object1.add(20.4, 30.4);
       System.out.println("Addition of two numbers:" + result);
    }
}
