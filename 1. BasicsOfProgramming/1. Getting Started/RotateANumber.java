package basicOfPepcoding;
import java.util.*;

public class RotateANumber 
{
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int digit = 0;
        int temp = n;
        
        while (temp != 0) {
            digit++;
            temp /= 10;
        }
        
        k = k % digit;
       // System.out.println("K:"+  k % digit);
        if (k < 0) {
            k = k + digit;
         }
        
        int mult = 1;
        int div = 1;
       // System.out.println("Diggit: "+digit+" K:"+k);
        for (int i = 1; i <= digit; i++) {
            if (i <= k) {
                mult *= 10;
            } else {
                div *= 10;
            }
        }
        //System.out.println("Mul: "+mult+" Div: "+div);
        int rem = n % mult;
        int oldVal = n / mult;
        //System.out.println("rem: "+rem+" Oldval: "+oldVal);
        
        n = rem * div + oldVal;
        
        System.out.println(n);
        sc.close();
    } 
}


   
   
   
   
   
   
   