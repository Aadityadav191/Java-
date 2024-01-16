package Multhreading;
class MyRunnable implements Runnable 
{
    public void run() 
    {
          // Code to be executed in the thread
         try
        {
          for (int i=0;  i<6; i++)
            {
                System.out.println(i);
                Thread.sleep(2000);
            }
        }

        catch(Exception e)
        {
          System.out.print("Shyam yadav ");
        }
    }
}

public class ThreadExample 
{
    public static void main(String[] args)
    {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
