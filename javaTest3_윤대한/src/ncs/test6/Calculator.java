package ncs.test6;

public class Calculator {
	
	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public double getSum(int data) {
		if(data > 5 || data < 2) {
			
		}
		int sum = 0;
		for(int i = 1; i<=data;i++) {
			sum += i;
		}
		
		return sum;
	}
}
