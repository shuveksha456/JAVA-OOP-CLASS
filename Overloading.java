public class Overloading {
       static int add (int a , int b){
        return a + b;
    }
     static double add (double a, double b ){
        return a + b ;
    }
    static int add (int a, int b, int c){
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println("Addition : " + add(5, 4));
        System.out.println("Addition: " + add(2.13, 3.12));
        System.out.println("Addition: " + add(2, 30 ,10));
    }
}
