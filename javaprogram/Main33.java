import java.util.*;
import java.io.*;
class Main33
{
	public static void main(String args[])
	{
		int j=0,k,l;
		String a;
		String c="";
		Scanner ad = new Scanner(System.in);
		a=ad.nextLine();
		while(a.equals("0")==false)
		{
			
			l=a.length();
			String[] b=a.split(" ");
			for(int i=0;i<b.length;i++)
			{	
				String temp=b[i];
				if(c.length()<=temp.length())
				{
					c=temp;
				}
				if (i==b.length-1)
					System.out.print(temp.length());
				else	
					System.out.printf("%d-",temp.length());
			}
			System.out.println();
			a=ad.nextLine();
				
			
			
		}
					
					System.out.println();
					System.out.println("The biggest word: "+c);
		
	}
}