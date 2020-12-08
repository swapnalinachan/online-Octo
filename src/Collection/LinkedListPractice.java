package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractice {

	public static void main(String[] args) {
	LinkedList ll=new LinkedList();
	ll.add("abc");
	ll.add(100);
	ll.add('S');
	ll.add("xyz");
	ll.add(null);
	ll.add(null);
	System.out.println(ll);
	System.out.println(ll.size());
	System.out.println(ll.isEmpty());
	System.out.println(ll.get(1));
	System.out.println(ll.contains('s'));
	ll.set(5, "paithan");
	System.out.println(ll);
	System.out.println(ll.size());
	ll.add(0, "SwapnTej");
	System.out.println(ll);
	System.out.println(ll.size());
	ll.remove(3);
	System.out.println(ll);
	System.out.println(ll.size());
	System.out.println("print ArrayList info using iterator");
	Iterator itr=ll.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	
	}
	System.out.println("print arrayList info using ListIterator");
	ListIterator litr=ll.listIterator();
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	System.out.println("print ArrayList info using for loop");
	for(int i=0; i<=ll.size()-1; i++)
	{
		System.out.println(ll.get(i));
	}
	System.out.println("print ArrayList info using for each loop");
	for(Object obj:ll)
	{
		System.out.println(obj);
	}
}
}
