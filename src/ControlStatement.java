public class ControlStatement
{
    //if statement
    public static void main(String[] args)
    {
        int id =101;
        int salary = 1000;
        if(id == 102)
        {
            System.out.println("Your id is 102");
        }
        else if (salary > 1000)
        {
            System.out.println("Your salary is greater than 1000");
        }
        else
        {
            System.out.println("your id = "+id );
            System.out.println("Your salary = "+salary);
        }

    }
}
