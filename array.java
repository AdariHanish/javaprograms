import java.util.Scanner;
public class array {
    public static void main(String args[]) {
        try (Scanner a = new Scanner(System.in)) {
            System.out.print("enter the size of the array: ");
            int n = a.nextInt();
            int arr[] = new int[n];
            System.out.print("enter the values of the array: ");
            // int arr[]=
            for (int i = 0; i < n; i++) {
                arr[i] = a.nextInt();
            }
            System.out.print("the array elements are: ");

            for (int i = 0; i < n; i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println("");
            System.out.println("the size of the array: " + n + "\n");
        }
    }
}