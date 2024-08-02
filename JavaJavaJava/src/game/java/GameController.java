package game.java;

public class GameController {
	private String[] location = new String[] {
			"소지품" , "방", "책상", "침대", "서랍", "옷장"
	};
	private String[] object = new String[] {
			
	};
	private String[][] predicate = new String[][] {
			{"본다"},{"집는다", "가져간다"}
	};
	
	public int[] Analyze(String str) {
		int[] arr = new int[]{
				-1,-1,-1
		};
		for(int i = 0; i < location.length; i++) {
			if(str.contains(location[i])) {
				arr[0] = i;
				break;
			}
		}
		for(int i = 0; i < object.length; i++) {
			if(str.contains(object[i])) {
				arr[1] = i;
				break;
			}
		}
		for(int i = 0; i<predicate.length;i++) {
			for(int j = 0; j<predicate[i].length;j++) {
				if(str.contains(predicate[i][j])) {
					arr[2] = i;
				}
			}
			if(arr[2] != -1) {
				break;
			}
		}
		return arr;
	}

	
	
	
	
	
	
	
	
	
	public String[] getLocation() {
		return location;
	}

	public String[] getObject() {
		return object;
	}

	public String[][] getPredicate() {
		return predicate;
	}
}
