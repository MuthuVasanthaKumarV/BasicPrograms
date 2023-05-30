public class ExceptionDemo
{
    int age;
    String name;
    ExceptionDemo(int age, String name)
    {
       this.age=age;
       this.name= name;

    }
    static void demo()
    {
        int x=10;
        int y=0;
        int z;
        String s=null;

        try
        {
            z= x/y;                             //ArithmeticException
            System.out.println(s.length());    //NullPointerException
            int a =Integer.parseInt("abc");//NumberFormatException

        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
           System.out.println("raw");
        }
    }
    public static void main(String[] args)
    {

        demo();
        ExceptionDemo ed = new ExceptionDemo(10,"muthu");
        System.out.println(ed.age);
        System.out.println(ed.name);
    }
}
