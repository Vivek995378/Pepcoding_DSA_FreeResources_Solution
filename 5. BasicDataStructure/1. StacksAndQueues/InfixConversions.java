package StacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixConversions {
	
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String exp = br.readLine();

	    // code
	    Stack<String> post = new Stack<>();
	    Stack<String> pre = new Stack<>();
	    Stack<Character> optor = new Stack<>();
	    
	    for(int i=0; i<exp.length(); i++)
	    {
	        char ch = exp.charAt(i);
	        if(ch == '(')
	        {
	            optor.push(ch);
	        }
	        else if((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
	        {
	            post.push(ch + "");
	            pre.push(ch + "");
	        }
	        else if(ch == ')')
	        {
	            while(optor.peek() != '(')
	            {
	                char op = optor.pop();
	                String postv2 = post.pop();
	                String postv1 = post.pop();
	                String postv = postv1 + postv2 + op;
	                post.push(postv);
	                
	                String prev2 = pre.pop();
	                String prev1 = pre.pop();
	                String prev = op + prev1 + prev2;
	                pre.push(prev);
	            }
	            optor.pop();
	            
	        }
	        else if( ch == '+' || ch == '-' || ch == '*' || ch == '/')
	        {
	            while(optor.size() > 0 && optor.peek() != '(' && precedence(ch) <= precedence(optor.peek()))
	            {
	                char op = optor.pop();
	                String postv2 = post.pop();
	                String postv1 = post.pop();
	                String postv = postv1 + postv2 + op;
	                post.push(postv);
	                
	                String prev2 = pre.pop();
	                String prev1 = pre.pop();
	                String prev = op + prev1 + prev2;
	                pre.push(prev);
	            }
	            optor.push(ch);
	            
	        }
	    }
	    while(optor.size() > 0)
	    {
	        char op = optor.pop();
	        String postv2 = post.pop();
	        String postv1 = post.pop();
	        String postv = postv1 + postv2 + op;
	        post.push(postv);
	        
	        String prev2 = pre.pop();
	        String prev1 = pre.pop();
	        String prev = op + prev1 + prev2;
	        pre.push(prev);
	    }
	    System.out.println(post.pop());
	    System.out.println(pre.pop());
	 }
	 public static int precedence(char ch)
	 {
	     if(ch == '+')
	     {
	         return 1;
	     }
	     else if(ch == '-')
	     {
	         return 1;
	     }
	     else if(ch == '*')
	     {
	         return 2;
	     }
	     else if(ch == '/')
	     {
	         return 2;
	     }
	     else
	     {
	         return 0;
	     }
	 }

}

/*
Sample Input
a*(b-c+d)/e

Sample Output
abc-d+*e/
/*a+-bcde
*/