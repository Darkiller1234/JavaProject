package test240731.object1;

import java.util.ArrayList;
import java.util.HashMap;

//C(Controller) : 사용자가 요청한 내용을 처리한 후 그 결과를 돌려주는 역할
public class FarmController {
	private HashMap<Farm, Integer> hMap = new HashMap<>();
	private ArrayList<Farm> list = new ArrayList<>();
	
	public boolean addNewKind(Farm f, int amount) {
		if(!hMap.containsKey(f)) {
			hMap.put(f, amount);
			return true;
		}
		return false;
	}
	
	public boolean removeKind(Farm f) {
		if(hMap.containsKey(f)) {
			hMap.remove(f);
			return true;
		}
		return false;
	}
	
	public boolean changeAmount(Farm f, int amount) {
		if(hMap.containsKey(f)) {
			hMap.replace(f, amount);
			return true;
		}
		return false;
	}
	
	public HashMap<Farm,Integer> printFarm(){
		return hMap;
	}
	
	public boolean buyFarm(Farm f) {
		if(hMap.containsKey(f) && hMap.get(f)>0) {
			list.add(f);
			hMap.replace(f, hMap.get(f) - 1);
			return true;
		}
		return false;
	}
	
	public boolean removeFarm(Farm f) {
		if(list.contains(f)) {
			list.remove(f);
			hMap.replace(f, hMap.get(f) + 1);
			return true;
		}
		return false;
	}
	
	public ArrayList<Farm> printBuyFarm(){
		return list;
	}
}
