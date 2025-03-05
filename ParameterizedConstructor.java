    public class ParameterizedConstructor {
  
    //Data members
    int length;
    int breadth;
   
    //Parameterized Constructor:-
    ParameterizedConstructor( int length, int breadth){
        this.length = length;           //this : current object lai refer garni kaam garxa 
        this.breadth = breadth;
    }

    void displayDetails(){
        System.out.println("Length:" + length);
        System.out.println("Breadth:" + breadth);
    }
    

    public static void main(String[] args) {
        ParameterizedConstructor parameterizedConstructor = new ParameterizedConstructor(10, 20);
        parameterizedConstructor.displayDetails();
    }    
}