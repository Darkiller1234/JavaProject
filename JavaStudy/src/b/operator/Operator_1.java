package b.operator;

public class Operator_1 {
	/*
	 * 1. 논리부정 연산자
	 * 
	 * 논리값(true/false)을 반대로 바꾸는 연산자
	 * 
	 * => 결과도 논리값으로 나옴
	 * 
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(!true);
		System.out.println(!false);

		boolean b1 = !(5 > 3);

		System.out.println(b1);

	}
}
