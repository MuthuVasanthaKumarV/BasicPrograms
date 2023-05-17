
interface Mobile
{
     void calling();
     void charging();
     static void m2(){
         System.out.println();
     }
     default void m3()
     {
         System.out.println("m3");
     }

}
class Apple implements Mobile {
    public void calling() {
        System.out.println(" It is used to Calling");
    }

    public void charging() {
        System.out.println("It is used to Charging");
    }

    public void capturing() {
        System.out.println("It is an subclass");
    }
    public void m2()
    {

    }
    @Override
    public void m3() {
        System.out.println("m3 in apple");
    }
}
    class Oneplus  extends Apple implements Mobile
    {
        public void calling()
        {
            System.out.println(" It is used to Calling in oneplus");
        }
        public void charging()
        {
            System.out.println("It is used to Charging in oneplus");
        }
    }

public class InterfaceSample
{
    public static void main(String[] args)
    {
        Apple a = new Apple();
        a.calling();
        a.charging();
        a.capturing();
        a.m3();

     // Oneplus o1 = new Oneplus();

    }
}
