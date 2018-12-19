import java.io.*;
import java.util.*;
class exp1
{
   public static void main(String args[])  
   {
        int n,i,j,c;

       Scanner sc=new Scanner(System.in);

       System.out.println("enter n value");

       n=sc.nextInt();

       System.out.println("prime numbers are");

       System.out.print(1+" ");

       for(i=1;i<=n;i++)
       {
          c=0;
         for(j=1;j<=i;j++)
         {
           if(i%j==0)
            c++;
         }
          if(c==2)
            System.out.print(i+" ");
       }
   }

}