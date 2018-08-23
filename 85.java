/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	String s;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		String even="";
		String odd="";
		char a[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				even=even+a[i];
			}
			else
			{
				odd=odd+a[i];
			}
		}
		System.out.print(even+" "+odd);	// your code goes here
	}
}
