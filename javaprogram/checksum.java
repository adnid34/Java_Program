import java.util.*;
class checksum
{
	public static int plus(int a,int b, int c)
	{
		int m= a+b;
		int n=m%2;
		int p=n+c;
		int q=p%2;
		return q;
	}
	
public static void main(String args[])
{
String a,b,c,d,e;
int r;
System.out.println("enter the headr in 8 bit bunch");
Scanner scan =new Scanner(System.in);
a= scan.nextLine();
b= scan.nextLine();
c= scan.nextLine();
d= scan.nextLine();
int i =7;

while(i>=0)
{
	r=plus(a.charAt(i),b.charAt(i),carry)
	e=e+integer.toString(r);
}
}
}