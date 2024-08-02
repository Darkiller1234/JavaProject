package test240726.object2;

import java.util.Comparator;

public class DescSinger implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		// TODO Auto-generated method stub
		return o2.getSinger().compareTo(o1.getSinger());
	}

}
