import java.io.IOException;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main6
{
	public static void main(String[] args)throws IOException
	{
		Scanner scan=new Scanner(System.in);
		int i,k,t;
		t=scan.nextInt();
		for(i=0;i<t;i++)
		{
			k=scan.nextInt();
		    fibo(k);
		}
	}
	public static BigInteger fibo(int a)
	{
		int j;
		BigInteger x=BigInteger.valueOf(0);
		BigInteger y=BigInteger.valueOf(1);
		BigInteger trm;
		j=1;
		if(a==0)
		{
			trm=BigInteger.valueOf(0);
		}
		else
		{
			do
		{
			trm=x.add(y);
			x=y;
			y=trm;
			j++;
		}	
		while(j<a);
		}
		System.out.printf("Fib(%d) = %d\n",a,trm);
		return trm;
	}
}