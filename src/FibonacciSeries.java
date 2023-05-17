public class FibonacciSeries
{
   static int factorial(int x)
    {
     if(x==1)
     {
         return 1;
     }
     return x * factorial(x-1);
    }
   static int fib(int y)
   {
       if(y == 1)
       {
           return 0;
       }
       else if (y==2 || y==3)
       {
           return 1;
       }

       else
       {
           return fib(y-1)+ fib(y-2);
       }
   }

    public static void main(String[] args)
    {
        System.out.println(FibonacciSeries.factorial(5));
        int Fibonacci = FibonacciSeries.fib(25);
        System.out.println(Fibonacci);
    }


}
