package RecursionOnTheWayUp;

import java.util.Scanner;

public class PrintKPC {
	
	public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        printKPC(str,"");
        sc.close();
    }
    
    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
    public static void printKPC(String str, String ans) 
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        
        String code=codes[ch-'0'];
        for(int i=0; i<code.length(); i++)
        {
            char codeCh=code.charAt(i);
            //System.out.println("ANS:"+ans);
            printKPC(ros,ans+codeCh);
        }
    }

}
