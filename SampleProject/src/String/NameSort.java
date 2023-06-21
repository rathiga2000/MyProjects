package String;

import java.util.Comparator;

public class NameSort implements Comparator{

	public int compare(Object o1, Object o2) {
		Television t1=(Television)o1;
		Television t2=(Television)o2;

		return t1.getName().compareTo(t2.getName());
		
	}

}
