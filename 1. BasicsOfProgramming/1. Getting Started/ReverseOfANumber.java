package basicOfPepcoding;
import java.util.*;

public class ReverseOfANumber 
{
	public static void main(String[] args)
	{
		// write your code here  
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int count = 0;
	    int temp = n;
	    while(temp > 0)
	    {
	        count++;
	        temp/=10;
	    }
	    int i =1;
	    int num =0;
	    while(i <= count)
	    {
	        int rem = n %10;
	        num = (i * (int)Math.pow(10,rem-1)) + num;
	        n/=10;
	        i++;
	    }
	    System.out.println(num);
	    sc.close();
	}
}