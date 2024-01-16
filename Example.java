
import java.util.Scanner;
public class Example
{
    public static void main(String []args)
      {
       try (Scanner Scan = new Scanner (System.in)) {
         int []array=new int[10];
          for(int i=0; i<=array.length ; i++)
            {
               System.out.print("Enter" + i +" element");
               array[i]= Scan.nextInt();
            }
          for (int i:array)
            {
               System.out.print(" " + i + " " );
            }
      }
       System .out.print ("Enter index to delete ");
      }
    
}
