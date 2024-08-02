package test.controller;

public class Test3 {
	public static void main(String[] args) {
		double sum = 0;
		double num = 1;
		while(true) {
			sum += num;
			if(num==100) {
				break;
			}
			num++;
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/num);
	}
}
