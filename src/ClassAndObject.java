public class ClassAndObject
{
    void ClassAndObject(int x,int y)
    {
        int z= x+y;

        System.out.println(z);
    }
    void method()
    {

        System.out.println("This is method ");
    }
    public static void main(String[] args)
    {
        ClassAndObject c = new ClassAndObject();
        c.ClassAndObject(10,20);
        c.method();
    }
}
