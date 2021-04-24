package RecursionWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPaths {
	
	public static void main(String[] args) throws Exception 
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> ans= getStairPaths(n);
        System.out.println(ans);
        sc.close();
    }

    public static ArrayList<String> getStairPaths(int n)     {
        if(n==0)
        {
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        else if(n<0)
        {
            ArrayList<String> base=new ArrayList<>();
            return base;
        }
        ArrayList<String> paths1 = getStairPaths(n-1);
        ArrayList<String> paths2 = getStairPaths(n-2);
        ArrayList<String> paths3 = getStairPaths(n-3);
        
        ArrayList<String> paths = new ArrayList<>();
        
        for(String e:paths1)
        {
            paths.add(1+e);
        }
        for(String e:paths2)
        {
            paths.add(2+e);
        }
        for(String e:paths3)
        {
            paths.add(3+e);
        }
        
        return paths;
    }

}
