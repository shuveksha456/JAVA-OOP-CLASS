package Inheritance;
class Shape{
    int  length;
    int breadth;
    int height;
}


class Cube extends Shape {
    void toCalculateCube(){
        int volume = length * length * length;
        System.out.println("The volume of cube: " + volume);
    }
}
class Cuboid extends Shape {
     void toCalculateCuboid(){
        int volume = length * breadth *height;
        System.out.println("The volume of cuboid: " + volume); 
     }
    } 
    public class SecondExample{
        public static void main(String[] args) {
            Cube cube = new Cube();
            cube.length=10;
            cube.toCalculateCube();

            Cuboid cuboid = new Cuboid();
            cuboid.length=10;
            cuboid.breadth=5;
            cuboid.height=2;
            cuboid.toCalculateCuboid();
        }
    }

