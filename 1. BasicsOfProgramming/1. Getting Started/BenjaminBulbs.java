package basicOfPepcoding;
import java.util.*;

public class BenjaminBulbs 
{
	public static void main(String[] args)
	{
	  // write your code here  
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter any number:");
	      int n =sc.nextInt();
	      for (int i = 1; i * i <= n; i++) 
	      {
	          System.out.println(i * i);
	      }
	      sc.close();
	 }
}