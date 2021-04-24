package StacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixEvaluation {
	
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String exp = br.readLine();

	    // code
	    Stack<Integer> operand = new Stack<>();
	    Stack<Character> operator = new Stack<>();
	    
	    for(int i=0; i<exp.length(); i++)
	    {
	        char ch = exp.charAt(i);
	        if(ch == '(')
	        {
	            operator.push(ch);
	        }
	        else if(Character.isDigit(ch))
	        {
	            operand.push(ch - '0');
	        }
	        else if(ch == ')')
	        {
	            while(operator.peek() != '(')
	            {
	                char op = operator.pop();
	                int v2 = operand.pop();
	                int v1 = operand.pop();
	                
	                int opv = operation(v1,v2,op);
	                operand.push(opv);
	            }
	            operator.pop();
	        }
	        else if(ch=='+' || ch=='-' || ch=='/' || ch=='*')
	        {
	            // ch is wanting higher priority to solve first
	            while(operator.size() > 0 && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek()))
	            {
	                char op = operator.pop();
	                int v2 = operand.pop();
	                int v1 = operand.pop();
	                
	                int opv = operation(v1,v2,op);
	                operand.push(opv);
	            }
	            // ch is pushing itself
	            operator.push(ch);
	        }
	    }
	    while(operator.size() !=0)
	    {
	        char op = operator.pop();
	        int v2 = operand.pop();
	        int v1 = operand.pop();
	        
	        int opv = operation(v1,v2,op);
	        operand.push(opv);
	    }
	    System.out.println(operand.peek());
	 }
	 public static int precedence(char optor)
	 {
	    if(optor == '+')
	    {
	         return 1;
	    }
	    else if(optor == '-')
	    {
	         return 1;
	    }
	    else if(optor == '*')
	    {
	         return 2;
	    }
	    else
	    {
	         return 2;
	    }
	 }
	 public static int operation(int v1, int v2, char optor)
	 {
	    if(optor == '+')
	    {
	         return v1+v2;
	    }
	    else if(optor == '-')
	    {
	         return v1-v2;
	    }
	    else if(optor == '*')
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
2 + 6 * 4 / 8 - 3
Sample Output
2
*/
