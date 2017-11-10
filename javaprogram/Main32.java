import java.io.IOException;
import java.util.*;
import java.io.*;
public class Main32 
{
    public static void main(String[] args) throws IOException {
       Scanner ad=new Scanner(System.in);
    int l=ad.nextInt();
    ad.nextLine();
    while (l>0)
	{
    String a=ad.nextLine();
    String b="";
    if (a.charAt(0)!=' ')
	{
    b=b+(a.charAt(0));
    }
    for(int i=1;i<a.length();i++)
	{
    if (a.charAt(i-1)==' ' && a.charAt(i)!=' ')
	{
        b=b+a.charAt(i);
    }
    }
    System.out.print(b);
    l--;
    System.out.println();
}
}
}