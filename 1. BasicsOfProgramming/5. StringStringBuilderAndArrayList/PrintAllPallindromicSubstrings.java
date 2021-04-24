package StringStringBuilderAndArrayList;

import java.util.Scanner;

public class PrintAllPallindromicSubstrings {
	
	public static boolean isPalindrome(String str)
    {
        int i=0;
        int j=str.length()-1;
        while(i<=j)
        {
            char sc = str.charAt(i);
            char ec = str.charAt(j);
            if(sc!=ec)
            {
                return false;
            }
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }

	public static void solution(String str){
		//write your code here
		for(int i=0; i<str.length(); i++)
		{
		    for(int j=i+1; j<=str.length(); j++)
		    {
		        String temp = str.substring(i,j);
		        if(isPalindrome(temp)==true)
		        {
		            System.out.println(temp);
		        }
		    }
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		solution(str);
		sc.close();
	}

}
