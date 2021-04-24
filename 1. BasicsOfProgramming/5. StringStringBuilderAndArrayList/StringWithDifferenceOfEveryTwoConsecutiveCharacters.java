package StringStringBuilderAndArrayList;

import java.util.Scanner;

public class StringWithDifferenceOfEveryTwoConsecutiveCharacters {
	
	public static String solution(String str){
		// write your code here
		StringBuilder sb =new StringBuilder();
		sb.append(str.charAt(0));
		for(int i=1; i<str.length(); i++)
		{
		    char ch1= str.charAt(i);
		    char ch2= str.charAt(i-1);
		    sb.append(ch1-ch2);
		    sb.append(ch1);
		}

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
		sc.close();
	}

}
