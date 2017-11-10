import java.util.*;
public class Main38
{
    public static void main(String[] args) {
		Scanner ad=new Scanner(System.in);
		int n=ad.nextInt();
		for (int k=1;k<n+1;k++)
		{
			int s = ad.nextInt();
			int t = ad.nextInt();
			Queue<Integer> queue = new LinkedList<Integer>();
			for (int i = 1; i <= s; i++)
				queue.add(i);
			int a=0;
			while (!queue.isEmpty()) 
			{
				for (int i = 0; i < t-1; i++)
					queue.add(queue.remove());
				a=queue.remove();
			} 
        System.out.println("Case "+k+": "+a);
		}
	}
}

