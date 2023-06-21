package String;

import java.util.Comparator;

public class SizeSort implements Comparator {

	public int compare(Object o1, Object o2) {
		Television t1 = (Television) o1;
		Television t2 = (Television) o2;
		if (t1.getSize() > t2.getSize()) {
			return 1;
		} else if (t1.getSize() < t2.getSize()) {
			return -1;
		} else
			return 0;
	}

}
