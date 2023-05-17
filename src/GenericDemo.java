import java.util.*;

public class GenericDemo
{
    public static void main(String[] args)
    {
        System.out.println("-------Make Collection As Generic-------");



        System.out.println("------List------");
        ArrayList <Character>al = new ArrayList();

        al.add('A');
        al.add('B');
        al.add('C');
        al.add('D');
        System.out.println(al);


        System.out.println("------Set-------");
        Set<Integer> s = new LinkedHashSet();
        s.add(100);
        s.add(200);
        s.add(300);
        s.add(400);
        System.out.println(s);

        System.out.println("------Map-------");

        Map<Integer,String> m1 = new HashMap();
        m1.put(1, "Muthu");
        m1.put(2, "Vasanth");
        m1.put(3, "Kumar");
        System.out.println(m1.keySet());// it return only keys present in map
        System.out.println(m1.get(1));// it return value
        System.out.println(m1.entrySet());// it return all key value pair in map
        System.out.println(m1.toString());// it return  to string value
        System.out.println(m1.containsKey(4)); // it return boolean value

    }
}
