package test240712.object;

public class MemberController {
	public final int SIZE = 10;
	private Member[] m = new Member[SIZE];
	
	public int existMemberNum() {
		int num = 0;
		for (int i = 0; i < this.m.length;i++) {
			if(this.m[i] != null) {
				num++;
			}
			else {
				return num;
			}
		}
		return num;
	}
	
	public Boolean checkId(String inputId) {		// 중복시 false
		for(int i = 0; i < this.existMemberNum(); i++) {
			if(this.m[i].getId().equals(inputId)) {
				return false;
			}
		}
		return true;
	}
	
	public void insertMember(String id, String name, String password, String email, 
			String gender, int age) {
		this.m[this.existMemberNum()] = new Member(id, name, password, email, gender.charAt(0), age);
	}
	
	public String searchId(String id) {
		for (int i = 0; i<this.existMemberNum();i++) {
			if(this.m[i].getId().equals(id)) {
				return this.m[i].inform();
			}
		}
		return null;
	}
	
	public Member[] searchName(String name) {	//???
//		for (int i = 0; i<this.existMemberNum();i++) {
//			if(this.m[i].getName().equals(name)) {
//				return this.m;
//			}
//		}
		//return null;
		Member[] mArr = new Member[SIZE];
		int count = 0;
		for (int i = 0; i<this.existMemberNum();i++) {
			if(this.m[i].getName().equals(name)) {
				mArr[count++] = m[i];
			}
		}
		return mArr;
	}
	
	public Member[] searchEmail(String email) {	//???
		for (int i = 0; i<this.existMemberNum();i++) {
			if(this.m[i].getEmail().equals(email)) {
				return this.m;
			}
		}
		return null;
	}
	
	public Boolean UpdatePassword(String id, String password) {
		for (int i = 0; i<this.existMemberNum();i++) {
			if(this.m[i].getId().equals(id)) {
				this.m[i].setPassword(password);
				return true;
			}
		}
		return false;
	}
	
	public Boolean updateName(String id, String name) {
		for (int i = 0; i<this.existMemberNum();i++) {
			if(this.m[i].getId().equals(id)) {
				this.m[i].setName(name);
				return true;
			}
		}
		return false;
	}
	
	public Boolean updateEmail(String id, String email) {
		for (int i = 0; i<this.existMemberNum();i++) {
			if(this.m[i].getId().equals(id)) {
				this.m[i].setEmail(email);
				return true;
			}
		}
		return false;
	}
	
	public Boolean delete(String id) {
		for (int i = 0; i<this.existMemberNum();i++) {
			if(this.m[i].getId().equals(id)) {
				this.m[i] = null;
				for (int j = i; j+1 < this.m.length; j++) {
					this.m[j] = this.m[j+1];
				}
				this.m[this.m.length-1] = null;
				return true;
			}
		}
		return false;
	}
	
	public void delete() {
		for (int i = 0; i<this.m.length;i++) {
			this.m[i] = null;
		}
	}
	
	public Member[] printAll() {		//???
		return this.m;
	}
}
