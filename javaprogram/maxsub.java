import java.util.*;
class maxsub
{
public static void main(String args[])
{
int a[] =new int[15];
int ax[]=new int [15];
int j=0,x=0,y=1;
Scanner p=new Scanner (System.in);
System.out.println("enter the size of array");
int l=p.nextInt();
System.out.println("enter the array");
for(int i=0;i<l;i++)
{
a[i]=p.nextInt();
}
for(int i=0;i<l-1;i++)
{
while(i<l-1&&a[i]>a[i+1])
{
	ax[j]=i+1;
	j++;
	i++;
}
}
if(a[l-1]>a[l])
	ax[j]=l;
for (int k=0;k<j;k++)
{
System.out.print(ax[k]+"  ");
}
for(int q=0;q<j-1;q++)
{
merge(a,x,ax[y]-1);
x=ax[y];
y++;
}
}

private static int[] arr;
	private static int[] temparr;
	private static int length;

private static void merge(int[] a,int li,int hi)
	{
		arr=a;
		length=a.length;
		temparr=new int[length];
		int mi=0;
		if(li<hi&&mi<hi)
		{
			mi=(li+hi)/2;
			merge(a,li,mi);
			merge(a,mi+1,hi);
			mergepart(li,mi,hi);
		}
	}
	private static void mergepart(int li,int mi,int hi)
	{
		for(int i=li;i<=hi;i++)
		{
			temparr[i]=arr[i];
		}
		int i=li;
		int j=mi;
		int k=li;
		while(i<=mi&&j<=hi)
		{
			if(temparr[i]<=temparr[j])
			{
				arr[k]=temparr[i];
				i++;
			}
			else
			{
				arr[k]=temparr[j];
				j++;
			}
			k++;
		}
		while(i<=mi)
		{
			arr[k]=temparr[i];
			k++;
			i++;
		}
	
	}
}