
   class Vehicle
   {
       int x=10;
       void speed()
       {
           System.out.println("This is speed method");
       }
   }
   class Honda extends Vehicle
   {
       int y=20;
       void speed()
       {
           System.out.println("The average speed is 80kmph");
       }
   }
    class Hero extends Honda
    {
        int z=30;
        void speed()
        {
            System.out.println("The average of speed is 60kmph");
        }
    }

public class Inheritance
{
    public static void main(String[] args)
    {
      Hero H1 =new Hero();
      H1.speed();
        System.out.println(H1.x);
        System.out.println(H1.y);
        System.out.println(H1.z);
    }
}
