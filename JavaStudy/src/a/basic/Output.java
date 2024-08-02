package a.basic;

public class Output {
	public static void main(String[] args) {
		//한줄을 출력하고 개행을 한다.
		System.out.println("안녕하세요.");
		System.out.println("윤대한입니다.");
		
		//단순하게 출력을 할 때 사용하는 출력문
		System.out.print("제 성별은 \n");
		//print에서 개행을 하고싶은 때는 \n을 이용한다.
		System.out.print("남자입니다. \n\n\n\n\n\n");
		double pi = 3.14159265358979323846264338;
		System.out.println(pi);
		
		String name = "윤대한";
		System.out.println("안녕하세요 저는 " + name + "입니다.");
		
		//printf(문자열포멧, 값1, 값2);
		/*
		 * 포멧안에서 쓸 수 있는 키워드
		 * %d : 정수
		 * %c : 문자
		 * %s : 문자열
		 * %f : 실수(소수점 아래로 원하는 만큼 표시하기 위해서는 %.nf)
		 * 
		 */
		System.out.printf("안녕하세요 저는 %s입니다. 나이는 %d 입니다. 원주율은 %.4f 입니다.", name, 22, 3.1415926535);
	}
}
