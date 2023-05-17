public class InstanceVariable
{
    int a = 10;
    String Name ;
    public InstanceVariable()
    {
        this.Name = "Muthu";
    }
    public static void main(String[] args)
    {
        InstanceVariable IV = new InstanceVariable();
        System.out.println(IV.a);
        System.out.println(IV.Name);
    }
}
