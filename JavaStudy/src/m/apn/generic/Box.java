package m.apn.generic;

import java.util.Arrays;

public class Box<T> {
	public Box() {
		super();
	}
	private T[] abArr; //어떤 것들을 담을지 알 수 없음 => 객체
	private int size;
	public Box(T[] abArr, int size) {
		super();
		this.abArr = abArr;
		this.size = size;
	}
	
	
	@Override
	public String toString() {
		return "Box [abArr=" + Arrays.toString(abArr) + ", size=" + size + "]";
	}


	public T[] getAbArr() {
		return abArr;
	}
	public int getSize() {
		return size;
	}
	public void setAbArr(T[] abArr) {
		this.abArr = abArr;
	}
	public void setSize(int size) {
		this.size = size;
	}
}
