import java.io.IOException;
import java.util.*;

public class Main80
 {
    public static void main(String[] args)throws IOException
	{
        Scanner scan = new Scanner(System.in);
        long t;
        long in1, in2;

        while (scan.hasNext()){
            int queue = 0;
            int stack = 0;
            int p_queue = 0;
            int im = 0;
            long max = 0;

            t = scan.nextLong();
            List ar = new ArrayList();
            while (t > 0){
                in1 = scan.nextInt();
                in2 = scan.nextInt();
                if (in1 == 1){
                    if (in2 > max)
                        max = in2;
                    ar.add(in2);
                }
                else {
                    if (!ar.contains(in2)){
                        im = 1;
                    }
                    else {
                        if (in2 == max){
                            max = 0;
                            Iterator iterator = ar.iterator();
                            while (iterator.hasNext()){
                                long temp = (long)iterator.next();
                                if (temp != in2 && temp > max)
                                    max = temp;
                            }
                            p_queue++;
                        }
                        if (in2 == (long)ar.get(0)){
                            queue++;
                        }
                        if (in2 == (long)ar.get(ar.size()-1)){
                            stack++;
                        }
                        ar.remove(in2);
                    }
                }
                t--;
            }
            if (im == 1)
                System.out.println("impossible");
            else if (stack == 0 && p_queue == 0 && queue == 0)
                System.out.println("impossible");
            else if (stack > queue && stack > p_queue)
                System.out.println("stack");
            else if (p_queue > stack && p_queue > queue)
                System.out.println("priority queue");
            else if (queue > p_queue && queue > stack)
                System.out.println("queue");
            else
                System.out.println("not sure");
        }
    }
}
