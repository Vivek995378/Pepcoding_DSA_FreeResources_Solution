package RecursionOnTheWayUp;

import java.util.Scanner;

public class PrintMazePathsWithJumps {
	
	public static void main(String[] args) throws Exception 
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        printMazePaths(1,1,n,m,"");
        sc.close();
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) 
    {
        if(sc==dc && sr==dr)
        {
            System.out.println(psf);
            return;
        }
        
        for(int jump=1; jump+sc<=dc; jump++)
        {
            printMazePaths(sr,sc+jump,dr,dc,psf+"h"+jump);
        }
        for(int jump=1; jump+sr<=dr; jump++)
        {
            printMazePaths(sr+jump,sc,dr,dc,psf+"v"+jump);
        }
        for(int jump=1; jump+sc<=dc && jump+sr<=dr; jump++)
        {
            printMazePaths(sr+jump,sc+jump,dr,dc,psf+"d"+jump);
        }
    }

}
