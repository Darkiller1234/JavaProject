package test240729.object1;

import java.util.Comparator;

public class SortedLottery implements Comparator<Lottery>{

	@Override
	public int compare(Lottery o1, Lottery o2) {
		// TODO Auto-generated method stub
		return !o1.getName().equals(o2.getName())?o1.getName().compareTo(o2.getName()):o1.getPhone().compareTo(o2.getPhone());
	}

}
