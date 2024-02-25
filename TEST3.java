class test extends Thread
{
    public void run()
    {
        System.out.println("hello world this is thread");
    }
}
class TEST3{
    public static void main(String args[])
    {
        test t=new test();
        t.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("Test");
        }
    }
}