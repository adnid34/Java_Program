import java.io.IOException;
import java.util.*;
import java.lang.Math;
import java.io.*;
class Main4
{
public static void main (String args[])throws IOException
{
	double x1,y1,x2,y2,d;
Scanner scan=new Scanner(System.in);
x1=scan.nextDouble();
y1=scan.nextDouble();
x2=scan.nextDouble();
y2=scan.nextDouble();
d=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
System.out.printf("%.4f\n",d);
}
} 