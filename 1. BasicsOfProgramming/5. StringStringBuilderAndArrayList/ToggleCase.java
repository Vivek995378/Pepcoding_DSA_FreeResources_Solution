package StringStringBuilderAndArrayList;

import java.util.Scanner;

public class ToggleCase {
	
	public static String toggleCase(String str){
		//write your code here
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++)
		{
		    char ch= str.charAt(i);
		    if(ch>=65 && ch<=90)
		    {
		       sb.append(Character.toLowerCase(ch));
		    }
		    else if(ch>=97 && ch<=122)
		    {
		        sb.append(Character.toUpperCase(ch));
		    }
		}

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(toggleCase(str));
		sc.close();
	}

}
