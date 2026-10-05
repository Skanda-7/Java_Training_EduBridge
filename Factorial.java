import java.util.Scanner;
public class Factorial
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
        int a=0,b=1;
        System.out.println("The Fibonacci Series");
        for(int i=0;i<=n;i++)
        {
            System.out.print(a+ "");
            int next=a+b;
            a=b;
            b=next;
            
        }
    }
}