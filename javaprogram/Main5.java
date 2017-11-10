import java.io.IOException;
import java.util.*;
public class Main5
{
	public static void main(String[] args)throws IOException
	{
		Scanner scan=new Scanner(System.in);
		int n,m,count;
		long mul,sum;
		while(scan.hasNextLine())
		{
		n=scan.nextInt();
		sum=0;
		mul=0;
		count=1;
		if(n==0)
		{
			break;
		}
			do
			{
				m=n%10;
				n=n/10;
				mul=m*facto(count);
				sum=sum+mul;
				count++;
			}while(n>0);
			System.out.println(sum);
		}
	}
	public static long facto(int a)
	{
		int i;
		long fact=1;
		for(i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}