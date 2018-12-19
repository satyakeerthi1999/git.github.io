import java.util.*;
import java.io.*;
class exp5
{
   public static void main(String args[])
   {
      int[][] a=new int[10][10];
      int[][] b=new int[10][10];
      int[][] c=new int[10][10]; 

      int i,j,k;
      int r1,c1,r2,c2;

      Scanner s = new Scanner(System.in);

      System.out.println("enter rows and colomns of both matrices");
       r1=s.nextInt();
       c1=s.nextInt();
       r2=s.nextInt();
       c2=s.nextInt();

       if(c1!=r2)
         System.out.println("multiplication is not possible");
       else
       {
           System.out.println("enter the elements for a");
           for(i=0;i<r1;i++)
           {
             for(j=0;j<c1;j++)
              a[i][j]=s.nextInt();
           }
           System.out.println("enter ele for b");
           for(i=0;i<r2;i++)
           {
             for(j=0;j<c2;j++)
              b[i][j]=s.nextInt();
           }

           for(i=0;i<r1;i++)
           {
             for(j=0;j<c2;j++)
              {
                 c[i][j]=0;
                for(k=0;k<c1;k++)
                 c[i][j]=c[i][j]+a[i][k]*b[k][j] ;
              }
           }

          System.out.println("product is");

          for(i=0;i<r1;i++)
           {
             for(j=0;j<c2;j++)
              System.out.print(c[i][j]+"    ");

              System.out.println();
           }

           System.out.println("the transpose matrix is");

           for(i=0;i<c2;i++)
           {
             for(j=0;j<r1;j++)
              System.out.print(c[j][i]+"     ");

              System.out.println();
           }
          
       }
   }

}