public class StringBufferAndBuilder
{
    public static void main(String[] args)
    {
        String s = "java";
    StringBuffer sb = new StringBuffer("JAVA PROGRAM");
    StringBuilder sb1 = new StringBuilder("STRING BUILDER");
        System.out.println(sb.append(" BUFFER METHOD "));// adding the string after the existing string
        System.out.println(sb.reverse()); // reversing the given string
        System.out.println(sb.insert(7,"is"));// adding the user input in particular place

        System.out.println( s.replace('j','H'));
    }
}
