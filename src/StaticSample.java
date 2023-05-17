



public class StaticSample
{

    static
    {
        for(int i=0;i<10;i++) {
            System.out.println(i);
        }
    }
    static
    {
        for (int i=10;i<=20;i++)
        {
            System.out.println(i);
        }
    }
    {
        System.out.println("I'm in non static block");
    }

    public static void main(String[] args)
    {

        System.out.println("main method");
        StaticSample s = new StaticSample();

    }
}
