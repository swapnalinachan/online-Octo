package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetPractice {

	public static void main(String[] args) {
		
	HashSet hs=new HashSet();
	hs.add("swapnali");
	hs.add(8189);
	hs.add('A');
	hs.add("Nachan");
	hs.add(2331);
	hs.add(null);
	hs.add(null);
	System.out.println(hs);
	System.out.println(hs.size());
	System.out.println(hs.isEmpty());
	System.out.println(hs.contains(3));
	hs.remove("Nachan");
	System.out.println(hs);
	
	System.out.println("print ArrayList info using iterator");
	Iterator itr=hs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
   
//System.out.println("print ArrayList info using for loop");
//   for(int i=0; i<=hs.size()-1; i++)
//   {
//	   System.out.println(hs);
//   }
	System.out.println("print ArrayList info using for each");
	for(Object ele:hs)
	{
		System.out.println(ele);
	}
	
	

}
}
