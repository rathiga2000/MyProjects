package Collection;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class IteratorList {

	public static void main(String[] args) {
		IteratorList obj = new IteratorList();
//obj.first();
		//obj.last();
	//obj.remove();
		//obj.rotat();
		//obj.replace();
	//obj.nextValue();
obj.previousValue();
	}
   public void first() {
       List<Integer> l = new ArrayList();
       l.add(7);
		l.add(76);
		l.add(5);
		l.add(8);
		l.add(56);
		l.add(9);
		l.add(34);
		l.add(8);
		  System.out.println(l);
		  ListIterator itr = l.listIterator();
          System.out.println("Remove first four element");
		  int count = 0;
		  while (itr.hasNext()) {
          itr.next();
			itr.remove();
			count++;
           if (count == 4) {
               break;
               }
		}
		System.out.println(l);
	}

	
	
	public void last() {
		List<Integer> l = new ArrayList();
        l.add(7);
		l.add(76);
		l.add(5);
		l.add(8);
		l.add(56);
		l.add(9);
		l.add(34);
		l.add(8);
		System.out.println(l);
		ListIterator itr = l.listIterator();
        System.out.println("Remove last four element");
		int count = 0;
		while (itr.hasNext()) {
             itr.next();
		}
		while (itr.hasPrevious()) {
			itr.previous();
			itr.remove();
			count++;
          if (count == 4) {
           break;
			}
		}
		System.out.println(l);
	}

	public void remove() {
     List<Integer> l = new ArrayList();
		l.add(76);
		l.add(5);
		l.add(8);
		l.add(56);
		l.add(9);
		l.add(76);
		l.add(8);
		l.add(9);
		System.out.println(l);
		ListIterator itr = l.listIterator();
        System.out.println("Remove duplicate element");
         for(int i=0;i<l.size();i++)
           {
	     for(int j=i+1;j<l.size();j++)
	     {
		if(l.get(i)==l.get(j))
		{
			l.remove(j);
		}
	}
}
		 System.out.println(l);
	}

	public void rotat() {
		List<Integer> l = new ArrayList();

		l.add(7);
		l.add(76);
		l.add(5);
		l.add(8);
		l.add(56);
		l.add(9);
		l.add(34);
		l.add(8);
		l.add(2);
		l.add(6);
		System.out.println(l);
		ListIterator itr = l.listIterator();
			for (int i=0;i<l.size()-1;i++) {
		
					int temp=l.get(i);
					l.set(i,l.get(i+1));
					l.set(i+1, temp);
				}
			System.out.println("after rotation");
				System.out.println(l);
}
	public void replace()
	{
		List<Integer> l = new ArrayList();

		l.add(7);
		l.add(76);
		l.add(5);
		l.add(8);
		l.add(56);
		l.add(9);
		l.add(34);
		l.add(8);
		l.add(2);
		l.add(6);
		System.out.println(l);
for(int i=0;i<l.size();i++)
{
	if(l.get(i)%2!=0)
	{
		l.set(i, 99);
	}
}
System.out.println(l);
	}
	public void nextValue()
	{
	List<Integer> l = new ArrayList();
    l.add(7);
	l.add(76);
	l.add(5);
	l.add(8);
	l.add(56);
	l.add(9);
	l.add(8);
	l.add(8);
	l.add(5);
	System.out.println(l);
	ListIterator <Integer> itr = l.listIterator();
System.out.println("Element has 5 then add 999 next");
while(itr.hasNext())
{
	if(itr.next()==5)
	{
		itr.add(99);
	}
}
System.out.println(l);
	}
public void previousValue()
{
List<Integer> l = new ArrayList();
 	l.add(8);
 	l.add(76);
 	l.add(5);
 	l.add(8);
 	l.add(56);
 	l.add(9);
 	l.add(0);
 	l.add(8);
 	System.out.println(l);
 	ListIterator <Integer> itr = l.listIterator();
 	System.out.println("Element has 8 then add 888 previous ");
 	while(itr.hasNext()){
 	itr.next();
	}
 	while(itr.hasPrevious()){
 	if(itr.previous()==8) {
        itr.add(888);
	}
 	}
 	System.out.println(l);
	}
}


