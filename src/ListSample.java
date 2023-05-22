import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListSample
{
    public static void main(String[] args)
    {
      List <String>l1 = new ArrayList<>();
      l1.add("muthu");
      l1.add("vasanth");
      l1.add("kumar");
      l1.add("1");
      l1.add("C");
      l1.add(2,"vijay");
      l1.add(10,"day");
        System.out.println(l1);
        for (int i=0;i<l1.size();i++)
        {
            if(l1.get(i).equals("1"))
            {
              l1.add(i,"43");
              break;
            }
        }
        System.out.println(l1);
      l1.remove("kumar");
        System.out.println(l1.contains(1));
        System.out.println(l1.size());

      for(Object o1:l1)
      {
          System.out.println("FOR EACH");
          System.out.println(o1);
      }
        Iterator i1 = l1.iterator();
      while(i1.hasNext())
        {
            System.out.println("ITERATOR");
            System.out.println(i1.next());
        }
      ListIterator li = l1.listIterator();
      while(li.hasPrevious())
      {
          System.out.println("LIST ITERATOR");
          System.out.println(li.previous());
      }
    }



}
