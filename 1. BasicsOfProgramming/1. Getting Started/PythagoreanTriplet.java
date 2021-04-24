package basicOfPepcoding;
import java.util.*;

public class PythagoreanTriplet 
{
	public static void main(String[] args) 
	{
	  // write your code here  
	      Scanner sc = new Scanner(System.in);
	      int a = sc.nextInt();
	      int b = sc.nextInt();
	      int c = sc.nextInt();
	      boolean flag = false;
	      if((a*a)==((b*b)+(c*c)))
	          flag=true;
	      else if((b*b)==((a*a)+(c*c)))
	          flag=true;
	      else if((c*c)==((b*b)+(a*a)))
	          flag=true;
	      if(flag)
	      {
	          System.out.println("true");
	      }
	      else
	      {
	          System.out.println("false");
	      }
	      sc.close();
 }
}