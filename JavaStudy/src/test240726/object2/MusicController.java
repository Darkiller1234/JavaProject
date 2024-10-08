package test240726.object2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicController {
	private List list = new ArrayList();
	
	public int addList(Music music) {
		list.add(music);
		return 1;
	}
	
	public int addAtZero(Music music) {
		list.add(0, music);
		return 1;
	}
	
	public List printAll() {
		return this.list;
	}
	
	public Music searchMusic(String title) {
		for (int i = 0; i<list.size(); i++) {
			if(((Music)list.get(i)).getTitle().equals(title)) {
				return (Music) list.get(i);
			}
		}
		return null;
	}
	
	public Music removeMusic(String title) {
		for (int i = 0; i<list.size(); i++) {
			if(((Music)list.get(i)).getTitle().contains(title)) {
				Music m = (Music) list.get(i);
				list.remove(i);
				return m ;
			}
		}
		return null;
	}
	
	public Music setMusic(String title, Music music) {
		for (int i = 0; i<list.size(); i++) {
			if(((Music)list.get(i)).getTitle().contains(title)) {
				Music m = (Music) list.get(i);
				list.set(i, music);
				return m;
			}
		}
		return null;
	}
	
	public int ascTitle() {
		//Collections.sort : 컬렉션에서 정렬기능을 제공하는 메소드
		// 정렬하고싶은 컬렉션객체와 정렬기준을 정한 객체(Comparator를 구현한 객체)를
		// 전달하면 정렬기준에 맞춰 정렬을 수행해준다.
		Collections.sort(list,new AscTitle());
		return 0;
	}
	
	public int descSinger() {
		Collections.sort(list,new DescSinger());
		return 0;
	}
}
