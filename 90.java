/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
                String str;
                Scanner sc=new Scanner(System.in);
                str=sc.nextLine();
                char[] carray = str.toCharArray();
                for (char c : carray) 
                {
                    if (Character.isDigit(c))
                    {
                        System.out.print(c);
                    }
	    }
           }
}    
    
    
