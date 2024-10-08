package test240730.object1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class MemberController {
	HashMap map = new HashMap();
	
	public boolean joinMembership(String id, Member m) {
		if(map.containsKey(id)) {
			return false;
		}
		map.put(id, m);
		return true;
	}
	
	public String login(String id, String password) {
		if(map.containsKey(id)) {
			Member m = (Member)map.get(id);
			if(m.getPassword().equals(password)) {
				return m.getName();
			}
		}
		
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		if(map.containsKey(id) && ((Member)map.get(id)).getPassword().equals(oldPw)) {
			((Member)map.get(id)).setPassword(newPw);
			return true;
		}
		return false;
	}
	
	public void changeName(String id, String newName) {
		((Member)map.get(id)).setName(newName);
	}
	
	public TreeMap sameName(String name) {
		Set keySet = map.keySet();
		TreeMap tm = new TreeMap(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		for(Object key : keySet) {
			if(((Member)map.get(key)).getName().equals(name)) {
				tm.put(key, ((Member)map.get(key)).getName());
			}
		}
		return tm;
	}
}
