import java.util.Stack;

public class StackSample
{
    public static void main(String[] args)
    {
     String s ="Muthu";
     Stack<Character> s1 = new Stack<Character>();
     for (int i =0 ;i< s.length();i++)
     {
         s1.push(s.charAt(i));
     }
     for (int i=0;i<s.length();i++)
     {
         System.out.print(s1.pop()+" ");
     }

    }
}
