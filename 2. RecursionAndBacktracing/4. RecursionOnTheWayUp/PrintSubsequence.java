package RecursionOnTheWayUp;

import java.util.Scanner;

public class PrintSubsequence {
	
	public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        printSS(str,"");
        sc.close();
    }

    public static void printSS(String ques, String ans) 
    {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        String ros=ques.substring(1);
        
        printSS(ros,ans+ch);
        printSS(ros,ans+"");
    }

}
