
class sample1
{
 synchronized void printTable(int n)
 {
     for (int i=1;i<=5;i++)
     {
         System.out.println(i*n);
         try {
             Thread.sleep(1000);
         } catch (InterruptedException e)
         {
             throw new RuntimeException(e);
         }
     }
 }
}
class MyTheard1 extends Thread
{
    sample1 s;
    MyTheard1(sample1 s)
    {
        this.s =s;
    }
    public void run()
    {
        s.printTable(5);
    }
}
class MyTheard2 extends Thread
{
    sample1 s;
    MyTheard2(sample1 s)
    {
        this.s =s;
    }
    public void run()
    {
        s.printTable(100);
    }
}
public class SynchronizedAndAsynchronized
{
    public static void main(String[] args)
    {
        sample1 s1 = new sample1();
        MyTheard1 m1 = new MyTheard1(s1);
        MyTheard2 m2 = new MyTheard2(s1);
        m1.start();
        m2.start();

    }
}
