import java.util.Scanner;
class matadd
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the size of n: ");
        int n=s.nextInt();
        System.out.print("enter the size of o: ");
        int o=s.nextInt();
        int a[][]=new int[n][o];
        int b[][]=new int[n][o];
        int c[][]=new int[n][o];
        System.out.println("enter the elements of matrix a: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<o;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("enter the elements of matrix b: ");
        for(int k=0;k<n;k++)
        {
            for(int l=0;l<o;l++)
            {
             b[k][l]=s.nextInt();
            }
        }
        System.out.println("the addition of matrix a+b is: ");
        for(int m=0;m<n;m++)
        {
            for(int d=0;d<o;d++)
            {
              c[m][d]=a[m][d]+b[m][d];
              System.out.print(c[m][d] + " ");
            }
            System.out.println();
        }
        s.close();
    }
}