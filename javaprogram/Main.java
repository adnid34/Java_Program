import java.io.IOException;
import java.util.*;
class Main
{
public static void main (String args[])throws IOException
{
	int rst1=0,rst2=0;
Scanner scan=new Scanner(System.in);
int a[]=new int[20];
int l=scan.nextInt();
for(int i=0;i<l;i++)
{
	a[i]=scan.nextInt();
}
for(int i=0;i<l-1;i+=2)
{
	int p=a[i];
	if(p>a[i+1])
		 rst1+=p;
}
for(int i=1;i<l;i+=2)
{
	int p=a[i];
	if(p>a[i-1])
		 rst2+=p;
}
if(rst1>rst2)
	System.out.print(rst1);
else
	System.out.print(rst2);
}
}