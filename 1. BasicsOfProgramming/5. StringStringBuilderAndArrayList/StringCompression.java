package StringStringBuilderAndArrayList;

import java.util.Scanner;

public class StringCompression {
	
	public static String compression1(String str){
		// write your code here
		StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        int i = 1;
        while (i < str.length()) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                sb.append(str.charAt(i));
            }
            i++;
        }
        return sb.toString();
	}

	public static String compression2(String str){
		// write your code here
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		int i=1;
		int count=1;
		while(i<str.length())
		{
		    if(str.charAt(i) == str.charAt(i-1))
		    {
		        count++;
		    }
		    else
		    {
		        if(count > 1)
		        {
		            sb.append(count);
					count=1;
		        }
		        sb.append(str.charAt(i));
		    }
		    i++;
		}
		if(count > 1)
		{
		    sb.append(count );
		}

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
		sc.close();
	}

}
