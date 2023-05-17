 //UpCasting and DownCasting
   class A
 {
     int m = 10;
     void m1()
     {
         System.out.println("I'm in m1");
     }
 }
 class B extends A
 {
     int n = 20;
     void m2()
     {
         System.out.println("I'm in m2");
     }
 }
 public class TypeCasting
 {
    public static void main(String[] args)
    {
        A a1 = new B();//upcasting access only superclass type object
        System.out.println(a1.m);
        a1.m1();
        if(a1 instanceof B)// before checking whether is downcasted or not
        {
            B b1 = (B) a1; // DownCasting access both superclass and subclass
            System.out.println(b1.m);
            System.out.println(b1.n);
            b1.m1();
            b1.m2();
        }


    }
}
