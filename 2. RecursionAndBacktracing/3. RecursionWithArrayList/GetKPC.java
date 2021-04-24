package RecursionWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKPC {
	
	public static void main(String[] args) throws Exception
    {
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        ArrayList<String> res= getKPC(str);
        System.out.println(res);
        sc.close();
    }
    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) 
    {
        if(str.length()==0)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        //char ch= str.charAt(0);
        int ch = str.charAt(0) ;
        String remStr= str.substring(1);
        ArrayList<String> faithAns = getKPC(remStr);
        ArrayList<String> ans = new ArrayList<>();
        String code=codes[ch-'0'];
        for(int i=0; i<code.length(); i++)
        {
            char chCode=code.charAt(i);
            for(String e:faithAns)
            {
                ans.add(chCode+e);
            }
        }
        return ans;
    }

}
