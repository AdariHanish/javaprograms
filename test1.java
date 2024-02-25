/*java program to creat abstract class employee with abstract methods calcuate salary and display info */
abstract class employee
{
    abstract void salary();
}
class employee1 extends employee
{
  int s=10000;
  int b=1000;
  String c="programmer";
  String a="hanish";
  void salary()
  {
    b=s+b;
    System.out.println("the name of the employee is:" + a);
    System.out.println("the role of the employee is:" + c);
    System.out.println("the salary of the employee is:" + s);
    System.out.println("the salary of employee with bonous is:" + b);
  }
}
class employee2 extends employee
{
  int s=50000;
  int b=500;
  String a="naidu";
  String c="developer";
  void salary()
  {
    b=s+b;
    System.out.println("the name of the employee is:" + a);
    System.out.println("the role of the employee is:" + c);
    System.out.println("the salary of the employee is:" + s);
    System.out.println("the salary of employee with bonous is:" + b);
  }
}
public class test1
{
    public static void main(String args[])
    {
        employee1 q=new employee1();
        employee2 p=new employee2();
        q.salary();
        p.salary();
    }
}