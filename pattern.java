import java.util.*;
public class pattern 
{
 public static void main(String args[])
 {
    Scanner s= new Scanner(System.in); 
    System.out.println("Enter the size of pyramid");
    int p=s.nextInt();
    s.close();
    for(int i=0;i<=p;i++)
    {
        for(int j=p;j<=1;j--)
        {
            if(i>=j)
            {
                System.out.print("* ");
            }
            else
            {
                System.out.println("/n");
            }
        }
    }

 }   
}
