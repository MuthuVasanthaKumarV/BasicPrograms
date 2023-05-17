
  class Demo extends Thread
  {


      public synchronized void run()

      {
          method1();
          method2();
//          method3();
      }
      synchronized void method1()
      {

          for(int i=0;i<=5;i++)
          {
              System.out.println("method 1"+Thread.currentThread().getName());
          }
//          try
//          {
//              System.out.println(5/0);
//          }
//          catch (Exception e)
//          {
//              System.out.println(e);
//          }

      }
     synchronized void method2()
      {
          for(int i=0;i<=5;i++)
          {
              System.out.println("method 2");
          }

      }
      void method3()
      {
          System.out.println(5/0);
          for(int i=0;i<=10;i++)
          {
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
          System.out.println("method 3");
      }
  }
public class MultiThread
{
    public static void main(String[] args)
    {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
//       // Demo d3 = new Demo();

        d1.start();
//        for (int i=1;i<=10;i++)
//        {
//            System.out.print(i);
//        }
        d2.start();
        System.out.println(d1.getName());
        System.out.println(d1.getId());


    }



}
