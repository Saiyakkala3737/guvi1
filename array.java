/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,k,num,sum=0;
		int a[]=new int[10];
		Scanner s=new Scanner(System.in);
		 num=s.nextInt();
	         k=s.nextInt();
		for(i=0;i<num;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<k;i++)
	          {
		       sum=sum+a[i];
	             }
	       System.out.println(sum);
        }
}
