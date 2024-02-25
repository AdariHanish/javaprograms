
import java.util.*;
public class quadratic {
    public static void main(String args[])
    {
        try (Scanner s = new Scanner(System.in)) {
            double a,b,c,d,e,f;
            System.out.print("enter the value of a:"+ " ");
            a=s.nextDouble();
            System.out.print("enter the value of b:"+ " ");
            b=s.nextDouble();
            System.out.print("enter the value of c:"+ " ");
            c=s.nextDouble();
            System.out.print("the determinant d is:"+ " ");
            d=b*b-4*a*c;
            System.out.println(d);
            if(d>0)
            {
            System.out.println("the roots of the quadratic equation are real but  not equal and they are: ");
              e=(-b+Math.sqrt(d))/2*a;
              System.out.print(e + ",");
              f=(-b-Math.sqrt(d))/2*a;
              System.out.println(f + " ");  
            }
            else if(d==0)
            {
            System.out.print("the roots are equal and they are: ");
            e=f=(-b)/2*a;
            System.out.print(e + ",");
            System.out.println(f + " ");
   }
   else
   {
                System.out.println("the roots are real and imaginary and: ");

                System.out.print("the real root is: ");
                e=(-b)/2*a;
                System.out.println(e + " ");
                System.out.print("the imaginary root is: ");
                f=(Math.sqrt(d))/2*a;
                System.out.println(f + " ");
            }
        }
    }
    
}