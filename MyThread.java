package Multhreading;

class YourThread extends Thread
 {
    public void run() 
    {
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

public class  MyThread
 {
    public static void main(String[] args) 
    {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        
        thread1.start(); // Starts the thread and calls run()
        thread2.start(); // Starts another thread
    }

    private void start()
    {
    }
}
