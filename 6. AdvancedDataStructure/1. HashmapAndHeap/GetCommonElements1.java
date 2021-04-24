package HashmapAndHeap;
import java.util.*;
public class GetCommonElements1 {
	public static void main(String[] args) throws Exception {
	    // write your code here
		Scanner sc = new Scanner(System.in);
	    int n1 = sc.nextInt();
	    int a1[] = new int[n1];
	    for(int i=0 ; i<n1 ; i++)
	    {
	        a1[i] = sc.nextInt();
	    }
	    
	    int n2 = sc.nextInt();
	    int a2[] = new int[n2];
	    for(int i=0 ; i<n2 ; i++)
	    {
	        a2[i] = sc.nextInt();
	    }
	    
	    HashMap<Integer , Integer> freqMap = new HashMap<>();
	    for(int val : a1)
	    {
	        if(freqMap.containsKey(val))
	        {
	            int oldFreq = freqMap.get(val);
	            int newFreq = oldFreq + 1;
	            freqMap.put(val , newFreq);
	        }
	        else
	        {
	            freqMap.put(val , 1);
	        }
	    }
	    for(int val : a2)
	    {
	        if(freqMap.containsKey(val))
	        {
	            System.out.println(val);
	            freqMap.remove(val);
	        }
	    }
	    sc.close();
	}

}
