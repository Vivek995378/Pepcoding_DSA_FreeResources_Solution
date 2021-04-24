package StacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class NextGreaterElement {
	
	public static void display(int[] a){
	    StringBuilder sb = new StringBuilder();

	    for(int val: a){
	      sb.append(val + "\n");
	    }
	    System.out.println(sb);
	  }

	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] = Integer.parseInt(br.readLine());
	    }

	    int[] nge = solve(a);
	    display(nge);
	 }

	 public static int[] solve(int[] arr){
	   // solve
	   int nxtg[] = new int[arr.length];
	   Stack<Integer> st = new Stack<>();
	   nxtg[arr.length - 1] = -1;
	   st.push(arr[arr.length-1]);
	   for(int i= arr.length-2; i>=0; i--) 
	    {
	        while (st.size() > 0 && st.peek() <= arr[i]) 
	        {
	            st.pop();
	        }

	        if (st.size() == 0) 
	        {
	            nxtg[i] = -1;
	        } 
	        else
	        {
	            nxtg[i] = st.peek();
	        }

	            st.push(arr[i]);
	    }

	    return nxtg;
	 }

}

/*
 * e.g.
for the array [2 5 9 3 1 12 6 8 7]
Next greater for 2 is 5
Next greater for 5 is 9
Next greater for 9 is 12
Next greater for 3 is 12
Next greater for 1 is 12
Next greater for 12 is -1
Next greater for 6 is 8
Next greater for 8 is -1
Next greater for 7 is -1
*/	
