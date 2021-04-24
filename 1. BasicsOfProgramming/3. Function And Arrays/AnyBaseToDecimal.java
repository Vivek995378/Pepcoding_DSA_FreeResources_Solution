package functionAndArrayPepcoding;

import java.util.Scanner;

public class AnyBaseToDecimal {
	
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int b = sc.nextInt();
	      int d = getValueIndecimal(n, b);
	      System.out.println(d);
	      sc.close();
	   }
	  
	   public static int getValueIndecimal(int n, int b){
	      // write your code here
	      int num=0;
	      int i=0;
	      while(n>0)
	      {
	          int rem =n%10;
	          num = (rem*(int)Math.pow(b,i)) + num;
	          n/=10;
	          i++;
	      }
	      return num;
	   }

}
