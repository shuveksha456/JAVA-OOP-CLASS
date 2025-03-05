public class AreaAndPerimeter {
    
    //method for area
    static int area(int length, int breadth){
        return length * breadth;
    }

    //method for perimeter
    static int perimeter(int length, int breadth){
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        
        //area
        System.out.println("Area of rectangle:" + area(5, 4));

        //perimeter
        System.out.println("Perimeter of rectangle:" + perimeter(5, 4));
    }
}
