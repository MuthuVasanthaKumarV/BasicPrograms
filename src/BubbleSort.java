import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args) {
        int[] a = {9, 6, 4, 6, 5, 2, 4, 7, 0, 1,10};
        sorting(a);
        System.out.println(Arrays.toString(a));
    }

           static void sorting( int[] a)
        {
            for(int i=0;i<a.length;i++)
            {
                for( int j=i+1;j<a.length;j++)
                {
                    if(a[i]>a[j])
                    {
                        int temp = a[i];
                        a[i]= a[j];
                        a[j]= temp;
                    }
                }
        }
    }
}
