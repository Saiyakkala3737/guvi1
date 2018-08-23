/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int n1,n2,lcm;
	    Scanner sc=new Scanner(System.in);
	    n1=sc.nextInt();
	    n2=sc.nextInt();
	    if(n1>0&&n2>0)
	    {
	    		lcm = (n1 > n2) ? n1 : n2;
        		while(true)
        		{
            			if( lcm % n1 == 0 && lcm % n2 == 0 )
            			{
                				System.out.println(lcm);
                				break;
            			}
            		lcm++;
        		}
	    }
	    else
	    System.out.println("enter only positive numbers");
	}
}
