import java.util.Locale;
import java.util.Scanner;

public class EnumerationSwitchSample
{
    public enum district
    {
        SALEM
                {
                    void famous()
                    {
                        System.out.println("");
                    }
                },COIMBATORE,TIRCHY,MADURAI,KANYA_KUMARI
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the district: " );
        String sc1 = sc.next().toUpperCase();
       district ds = district.valueOf(sc1);
       switch (ds)
       {
           case SALEM -> System.out.println("Chennai");
           case COIMBATORE -> System.out.println("Covai");
           case TIRCHY -> System.out.println("Tiruchirapalli");
           case MADURAI -> System.out.println("Madurai");
           case KANYA_KUMARI -> System.out.println("KanyaKumari");
       }
    }

}
