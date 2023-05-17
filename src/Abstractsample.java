
        abstract class Animal
        {
            abstract void eat();
            abstract  void sleep();
            abstract void walk();
            Animal(){
                System.out.println("This is Animal constructor");
            }

        }
        class Dog extends Animal
        {
          void eat()
          {
              System.out.println("Eat");
          }
          void sleep()
          {
              System.out.println("Sleep");
          }
          void walk()
          {
              System.out.println("Walk");
          }
        }

public class Abstractsample
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog();
        d1.eat();
        d1.sleep();
        d1.walk();


    }
}
