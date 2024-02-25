import java.util.*;
public class multiplicationtable {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("enter a number for multiplication table: ");
            int a;
            a=s.nextInt();
            System.out.printf("the muliplication table of %d:",a);
            System.out.println("");
            for(int i = 1; i <= 10; ++i)
            {
                System.out.printf("%d * %d = %d \n", a, i, a * i);
            }
        }
    }
}