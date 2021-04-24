package HashmapAndHeap;
import java.util.*;
import java.io.*;
public class KLargestElements {
	
	public static void main(String[] args) throws Exception {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      int n = Integer.parseInt(br.readLine());
	      int[] arr = new int[n];

	      for (int i = 0; i < n; i++) {
	         arr[i] = Integer.parseInt(br.readLine());
	      }

	      int k = Integer.parseInt(br.readLine());
	      // write your code here
	      PriorityQueue<Integer> pq = new PriorityQueue<>();
	      for(int i=0 ; i<arr.length ; i++)
	      {
	          if(i < k)
	          {
	              pq.add(arr[i]);
	          }
	          else
	          {
	              if(arr[i] > pq.peek())
	              {
	                  pq.remove();
	                  pq.add(arr[i]);
	              }
	          }
	      }
	      while(pq.size() > 0)
		  {
				System.out.println(pq.peek());
				pq.remove();
		  }
	      //OR
//	       for(int val : arr)
//	       {
//	           pq.add(val);
//	       }
	     
//	       while(pq.size() > 0)
//	 		{
//	 		    if(pq.size() > k)
//	 		    {
//	 		        pq.remove();
//	 		    }
//	 		    else
//	 		    {
//	         		System.out.println(pq.peek());
//	         		pq.remove();
//	 		    }
//	 		}
	    }

}
