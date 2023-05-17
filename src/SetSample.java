import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSample
{
    public static void main(String[] args)
    {
        System.out.println("-------HashSet----------");
        Set s1 = new HashSet();
        s1.add(1);
        s1.add(1);
        s1.add("muthu");
        s1.add("vasanth");
        for (Object o1 : s1)
        {
            System.out.println(o1+" ");
        }

        System.out.println("------LinkedHashset-------");
  Set s2 = new LinkedHashSet();
        s2.add(1);
        s2.add(2);
        s2.add(3);
        s2.add(4);
        s2.add(5);
        s2.add(6);
        s2.add(7);
        s2.add(8);
        s2.add(9);
        s2.add(10);
        s2.add(11);
        s2.add(12);
        s2.add(13);
        s2.add(14);
        s2.add(15);
        s2.add(16);
        s2.add(17);
        for(Object o1: s2)
        {
            System.out.print(o1+" ");
        }

        System.out.println("------TreeSet-------");

        Set s3 = new TreeSet();
        s3.add("muthu");
        s3.add("vijay");
        s3.add("vasanth");
        s3.add("arya");
        s3.add("balaji");

        for(Object o2:s3)
            System.out.println(o2+" ");
    }
}
