public class EncapsulationDemo
{
    public static void main(String[] args) {
       EncapsulationSample e1 = new EncapsulationSample();
        e1.setId(101);
       e1.setName("muthu");
       e1.setSalary(20000.0);
        System.out.println(e1.getId());
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
    }

}
