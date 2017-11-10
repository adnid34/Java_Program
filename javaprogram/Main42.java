import java.io.IOException;
import java.util.*;
import java.io.*;
import java.lang.Math;
import java.math.BigInteger;
public class Main42 
{
	
    public static void main(String[] args) throws IOException
{
	Scanner scan=new Scanner(System.in);
	int i,j;
	ArrayList<Integer> cashier = new ArrayList<Integer>();
	ArrayList<Integer> item = new ArrayList<Integer>();
	ArrayList<Integer> time = new ArrayList<Integer>();
	int itm=scan.nextInt();
	int client=scan.nextInt();
	int mindx;
	for( i=0;i<itm;i++)
		{
		cashier.add(scan.nextInt());
		time.add(0);
		}
	for( j=0;j<client;j++)
		item.add(scan.nextInt());	
	while (item.size()>0)
			{
			mindx=time.indexOf(Collections.min(time));
			time.set(mindx,time.get(mindx)+item.remove(0)*cashier.get(mindx));
			}
	int total=Collections.max(time);
	System.out.println(total);
}
}
