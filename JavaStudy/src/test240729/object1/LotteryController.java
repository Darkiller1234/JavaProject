package test240729.object1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class LotteryController {
	HashSet lottery = new HashSet();
	HashSet win = new HashSet();
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}
	
	public boolean deleteObject(Lottery l) {
		boolean isRemove = lottery.remove(l);
		if(win.contains(l)) {
			win.remove(l);
		}
		return isRemove;
//		Iterator it = lottery.iterator();
//		while(it.hasNext()) {
//			Lottery lt = (Lottery)it.next();
//			if(lt.equals(l)) {
//				lottery.remove(lt);
//				if(win != null) {
//					win.remove(lt);
//				}
//				return true;
//			}
//		}
//		return false;
	}
	
	public HashSet winObject() {
		if(lottery.size() < 4) {
			return null;
		}
		List<Lottery> list = new ArrayList<>();
		list.addAll(lottery);
		
		while(win.size() < 4) {
			int rand = (int)(Math.random() * list.size());
			win.add(list.get(rand));
		}
		return win;
	}
	
	public TreeSet sortedWinObject() {
		TreeSet sortedWinSet = new TreeSet(new SortedLottery());
		sortedWinSet.addAll(win);
		return sortedWinSet;
	}
	
	public boolean searchWinner(Lottery l) {
		return win.contains(l);
	}
}
