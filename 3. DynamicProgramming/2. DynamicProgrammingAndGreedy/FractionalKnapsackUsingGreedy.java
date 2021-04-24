package DynamicProgrammingAndGreedy;

import java.util.*;

public class FractionalKnapsackUsingGreedy {
	
	public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in)    ;
        int n=sc.nextInt();
        int val[]=new int[n];
        for(int i=0; i<n; i++)
        {
            val[i]=sc.nextInt();
        }
        int wt[]=new int[n];
        for(int i=0; i<n; i++)
        {
            wt[i]=sc.nextInt();
        }
        int capacity=sc.nextInt();
        double maxValue= getMaxValue(val,wt,capacity);
        System.out.println(maxValue);
        sc.close();
    }
  
    static class FractionalKnapsack
    {
        Double cost;
        double val,wt,idx;
        
        @SuppressWarnings("deprecation")
		public FractionalKnapsack(int val,int wt,int idx)
        {
            this.val=val;
            this.wt=wt;
            this.idx=idx;
            cost=new Double((double)val/(double)wt);
        }
    }
    
    public static double getMaxValue(int[] val,int[] wt,int capacity)
    {
        FractionalKnapsack[] ival=new FractionalKnapsack[val.length];
        for(int i=0; i<ival.length; i++)
        {
            ival[i]=new FractionalKnapsack(val[i],wt[i],i);
        }
        
        Arrays.sort(ival, new Comparator<FractionalKnapsack>() {
            @Override
            public int compare(FractionalKnapsack o1, FractionalKnapsack o2)
            {
                return o2.cost.compareTo(o1.cost);
            }
        });

        double total=0;
        for (FractionalKnapsack i : ival) {
 
            int curWt = (int)i.wt;
            int curVal = (int)i.val;
 
            if (capacity - curWt >= 0) {
                capacity = capacity - curWt;
                total += curVal;
            }
            else {
                double fraction
                    = ((double)capacity / (double)curWt);
                total += (curVal * fraction);
                capacity
                    = (int)(capacity - (curWt * fraction));
                break;
            }
        }
        return total;

    }

}

/*
 * Sample Input
10
33 14 50 9 8 11 6 40 2 15 
7 2 5 9 3 2 1 10 3 3 
5

Sample Output
50.0
*/