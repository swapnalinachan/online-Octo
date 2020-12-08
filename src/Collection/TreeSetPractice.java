package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {
		TreeSet tr=new TreeSet();
		tr.add(10);
		tr.add(100);
		tr.add(1000);
		tr.add(50);
		tr.add(500);
		tr.add(5000);
		System.out.println(tr);
		
		tr.pollFirst();
		System.out.println(tr);
		tr.pollLast();
		System.out.println(tr);
		
		System.out.println(tr.first());
		System.out.println(tr.last());
		
		System.out.println("print TreeSet info using iterator");
		Iterator itr=tr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
