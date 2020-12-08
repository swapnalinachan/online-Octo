package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("abc");
		al.add(100);
		al.add('A');
		al.add("abc");
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		System.out.println(al.get(1));
		System.out.println(al.contains("ABC"));
		al.set(0, "Akshay");
		System.out.println(al);
		al.add(1, 500);
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println("print ArrayList using iterator corsor");
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("print ArrayList using ListIterator");
		ListIterator litr=al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("print ArrayList info using for loop");
		for(int i=0; i<=al.size()-1; i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("print ArrayList info using for each loop");
		for(Object obj:al)
		{
			System.out.println(obj);
		}
		
	}

}
