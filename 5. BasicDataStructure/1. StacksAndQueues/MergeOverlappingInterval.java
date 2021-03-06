package StacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class MergeOverlappingInterval {
	
	public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time
        Pair pairs[] = new Pair[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            pairs[i] = new Pair(arr[i][0],arr[i][1]);
        }
        Arrays.sort(pairs);
        Stack<Pair> st = new Stack<>();
        for(int i=0; i<arr.length; i++)
        {
            if(i == 0)
            {
                st.push(pairs[i]);
            }
            else
            {
                Pair top = st.peek();
                
                if(pairs[i].st > top.en)
                {
                    st.push(pairs[i]);
                }
                else
                {
                    top.en = Math.max(top.en,pairs[i].en);
                }
            }
        }
        
        Stack<Pair> rs = new Stack<>();
        while(st.size() > 0)
        {
            rs.push(st.pop());
        }
        
        while(rs.size() > 0)
        {
            Pair p = rs.pop();
            System.out.println(p.st + " "+ p.en);
        }
        
    }
    
    public static class Pair implements Comparable<Pair>
    {
        int st;
        int en;
        
        Pair(int st, int en)
        {
            this.st = st;
            this.en = en;
        }
        
        public int compareTo(Pair other)
        {
            if(this.st != other.st)
            {
                return this.st - other.st;
            }
            else
            {
                return this.en - other.en;
            }
        }
    }

}

/*
 * E.g. Let us say there are 6 meetings
1 8
5 12
14 19
22 28
25 27
27 30

Then the output of merged meetings will belongs
1 12
14 19
22 30
*/
