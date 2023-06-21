package String;

import java.util.Comparator;

public class WarrantySort implements Comparator {

	public int compare(Object o1, Object o2) {
		Television t1 = (Television) o1;
		Television t2 = (Television) o2;
		if (t1.getWarrantyear() > t2.getWarrantyear()) {
			return 1;
		} else if (t1.getWarrantyear() < t2.getWarrantyear()) {
			return -1;
		} else
			return 0;
	}
}
