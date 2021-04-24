package HashmapAndHeap;
import java.util.*;

public class LongestConsecutiveSequenceOfElements {
	
	public static void main(String[] args) throws Exception {
	    // write your code here
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int a[] = new int[n];
	    for(int i=0 ; i<n ; i++)
	    {
	        a[i] = sc.nextInt();
	    }
	    
	    HashMap<Integer , Boolean> hmap = new HashMap<>();
	    for(int val : a)
	    {
	        hmap.put(val , true);
	    }
	    
	    for(int val : a)
	    {
	        if(hmap.containsKey(val - 1))
	        {
	            hmap.put(val , false);
	        }
	    }
	    
	    //ml = main length
	    //msp = main starting point
	    int ml = 0;
	    int msp = 0;
	    for(int val : a)
	    {
	        if(hmap.get(val) == true)
	        {
	            //tl = temporary length
	            //tsp = temporary starting point
	            int tl = 1;
	            int tsp = val; 
	            
	            while(hmap.containsKey(tsp + tl))
	            {
	                tl++;
	            }
	            if(tl > ml)
	            {
	                ml = tl;
	                msp = tsp;
	            }
	        }
	    }
	    for(int i=0 ; i<ml ; i++)
	    {
	        System.out.println(msp + i);
	    }
	    sc.close();
	 }

}
