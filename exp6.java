import java.util.*;
import java.io.*;
class exp6
{
   public static void main(String args[])
   {
       double a,b,c;
       double d,x,y;

       Scanner s=new Scanner(System.in);

       System.out.println("enter coefficients");

       a=s.nextInt();
       b=s.nextInt();
       c=s.nextInt();

       d= b*b-4*a*c;

       if(d>0)
       {
          x= (-b+Math.sqrt(d))/(2*a);
          y= (-b-Math.sqrt(d))/(2*a);

          System.out.println("roots are real"+x+"and"+y);
       }
       else if(d<0)
       {
         double q=Math.sqrt(-d);

         double r=-b/2*a;
         double t=q/2*a;
         System.out.print("roots are imaginary");
         System.out.print(r+"+i"+t);
         System.out.print("and"+r+"-i"+t);
       }
       else if(d==0)
       {
          x= -b/(2*a);
          y= -b/(2*a);

          System.out.println("roots are equal"+x+"and"+y);
       }
       

   }

}