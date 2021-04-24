package StacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
	
	public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
            {
                st.push(ch);
            }
            else if(ch == ')')
            {
                boolean result = closingBrackets(st,'(');
                if(result == false)
                {
                    System.out.println(false);
                    return;
                }
            }
            else if(ch == '}')
            {
                boolean result = closingBrackets(st,'{');
                if(result == false)
                {
                    System.out.println(false);
                    return;
                }
                
            }
            else if(ch == ']')
            {
                boolean result = closingBrackets(st,'[');
                if(result == false)
                {
                    System.out.println(false);
                    return;
                }
                
            }
        }
        if(st.size() == 0)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
    
    public static boolean closingBrackets(Stack<Character> st, char ch)
    {
        if(st.size() == 0)
        {
            return false;
        }
        else if(st.peek() != ch)
        {
            return false;
        }
        else
        {
            st.pop();
            return true;
        }
    }

}

/*
 * 
e.g.
[(a + b) + {(c + d) * (e / f)}] -> true
[(a + b) + {(c + d) * (e / f)]} -> false
[(a + b) + {(c + d) * (e / f)} -> false
([(a + b) + {(c + d) * (e / f)}] -> false
*/
