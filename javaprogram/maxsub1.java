import java.util.*;
class maxsub1
{
public static void main(String args[])
{
int a[] =new int[15];
int ax[]=new int [15];
int j=0;
Scanner p=new Scanner (System.in);
System.out.println("enter the size of array");
int l=p.nextInt();
System.out.println("enter the array");
for(int i=0;i<l;i++)
{
a[i]=p.nextInt();
}
if(a[0]<a[1])
{
	ax[j]=0;
	j++;
}
for(int i=1;i<l-1;i++)
{
while(i<l-1&&a[i]<a[i+1])
{
	//ax[j]=i;
	//j++;
	i++;
}
ax[j]=i;
j++;
}
//if(a[l-1]>a[l])
	//ax[j]=l;
for (int k=0;k<=j;k++)
{
System.out.print(ax[k]+"  ");
}
}
}









