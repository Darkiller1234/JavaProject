package m.apn.generic;

public class Run {
	public static void main(String[] args) {
		//객체를 생성하는 시점에 어떤 타입을 사용할지
		//타입인지를 정해준다.
		
		Box<Integer> aBox = new Box();
		
		Integer[] arr = new Integer[10];
		aBox.setAbArr(arr);
		
		aBox.getAbArr()[0] = 10;
		
		System.out.println(aBox.toString());
		
	}
}
