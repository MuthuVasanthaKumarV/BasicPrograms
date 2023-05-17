import java.io.IOException;

class Exception11
{
public void msg() throws Exception
{
    System.out.println("super class");
}
}
class Exception12 extends Exception11
{
    public void msg(ClassCastException ce)
    {
        System.out.println("sub class");
    }
}

public class ExceptionHandling
{

   public static void main(String[] args)
   {
       Exception11 e11 = new Exception12();
       try {
           e11.msg();
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
       Exception1 e1 = new Exception1();
       try {
           Exception1.validAge(7);
       }
       catch (CustomizedException e)
       {
           
       }
   }
}
