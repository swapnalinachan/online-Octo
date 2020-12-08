package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorPractice {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("abc");
		v.add(100);
		v.add('A');
		v.add("abc");
		v.add(null);
		v.add(null);
		
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.isEmpty());
		System.out.println(v.size());
		System.out.println(v.get(4));
		System.out.println(v.contains(null));
		v.set(5, "Nachan");
		System.out.println(v);
		v.add(4, "swapnali");
		System.out.println(v);
		System.out.println(v.size());
		v.remove(0);
		System.out.println(v);
		System.out.println(v.size());
		
		System.out.println("print ArrayList info using Iterator");
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("print ArrayList info using ListIterator");
		ListIterator litr=v.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("print vector info using for loop");
		for(int i=0; i<=v.size()-1; i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("print ArrayList info using for each lop");
		for(Object obj:v)
		{
			System.out.println(obj);
		}
		System.out.println("print ArrayList info using Enumeration corsor");
		Enumeration enu=v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
	}

}
