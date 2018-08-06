
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=23,c=0;
		for(int i=2;i<=n;i++)
		{
			c=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					c++;
			}
		}
			if(c!=0)
			System.out.print("yes");
			else
			System.out.print("No");
		
	}
}
