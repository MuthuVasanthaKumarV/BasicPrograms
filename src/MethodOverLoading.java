

public class MethodOverLoading
{
     void studentInfo(int id,long phno,String Name)
    {
        System.out.println("Student id = "+id);
        System.out.println("Student Name = "+Name);
        System.out.println("Student phno = "+phno);
    }

 void studentInfo(int id,long phno,String Name,String city)
    {
        System.out.println("Student id = "+id);
        System.out.println("Student Name = "+Name);
        System.out.println("Student PhNo = "+phno);
        System.out.println("Student city = "+city);
    }
   void studentInfo(int id,long phno,String Name,String city,long aadharNo)
    {
        System.out.println("Student id = "+id);
        System.out.println("Student Name = "+Name);
        System.out.println("Student PhNo = "+phno);
        System.out.println("Student city = "+city);
        System.out.println("Student Aadhar = "+aadharNo);
    }
    class ChildClass
    {
        void studentInfo(int id,long phno,String Name,String city,long aadharNo,String Address)
        {
            System.out.println("Student id = "+id);
            System.out.println("Student Name = "+Name);
            System.out.println("Student PhNo = "+phno);
            System.out.println("Student city = "+city);
            System.out.println("Student Aadhar = "+aadharNo);
        }
    }
}
