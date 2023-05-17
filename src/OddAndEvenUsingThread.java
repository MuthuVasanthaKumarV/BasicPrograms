class OddNumber {
    int contr = 1;
    static int num;

    public void countOddNumber() {

            while (contr < num) {
                while (contr % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.print(contr + " ");
                contr++;
               notify();
            }
        }


    public void displayEvenNumber() {


            while (contr < num) {

                while (contr % 2 == 1) {

                    try {
                        wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                System.out.print(contr + " ");

                contr++;
                notify();
            }
        }
    }

public class OddAndEvenUsingThread
{
    public static void main(String[] args)
    {
        OddNumber.num =20;
        OddNumber on = new OddNumber();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                on.displayEvenNumber();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run()
            {

                on.countOddNumber();
            }
        });
        t1.start();
        t2.start();
    }
}
