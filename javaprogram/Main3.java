import java.io.IOException;
import java.util.*;
import java.io.*;
public class Main3 {
 
    public static void main(String[] args) throws IOException {
 
       Scanner br=new Scanner (System.in);
		int i,n,f,s,th;
		f=0;s=1;
		i=0;
		n=br.nextInt();
		System.out.printf("%d %d",f,s);
		for(i=0;i<46;i++)
		{
			while(i<n-2)
			{
				th=f+s;
				f=s;
				s=th;
				i++;
				System.out.printf(" %d",th);
				if(i=='\0')
				{
					break;
				}
			}
		}	
 
    }
 
}