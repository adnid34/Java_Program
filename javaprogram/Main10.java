import java.io.IOException;
import java.util.*;
import java.io.*;
import java.math.*;
import java.util.ArrayList;
public class Main10
{
	public static void main(String args[])throws IOException
	{
	int q,pq,s;
	ArrayList<Integer> arr = new ArrayList<Integer>();
	Scanner scan=new Scanner(System.in);
	while (scan.hasNext())
	{
		int n=scan.nextInt();
		arr.clear();
		q=0;pq=0;s=0;
		boolean done=true;
		while (n>0)
		{
			int n1=scan.nextInt();
			int n2=scan.nextInt();
			if (n1==1)
			{
				arr.add(n2);
			}
			else
			{
				if (arr.size()==1 && n2==arr.get(0))
				{
					q++;
					pq++;
					s++;
					arr.remove(0);
				}
				int ind=arr.indexOf(n2);
				if (ind==-1)
					done=false;
				if(ind!=-1 && done)
				{
					if (ind==0)
					{
						if (arr.indexOf(Collections.max(arr))==0)
						{
							q++;
							pq++;
						}
						else
						{
							q++;
						}
					}
					else if(ind==arr.size()-1)
					{
						if (arr.indexOf(Collections.max(arr))==arr.size()-1)
						{
							s++;
							pq++;
						}
						else
						{
							s++;
						}
					}
					else if(ind==arr.indexOf(Collections.max(arr)))
					{
						pq++;
					}
					
					arr.remove(ind);
				}
			}
			
			n--;
		}
		int mm=Math.max(q,Math.max(pq,s));
		if (mm==0)
		{
			System.out.println("impossible");
		}
		else if(mm==q)
		{
			if (mm==pq || mm==s)
			{
				System.out.println("not sure");
			}
			else
			{
				System.out.println("queue");
			}
		}
		else if(mm==pq)
		{
			if (mm==q || mm==s)
			{
				System.out.println("not sure");
			}
			else
			{
				System.out.println("priority queue");
			}
		}
		else
		{
			System.out.println("stack");
		}
		
		
	}
	}
}