import java.io.IOException;
import java.util.*;
import java.io.*;
public class tr_swap {
 
    public static void main(String[] args) throws IOException 
	{
 
       Scanner ad=new Scanner(System.in);
		int temp=0,t,j,i=0,k,count=0;
		t=ad.nextInt();
		while(t>0)
		{
			count=0;
			j=ad.nextInt();
			int[] a=new int[j];
			for(i=0;i<j;i++)
			{
				a[i]=ad.nextInt();
			}
		for(i=0;i<j;i++)
			{
				for(k=0;k<j;k++)
				{
					if((k+1)<a.length&&(a[k]>a[k+1]))
				{
					temp=a[k+1];
					a[k+1]=a[k];
					a[k]=temp;
					count++;
				}
				}
			}
			System.out.printf("Optimal train swapping takes %d swaps.\n",count);
		t--;
		}
 
    }
 
}