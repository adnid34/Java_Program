import java.io.IOException;
import java.util.*;
public class Main1
{
	public static void main(String[] args)throws IOException
	{
		Scanner scan=new Scanner (System.in);
		int a,n,m,t,sum;
		m=0;n=1;
		a=0;
		t=scan.nextInt();
		System.out.print(m+" "+n);
		for(a=0;a<46;a++)
		{
			while(a<t-2)
			{
				sum=m+n;
				m=n;
				n=sum;
				a++;
				System.out.print(" "+sum);
			}
		}	
		System.out.println();
		
	}
}