package HashmapAndHeap;
import java.util.*;
public class PriorityQueueORHeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();	//Ascending order
		// PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //Descending order
		int ranks[] = {22,21,34,15,36,89,5};
		for(int val : ranks)
		{
			pq.add(val);
		}
		
		while(pq.size() > 0)
		{
			System.out.println(pq.peek());
			pq.remove();
		}
		
	}

}
