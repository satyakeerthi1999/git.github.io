import java.io.*;
import java.util.*;
class exp
{
   public static void main(String args[])  
   {
        int n,i;

       Scanner sc=new Scanner(System.in);

       System.out.println("enter n value");

       n=sc.nextInt();

       System.out.println("multiplication table for "+n);

        for(i=0;i<=20;i++)
        {
           System.out.println(n+"*"+i+"="+n*i);
        }
   }

}