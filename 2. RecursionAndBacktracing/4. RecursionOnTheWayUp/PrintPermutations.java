package RecursionOnTheWayUp;

import java.util.Scanner;

public class PrintPermutations {
	
	public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        printPermutations(str,"");
        sc.close();
    }

    public static void printPermutations(String str, String ans) 
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        
        for(int i=0; i<str.length(); i++)
        {
            char ch=str.charAt(i);
            String lpart=str.substring(0,i);
            String rpart=str.substring(i+1);
            String ros=lpart + rpart;
            
            printPermutations(ros,ans+ch);
        }
    }

}
