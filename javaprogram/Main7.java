import java.io.IOException;
import java.util.*;
class Main7
{
   public static void main(String args[])throws IOException
   {
	   Scanner scan=new Scanner(System.in);
	   int i=scan.nextInt();
	   int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0;
	   int p=i;
	   while(i>0)
	   {
		   if(i==1)
		   {
			   c1=c1+1;
			   break;
		   }   
		   else if(i>=2 && i<5)
		   {
			   c2=c2+(i/2);
			   i=i%2;
		   }   
		   else if(i>=5  && i<10)
		   {
			   c3=c3+(i/5);
			   i=i%5;
		   }   
		   else if(i>=10 && i<20)
		   {
			   c4=c4+(i/10);
			   i=i%10;
		   }
			else if(i>=20&&i<50)
			{
				c5=c5+(i/20);
				i=i%20;
			}
			else if(i>=50&&i<100)
			{
				c6=c6+(i/50);
				i=i%50;
			}
           else
           {
			  c7=c7+(i/100);
              	i=i%100;		  
		   }			   
	   } 
		System.out.printf("%d\n",p);	   
	   System.out.printf("%d nota(s) de R$ 100,00\n",c7);
	   System.out.printf("%d nota(s) de R$ 50,00\n",c6);
	   System.out.printf("%d nota(s) de R$ 20,00\n",c5);  
	   System.out.printf("%d nota(s) de R$ 10,00\n",c4);
	   System.out.printf("%d nota(s) de R$ 5,00\n",c3);  
	   System.out.printf("%d nota(s) de R$ 2,00\n",c2);
	   System.out.printf("%d nota(s) de R$ 1,00\n",c1);  
   }   
}