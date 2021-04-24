package RecursionWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathsWithJumps {
	
	public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
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
        if(sc==dc && sr==dr)
        {
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> hpaths= new ArrayList<>();
        ArrayList<String> vpaths= new ArrayList<>();
        ArrayList<String> dpaths= new ArrayList<>();
        ArrayList<String> ans= new ArrayList<>();
        
        for(int jump=1; jump+sc<=dc; jump++)
        {
            hpaths= getMazePaths(sr,sc+jump,dr,dc);
            for(String hpath:hpaths)
            {
                ans.add("h" + jump + hpath);
            }
        }
        for(int jump=1; jump+sr<=dr; jump++)
        {
            vpaths= getMazePaths(sr+jump,sc,dr,dc);
            for(String vpath:vpaths)
            {
                ans.add("v" + jump + vpath);
            }
        }
        for(int jump=1; jump+sc<=dc && jump+sr<=dr; jump++)
        {
            dpaths= getMazePaths(sr+jump,sc+jump,dr,dc);
            for(String dpath:dpaths)
            {
                ans.add("d" + jump + dpath);
            }
        }
        
        return ans;
    }

}
