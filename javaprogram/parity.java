import java.util.*;
class parity
{
public static void main(String args[])
{
String a,c;
boolean p;
int b,i=0;
Scanner scan = new Scanner(System.in);
System.out.println("Enter the sender  string");
a=scan.nextLine();
System.out.println("Enter the parity \n 1.odd \n 2.even");
b=scan.nextInt();
int count=0;
int len= a.length();
while(i<len)
{
if(a.charAt(i)==1)
{
	count++;
}
i++;
}
if(b==1)
{
if(count%2==0)
	a=a+"1";
else
	a=a+"0";
}
else
{
	if(count%2==0)
		a=a+"0";
	else
		a=a+"1";
}
System.out.println(a);
System.out.println("Enter the reciever string");
	c=scan.next();
	p=a.equals(c);
	if(p==true)
		System.out.println("no error");
	else
		System.out.println("error occured");
}
}