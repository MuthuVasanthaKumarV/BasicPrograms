public class TypeCastingSample
{
    //Widening Type Casting
    //Lower to Higher Datatype

    public static void main(String[] args)
    {
        int r = 10;
        long s = r;
        float j = s;
        int d = (int) j;//Narrowing Higher to Lower datatype
        System.out.println(d);
    }

}
