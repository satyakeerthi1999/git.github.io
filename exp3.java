import java.io.*;
import java.util.*;
class fibo
{
 public int frec(int n)
  {
    if(n==0)
      return 0;
   else if(n==1)
      return 1;
    else
     return frec(n-1)+frec(n-2);
  }
  
 public void fnon(int a,int b,int n)
  {
   for(int i=3;i<=n;i++)
   {
    int  c=a+b;
      a=b;
      b=c;
   }
  System.out.println("nth value of fibbonaci by non rec is"+b);
  }
}
class exp3
{
   public static void main(String args[])  
   {
        int n,x;

       Scanner sc=new Scanner(System.in);

       System.out.println("enter n value");

       n=sc.nextInt();

       fibo f = new fibo();

         f.fnon(1,1,n);

          x = f.frec(n);
        
       System.out.println("nth value of fibonnaci by rec is "+x);
    }
}