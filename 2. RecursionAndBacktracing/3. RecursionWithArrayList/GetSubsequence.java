package RecursionWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {
	
	public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        ArrayList<String> res = gss(str);
        System.out.println(res);
        sc.close();
    }

	public static ArrayList<String> gss(String str) 
    {
        if(str.length()==0)
        {
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        char ch= str.charAt(0)    ;
        String remStr= str.substring(1);
        ArrayList<String> faithAns= gss(remStr);
        ArrayList<String> ans= new ArrayList<>();
        //wITHOUT FIRST CHARACTER
        for(String e:faithAns)    
        {
            ans.add(e);
        }
        //wITH FIRST CHARACTER
        for(String e:faithAns)
        {
             ans.add(ch+e);
        }
        return ans;
    }

}
