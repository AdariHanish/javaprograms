import java.util.*;
public class normal
{
  public static void main (String args[])
  {
   Scanner p=new Scanner(System.in);
   System.out.print("enter the number:-");
   int n=p.nextInt();
   p.close();
   while(n>1)
   {
    if(n>2||n>3)
    {
   if(n%2==0||n%3==0)
   {
    System.out.println("it is not a prime number");
   }
   else{
    System.out.println("it is a prime number");
   }
    }
    else if(n==2||n==3)
    {
     System.out.println("it is a prime number");
    }
    else
    {
     System.out.println("not a prime number");
    }
    break;
   }
  }
}