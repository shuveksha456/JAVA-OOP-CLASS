public class CubeExample {
     static int length;
    
   static int calculateVolumeCube(){
        return length * length *length;
    }

    public static void main(String[] args) {
        CubeExample.length = 5;
      
        System.out.println("Volume of Cube :" + calculateVolumeCube());
    }
}

//using static keywords
//volume of cuboid
//simple interest
//ask input  from user 
