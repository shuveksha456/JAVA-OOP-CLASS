package FileHandling;

import java.io.FileWriter;

public class WriteToFile{
    public static void main(String[]args){
          try{
            FileWriter writer= new FileWriter("example.txt");
            writer.write("Hello. Java is a programming language");
            writer.close();
            System.out.println("Successfully write to file");
            }catch(Exception e){
                System.out.println("An error occured");
                e.printStackTrace();
     }
}
}
