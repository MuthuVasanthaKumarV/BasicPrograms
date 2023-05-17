public class SwappingTwoStringWithVariable
{
    public static void main(String[] args)
    {
        System.out.println("-------------------------swapping two string-----------------------------------");
        String s2 = "MUTHU";
        String s3 = "VASANTH";
        String s4 = s2+s3 ;
        System.out.println("Before swapping ");
        System.out.println("s2 ="+ s2);
        System.out.println("s3 ="+ s3);
        System.out.println("After swapping ");
        System.out.println("s2 = "+ s4.substring(s4.length()-s3.length()));
        System.out.println("s3 = "+s4.substring(0,s4.length()-s3.length()));
    }
}
