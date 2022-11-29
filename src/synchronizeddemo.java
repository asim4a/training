class display
{
    public synchronized void wish(String name)
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("good morning");
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {

            }
            System.out.println(name);
        }
    }
}
class Mythread1 extends Thread{
    display d;
    String name;
    Mythread1(display d,String name)
    {
        this.d=d;
        this.name=name;
    }
    public void run()
    {
        d.wish(name);
    }
}
public class synchronizeddemo
{
    public static void main(String[] args)
    {
        display d=new display();
        Mythread1 t1=new Mythread1(d,"dhoni");
        Mythread1 t2=new Mythread1(d,"virat");
        t1.start();
        t2.start();
    }
}