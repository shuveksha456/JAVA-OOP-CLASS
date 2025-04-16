//Handeling String
// i. Concatenation  ii. Conversion  iii. Changing case  iv. Extracting character  v. Searching string   

public class HandelingStringExample {
    public static void main(String[] args) {
     
        //Concatenation
    String a= "Shuveksha";
    String b = "Gurung";
    String concat = a +  b ;
    System.out.println("Concatenation Example:  " +  " " +  concat );  
    System.out.println("----------------"); 

         //Conversion
    int number = 123;
    String StringToNumber = String.valueOf(number);
    System.out.println(StringToNumber.getClass().getName());
    System.out.println("----------------"); 

        //Changing case
    String mixedCase = "Hello world";
    System.out.println ("UpperCase: " + mixedCase.toUpperCase());
    System.out.println("LowerCase: " + mixedCase.toLowerCase());
    System.out.println("----------------"); 

        //Extracting character
    String name = "Programming";
    char firstchar = name.charAt(0);
    char fifthchar = name.charAt(4);
    System.out.println("First character: " + firstchar);
    System.out.println("Fifth character: " + fifthchar);
    System.out.println("----------------"); 

       //String Comparision
    String s1 = "Java";
    String s2 = "Java";
    String s3 = new String("Java");
    String s4 = "java";

    //Using ==
    System.out.println("s1 == s2: " + (s1 == s2));
    System.out.println("s1 == s3: " + (s1 == s3));
    System.out.println("----------------");

    //Using .equalsIgnoreCase
    System.out.println(s1.equalsIgnoreCase(s4));
    System.out.println("----------------");

       //Searching string 
    String text = "Java is a Programming language";

    //Check if contains
    System.out.println("Contains Programming: " + text.contains("Programming"));

    //Index of string occurence
    int firstIndex = text.indexOf("Java");
    System.out.println("First 'Java' is at : " + firstIndex);
}
}
