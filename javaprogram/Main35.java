import java.util.*;
class Main35
{
public static void main(String args[])
{
int i,j,k,temp=0;
Scanner ad =new Scanner(System.in);
int t=ad.nextInt();
while(t>0)
{  
	int c=0;
	k=ad.nextInt();
	int r[]=new int[k];
	for(i=0;i<k;i++)
	{
		r[i]=ad.nextInt();
	}
	for(i=0;i<k-1;i++)
	{
		for(j=i+1;j<k;j++)
		{
			if(j<r.length&&r[i]>r[j])
			{
				temp=r[i];
				r[i]=r[j];
				r[j]=temp;
				c=c+1;
			}
		}
		
	}
	System.out.println("Optimal train swapping takes"+ c +"swaps.");
	t--;
}
}
}