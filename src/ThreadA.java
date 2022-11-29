public class ThreadA {
    public static void main(String[] args) throws InterruptedException{
ThreadB b=new ThreadB();
b.start();
Thread.sleep(10000);
synchronized (b)
{
    System.out.println("main thread calling wait method");
    b.wait(10000);
    System.out.println("main thread get notification");
    System.out.println(b.total);
}
    }
}

class ThreadB extends Thread
{
    int total=0;
    public void run()
    {
        synchronized (this)
        {
            System.out.println("child thread starts cal");
            for(int i=0;i<10;i++)
            {
                total=total+i;

            }
            System.out.println("child thread giving notification");
        }
    }
}
