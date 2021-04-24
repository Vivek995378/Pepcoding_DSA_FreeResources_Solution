package functionAndArrayPepcoding;

import java.util.Scanner;

public class AnyBaseSubtraction {
	
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int b = sc.nextInt();
	      int n1 = sc.nextInt();
	      int n2 = sc.nextInt();
	  
	      int d = getDiff(b, n1, n2);
	      System.out.println(d);
	      sc.close();
	   }
	  
	   public static int getDiff(int b, int n1, int n2){
	       // write ur code here
	       int n1InDecimal = baseToDecimal(n1, b);
	       int n2InDecimal = baseToDecimal( n2,  b);
	       int diffInDecimal = n2InDecimal - n1InDecimal ;
	       int diffInGivenBase = decimalToAnyBase(diffInDecimal,  b);
	       return diffInGivenBase;
	   }
	   public static int baseToDecimal(int n, int b)
	   {
	       int num = 0;
	       int i=0;
	       while(n>0)
	       {
	           int rem = n%10;
	           num = (rem*(int)Math.pow(b,i)) + num;
	           n/=10;
	           i++;
	       }
	       return num;
	   }
	   public static int decimalToAnyBase(int n, int b)
	   {
	       int num = 0;
	       int i=0;
	       while(n>0)
	       {
	           int rem = n%b;
	           num = (rem*(int)Math.pow(10,i)) + num;
	           n/=b;
	           i++;
	       }
	       return num;
	   }

}
