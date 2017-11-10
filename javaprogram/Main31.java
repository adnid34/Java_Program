import java.util.*;
class Main31
{
public static void main (String args[])
{
	int a[]=new int[3];
	int b[]=new int[3];
	int i,j;
	Scanner ad=new Scanner(System.in);
	for(i=0;i<3;i++)
	{
		a[i]=ad.nextInt();
		b[i]=a[i];
	}
	for(i=0;i<2;i++)
	{
		for(j=i+1;j<3;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(i=0;i<3;i++)
	{
		System.out.println(a[i]);
	}
	System.out.println();
	for(i=0;i<3;i++)
	{
		System.out.println(b[i]);
	}
}
}