import java.util.*;
import java.io.*;

public class Main37 
{	
	static int s;
	public static void main(String[] args) throws IOException 
	{
		Scanner ad=new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (ad.hasNextInt()&&ad.hasNextInt()) {
			int t=ad.nextInt();
			s=ad.nextInt();
			sb.append(t + " " + s + "\n");
			if (t == 0 && s == 0)
				break;
			
			Item[] items = new Item[t];
			for (int i = 0; i < t; ++i) {
				int x = ad.nextInt();
				items[i] = new Item(x);
			}
			Arrays.sort(items);
			
			for (int i = 0; i < t; ++i)
				sb.append(items[i].num + "\n");
		}
		System.out.print(sb);
		
		ad.close();
		System.exit(0);
	}
	static class Item implements Comparable<Item> {
		int num;
		
		public Item(int num) 
		{
			this.num = num;
		}

		public int compareTo(Item i)
		{
			int mod1 = (Math.abs(this.num) % s) * (this.num < 0 ? -1 : 1);
			int mod2 = (Math.abs(i.num) % s) * (i.num < 0 ? -1 : 1);

			if (mod1 != mod2)
			{
				return mod1 - mod2;
			}
			int mod21 = Math.abs(this.num) % 2;
			int mod22 = Math.abs(i.num) % 2;
			if (mod21 == 0 && mod22 == 1)
				return 1;
			if (mod21 == 1 && mod22 == 0)
				return -1;
			if (mod21 == 1 && mod22 == 1 && i.num <= this.num)
				return -1;
			if (mod21 == 1 && mod22 == 1 && i.num > this.num)
				return 1;
			if (mod21 == 0 && mod22 == 0 && i.num <= this.num)
				return 1;
			if (mod21 == 0 && mod22 == 0 && i.num > this.num)
				return -1;
			return 1;
		}
	}
}	
	
