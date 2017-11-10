import java.io.IOException;
import java.util.*;
public class Main11
 {
	
public static int s=0;
    public static void main(String[] args) throws IOException 
	{
		Scanner br=new Scanner(System.in);
		int i,n;
		int[] a;
		n=br.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=br.nextInt();
		}
		for(i=0;i<n;i++)
		{
			int t=fab(a[i]);
			System.out.printf("fib(%d) = %d calls = %d\n",a[i],s-1,t);
			s=0;
		}
		
		
	}
	public static int fab(int x)
	{
		if(x==0)
		{
			s++;
			return 0;
		}
		else if(x==1)
		{
			s++;
			return 1;
		}
		else
		{
			s++;
			return (fab(x-1)+fab(x-2));
		}
		
	}
}