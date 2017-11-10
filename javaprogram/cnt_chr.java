import java.util.*;
import java.io.*;
import java.io.IOException;
public class cnt_chr 
{
	public static void main(String[] args) throws IOException
	{
		int i,j=0,k,l;
		String a;
		String b="";
		Scanner br = new Scanner(System.in);
		a=br.nextLine();
		while(a.equals("0")==false)
		{
			l=a.length();
			String[] str=a.split(" ");
			for(i=0;i<str.length;i++)
			{	
				String temp=str[i];
				if(b.length()<=temp.length())
				{
					b=temp;
				}
				if (i==str.length-1)
					System.out.print(temp.length());
				else	
					System.out.printf("%d-",temp.length());
			}
			System.out.println();
			a=br.nextLine();
		}
			System.out.println();
			System.out.println("The biggest word: "+b);
	}
}