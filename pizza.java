public  class pizza
{
    String size;String crust;int Topping ; String name;
    pizza() {
        this("Large:");
        System.out.println("No args are done");
        
    }
    pizza(String size) {
        this(size,"MEdium:");
        System.out.println("Size is Done");
    }
    pizza(String name,String crust)
    {
        this.crust=crust;this.name=name;
        Topping=3;
        System.out.println("Full Details are given\n");
        
    }
    public static void main(String [] args)
    {
        pizza p1=new pizza();
    }
}