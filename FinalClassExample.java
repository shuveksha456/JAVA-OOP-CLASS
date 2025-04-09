//Final Class
final class First{
    void firstMethod(){
        System.out.println("First Method Called");
    }
}
class Second{ //extends First{
    void secondMethod(){
        System.out.println("Second Method Called");
    }
}
public class FinalClassExample {
    public static void main(String[] args) {
        //final attributes
         //  final String name = "Charlie";
        // // name ="Alpha";
        // System.out.println(name);

        Second second = new Second();
        second.secondMethod();
    }
}
