import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			
		String s="during";
		int l=s.length();
		if(l%2==0)
		System.out.print(s.substring(0,l/2-1)+"**"+s.substring(l/2+1,l));
		else
		System.out.print(s.substring(0,l/2)+"*"+s.substring(l/2+1,l));
		
	}
}
