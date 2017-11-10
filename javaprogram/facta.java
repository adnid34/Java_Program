import java.io.IOException;
import java.util.*;
import java.math.BigInteger;
public class facta
{
	public static void main(String[] args)throws IOException
	{
		Scanner scan=new Scanner(System.in);
		while (scan.hasNextInt()){
		BigInteger bi1=BigInteger.valueOf(0);
		BigInteger bi2=BigInteger.valueOf(0);
		BigInteger sum=BigInteger.valueOf(0);
		int a=0,b=0;
		a=scan.nextInt();
		b=scan.nextInt();
			bi1=facto(a);
			bi2=facto(b);
		
		sum=bi1.add(bi2);
    System.out.println(sum);		
	}
	}
	public static BigInteger facto(int x)
	{
		int i;
		BigInteger fact=BigInteger.valueOf(1);
		if(x==0)
		{
			fact=BigInteger.valueOf(1);
		}
		for(i=1;i<=x;i++)
		{
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}
}