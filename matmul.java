import java.util.*;
public class matmul
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n,o;
        System.out.print("Enter the no of rows: ");
        n=s.nextInt();
        System.out.print("Enter the no of cols: ");
        o=s.nextInt();
        int a[][]=new int[n][o];
        int b[][]=new int[n][o];
        int c[][]=new int[n][o];
        System.out.println("Enter the elements of the matrix a:");
        for(int l=0;l<n;l++)
        {
            for(int m=0;m<o;m++)
            {
                a[l][m]=s.nextInt();
            }
        }
        System.out.println("Enter the elements of the matrix b:");
        for(int e=0;e<n;e++)
        {
            for(int f=0;f<o;f++)
            {
                b[e][f]=s.nextInt();
            }
        }
        System.out.println("the multiplication of matrix a*b is:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<o;j++)
            {
                for(int k=0;k<n;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<o;j++)
            {
                    System.out.print(c[i][j] + " ");  
             }
                System.out.println(" ");
        }
            s.close();
    }
}