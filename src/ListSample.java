import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class ListSample
{
    public static void main(String[] args)
    {
      List l1 = new ArrayList();
      l1.add("muthu");
      l1.add("vasanth");
      l1.add("kumar");
      l1.add(1);
      l1.add('C');
      l1.add(2,"vijay");
      l1.remove("kumar");
        System.out.println(l1.contains(1));
        System.out.println(l1.size());

      for(Object o1:l1)
      {
          System.out.println(o1);
      }
        Iterator i1 = l1.iterator();
      while(i1.hasNext())
        {
            System.out.println(i1.next());
        }
    }

}
