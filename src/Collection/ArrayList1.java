package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Akshay");
		al.add(100);
		al.add('A');
		al.add("swapnali");
		al.add("Akshay");
		al.add(null);
		al.add(null);
		System.out.println(al.isEmpty());
		System.out.println(al.get(4));
		System.out.println(al.size());
	System.out.println(al.remove(3));
		System.out.println(al);
		System.out.println(al.size());
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		for(Object obj :al)
		{
			System.out.println(obj);
			
		}
		ListIterator litr=al.listIterator();
				{
					while(litr.hasNext())
			System.out.println(litr.next());
				}
		
		}
		
	}


