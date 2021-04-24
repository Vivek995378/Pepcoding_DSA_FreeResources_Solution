package basicOfPepcoding;
import java.util.*;

public class PrintAllPrimeTillN {

    public static void main(String[] args) 
    {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        
        for (int i = low; i <= high; i++) 
        {
            if (isPrime(i) == true) 
            {
                System.out.println(i);
            }
        }
        sc.close();
    }
    public static boolean isPrime(int val) 
    {
        for (int i = 2; i * i <= val; i++) 
        {
            if (val % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
}