 
import java.util.Scanner;
public class prg
{
    public static void main (String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int order;
        if(args.length>0)
        {
            order=Integer.parseInt(args[0]);
        }
        else
        {
            System.out.println("Enter the order of matrix");
            order=sc.nextInt();
            
        }
        int a[][]=new int [order][order];
        int b[][]=new int [order][order];
        int c[][]=new int [order][order];
        System.out.println("Enter the order of matrix A");
        for(int i=0;i<order;i++)
        {
            for(int j=0;j<order;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the order of matrix B");
        for(int i=0;i<order;i++)
        {
        for(int j=0;j<order;j++)
        {
            b[i][j]=sc.nextInt();
        }
    }
    System.out.println("the order of matrix A are");
    {
         for(int i=0;i<order;i++)
         {
             for(int j=0;j<order;j++)
             {
                  System.out.print(a[i][j]+" ");
             }
              System.out.println();
         }
          System.out.println("The order of the matrix B are");
          {
              for(int i=0;i<order;i++)
              {
                  for(int j=0;j<order;j++)
                  {
                     System.out.print(b[i][j]+" "); 
                  }
                  System.out.println();
              }
              System.out.println("The sum of 2 matric are ");
              for(int i=0;i<order;i++)
              {
                  for(int j=0;j<order;j++)
                  {
                      c[i][j]=a[i][j]+b[i][j];
                      System.out.print(c[i][j]+" ");
                      
                  }
                  System.out.println();
              }
              sc.close();
          }
    }
}
}
