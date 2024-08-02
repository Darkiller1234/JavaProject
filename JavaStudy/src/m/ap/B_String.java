package m.ap;

import java.util.StringTokenizer;

public class B_String {
	String str = "Java, Oracle, sql, html, css, spring";
	public void method01() {
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		int count = stn.countTokens();
		for(int i = 0; i<count; i++) {
			System.out.println(stn.nextToken());
		}
		
		stn = new StringTokenizer(str, ",");
		while(stn.hasMoreElements()) {
			System.out.println(stn.nextToken());
		}
	}
}
