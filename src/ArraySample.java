import java.util.Arrays;
import java.util.Scanner;

public class ArraySample
{
   static Scanner sc = new Scanner(System.in);
    static void arrayDeclaration()
    {
        int [] b = new int [5];
        for (int i=0;i<b.length;i++)
        {
            System.out.println("Enter the values");
            b[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(b));
    }
    public static void main(String[] args)
    {

        ArraySample.arrayDeclaration();
    }




}
