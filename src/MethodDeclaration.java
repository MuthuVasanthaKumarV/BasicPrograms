public class MethodDeclaration
{
    static void additionOfTwoNumber(int x,int y)
    {
        int add = x+y;
        System.out.println("Addition of two number = "+add);
    }
    static void subOfTwoNumber(int x,int y,int z)
    {
        int sub = x-y-z;
        System.out.println("Subtraction of Three number = "+sub);
    }
    static void multiplyOfTwoNumber(int x,int y)
    {
        int multiply = x*y;
        System.out.println("Multiplication of two number = "+multiply);
    }
    static void divisionOfTwoNumber(int x,int y)
    {
        int division = x/y;
        System.out.println("Division of two number = "+division);
    }
    static double run(int x)
    {
        return x;
    }
    int walk(double  z)
    {
        return (int)z;//DownCasting,because it covert large to small datatype
    }
}
