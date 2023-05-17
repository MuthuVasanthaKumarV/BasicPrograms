public class SwitchStatement
{
    public static void main(String[] args)
    {
     int age=15;
     switch (age)
     {
         case 10:
         {
             System.out.println("Your are not eligible to vote");
             break;
         }

         case 14+1 :
         {
             System.out.println("your are not eligible to vote");
            break;
         }
         case 18:
         {
             System.out.println("Your are eligible to vote");
             break;
         }
         default:
             System.out.println("Ready to vote");
     }
    }
}


