import java.util.ArrayList;
import java.util.List;

public class SumOfArrayList
{
    public static void main(String[] args)
    {
        int sum=0;
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(20);
        numbers.add(50);
        numbers.add(80);
       for(int num :numbers)
       {
          sum  = sum + num;
       }
        System.out.println(sum);
    }
}
