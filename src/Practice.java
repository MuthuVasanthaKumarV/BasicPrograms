import java.util.Arrays;

import static java.lang.Long.sum;

public class Practice
{
    public static void main(String[] args)
    {
        int i ;
        int[] a = {3, 45, 78, 88, 54, 43, 11};
        int[] b = new int[a.length];
        int index = 0;
        int[] c = new int[a.length + b.length];
        int pos = 0;
        for( i=0;i<a.length;i++)
        {
            b[pos] = sumOfDigit( a[i]);
            pos++;
        }
        System.out.println(Arrays.toString(b));
    }

    private static int sumOfDigit(int i)
    {
        int value=0;
        while(i>0)
        {
            int rem = i%10;
             value = value +rem;
             i=i/10;
        }
        if(value>9) {
          value = sumOfDigit(value);
        }
        return value;
    }

    }
