import java.util.*;
public class Main39
{

private static ArrayList<Integer> v = new ArrayList<Integer>();
private static int counter = 0;

private static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
{
	int i = 0;
	int j = 0;
	int s1 = a.size();
	int s2 = b.size();
	ArrayList<Integer> r = new ArrayList<Integer>();

	while (i < s1 && j < s2)
	{
		if (a.get(i) < b.get(j))
		{
			r.add(a.get(i));
			i++;
		}
		else
		{
			r.add(b.get(j));
			counter += (int)(a.size()) - i;
			j++;
		}
	}

	while (i < s1)
	{
		r.add(a.get(i));
		i++;
	}

	while (j < s2)
	{
		r.add(b.get(j));
		j++;
	}

	return r;
}

private static ArrayList<Integer> mergeSort(int left, int right)
{
	ArrayList<Integer> r = new ArrayList<Integer>();
	int middle = (left + right) / 2;

	if (left + 1 >= right)
	{
		r.add(v.get(left));
		return r;
	}

	ArrayList<Integer> a = mergeSort(left, middle);
	ArrayList<Integer> b = mergeSort(middle, right);
	r = new ArrayList<Integer>(merge(new ArrayList(a), new ArrayList(b)));

	return r;
}

public static void main(String[] args)
{
	int y;
	int x=0;
	Scanner ad=new Scanner(System.in);
	while (ad.hasNextInt())
	{
		y=ad.nextInt();
		if (y==0)
			break;
		counter = 0;
		v.clear();

		for (int i = 0; i < (y); ++i)
		{
			
				v.add(ad.nextInt());
			
		}

		mergeSort(0, y);

		if (counter % 2 != 0)
		{
			System.out.println("Marcelo");
		}
		else
		{
			System.out.println("Carlos");
		}
	}

}
}
