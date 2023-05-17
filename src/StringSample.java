

import java.sql.SQLOutput;

public class StringSample
{
    public  static void   main(String[] args)
    {
     String s =  "JAVA PROGRAM"; //BY LITERALS
     String s1 =  new String ("PROGRAM");  //BY NEW OPERATOR
        System.out.println(s1.length());     //length
        System.out.println(s1.hashCode());  //hashcode of object
        System.out.println(s1.toLowerCase()); // covert to lower
        System.out.println(s1.toUpperCase()); // convert to upper
        System.out.println(s+s1); //concat
        System.out.println(s.compareTo(s1)); //compareTo method  it return  0 or + or - value
        System.out.println(s.contains("A"));  // it Return Boolean value
        System.out.println(s.endsWith("VA"));  // it Return Boolean value
        System.out.println(s.charAt(3));  // it return the index element
        System.out.println(s.indexOf("PROGRAM"));



    }

}
