package RecursionWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePaths {
	
	public static void main(String[] args) throws Exception 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<String> ans= getMazePaths(1,1,n,m);
        System.out.println(ans);
        sc.close();
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc)
    {
        if(sr==dr && sc==dc)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String> hpaths =new ArrayList<>();
        ArrayList<String> vpaths =new ArrayList<>();
        
        if(sc<dc)
        {
        hpaths= getMazePaths(sr,sc+1,dr,dc);
        }
        if(sr<dr)
        {
        vpaths= getMazePaths(sr+1,sc,dr,dc);
        }
        ArrayList<String> paths= new ArrayList<>();
        
        for(String e:hpaths)
        {
            paths.add("h"+e);
        }
        for(String e:vpaths)
        {
            paths.add("v"+e);
        }
        
        return paths;
    }

}
