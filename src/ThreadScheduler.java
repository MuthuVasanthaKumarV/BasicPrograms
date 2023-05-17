import java.util.Iterator;

class SampleThread1 extends Thread
{
    public synchronized void run1()
 {
     for (char ch=65;ch<='E';ch++)
     {
         System.out.print(Thread.currentThread().getName());
         System.out.println(ch);
      //   yield();
         try {
             wait(5000);
             Thread.sleep(1);

         } catch (InterruptedException e)
         {
           e.printStackTrace();
         }
     }
     System.out.print(Thread.currentThread().getPriority());
     notify();
 }
}
class SampleThread2 extends Thread
{
    public synchronized void run()
    {
        for (char ch=65;ch<='E';ch++)
        {
            System.out.print(Thread.currentThread().getName());
            System.out.println(ch);

            try {
             //  wait(100000);
                Thread.sleep(1);

            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.print(Thread.currentThread().getPriority());

        }
     //  notify();
    }
}
public class ThreadScheduler
{
    public static void main(String[] args)
    {
    SampleThread1 st1 = new SampleThread1();
    SampleThread1 st2 = new SampleThread1();

        st1.setName("SampleThread1");
        st2.setName("SampleThread2");
        st1.setPriority(4);
        st2.setPriority(1);
        System.out.println(Thread.currentThread());
    st1.start();
        System.out.println(Thread.currentThread().getState());
    st2.start();


    }

}
