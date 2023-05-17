 public class ThreadInterruptExample implements Runnable {

        public void run()
        {
            try {
                for (int i = 1; i <= 10; i++)
                {
                    System.out.println("This is message #" + i);


                    Thread.sleep(1000);
                }
            }
                 catch(InterruptedException e)
                {
                    System.out.println("I'm resumed");
                }

            }

            public static void main (String[]args)
            {
                Thread t1 = new Thread(new ThreadInterruptExample());
                t1.start();
               t1.interrupt();



            }
        }

