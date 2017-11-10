import java.util.*;
class max_subarray
{
	public static void main(String[] args)
	{		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=in.nextInt();
		System.out.println();
		int a[]=new int[n];
		int i;
		System.out.println("Enter the elements:");
		for( i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		int  nl=0;
		i=0;
		while(i<n)
		{
			int nr=0;
			while(i<n-1 && a[i]<a[i+1])
			{
			  i++;
			}
			i=i+1;
            nr=i-nl;		
			int l[]=new int[i];
            for(int m=0;m<nl;m++)
			{
				l[m]=a[m];
			}					
			int r[]=new int[nr];
			for(int m=0;m<i-nl;m++)
			{
				r[m]=a[m+nl];
			}
			int c=merge(l,a,r,nl,nr);
			nl=c;	
		}
          for(int x=0;x<n;x++)
            {
			  System.out.print(a[x]+" ");
		    }		
	}
	public static int merge(int l[],int a[],int r[],int nl,int nr)
	{
		int i=0,j=0,k=0;
		if(nl==0)
		{
			while(nl!=nr)
			{
				l[nl]=a[nl];
				nl++;
			}	
		}
		else
		{
			while(i<nl && j<nr)
			{
				if(l[i]<=r[j])
				{
					a[k]=l[i];
					i++;
				}	
				else
				{
					a[k]=r[j];
					j++;
				}
				k++;
			}	
			while(i<nl)
			{
				a[k]=l[i];
				i++;
				k++;
			}	
			while(j<nr)
			{
				a[k]=r[j];
				j++;
				k++;
			}	
			nl=k;	
		}
		return nl;
	}
}	
	