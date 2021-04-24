package functionAndArrayPepcoding;

import java.util.Scanner;

public class DigitFrequency {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
        sc.close();
    }

    public static int getDigitFrequency(int n, int d) {
        // write code here
        int count=0;
        while(n>0)
        {
            int rem= n%10;
            if(rem==d)
            {
                count++;
            }
            n/=10;
        }
        return count;
    }


}
