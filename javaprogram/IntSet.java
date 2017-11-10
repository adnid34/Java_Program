package IntSet;
import java.util.ArrayList;
import java.util.Collection;


public class IntSet {

private ArrayList<Integer> intset;

public IntSet(){
    intset = new ArrayList<Integer>();
}

public void insert(int x){
    intset.add(x);
}

public void remove(int x){
    //implement here
    intset.indexOf(x);
}

public boolean member(int x){
    //implement here
    return true;
}

public IntSet intersect(IntSet a){
    //implement here
    return a;
}

public IntSet union(IntSet a){
    //implement here
    return a;
}

public IntSet difference(IntSet a){
    //implement here
    IntSet b = new IntSet();
    return b; 
}
}