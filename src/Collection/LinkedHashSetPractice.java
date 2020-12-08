package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPractice {

	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("swapnali");
		lhs.add(8189);
		lhs.add('A');
		lhs.add("Nachan");
		lhs.add(2331);
		lhs.add(null);
		lhs.add(null);
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.contains(3));
		lhs.remove("Nachan");
		System.out.println(lhs);
		 
		System.out.println("print ArrayList info using iterator");
		Iterator itr=lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("print ArrayList info using for each");
		for(Object ele:lhs)
		{
			System.out.println(ele);
		}
	   
	}

}
