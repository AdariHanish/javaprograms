abstract class employee 
{
    int s = 10000;
    String n = "hanish";
    void salary(int a)
    {
        a=100;
        System.out.println(a);
    }
}

class bonous extends employee 
{
    void salary(int a,int b)
    {
        a=100;
        b=20;
        b=b+a;
        System.out.println("the salary of the employee with bonous is" + b);
    }
}
class bonous1 extends employee 
{
    int b = 700;
    int q = s + b;
    void salary()
    {
        System.out.println("the salary of the employee with bonous is" + q);
    }
}

class employee1 
{
    public static void main(String args[]) 
    {
        bonous1 q=new bonous1();
        q.salary();
    }
}