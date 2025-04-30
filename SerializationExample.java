import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import serialization.Student;

public class SerializationExample {
    public static void main(String[] args) {
        try{
        Student student = new Student(101, "Alpha");
        

        //Create file named student.ser (extension . ser = serialized object)
        FileOutputStream fileOutput = new FileOutputStream("student.ser");

        ObjectOutputStream out = new ObjectOutputStream(fileOutput);

       // Convert an object into byte stream 
      
       out.writeObject(student);
       out.close();
       fileOutput.close();
       System.out.println("Serialization done"); 

    }
    catch (Exception e ){
        e.printStackTrace();
    }
    }
}
