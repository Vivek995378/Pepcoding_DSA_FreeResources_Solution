package functionAndArrayPepcoding;

import java.util.Scanner;

public class AnyBaseToAnyBase {
	
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int sourceBase = sc.nextInt();
	      int destBase= sc.nextInt();
	      int num = anyBaseToAnyBase(n,sourceBase,destBase);
	      System.out.println(num);
	      sc.close();
	   }   
	   public static int anyBaseToAnyBase(int n, int sourceBase, int destBase)
	   {
	       int firstConvertedToDecimal = anyBaseToDecimal(n , sourceBase);
	       int convertedNumber = decimalToAnyBase(firstConvertedToDecimal , destBase);
	       return convertedNumber;
	   }
	   public static int anyBaseToDecimal(int n, int b)
	   {
	       int num = 0;
	       int i = 0;
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
	       int i = 0;
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
