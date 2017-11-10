package IntSet;
import java.util.ArrayList;
import java.util.Collection;
public class IntSet 
{
private ArrayList<Integer> intset;

public IntSet()
{
    intset = new ArrayList<Integer>();
}

public void insert(int x)
{
    intset.add(x);
}
public IntSet intersect(IntSet a)
{   
    return a;
}

public IntSet union(IntSet a)
{
    return a;
}

public IntSet difference(IntSet a)
{
    IntSet b = new IntSet();
    return b; 
}
public static void main(String args[])
{
	
}
}