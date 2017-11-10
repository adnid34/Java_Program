import java.io.IOException;
import java.util.*;
import java.io.*;
class Main34
{
public static void main(String args[])throws IOException
{
Scanner ad=new Scanner(System.in);
int i,l,j,t;
t=ad.nextInt();
while(t>0)
{
String st1="";
ad.nextLine();
String st2=ad.nextLine();
j=ad.nextInt();
l=st2.length();
for(i=0;i<l;i++)
{
st1=st1+(char)('Z'+(st2.charAt(i)-'Z'-j)%26);
}
System.out.print(st1);
System.out.println();
t--;
}
}
}