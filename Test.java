class First extends Thread
{
    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("From First : "+i);
        }
    }
}
class Second extends Thread
{
    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("From Second : "+i);
        }
    }
}
class Test
{
    public static void main(String arg[])
    {
        First f = new First();
        Second s = new Second();
        Thread t1 = new Thread(f);
        Thread t2 = new Thread(s);
        t1.start();
        t2.start();
    }
}