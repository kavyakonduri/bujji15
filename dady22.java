/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("enter a umber");
        int n=sc.nextInt();
        int num=0,i,count=0;
        for(i=2;i<num;i++)
        {
          if(num%i==0)
          {   
             count++;
             break;
          }
        }
     if(count==0)
     {
       System.out.println("yes it is a prime number");
     }
     else
     {
        System.out.println("no it is not a prime number");

     }
	}
}
