package ncs.test2;

public class StringTest {
	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		double data[] = new double[5];
		double sum = 0;
		
		String[] st = str.split(",");
		int i = 0;
		for(String string: st) {
			data[i++] = Double.parseDouble(string);
			sum += Double.parseDouble(string);
		}
		System.out.printf("합계 : %.3f\n", sum);
		System.out.printf("평균 : %.3f", sum/data.length);
	}
}
