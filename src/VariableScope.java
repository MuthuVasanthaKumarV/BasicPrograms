

public class VariableScope
{
    int l = 10;//instance variable
    static int m = 20;//static variable

    public static void main(String[] args)
    {
       int n = 30;//local variable
        System.out.println(m);
        System.out.println(n);
        VariableScope v1 = new VariableScope();
        System.out.println(v1.l);
    }

}
