package basicOfPepcoding;
import java.util.*;

public class DigitsOfANumber {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int count =0;
		while(temp > 0)
		{
			count++;
			temp/=10;
		}
		int divider = (int)Math.pow(10 , count-1);
		while(divider > 0)
		{
			int digit = n / divider;
			System.out.println(digit);
			n = n % divider;
			divider/=10;
		}
		sc.close();
	}
	
}
