package functionAndArrayPepcoding;

import java.util.Scanner;

public class DecimalToAnyBase {
	
		public static void main(String[] args) 
		{
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int b = sc.nextInt();
	      int dn = getValueInBase(n, b);
	      System.out.println(dn);
	      sc.close();
	    }
	  
	   public static int getValueInBase(int n, int b)
	   {
	       // write code here
	       int i=0;
	       int num=0;
	       while(n > 0)
	       {
	           int rem = n%b;
	           num = (rem*(int)Math.pow(10,i)) + num;
	           n/=b;
	           i++;
	       }
	       return num;
	   }
	   

}
