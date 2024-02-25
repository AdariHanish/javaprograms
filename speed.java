import java.util.*;
public class speed 
{
    public static void main(String args[])
    {
       try( Scanner s=new Scanner(System.in);){
        int a,b,c,d,e,f;
        System.out.print("ENETR THE SPEED OF THE RACER A: ");
        a=s.nextInt();
        System.out.print("ENETR THE SPEED OF THE RACER B: ");
        b=s.nextInt();
        System.out.print("ENETR THE SPEED OF THE RACER C: ");
        c=s.nextInt();
        System.out.print("ENETR THE SPEED OF THE RACER D: ");
        d=s.nextInt();
        System.out.print("ENETR THE SPEED OF THE RACER E: ");
        e=s.nextInt();
        System.out.print("THE QUALIFYING SPEED OF THE RACERS IS: ");
        f=(a+b+c+d+e)/5;
        System.out.println(f);
    }
}
}
