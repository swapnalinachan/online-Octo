package Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//{101=swapnali, 102=akshay, 103=dnyanu}
		Hashtable<Integer, String> hm=new Hashtable<Integer, String> ();
		
		hm.put(101, "swapnali");
		hm.put(102, "akshay");
		hm.put(103, "dnyanu");
		hm.put(104, "swapnali");
		hm.put(101, "shreyash");
		System.out.println(hm);
		System.out.println(hm.get(101));
		hm.remove(101);
		System.out.println(hm);
		int size=hm.size();
		System.out.println(size);
		
		//Set s=hm.keySet();
		Iterator<Integer> itr=hm.keySet().iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		Iterator<String> itr2=hm.values().iterator();
		
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
		
		hm.forEach((K,V)->System.out.println(K+V));
	}

}
