package HashmapAndHeap;
import java.io.*;
import java.util.*;

public class ImplementingHashMap {
	
	public static class HashMap<K, V> {
	    private class HMNode {
	      K key;
	      V value;

	      HMNode(K key, V value) {
	        this.key = key;
	        this.value = value;
	      }
	    }

	    private int size; // n
	    private LinkedList<HMNode>[] buckets; // N = buckets.length

	    public HashMap() {
	      initbuckets(4);
	      size = 0;
	    }

	    @SuppressWarnings("unchecked")
		private void initbuckets(int N) {
	      buckets = new LinkedList[N];
	      for (int bi = 0; bi < buckets.length; bi++) {
	        buckets[bi] = new LinkedList<>();
	      }
	    }

	    public void put(K key, V value) throws Exception {
	      // write your code here
	      int bi = hashfn(key);   // bi = bucket index
	      int di = getIndexWithinBucket(key , bi);  //di = data index
	      
	      if(di != -1)   //it means data is already present , you have to                        just update the value on that key
	      {
	          HMNode node = buckets[bi].get(di);
	          node.value = value;
	      }
	      else
	      {
	          HMNode node = new HMNode(key , value);
	          buckets[bi].add(node);
	          size++;
	      }
	      
	      //to check either hashmap contains elements within range of             loading factor or not (loading factor is <2.0)
	      double lambda = size * 1.0 / buckets.length;
	      if(lambda > 2.0)
	      {
	          rehash();  //it doubles the size of hashmap when it violates                        loading factor
	      }
	    }
	    public int hashfn(K key) {
	        int hc = key.hashCode();   //hc = hash code
	        return Math.abs(hc) % buckets.length;
	    }
	    public int getIndexWithinBucket(K key , int bi) {
	        int di = 0;   //let initially data index be 0
	        for(HMNode node : buckets[bi])
	        {
	            if(node.key.equals(key))
	            {
	                return di;
	            }
	            di++;
	        }
	        return -1;
	    }
	    public void rehash() throws Exception {
	        //oba = old bucket array , it stores all data of buckets
	        // oba[] = buckets[4]
	        LinkedList<HMNode> oba[] = buckets ; 
	        //this initbuckets function initalize a new LL of double size           of previous one with the the same name i.e. buckets
	        // buckets[] = new buckets[2*sizeOf(oba){i.e. 4}]
	        initbuckets(oba.length * 2);
	        size = 0;
	         
	        for(int i=0 ; i<oba.length ; i++)
	        {
	            for(HMNode node : oba[i])
	            {
	                put(node.key , node.value);  
	                //calling the upper put function
	            }
	        }
	    }

	    public V get(K key) throws Exception {
	      // write your code here
	      int bi = hashfn(key);   // bi = bucket index
	      int di = getIndexWithinBucket(key , bi);  //di = data index
	      
	      if(di != -1)   //it means data is already present , you have to                        just update the value on that key
	      {
	          HMNode node = buckets[bi].get(di);
	          return node.value;
	      }
	      else
	      {
	          return null;
	      }
	    }

	    public boolean containsKey(K key) {
	      // write your code here
	      int bi = hashfn(key);   // bi = bucket index
	      int di = getIndexWithinBucket(key , bi);  //di = data index
	      
	      if(di != -1)   //it means data is already present , you have to                        just update the value on that key
	      {
	          return true;
	      }
	      else
	      {
	          return false;
	      }
	    }

	    public V remove(K key) throws Exception {
	      // write your code here
	      int bi = hashfn(key);   // bi = bucket index
	      int di = getIndexWithinBucket(key , bi);  //di = data index
	      
	      if(di != -1)   //it means data is already present , you have to                        just update the value on that key
	      {
	          HMNode node = buckets[bi].remove(di); 
	          size--;
	          return node.value;
	      }
	      else
	      {
	          return null;
	      }
	    }

	    public ArrayList<K> keyset() throws Exception {
	      // write your code here
	      ArrayList<K> keys = new ArrayList<>();
	      
	      for(int i=0 ; i<buckets.length ; i++)
	      {
	          for(HMNode node : buckets[i])
	          {
	              keys.add(node.key);
	          }
	      }
	      
	      return keys;
	    }

	    public int size() {
	      // write your code here
	      return size;
	    }

	   public void display() {
	      System.out.println("Display Begins");
	      for (int bi = 0; bi < buckets.length; bi++) {
	        System.out.print("Bucket" + bi + " ");
	        for (HMNode node : buckets[bi]) {
	          System.out.print( node.key + "@" + node.value + " ");
	        }
	        System.out.println(".");
	      }
	      System.out.println("Display Ends");
	  }
	}

	  public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    HashMap<String, Integer> map = new HashMap<>();

	    String str = br.readLine();
	    while (str.equals("quit") == false) {
	      if (str.startsWith("put")) {
	        String[] parts = str.split(" ");
	        String key = parts[1];
	        Integer val = Integer.parseInt(parts[2]);
	        map.put(key, val);
	      } else if (str.startsWith("get")) {
	        String[] parts = str.split(" ");
	        String key = parts[1];
	        System.out.println(map.get(key));
	      } else if (str.startsWith("containsKey")) {
	        String[] parts = str.split(" ");
	        String key = parts[1];
	        System.out.println(map.containsKey(key));
	      } else if (str.startsWith("remove")) {
	        String[] parts = str.split(" ");
	        String key = parts[1];
	        System.out.println(map.remove(key));
	      } else if (str.startsWith("size")) {
	        System.out.println(map.size());
	      } else if (str.startsWith("keyset")) {
	        System.out.println(map.keyset());
	      } else if (str.startsWith("display")) {
	        map.display();
	      }
	      str = br.readLine();
	    }
	  }

}
