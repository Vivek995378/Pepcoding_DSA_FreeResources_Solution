package StacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class PostfixEvaluationConversions {
	
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String exp = br.readLine();

	    // code
	    Stack<Integer> vs = new Stack<>();
	    Stack<String> is = new Stack<>();
	    Stack<String> ps = new Stack<>();
	    
	    for(int i=0; i<exp.length(); i++)
	    {
	        char ch = exp.charAt(i);
	        
	        if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
	        {
	            int v2 = vs.pop();
	            int v1 = vs.pop();
	            int v = operation(v1,v2,ch);
	            vs.push(v);
	            
	            String iv2 = is.pop();
	            String iv1 = is.pop();
	            String iv = "(" + iv1 + ch + iv2 + ")";
	            is.push(iv);
	            
	            String pv2 = ps.pop();
	            String pv1 = ps.pop();
	            String pv = ch + pv1 + pv2;
	            ps.push(pv);
	            
	        }
	        else
	        {
	            vs.push(ch - '0');
	            is.push(ch + "");
	            ps.push(ch + "");
	        }
	    }
	    System.out.println(vs.pop());
	    System.out.println(is.pop());
	    System.out.println(ps.pop());
	 }
	 
	 public static int operation(int v1, int v2, char ch)
	 {
	    if(ch == '+')
	    {
	        return v1+v2;
	    }
	    else if(ch == '-')
	    {
	        return v1-v2;
	    }
	    else if(ch == '*')
	    {
	        return v1*v2;
	    }
	    else
	    {
	        return v1/v2;
	    }
	 }

}

/*
 * Sample Input
264*8/+3-

Sample Output
2
((2+((6*4)/8))-3)
-+2/*6483
*/
