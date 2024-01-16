/*  Java Program to get 10 element and delete an element from an Array */

import java.utill.;
import java.util.Scanner;

public class arraydeletion
{
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in)) {
          int n;   
          System.out.println("Enter the number of elements :");
          n=scanner.nextInt();    
          
          Integer arr[]=new Integer[n];    
          System.out.println("Enter the elements of the array :");
          for(int i=0;i<n;i++)      
          {
              arr[i]=scanner.nextInt();
          }
          System.out.println("Enter the element you want to remove ");
          int elem = scanner.nextInt();
  
  for(int i = 0; i < arr.length; i++)
  {
   if(arr[i] == elem)   
   {
          for(int j = i; j < arr.length - 1; j++)
          {
              arr[j] = arr[j+1];
          }
          break;
   }
  }
   
    System.out.println("Elements after deletion " );
    for(int i = 0; i < arr.length-1; i++)
    {
               System.out.print(arr[i]+ " ");
    }
        }  
    }
}
