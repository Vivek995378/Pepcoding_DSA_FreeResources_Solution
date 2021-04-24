package StacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class SlidingWindowMaximum {
	
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] arr = new int[n];
	    for(int i = 0; i < n; i++){
	       arr[i] = Integer.parseInt(br.readLine());
	    }
	    int k = Integer.parseInt(br.readLine());

	    // code
	    int nge[] = new int[n];
	    Stack<Integer> st = new Stack<>();
	    st.push(arr.length-1);
	    nge[arr.length-1] = arr.length;
	    for(int i=arr.length-2; i>=0; i--)
	    {
	        while(st.size() > 0 && arr[i] >= arr[st.peek()])
	        {
	            st.pop();
	        }
	        if(st.size() == 0)
	        {
	            nge[i] = arr.length;
	        }
	        else
	        {
	            nge[i] = st.peek();
	        }
	        st.push(i);
	    }
	    
	    for(int i=0; i<=arr.length-k; i++)
	    {
	        int j = i;
	        while(nge[j] < i+k)
	        {
	            j = nge[j];
	        }
	        System.out.println(arr[j]);
	    }
	 }

}

/*
 * e.g.
for the array [2 9 3 8 1 7 12 6 14 4 32 0 7 19 8 12 6] and k = 4, the answer is [9 9 8 12 12 14 14 32 32 32 32 19 19 19]
*/
