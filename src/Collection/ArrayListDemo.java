package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al= new ArrayList();
		
		ArrayListDemo ald=new ArrayListDemo();

		System.out.println(al.isEmpty());
		
		al.add(123);
		al.add("sdfdas");
		al.add('s');
		al.add(null);
		al.add(12.221);
		al.add(ald);
		al.add(null);
		
		Iterator itr=al.iterator();
		
		for(Object obj:al){
			
			System.out.println(obj);
		}
		
		
		

	}

}
