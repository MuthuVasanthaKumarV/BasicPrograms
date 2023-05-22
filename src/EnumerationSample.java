public class EnumerationSample
{
    public enum Vegetable

    {
        CARROT
                {
                    public void color()
                    {
                        System.out.println("ORANGE COLOR");
                    }
                },POTATO
            {
                public void color()
                {
                    System.out.println("SANDAL COLOR");
                }
            },CAULIFLOWER,ONION,TOMATO
    }
    public enum Fruit {

        APPLE
                {
                    public void color()
                    {
                        System.out.println("RED COLOR");
                    }

                },ORANGE{
            public void color()
            {
                System.out.println("ORANGE COLOR");
            }
        },MANGO,BANANA,GRAPES

}
    public static void main(String[] args)
    {
        Fruit f1 = Fruit.ORANGE;
        Fruit [] f2 = Fruit.values();
        System.out.println(f1);
        for(int i=0;i<f2.length;i++)
        {
            System.out.println(f2[i]+"-->"+f2[i].ordinal());
        }
        Vegetable [] v1 = Vegetable.values();
        for(int i=0;i<v1.length;i++)
        {
            System.out.println(v1[i]+"-->"+v1[i].ordinal());
        }

     
    }
}
