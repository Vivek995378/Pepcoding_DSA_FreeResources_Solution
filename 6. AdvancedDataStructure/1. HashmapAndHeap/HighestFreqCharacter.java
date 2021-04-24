package HashmapAndHeap;

import java.util.*;

public class HighestFreqCharacter {
	
	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        HashMap<Character , Integer> hm = new HashMap<>();
        for(int i=0 ; i<str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(hm.containsKey(ch))
            {
                int ov = hm.get(ch);
                int nv = ov + 1;
                hm.put(ch , nv);
            }
            else
            {
                hm.put(ch , 1);
            }
        }
        
        char maxFreqChar = str.charAt(0);
        for(Character key:hm.keySet())
        {
            if(hm.get(key) > hm.get(maxFreqChar))
            {
                maxFreqChar = key;
            }
            
        }
        System.out.println(maxFreqChar);
        sc.close();
    }

}
