import java.util.*;
import java.io.*;
import java.math.*;
import java.util.ArrayList;
public class ds{
	public static void main(String args[]){
	int q,pq,s;
	ArrayList<Integer> arr = new ArrayList<Integer>();
	Scanner in=new Scanner(System.in);
	while (in.hasNextInt()){
		int n=in.nextInt();
		arr.clear();
		q=0;pq=0;s=0;
		boolean done=false;
		while (n>0){
			int n1=in.nextInt();
			int n2=in.nextInt();
			if (n1==1){
				arr.add(n2);
			}
			else{
				int ind=arr.indexOf(n2);
				if (ind==-1){
					done=true;
				}
				else{
					if (ind==arr.indexOf(Collections.max(arr))){
						pq++;
					}
					if (ind==0){
						q++;
					}
					if (ind==arr.size()-1){
						s++;
					}
				arr.remove(ind);
				}
			}
			n--;
		}
		int mm=Math.max(q,Math.max(pq,s));
		if (mm==0 || done){
			System.out.println("impossible");
		}
		else if(mm==q){
			if (mm==pq || mm==s){
				System.out.println("not sure");
			}
			else{
				System.out.println("queue");
			}
		}
		else if(mm==pq){
			if (mm==q || mm==s){
				System.out.println("not sure");
			}
			else{
				System.out.println("priority queue");
			}
		}
		else{
			System.out.println("stack");
		}
		
		
	}
	}
}