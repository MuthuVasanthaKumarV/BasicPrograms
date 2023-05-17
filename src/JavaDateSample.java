import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaDateSample
{
    public static void main(String[] args)
    {
        System.out.println("------Local Date-------");
        LocalDate ld = LocalDate.now();
        System.out.println("LocalDate -> "+ld);

        System.out.println("------Local Date-------");
        LocalTime lt = LocalTime.now();
        System.out.println("LocalTime -> "+lt);

        System.out.println("------Local Date & Time-------");
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("LocalDateTime -> "+ldt);

        System.out.println("------Local Date & Time Formatter-------");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E dd-MMM-yyyy HH:mm:ss");
        String formattedDate = ldt.format(dtf);
        System.out.println("formattedDate -> "+formattedDate);

    }
}
