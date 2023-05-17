

public class WrapperClassSample
{
    public static void main(String[] args)
    {
        String s1 = "heelo";
        s1 = "heelo";
        int m =10;
        byte n = 100;
        float o = 1000;
        double p =  10000;

        // AutoBoxing Primitive to WrapperClass

        Integer i = m;
        Byte b = n;
        Float f = o;
        Double d = p;
        System.out.println("*******PrimitiveType to WrapperClass********");
        System.out.println(i);
        System.out.println(b);
        System.out.println(f);
        System.out.println(d);

        // AutoUnboxing WrapperClass to Primitive DataType

        byte ByteObj = b;
        int IntObj = i;
        float FloatObj = f;
        double DoubleObj =  d;
        System.out.println("******WrapperClass to Primitive DataType****** ");
        System.out.println(ByteObj);
        System.out.println(IntObj);
        System.out.println(FloatObj);
        System.out.println(DoubleObj);


    }
}
