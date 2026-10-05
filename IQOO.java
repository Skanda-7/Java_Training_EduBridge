public interface IQOO
{
    int add(int a,int b);
    default void display()
    {
        System.out.println("This is the add method");
    }
}
class main
{
    public static void main(String[] args)
    {
        IQOO i1=(a,b)-> a+b;
        i1.add(10,20);
        i1.display();
    }
}