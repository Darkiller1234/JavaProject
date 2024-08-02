package o.collection.list;

import java.util.ArrayList;
import java.util.List;

public class GenericListRun {
	public static void main(String[] args) {
		List<Music> list = new ArrayList<>();
		
		list.add(new Music("에피소드", "웅나웅나"));
		list.add(new Music("젠레스 존 제로", "웅나웅나"));
		list.add(new Music("웅나나", "웅나웅나"));
		
		System.out.println(list);
		
		for(Music m : list) {
			System.out.println(m);
		}
		/*
		 * 제네릭을 사용하는 이유
		 * 1. 명시된 타입의 객체만 저장하도록 제한둘 수 있다.
		 * 2. ㅐㅔ4
		 */
		
	}
}
