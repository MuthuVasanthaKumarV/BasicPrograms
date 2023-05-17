public class CustomizedException extends Exception
{
    CustomizedException()
    {
        System.out.println("Your are Not Eligible to login");
    }
}
    class Exception1
{
      static void validAge(int age) throws CustomizedException
    {
        if(age<18)
        {
            throw new CustomizedException();
        }
        else
        {
            System.out.println("Your are Eligible to login");
        }
    }
}

